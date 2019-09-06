package com.traders.controller;

import java.lang.reflect.Type;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeToken;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.traders.models.Grains;
import com.traders.models.User;
import com.traders.models.request.GrainsRequest;
import com.traders.service.GrainsStoreService;

@RestController
//@RequestMapping("/traders")
@CrossOrigin(origins = "http://localhost:4200")
public class TradersController {

	@Autowired(required = true)
	private GrainsStoreService grainsStoreService;

	@Autowired
	private ModelMapper modelMapper;

	@PostMapping("/traders/authenticate")
	public ResponseEntity<?> authenticate(@RequestBody User user) {
			
		if ( (user.getUsername() != null && !user.getUsername().isEmpty())
				&& (user.getPassword() != null && !user.getPassword().isEmpty())) {
			if (user.getUsername().equals("admin") && user.getPassword().equals("admin")) {
				return new ResponseEntity<User>(user, HttpStatus.OK);
			} else {
				return ResponseEntity.status(HttpStatus.UNAUTHORIZED).body("Invalid username or password");
			}
		} else {
			return ResponseEntity.status(HttpStatus.NOT_FOUND).body("Invalid username or password");
		}
	}

	@PostMapping(value = "/grains", consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<?> saveGrains(@RequestBody GrainsRequest grainsRequest) {
		Grains grains = modelMapper.map(grainsRequest, Grains.class);
		grainsStoreService.saveGrains(grains);
		return null;
	}

	@GetMapping("/grains")
	public ResponseEntity<?> getGrains() {
		List<Grains> grainsList = grainsStoreService.getGrains();
		Type listType = new TypeToken<List<Grains>>() {
		}.getType();
		List<Grains> grains = modelMapper.map(grainsList, listType);
		return new ResponseEntity<>(grains, HttpStatus.OK);
	}

	@GetMapping("/grainsByName")
	public ResponseEntity<?> getGrainsByName(@RequestParam String grainName) {
		List<Grains> grainsList = grainsStoreService.getGrainsByName(grainName);
		Type listType = new TypeToken<List<Grains>>() {
		}.getType();
		List<Grains> grains = modelMapper.map(grainsList, listType);
		return new ResponseEntity<>(grains, HttpStatus.OK);
	}

}

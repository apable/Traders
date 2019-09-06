package com.traders.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.traders.models.Grains;
import com.traders.models.request.GrainsRequest;
import com.traders.repository.GrainsStoreRepository;


@Service
public class GrainsStoreService {
	
	@Autowired(required=true)
	GrainsStoreRepository grainsStoreRepository ;
	
	public void saveGrains( Grains grains) 
	{
	
		grains.getPurchaseDetails().setAmount(grains.getPurchaseDetails().getQuantity() * grains.getPurchaseDetails().getRate());
		
		grains.getSalesDetails().setAmount(grains.getSalesDetails().getQuantity() * grains.getSalesDetails().getRate() );
		grains.getSalesDetails().setDifference(grains.getSalesDetails().getAmount() - grains.getSalesDetails().getReceivedAt());
		
		grainsStoreRepository.save(grains);
	}
	public   List<Grains>  getGrains() 
	{
		return (List<Grains>) grainsStoreRepository.findAll();
	}
	public List<Grains> getGrainsByName(String grainName) {
		return (List<Grains>) grainsStoreRepository.findByGrainName(grainName);
	}
}

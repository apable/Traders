package com.traders.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.traders.models.Grains;
import java.lang.String;

@Repository
public interface GrainsStoreRepository extends CrudRepository<Grains, Integer> {
	
	List<Grains> findByGrainName(String grainname);
	

}

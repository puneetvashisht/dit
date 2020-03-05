package com.ibm.repo;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.ibm.entities.Address;
@Repository
public class AddressRepo {
	
	@PersistenceContext
	EntityManager em;
	
	@Transactional
	public void addAddress(Address address){
		em.persist(address);
		
	}

}

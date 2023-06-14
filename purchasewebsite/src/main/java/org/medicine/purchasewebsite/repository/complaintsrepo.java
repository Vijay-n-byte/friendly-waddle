package org.medicine.purchasewebsite.repository;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class complaintsrepo {

	@Autowired
	private EntityManager em;
	
	
}

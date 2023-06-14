package org.medicine.purchasewebsite.repository;

import java.util.List;

import org.medicine.purchasewebsite.entities.complaints;
import org.medicine.purchasewebsite.entities.customer;
import org.medicine.purchasewebsite.entities.logincredentials;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.Query;
import jakarta.transaction.Transactional;

@Repository
@Transactional
public class adminrepo {
	
	@Autowired
	private EntityManager em;
	
	public void addcustomer(customer c) {
		em.persist(c);
	}
	
	public void addmanager(logincredentials c) {
		em.persist(c);
	}
	
	public void addengineer(logincredentials c) {
		em.persist(c);
	}
	
	public List<customer> getcustomersforadmin(){
		Query q=em.createQuery("select e from customer e", customer.class);
		List<customer> c=q.getResultList();
		return c;
	}

}

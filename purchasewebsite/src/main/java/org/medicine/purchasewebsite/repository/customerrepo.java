package org.medicine.purchasewebsite.repository;

import java.util.List;

import org.medicine.purchasewebsite.dto.customerdto;
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
public class customerrepo {
	
	@Autowired
	private EntityManager em;
	
	public customer getcustomer(String c) {
		return em.find(customer.class, c);
	}
	public void savecomplaintsofcustomer(complaints c) {
		em.persist(c);
	}
	public void updatecomplaintsofcustomer(complaints c) {
		em.merge(c);
	}
	public complaints getcomplaint(int y) {
		return em.find(complaints.class,y);
		
	}
	public List<complaints> getcomplaintsformanager(){
		Query q=em.createQuery("select e from complaints e where e.status=1", complaints.class);
		List<complaints> c=q.getResultList();
		return c;
	}
	public List<logincredentials> getengineersfformanagers(){
		Query q=em.createQuery("select e from logincredentials e where e.designations=:sum", logincredentials.class);
		q.setParameter("sum", "engineer");
		List<logincredentials> c=q.getResultList();
		return c;
	}
	
	public List<complaints> getcomplaintsforengineers(String u){
		Query q=em.createQuery("select e from complaints e where e.asignedto=:app and e.status=1", complaints.class);
		q.setParameter("app",u);
		List<complaints> c=q.getResultList();
		return c;
	}
	
	
	
	

	
}

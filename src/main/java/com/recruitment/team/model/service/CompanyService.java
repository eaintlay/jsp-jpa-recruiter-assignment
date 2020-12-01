package com.recruitment.team.model.service;

import java.util.List;
import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.recruitment.team.model.entity.Company;



@Stateless
public class CompanyService {
	
	@PersistenceContext(name = "jsp-jpa-recruiter")
	private EntityManager em;

	public List<Company> findAll() {
		TypedQuery<Company> query = em.createNamedQuery("Company.findAll", Company.class);
		return query.getResultList();
	}

	public Company findById(int id) {
		return em.find(Company.class, id);
	}

	public void save(Company company) {
		
		
		if (company.getId() == 0) {
			em.persist(company);
		}else {
			em.merge(company);
		}
	}
	
	public void delete(int cid) {
		
		Company com = em.find(Company.class, cid);
		em.remove(com);
	}

	

}
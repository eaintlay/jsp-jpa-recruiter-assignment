package com.recruitment.team.model.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.recruitment.team.model.entity.Recruiter;


@Stateless
public class RecruiterService {
	
	@PersistenceContext(name = "jsp-jpa-recruiter")
	private EntityManager em;
	
	public RecruiterService(EntityManager createEntityManager) {
		// TODO Auto-generated constructor stub
	}

	public List<Recruiter> findAll() {
		TypedQuery<Recruiter> query = em.createNamedQuery("Recruiter.findAll", Recruiter.class);
		return query.getResultList();
	}

	public Recruiter findById(int id) {
		return em.find(Recruiter.class, id);
	}

	public void save(Recruiter recruiter) {
		if (recruiter.getId() == 0) 
			em.persist(recruiter);
		else
			em.merge(recruiter);
	}

	public void delete(int rid) {
		Recruiter r = em.find(Recruiter.class, rid);
		em.remove(r);
		
	}

	public Long getCountUser() {
		TypedQuery<Long> query = em.createQuery("SELECT COUNT(r) FROM Recruiter  r",Long.class);
		return query.getSingleResult();
	}
	
	
		
	

}
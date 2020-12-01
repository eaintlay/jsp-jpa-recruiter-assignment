package com.recruitment.team.model.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.EntityNotFoundException;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.recruitment.team.model.entity.Recruiter;


@Stateless
public class RecruiterService {
	@PersistenceContext(name="jsf-template-assignment")
	private EntityManager em;
	
	
	public RecruiterService(EntityManager createEntityManager) {
		// TODO Auto-generated constructor stub
	}


	public Recruiter check(String username, String password) throws EntityNotFoundException{
		TypedQuery<Recruiter> query=em.createNamedQuery("Recruiter.login",Recruiter.class);
		query.setParameter("name", username);
		query.setParameter("pass", password);
		return query.getSingleResult();
	}


	public Recruiter findById(int parseInt) {
		// TODO Auto-generated method stub
		return null;
	}


	public static void save(Recruiter recruiter) {
		// TODO Auto-generated method stub
		
	}


	public Recruiter login(String email, String password) {
		// TODO Auto-generated method stub
		return null;
	}

}

package com.recruitment.team.model.service;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import com.recruitment.team.model.entity.CandidateJoborderStatus;



@Stateless
public class CandidateJobOrderStatusService {
	
	@PersistenceContext(name = "jsp-jpa-recruiter")
	private EntityManager em;

	

	public CandidateJoborderStatus findById(int id) {
		return em.find(CandidateJoborderStatus.class, id);
	}
}

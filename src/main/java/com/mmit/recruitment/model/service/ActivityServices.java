package com.mmit.recruitment.model.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.mmit.recruitment.model.entity.AvailabilityType;
import com.mmit.recruitment.model.entity.Pipelinehistory;

@Stateless
public class ActivityServices {

	@PersistenceContext(name = "jsp-jpa-recruiter")
	private EntityManager em;

	public List<Pipelinehistory> findAll() {
		TypedQuery<Pipelinehistory> query = em.createNamedQuery("Pipelinehistory.findAll", Pipelinehistory.class);
		return query.getResultList();
	}

	public AvailabilityType findById(int id) {
		return em.find(AvailabilityType.class, id);
	}
	
}

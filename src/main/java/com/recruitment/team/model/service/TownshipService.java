package com.recruitment.team.model.service;

import java.util.List;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import com.recruitment.team.model.entity.Township;


@Stateless
public class TownshipService {
	
	@PersistenceContext(name="jsf-template-assignment")
	private EntityManager em;
	
	

	public TownshipService(EntityManager createEntityManager) {
		// TODO Auto-generated constructor stub
	}

	public List<Township> findAll() {
		TypedQuery<Township> query=em.createQuery("SELECT t FROM Township t",Township.class);
		return query.getResultList();
	}

	public Township findById(int id) {
		return em.find(Township.class, id);
	}

	public void save(Township t) {
		// TODO Auto-generated method stub
		
	}

	public void delete(int parseInt) {
		// TODO Auto-generated method stub
		
	}

}

package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Nodal;

@Repository
public class NodalRepoImpl implements NodalRepo {

	@Autowired
	EntityManager eMan;
	
	@Override
	public void addNodal(Nodal nodal) {
		eMan.persist(nodal);		
	}

	@Override
	public List<Nodal> getNodals() {
		Query qry = eMan.createQuery("from Nodal");
		return qry.getResultList();
	}

	@Override
	public boolean updateNodal(Nodal nodal) {
		// TODO Auto-generated method stub
		eMan.merge(nodal);
		return true;
	}

	@Override
	public Nodal searchNodalById(String userid) {
		// TODO Auto-generated method stub
		Nodal pp = eMan.find(Nodal.class, userid);		
		return pp;
	}
}
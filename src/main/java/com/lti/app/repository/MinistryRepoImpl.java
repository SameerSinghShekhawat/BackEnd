package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Ministry;

@Repository
public class MinistryRepoImpl implements MinistryRepo {
	@Autowired
	EntityManager eMan;
	
	@Override
	public void addMinistry(Ministry ministry) {
		eMan.persist(ministry);
		
	}

	@Override
	public List<Ministry> getMinistry() {
		Query qry = eMan.createQuery("from Ministry");
		return qry.getResultList();
	}

	@Override
	public boolean updateMinistry(Ministry ministry) {
		// TODO Auto-generated method stub
		eMan.merge(ministry);
		return true;
	}

	@Override
	public Ministry searchMinistryById(String userid) {
		// TODO Auto-generated method stub
		Ministry pp = eMan.find(Ministry.class, userid);		
		return pp;
	}
}
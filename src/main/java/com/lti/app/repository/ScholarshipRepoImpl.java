package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Scholarship;

@Repository
public class ScholarshipRepoImpl implements ScholarshipRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addData(Scholarship sch) {
		eMan.persist(sch);		
	}

	@Override
	public List<Scholarship> getData() {
		Query qry = eMan.createQuery("from Scholarship");
		return qry.getResultList();
		
	}

	@Override
	public Scholarship getScholarDetails(String uniqid) {
		Scholarship sc = eMan.find(Scholarship.class, uniqid);
		return sc;
	}

	@Override
	public List<Scholarship> instWiseScholar(String institutename) {
		Query qry = eMan.createQuery("select s from Scholarship s where s.institutename= :instname").setParameter("instname", institutename);
		return qry.getResultList();
	}

}

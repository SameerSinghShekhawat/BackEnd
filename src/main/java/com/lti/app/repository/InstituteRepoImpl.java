package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Institute;
@Repository
public class InstituteRepoImpl implements InstituteRepo{
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addInstitute(Institute inst) {
		eMan.persist(inst);
		
	}

	@Override
	public Institute searchInstitute(String instid) {
		Institute ii = eMan.find(Institute.class, instid);
		return ii;
	}

	@Override
	public List<Institute> getInstitute() {
		Query qry=eMan.createQuery("from Institute");
		return qry.getResultList();
	}

}

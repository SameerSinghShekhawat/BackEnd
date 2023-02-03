package com.lti.app.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.InstituteApprovalStatus;
import com.lti.app.pojo.ScholarshipApproval;

@Repository
public class ScholarAppRepoImpl implements ScholarAppRepo{
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addScholarApp(ScholarshipApproval scap) {
		eMan.persist(scap);
		
	}

	@Override
	public ScholarshipApproval getScholarApp(String uniqid) {
		ScholarshipApproval scapp = eMan.find(ScholarshipApproval.class, uniqid);
		return scapp;
	}

	@Override
	public void updateStat(ScholarshipApproval scap) {
		eMan.merge(scap);
		
	}

	
	
	

}

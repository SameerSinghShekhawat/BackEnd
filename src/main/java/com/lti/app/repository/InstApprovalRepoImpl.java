package com.lti.app.repository;

import javax.persistence.EntityManager;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lti.app.pojo.InstituteApprovalStatus;
@Repository
public class InstApprovalRepoImpl implements InstApprovalRepo{
	
	@Autowired
	EntityManager eMan;
	
	
	@Override
	public void addInstAppoval(InstituteApprovalStatus instAppStatus) {
		eMan.persist(instAppStatus);
		
	}


	@Override
	public String getMinistApproval(String instid) {
		InstituteApprovalStatus ias = eMan.find(InstituteApprovalStatus.class, instid);
		String s = ias.getMinistryapproval();
		return s;
	}


	@Override
	public InstituteApprovalStatus getInstApp(String instid) {
		InstituteApprovalStatus ias = eMan.find(InstituteApprovalStatus.class, instid);
		return ias;
	}


	@Override
	public void setNodalStat(InstituteApprovalStatus insta) {
		eMan.merge(insta);
		
	}

}

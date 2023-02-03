package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.InstituteApprovalStatus;
import com.lti.app.repository.InstApprovalRepo;
@Service
@Transactional
public class InstApprovalServiceImpl implements InstApprovalService{
	
	@Autowired
	InstApprovalRepo instAppRepo;

	@Override
	public void addInstApproval(InstituteApprovalStatus instApproval) {
		instAppRepo.addInstAppoval(instApproval);
		
	}

	@Override
	public String getMinistApproval(String instid) {
		return instAppRepo.getMinistApproval(instid);
	}

	@Override
	public InstituteApprovalStatus getInstApp(String instid) {
		// TODO Auto-generated method stub
		return instAppRepo.getInstApp(instid);
	}

	@Override
	public void setNodalStat(InstituteApprovalStatus insta) {
		instAppRepo.setNodalStat(insta);
		
	}
	
	

}

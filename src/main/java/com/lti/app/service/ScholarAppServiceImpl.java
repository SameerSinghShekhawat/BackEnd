package com.lti.app.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.ScholarshipApproval;
import com.lti.app.repository.ScholarAppRepo;

@Service
@Transactional
public class ScholarAppServiceImpl implements ScholarAppService{
	
	@Autowired
	ScholarAppRepo scaprepo;

	@Override
	public void addScholarApproval(ScholarshipApproval scap) {
		scaprepo.addScholarApp(scap);
		
	}

	@Override
	public ScholarshipApproval getScholarApp(String uniqid) {
		// TODO Auto-generated method stub
		return scaprepo.getScholarApp(uniqid);
	}

	@Override
	public void updateStat(ScholarshipApproval scap) {
		scaprepo.updateStat(scap);
		
	}
	

}

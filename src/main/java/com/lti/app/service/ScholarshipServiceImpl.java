package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Scholarship;
import com.lti.app.pojo.ScholarshipApproval;
import com.lti.app.repository.ScholarshipRepo;

@Transactional
@Service
public class ScholarshipServiceImpl implements ScholarshipService
{
	@Autowired
	ScholarshipRepo sRepo;
	
	@Autowired
	ScholarAppService sapser;

	@Override
	public void addData(Scholarship sch) {
		sRepo.addData(sch);
		ScholarshipApproval scap=new ScholarshipApproval();
		scap.setUniqid(sch.getUniqid());
		sapser.addScholarApproval(scap);
		
	}

	@Override
	public List<Scholarship> getData() {		
		return sRepo.getData();
	}

	@Override
	public Scholarship getScholarDetails(String uniqid) {
		// TODO Auto-generated method stub
		return sRepo.getScholarDetails(uniqid);
	}

	@Override
	public List<Scholarship> instWiseScholar(String institutename) {
		
		return sRepo.instWiseScholar(institutename);
	}
	
}

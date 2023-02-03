package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Institute;
import com.lti.app.pojo.InstituteApprovalStatus;
import com.lti.app.repository.InstituteRepo;
@Service
@Transactional
public class InstituteServiceImpl implements InstituteService{
	
	@Autowired
	InstituteRepo instRepo;
	
	@Autowired
	InstApprovalService instAppService;

	@Override
	public void addInstitute(Institute inst) {
		instRepo.addInstitute(inst);
		InstituteApprovalStatus instAppSt = new InstituteApprovalStatus();
		instAppSt.setInstid(inst.getInstid());
		instAppService.addInstApproval(instAppSt);
		
		
	}

	@Override
	public Institute searchInstitue(String instid) {
		
		return instRepo.searchInstitute(instid);
	}

	@Override
	public List<Institute> getInstitute() {
		// TODO Auto-generated method stub
		return instRepo.getInstitute();
	}

	@Override
	public Institute getInstitute(String instid) {
		return instRepo.searchInstitute(instid);
	}

}

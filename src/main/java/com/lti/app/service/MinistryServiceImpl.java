package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.pojo.Ministry;
import com.lti.app.repository.MinistryRepo;

@Service
@Transactional
public class MinistryServiceImpl implements MinistryService {
	
	@Autowired
	MinistryRepo pRepo;


	@Override
	public List<Ministry> getMinistry() {
		return pRepo.getMinistry();
	}
	
	@Override
	public void addMinistry(Ministry ministry) {
		pRepo.addMinistry(ministry);
	}

	@Override
	public boolean updateMinistry(Ministry ministry) {
		// TODO Auto-generated method stub
		return pRepo.updateMinistry(ministry);
	}

	@Override
	public Ministry searchMinistryById(String userid) {
		// TODO Auto-generated method stub
		return pRepo.searchMinistryById(userid);
	}

}

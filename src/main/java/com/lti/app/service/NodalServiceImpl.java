package com.lti.app.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.app.pojo.Nodal;
import com.lti.app.repository.NodalRepo;

@Service
@Transactional
public class NodalServiceImpl implements NodalService {
	
	@Autowired
	NodalRepo pRepo;

	@Override
	public void addNodal(Nodal nodal) {
		pRepo.addNodal(nodal);
	}
	@Override
	public List<Nodal> getNodals() {
		return pRepo.getNodals();
	}
	@Override
	public boolean updateNodal(Nodal nodal) {
		// TODO Auto-generated method stub
		return pRepo.updateNodal(nodal);
	}
	@Override
	public Nodal searchNodalById(String userid) {
		// TODO Auto-generated method stub
		return pRepo.searchNodalById(userid);
	}
}

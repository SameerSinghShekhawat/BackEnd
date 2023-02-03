package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Nodal;

public interface NodalRepo {
	public void addNodal(Nodal nodal);
	public List<Nodal> getNodals();
	public boolean updateNodal(Nodal nodal);
	public Nodal searchNodalById(String userid);
}

package com.lti.app.repository;

import java.util.List;

import com.lti.app.pojo.Ministry;

public interface MinistryRepo {
	public void addMinistry(Ministry ministry);
	public List<Ministry> getMinistry();
	public boolean updateMinistry(Ministry ministry);
	public Ministry searchMinistryById(String userid);
}

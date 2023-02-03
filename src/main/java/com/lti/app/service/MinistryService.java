package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Ministry;

public interface MinistryService {
	public void addMinistry(Ministry ministry);
	public List<Ministry> getMinistry();
	public boolean updateMinistry(Ministry ministry);
	public Ministry searchMinistryById(String userid);
}

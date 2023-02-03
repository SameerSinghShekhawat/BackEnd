package com.lti.app.service;

import java.util.List;

import com.lti.app.pojo.Image;

public interface ImageService {
	
	void addImage(Image image);
	
	List<Image> getAll();

}

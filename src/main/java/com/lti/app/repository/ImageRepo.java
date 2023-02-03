package com.lti.app.repository;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.app.pojo.Image;

public interface ImageRepo {
	
	void addImage(Image image);
	
	List<Image> getAll();

}

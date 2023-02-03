package com.lti.app.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Image;
import com.lti.app.repository.ImageRepo;

@Service
@Transactional
public class ImageServiceImpl implements ImageService{
	
	@Autowired
	ImageRepo imgRepo;

	@Override
	public void addImage(Image image) {
		imgRepo.addImage(image);
		
	}

	@Override
	public List<Image> getAll() {
		return imgRepo.getAll();
	}

}

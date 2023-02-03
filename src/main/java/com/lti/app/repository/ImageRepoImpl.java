package com.lti.app.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lti.app.pojo.Image;

@Repository
public class ImageRepoImpl implements ImageRepo {
	
	@Autowired
	EntityManager eMan;

	@Override
	public void addImage(Image image) {
		eMan.persist(image);
		
	}

	@Override
	public List<Image> getAll() {
		Query qry=eMan.createQuery("from Image");
		return qry.getResultList();
	}

}

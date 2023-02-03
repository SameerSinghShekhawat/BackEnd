package com.lti.app.dto;

import org.springframework.web.multipart.MultipartFile;

public class Imagedto {
	
	private MultipartFile file;
	
	private String uniqid;
	
	private String name;
	
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

	public String getUniqid() {
		return uniqid;
	}

	public void setUniqid(String uniqid) {
		this.uniqid = uniqid;
	}
	

}

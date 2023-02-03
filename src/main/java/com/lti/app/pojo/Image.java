package com.lti.app.pojo;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import org.springframework.web.multipart.MultipartFile;

@Entity
@Table(name="documentsimage")
public class Image {
	
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator = "id_Sequence")
	@SequenceGenerator(name = "id_Sequence", sequenceName = "ID_SEQ")
	private long id;
	private String uniqid;
	private String image;
	
	
	
	public Image(long id, String uniqid, String image) {
		super();
		this.id = id;
		this.uniqid = uniqid;
		this.image = image;
	}
	public Image() {
		super();
		// TODO Auto-generated constructor stub
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getUniqid() {
		return uniqid;
	}
	public void setUniqid(String uniqid) {
		this.uniqid = uniqid;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}

}

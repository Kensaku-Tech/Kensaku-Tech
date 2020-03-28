package com.Dogserchsp.springboot.form;

import java.io.Serializable;

public class SearchForm implements Serializable{

	private String hair;
	private String size;
	private String specialties;

	public String getHair() {
		return this.hair;
	}

	public void setHair(String hair) {
		this.hair = hair;
	}

	public String getSize() {
		return this.size;
	}

	public void setSize(String size) {
		this.size = size;
	}

	public String getSpecialties() {
		return this.specialties;
	}

	public void setSpecialties(String specialties) {
		this.specialties = specialties;
	}

}

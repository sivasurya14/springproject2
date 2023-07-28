package com.mobiledetails.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Mobile {
	@Id 
	@GeneratedValue(strategy = GenerationType.AUTO)
    private int id;
	private String brand;
	private int vers;
	
	public Mobile() {
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public int getVers() {
		return vers;
	}
	public void setVers(int vers) {
		this.vers = vers;
	}
	

}

package com.karina.multitableSequence;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Vehicles {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bike_gen")
	@SequenceGenerator(name="bike_gen",sequenceName="bike_seq", initialValue=5, allocationSize=100)
	int vid;
	String vname;
	String price;
	
	@OneToOne(cascade=CascadeType.ALL)
	Company company;

	public int getVid() {
		return vid;
	}

	public void setVid(int vid) {
		this.vid = vid;
	}

	public String getVname() {
		return vname;
	}

	public void setVname(String vname) {
		this.vname = vname;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public Company getCompany() {
		return company;
	}

	public void setCompany(Company company) {
		this.company = company;
	}
	
	
}

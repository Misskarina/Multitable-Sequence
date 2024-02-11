package com.karina.multitableSequence;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.SequenceGenerator;

@Entity
public class Company {
	@Id
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="bike_gen")
	@SequenceGenerator(name="bike_gen",sequenceName="bike_seq", initialValue=5, allocationSize=100)
	
	int cid;
	String cname;
	String country;
	
	@OneToOne(cascade=CascadeType.ALL)
	Vehicles vehicles;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Vehicles getVehicles() {
		return vehicles;
	}

	public void setVehicles(Vehicles vehicles) {
		this.vehicles = vehicles;
	}
	
	

}

package com.karina.multitableSequence;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class VehiclesController {

	@Autowired
	VehiclesRepository vrepo;
	CompanyRepository crepo;
	
	@RequestMapping("/test")
	public String test()
	{
		return"program tested";
	}
	
	@RequestMapping("/save")
	public String save()
	{
		Vehicles v=new Vehicles();
		v.setVname("Innova");
		v.setPrice("19-26lakh");
		
		Company c=new Company();
		c.setCname("Toyota");
		c.setCountry("Japan");
		
		v.setCompany(c);
		c.setVehicles(v);
		vrepo.save(v);
		return"data saved";
		
	}
	@RequestMapping("/saveall")
	public String saveall()
	{
		Vehicles v1=new Vehicles();
		v1.setVname("Mahindra XUV700");
		v1.setPrice("14-26lakh");
		
		Company c1=new Company();
		c1.setCname("Mahindra");
		c1.setCountry("India");
		
		v1.setCompany(c1);
		c1.setVehicles(v1);
		
		vrepo.save(v1);
		
		Vehicles v2=new Vehicles();
		v2.setVname("Range Rover");
		v2.setPrice("2.39-4.17Cr*");
		
		Company c2=new Company();
		c2.setCname("Land Rover");
		c2.setCountry("United kingdom");
		
		v2.setCompany(c2);
		c2.setVehicles(v2);
		vrepo.save(v2);
		
		Vehicles v3=new Vehicles();
		v3.setVname("La Ferrari");
		v3.setPrice("$1.4 Million");
		
		Company c3=new Company();
		c3.setCname("Ferrari");
		c3.setCountry("Italian");
		
		v3.setCompany(c3);
		c3.setVehicles(v3);
		vrepo.save(v3);
		
		Vehicles v4=new Vehicles();
		v4.setVname("Rolls Royce");
		v4.setPrice("200 Cr*");
		
		Company c4=new Company();
		c4.setCname("Rolls Royce");
		c4.setCountry("England");
		
		v4.setCompany(c4);
		c4.setVehicles(v4);
		vrepo.save(v4);
		
		List<Vehicles>list=Arrays.asList(v1,v2,v3,v4);
		vrepo.saveAll(list);
		return "all data saved";
	}
		
		
}

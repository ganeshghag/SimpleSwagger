package com.ghag.rnd.swagger.simple;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DoneeController {
	
	@RequestMapping(value="/api/donee", method=RequestMethod.GET)
	public List<Donee> getAllDoneeList(){
		System.out.println("received req for listall donee");
		
		List<Donee> retList = new ArrayList<Donee>();
		retList.add(createNewDonee(1));
		retList.add(createNewDonee(2));
		retList.add(createNewDonee(3));
		retList.add(createNewDonee(4));
		retList.add(createNewDonee(5));
		retList.add(createNewDonee(6));
		
		return retList;
	}
	
	@RequestMapping(value="/api/donee/{doneeId}", method=RequestMethod.GET)
	public Donee loadSingleDonee(@PathVariable Integer doneeId){
		System.out.println("received req for load donee with "+doneeId);
		return createNewDonee(doneeId);
	}
	
	
	@RequestMapping(value="/api/donee", method=RequestMethod.POST)
	public Donee createDonee(@RequestBody Donee donee){
		System.out.println("received req for create donee with "+donee);
		return donee;
	}
	
	@RequestMapping(value="/api/donee", method=RequestMethod.PUT)
	public Donee updateDonee(@RequestBody Donee donee){
		System.out.println("received req for update donee with "+donee);
		return donee;
	}
	
	@RequestMapping(value="/api/donee/{doneeId}", method=RequestMethod.DELETE)
	public Donee deleteDonee(@PathVariable Integer doneeId){
		System.out.println("received req for delete donee with "+doneeId);
		return createNewDonee(doneeId);
	}
	
	//util method only
	private Donee createNewDonee(Integer doneeId) {
		Donee donee = new Donee();
		donee.setAddress("address"+doneeId);
		donee.setCity("city"+doneeId);
		donee.setEligibleRate(50.0);
		donee.setName("name"+doneeId);
		donee.setPan("AFNGN2018Q"+doneeId);
		donee.setPincode("400601"+doneeId);
		donee.setState("MH"+doneeId);
		donee.setStatus("FINAL"+doneeId);
		donee.setVendorCode("VCODE"+doneeId);
		donee.setVendorName("VNAME"+doneeId);
		
		return donee;
	}
	
	
}
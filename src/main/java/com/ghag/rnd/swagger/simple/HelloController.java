package com.ghag.rnd.swagger.simple;
import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@RequestMapping(method = RequestMethod.GET, value = "/api/javainuse")
	public String sayHello() {
		return "Swagger Hello World";
	}
	
	
	@RequestMapping(value="/api/javainuse/{input}", method=RequestMethod.GET)
	public List<String> getList(@PathVariable String input){
		
		List<String> retList = new ArrayList<String>();
		retList.add("Ganesh"+"_"+input);
		retList.add("Prachi"+"_"+input);
		retList.add("Janhavi"+"_"+input);
		retList.add("Vallari"+"_"+input);
		
		return retList;
	}
	
	@RequestMapping(value="/api/javainuseObjects/{input}", method=RequestMethod.GET)
	public List<MyData> getListWithObjects(@PathVariable String input){
		
		List<MyData> retList = new ArrayList<MyData>();
		retList.add(new MyData("one"+input));
		retList.add(new MyData("two"+input));
		retList.add(new MyData("three"+input));
		return retList;
	}


	
}
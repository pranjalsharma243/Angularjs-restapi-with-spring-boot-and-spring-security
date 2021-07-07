package com.genc.angularjs;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
	
	@RequestMapping(path="/msg",method=RequestMethod.GET,produces =MediaType.TEXT_PLAIN_VALUE)
	public String message()
	{
		System.out.println("working");
		return"Welcome to dashboard";
		
	}
	@PostMapping("/createproduct")
	public Product addProduct(@RequestBody Product s)
	{
		System.out.println(s);
		return s;
		
	}
	
	

}

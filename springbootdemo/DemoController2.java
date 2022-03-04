package com.examples.nseit.springbootdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DemoController2
{
	@Autowired
	@Qualifier("r")
	Shape shape;
	
	@Value("${config1.databaseName}")
	String dname;
	@Value("${config1.databaseDriver}")
	String ddriver;
	
	@GetMapping("/test1")
	public String test3()
	{
		return shape.showShape();
	}
	@GetMapping("/test2")
	public String test4()
	{
		return "response from test4";
	}
	@GetMapping("/details")
	public Configuration showConfigDetails()
	{
		return new Configuration(ddriver,dname);
	}

}

package com.examples.nseit.springbootdemo;

import org.springframework.stereotype.Component;

@Component(value="r")
public class Rectangle implements Shape
{

	@Override
	public String showShape() {
		// TODO Auto-generated method stub
		return "It is in rectangle in shape...";
	}

}

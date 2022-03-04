package com.examples.nseit.springbootdemo;

import org.springframework.stereotype.Component;

@Component(value="c")
public class Circle implements Shape
{

	@Override
	public String showShape() 
	{
			return "It is circle in shape...";
	}

}

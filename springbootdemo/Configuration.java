package com.examples.nseit.springbootdemo;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@ConfigurationProperties("config1")
@Component
public class Configuration 
{
	String databaseDriver;
	String databaseName;
	
	public Configuration()
	{
		
	}
	
	public Configuration(String databaseDriver, String databaseName) 
	{
		super();
		this.databaseDriver = databaseDriver;
		this.databaseName = databaseName;
	}

	public String getDatabaseDriver() 
	{
		return databaseDriver;
	}
	
	public void setDatabaseDriver(String databaseDriver) 
	{
		this.databaseDriver = databaseDriver;
	}
	
	public String getDatabaseName() 
	{
		return databaseName;
	}
	
	public void setDatabaseName(String databaseName)
	{
		this.databaseName = databaseName;
	}
}

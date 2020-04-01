package com.softnet.cloud.springboot.model;

import org.springframework.http.HttpStatus;

public class RestResponseStatus
{
	private HttpStatus 	status;
	private String 		message;
	
	public RestResponseStatus() {}
	public RestResponseStatus(HttpStatus status, String message) 
	{
		this.status = status;
		this.message = message;
	}
	
	public HttpStatus getStatus()
	{
		return this.status;
	}
	
	public void setStatus(HttpStatus status)
	{
		this.status = status;
	}
	
	public String getMessage()
	{
		return this.message;
	}
	
	public void setMessage(String message)
	{
		this.message = message;
	}
}

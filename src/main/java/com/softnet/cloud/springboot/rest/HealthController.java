package com.softnet.cloud.springboot.rest;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.softnet.cloud.springboot.model.RestResponseStatus;

@RestController
public class HealthController
{
	@GetMapping("/health")
	public RestResponseStatus getStatus() 
	{
		return new RestResponseStatus(HttpStatus.OK, "I am UP");
    }
}

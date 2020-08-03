package com.tenfarmers.microservices.limitsservice;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.tenfarmers.microservices.limitsservice.bean.Configuration;
import com.tenfarmers.microservices.limitsservice.bean.LimitConfiguration;

@RestController
public class LimitsConfigurationController {
	
	@Autowired
	private Configuration configuration;
	
	@GetMapping("/limits")	
	public Configuration retrieveLimitsFromConfiguration() {
		return configuration;
		//return new LimitConfiguration(300, 30);
	}
}

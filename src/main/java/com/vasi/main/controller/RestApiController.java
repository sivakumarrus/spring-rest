package com.vasi.main.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestApiController {

	@GetMapping("/")
	public String serviceHealthCheck() {
		return "service health is good";
	}

}

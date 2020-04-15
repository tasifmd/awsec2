package com.taazsoft.awsec2.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/ec2")
public class Ec2Controller {

	@GetMapping("/test")
	public ResponseEntity<String> test() {
		String response = "Ec2 Instance Test";
		return new ResponseEntity<String>(response, HttpStatus.OK);
	}

}

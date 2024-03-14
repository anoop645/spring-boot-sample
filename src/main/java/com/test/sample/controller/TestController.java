package com.test.sample.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("api")
public class TestController {

	@GetMapping("hello")
	public ResponseEntity<String> getMsg() {
		return ResponseEntity.ok("hello World");
	}
}

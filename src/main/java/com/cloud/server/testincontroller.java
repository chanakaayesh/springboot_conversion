package com.cloud.server;

import java.math.BigDecimal;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class testincontroller {
	@GetMapping("/get")
	public String show() {
		return "showing";
	}
}

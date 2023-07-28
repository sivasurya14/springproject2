package com.sample;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SwaggerController {

	@GetMapping

	public String showMessage() {

		return "hellow world";
	}

}

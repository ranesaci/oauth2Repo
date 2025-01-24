package com.oauth.implementation.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthSecurityController {

	@GetMapping("/private/auth")
	public String privateResource() {
		return "privateResource";
	}
	
	@GetMapping("/public/auth")
	public String publicResource() {
		return "publicResource";
	}
}

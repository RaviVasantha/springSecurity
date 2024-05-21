package com.inventry;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value="/api")
public class SecurityController {
	
	@GetMapping(value="/public")
	public String publicApi() {
		return "This is public Api";
	}
	@GetMapping(value="/user")
	public String UserApi() {
		return "This is User Api";
	}
	@GetMapping(value="/admin")
	public String AdminApi() {
		return "This is Admin Api";
	}
	

}

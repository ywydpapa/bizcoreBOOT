package com.example.bizcore.user;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user/*")
public class UserController {
	
	@GetMapping("/login")
	public String Login() {
		return "�α���";
	}
}

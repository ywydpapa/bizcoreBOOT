package com.example.bizcore;

import javax.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {
	
	@GetMapping("/home")
	public String home(HttpSession session) {
		String userId = (String)session.getAttribute("userId");
		
		if(userId != null) {
			return "/main";
		} else {
			return "/user/login";
		}
	}
	
	@GetMapping("/main")
	public String main(HttpSession session) {
		return "∏ﬁ¿Œ »®";
	}
}

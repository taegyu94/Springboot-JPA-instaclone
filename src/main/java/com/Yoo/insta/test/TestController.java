package com.Yoo.insta.test;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/test/login")
	public String testLogin() {
		return "auth/loginForm";
	}
	
	@GetMapping("/test/join")
	public String testHome() {
		return "auth/joinForm";
	}
	
	@GetMapping("/test/profile")
	public String testProfile() {
		return "user/profile";
	}
	
	@GetMapping("/test/profileEdit")
	public String testProfileEdit() {
		return "user/profile_edit";
	}
	
	@GetMapping("/test/feed")
	public String testFeed() {
		return "image/feed";
	}
	
	@GetMapping("/test/imageUpload")
	public String testImageUpload() {
		return "image/image_upload";
	}
}

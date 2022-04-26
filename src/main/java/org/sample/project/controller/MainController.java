package org.sample.project.controller;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {
	@GetMapping("/")
	public String index() {
		return "index";
	}
	
	@GetMapping("/test")
	public String test() {
		return "test";
	}
	
	@PostMapping("/formPostEx")
	public String formPostEx(@RequestParam("user_id")String user_id, @RequestParam("user_pw")String user_pw) {
		System.out.print("formPostEx 작동" + user_id);
		return "redirect:/";
	}
	
}

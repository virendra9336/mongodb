package org.krams.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/")
public class MediatorController {

	@RequestMapping
	public String getHomePage() {
		System.out.println("hello web");
		System.out.println("hello web1111");
		return "redirect:/users";
	}
}

package com.test.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MvcController {

	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("msg", "From Controller");
		return "index";
	}
}

package com.test.project.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.test.project.DTO.LoginDTO;

@Controller
public class MvcController {

	@GetMapping("/")
	public String getHome(Model model) {
		model.addAttribute("msg", "From Controller");
		return "index";
	}

	@GetMapping("/login")
	public String login(Model model) {
		return "login";
	}

	@PostMapping("/doLogin")
	public String doLogin(@ModelAttribute("userInfo") LoginDTO loginDTO, Model model) {
		System.out.println(loginDTO.getUsername());
		model.addAttribute("user", loginDTO);
		return "welcome";
	}
}

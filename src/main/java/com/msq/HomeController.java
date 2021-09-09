package com.msq;

import java.util.Date;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
@GetMapping("/")
public String me(Model model) {
	model.addAttribute("dt", new Date().toString());
	return "me";
}
}

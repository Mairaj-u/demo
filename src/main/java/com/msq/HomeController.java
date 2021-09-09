package com.msq;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class HomeController {
	@Autowired
	private UserRpository userRepository;
@GetMapping("/")
public String me(Model model) {
	User user=new User();
	user.setName("mairaj");
	
	
	
	model.addAttribute("dt", new Date().toString());
	return "me";
}
}

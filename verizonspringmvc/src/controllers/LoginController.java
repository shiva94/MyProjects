package controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class LoginController {
	@RequestMapping("loginvalidate")
	public String loginValidate(@ModelAttribute("login") Login log){
		if(log.getUsername().equals(log.getPassword()))
			return "Success";
		else
			return "Failed";
	}
	
}

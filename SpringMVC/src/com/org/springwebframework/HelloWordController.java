package com.org.springwebframework;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller

public class HelloWordController {

	@RequestMapping("/")
	public String hello() {
		return "hello";
	}

	@RequestMapping(value = "/hi", method = RequestMethod.GET)
	public String hi(@RequestParam("name") String name, Model model) {
		String message = "Hi " + name + "!";
		model.addAttribute("message", message);
		return "hi";
	}

}

package com.cognizant.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HelloController {
	
	@RequestMapping(value="hello.htm", method=RequestMethod.GET)
	public ModelAndView sayHello(){
		ModelAndView mv = new ModelAndView();
		String data = "HelloWorld!";
		mv.addObject("data",data);
		mv.setViewName("hello");
		
		return mv;
	}
	
}

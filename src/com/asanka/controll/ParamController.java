package com.asanka.controll;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ParamController {

	/*@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView printMessage(@PathVariable("userName") String user, @PathVariable("countryName") String country){
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMsg", "hello, " + user + " from " + country);
		
		return modelAndView;		
	}*/
	
	@RequestMapping("/welcome/{countryName}/{userName}")
	public ModelAndView printMessage(@PathVariable Map<String, String> pathVars){
		
		String user = pathVars.get("userName");
		String country = pathVars.get("countryName");
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMsg", "hello, " + user + " from " + country);
		
		return modelAndView;		
	}
}

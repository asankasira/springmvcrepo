package com.asanka.controll;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

/**
 * 
 * MulitiAction Controller class 
 *
 */

@Controller
@RequestMapping("/entertain")
public class AnnoController {
	
	@RequestMapping("/jive")
	public ModelAndView printMessage(){
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMsg", "Works with Annotation Jive Dancing");
		
		return modelAndView;		
	}
	
	@RequestMapping("/music")
	public ModelAndView displaySongs(){
		
		ModelAndView modelAndView = new ModelAndView("HelloPage");
		modelAndView.addObject("welcomeMsg", "Ukule Orchestra theme song");
		
		return modelAndView;		
	}
}

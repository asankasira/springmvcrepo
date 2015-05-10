package com.asanka.controll.student;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.asanka.model.domain.Student;

@Controller
public class StudentSubmissionController {
	
	@RequestMapping(value="admission.html", method=RequestMethod.GET)
	public ModelAndView getSubmissionForm(){
		
		ModelAndView modelAndView = new ModelAndView("AdmissionForm");
		return modelAndView;
	}

/*	@RequestMapping(value="submitAdmission.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@RequestParam Map<String, String> reqParams){
		
	    String firstName = reqParams.get("firstname");
	    String lastName = reqParams.get("lastname");
		
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		modelAndView.addObject("firstname", firstName);
		modelAndView.addObject("lastname", lastName);
		
		return modelAndView;
	}*/
	
	@RequestMapping(value="submitAdmission.html", method=RequestMethod.POST)
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student st){
				
		ModelAndView modelAndView = new ModelAndView("AdmissionSuccess");
		return modelAndView;
	}
	
	/**
	 * gets called before handling any request
	 */
	@ModelAttribute
	public void addCommonModelObects(Model model){
		model.addAttribute("headerMessage", "College of Engineering, India");
	}
}

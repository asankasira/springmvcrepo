package com.asanka.controll.student;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Map;

import org.springframework.beans.propertyeditors.CustomDateEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.asanka.editor.StudentNameEditor;
import com.asanka.model.domain.Student;

@Controller
public class StudentSubmissionController {
	
	private final static DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
	
	@InitBinder
	public void initializeBinder(WebDataBinder binder){
//		binder.setDisallowedFields("studentHobby","dateOfBirth");
		
		binder.registerCustomEditor(Date.class, new CustomDateEditor(formatter, false));
		binder.registerCustomEditor(String.class, "firstname", new StudentNameEditor());
	}
	
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
	public ModelAndView submitAdmissionForm(@ModelAttribute("student") Student st, BindingResult result){
			
		String viewName = "AdmissionSuccess";
		
		if(result.hasErrors()){
			viewName = "AdmissionForm";
		}
		
		ModelAndView modelAndView = new ModelAndView(viewName);
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

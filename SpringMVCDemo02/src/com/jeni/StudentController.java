package com.jeni;

import javax.servlet.http.HttpServletRequest;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class StudentController {
//	
//	@RequestMapping(path="/studentform")
//	public String showStudentForm(Model model) {
//		return "studentform";
//	}
//	
	@RequestMapping(path="/studentform")
	public String showStudentForm(Model model) {
		return "studentFormJSTL";
	}
	
	@RequestMapping(path="/studentformV3")
	public String showStudentFormV3(Model model) {
		model.addAttribute("student", new Student());
		return "studentform";
	}
	
	
	@RequestMapping(path="/processStudentForm")
	public String processStudentForm(HttpServletRequest request, Model model) {
		String firstName = request.getParameter("firstName");
		String lastName = request.getParameter("lastName");
	
		
		firstName = (firstName.charAt(0)+"").toUpperCase() + firstName.substring(1).toLowerCase();
		lastName = (lastName.charAt(0)+"").toUpperCase() + lastName.substring(1).toLowerCase();
		
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "studentDetails";
	}
	
	@RequestMapping(path="/processStudentFormV2")
	public String processStudentFormV2(@RequestParam(name="firstName") String firstName, @RequestParam(name="lastName") String lastName,Model model) {
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
		
		firstName = (firstName.charAt(0)+"").toUpperCase() + firstName.substring(1).toLowerCase();
		lastName = (lastName.charAt(0)+"").toUpperCase() + lastName.substring(1).toLowerCase();
		
		model.addAttribute("firstName", firstName);
		model.addAttribute("lastName", lastName);
		return "studentDetails";
	}
	

	@RequestMapping(path="/processStudentFormV3")
	public String processStudentFormV3(
			@Valid @ModelAttribute(name="student") Student student, BindingResult bindingResult) {
//		String firstName = request.getParameter("firstName");
//		String lastName = request.getParameter("lastName");
		if(bindingResult.hasErrors()) {
			return "studentFormJSTL";
		}
		String firstName = student.getFirstName();
		String lastName = student.getLastName();

		firstName = (firstName.charAt(0)+"").toUpperCase() + firstName.substring(1).toLowerCase();
		lastName = (lastName.charAt(0)+"").toUpperCase() + lastName.substring(1).toLowerCase();
		
		student.setFirstName(firstName);
		student.setLastName(lastName);
		
		//model.addAttribute("student", student);
	
		
//		model.addAttribute("firstName", firstName);
//		model.addAttribute("lastName", lastName);
		return "studentDetails";
	}


}

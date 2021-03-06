package controllers;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

//import day15.Employee;

@Controller
@RequestMapping("/emplform.htm")
public class EmployeeController {
	@Autowired
	EmployeeValidations validations;
	@Autowired
	EmployeeDAOImpl dao;
	@RequestMapping(method=RequestMethod.GET)
	public ModelAndView showEmplForm()
	{
		Employee employee = new Employee();
		ModelAndView mav= new ModelAndView();
		mav.addObject(employee);
		mav.setViewName("EmployeeForm");
		return mav;
	}
	@RequestMapping(method=RequestMethod.POST)
	public ModelAndView processFrom(@ModelAttribute("employee") Employee empl, BindingResult result)
	{	
		ModelAndView mav= new ModelAndView();
		validations.validate(empl,result);
		if(result.hasErrors())
			mav.setViewName("EmployeeForm");
		else{
			dao.addEmployee(empl);
			List<Employee> employees= dao.getEmployees();
			mav.addObject("empls",employees);
			mav.addObject("e",empl);
			mav.setViewName("EmplSuccess");
		}
		return mav;
	}
}
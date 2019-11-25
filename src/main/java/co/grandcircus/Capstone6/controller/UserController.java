package co.grandcircus.Capstone6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Capstone6.model.User;
import co.grandcircus.Capstone6.repo.TaskRepo;
import co.grandcircus.Capstone6.repo.UserRepo;

@Controller
public class UserController {
	
	@Autowired
	UserRepo u;
	
	@Autowired
	TaskRepo t;
	
	
	@RequestMapping("create-account")
	public ModelAndView add(User uDetails) {
		u.save(uDetails);
		return new ModelAndView("register");
	}
	
	@RequestMapping("sign-in")
	public ModelAndView goToTasks() {
		
		return new ModelAndView("task-list");
		
	}
	

}

package co.grandcircus.Capstone6.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import co.grandcircus.Capstone6.model.Task;
import co.grandcircus.Capstone6.repo.TaskRepo;

@Controller
public class TaskController {

	@Autowired
	TaskRepo t;
	

	@RequestMapping("add-task")
	public ModelAndView add(Task tDetails) {
		t.save(tDetails);
		return new ModelAndView("task-list", "tasks", t.findAll());
	}
	
	@RequestMapping("delete")
	public ModelAndView delete(Task task) {
		t.delete(task);
		return new ModelAndView("task-list");
		
	}
}

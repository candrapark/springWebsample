package net.msfl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller public class SpringWebSampleController {
	@RequestMapping("/spring") 
	public ModelAndView springWebSample() {
		String message = "First sample with the Spring Framework!";
		return new ModelAndView("spring", "message", message);
	}
}

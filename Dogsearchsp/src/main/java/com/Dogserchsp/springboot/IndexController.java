package com.Dogserchsp.springboot;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class IndexController {

	@RequestMapping(value="/index", method=RequestMethod.GET)
	public ModelAndView send(
			ModelAndView mav) {

		mav.setViewName("index");
		return mav;
	}
}
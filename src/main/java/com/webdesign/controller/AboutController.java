package com.webdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webdesign.service.AboutService;


@Controller
public class AboutController {
	
	@Autowired
	private AboutService aboutService;
	
	@RequestMapping(value="/about", method=RequestMethod.GET)
	public ModelAndView menu() {
		ModelAndView model = new ModelAndView();
		model.setViewName("pages/about");
		model.addObject("mainList", aboutService.aboutMeInfo());
		return model;
	}
}

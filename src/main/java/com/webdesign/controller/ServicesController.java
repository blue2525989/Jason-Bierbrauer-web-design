package com.webdesign.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.webdesign.service.ServicesService;

@Controller
public class ServicesController {

	@Autowired
	private ServicesService servicesService;
	
	@RequestMapping(value="/services", method=RequestMethod.GET)
	public ModelAndView location() {
		ModelAndView model = new ModelAndView();
		model.setViewName("pages/services");
		model.addObject("mainList", servicesService.serviceList());
		return model;
	}
}

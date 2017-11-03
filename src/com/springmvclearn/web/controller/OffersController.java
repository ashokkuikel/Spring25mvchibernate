package com.springmvclearn.web.controller;

import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class OffersController {

	// Sending value from controller to page via HttpSession session
	// @RequestMapping("/")
	// public String showHome(HttpSession httpSession){
	// httpSession.setAttribute("name", "Sanjay");
	// return "home";
	// }

	// Sending value from controller to page via ModelAndView
//	@RequestMapping("/")
//	public ModelAndView showHome() {
//		ModelAndView modelAndView = new ModelAndView("home");
//		Map<String, Object> model = modelAndView.getModel();
//		model.put("name", "I am sanjay");
//		return modelAndView;
//	}
	
	
	@RequestMapping("/")
	public String showHome(Model model) {
		model.addAttribute("name", "<b> I am from model <b>");
		return "home";
	}

}

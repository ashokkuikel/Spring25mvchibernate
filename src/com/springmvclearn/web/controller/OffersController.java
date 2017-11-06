package com.springmvclearn.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.springmvclearn.web.dao.Offer;
import com.springmvclearn.web.service.OffersService;

@Controller
public class OffersController {
	
	private OffersService OffersService;
	
	

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
	
	@Autowired
	public void setOffersService(OffersService offersService) {
		OffersService = offersService;
	}



	@RequestMapping("/")
	public String showHome(Model model) {
		  List<Offer> offers  = OffersService.getCurrent();
		model.addAttribute("offers", offers);
		return "home";
	}

}

package com.springmvclearn.web.controller;

import java.util.List;

import org.apache.catalina.connector.Request;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

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
	// @RequestMapping("/")
	// public ModelAndView showHome() {
	// ModelAndView modelAndView = new ModelAndView("home");
	// Map<String, Object> model = modelAndView.getModel();
	// model.put("name", "I am sanjay");
	// return modelAndView;
	// }

	@Autowired
	public void setOffersService(OffersService offersService) {
		OffersService = offersService;
	}

	@RequestMapping("createOffer")
	public String creatOffer() {
		return "createOffer";
	}

	@RequestMapping(value = "offerCreate", method = RequestMethod.POST)
	public String afterCreate(Model model, Offer offer) {
		System.out.println(offer);
		OffersService.create(offer);
		List<Offer> offers = OffersService.getCurrent();
		model.addAttribute("offers", offers);
		return "offerCreateMessage";
	}

}

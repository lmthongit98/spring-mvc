package com.laptrinhjavaweb.controller.admin;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller(value = "newsControllerOfAdmin")
public class NewsController {
	
	@RequestMapping(value = "/news/list", method = RequestMethod.GET)
	public ModelAndView showList() {
		ModelAndView mav = new ModelAndView("admin/news/list");
		return mav;
	}
	
	@RequestMapping(value = "/news/edit", method = RequestMethod.GET)
	public ModelAndView editNews() {
		ModelAndView mav = new ModelAndView("admin/news/edit");
		return mav;
	}

}

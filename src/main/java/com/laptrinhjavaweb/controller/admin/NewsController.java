package com.laptrinhjavaweb.controller.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.laptrinhjavaweb.model.NewModel;
import com.laptrinhjavaweb.service.INewService;

@Controller(value = "newsControllerOfAdmin")
public class NewsController {
	
	@Autowired
	private INewService newService;
	
	@RequestMapping(value = "/quan-tri/bai-viet/danh-sach", method = RequestMethod.GET)
	public ModelAndView showList(@ModelAttribute("model") NewModel  model) {
 		ModelAndView mav = new ModelAndView("admin/news/list");
 		model.setListResult(newService.findAll());
 		mav.addObject("model", model);
		return mav;
	}
	
	@RequestMapping(value = "/quan-tri/bai-viet/chinh-sua", method = RequestMethod.GET)
	public ModelAndView editNews() {
		ModelAndView mav = new ModelAndView("admin/news/edit");
		return mav;
	}

}

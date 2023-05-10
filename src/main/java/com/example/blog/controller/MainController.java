package com.example.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class MainController {

	@GetMapping("/")
    public String test(Model model) {
		
        Post post1 = new Post(1, "히유", "아즈아즈아");
        Post post2 = new Post(2, "sprin이이이잉", "ㅠㅠ");

        List<Post> list = new ArrayList<>();
        list.add(post1);
        list.add(post2);

        model.addAttribute("list", list);
        
        return "test";
    }
	
	@GetMapping("/loginform")
	public ModelAndView getLoginform() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("loginform");
		
		return mav;
	}
	
	
	@GetMapping("/mailform")
	public ModelAndView getMailform() {
		ModelAndView mav = new ModelAndView();
		mav.setViewName("mailform");
		
		return mav;
	}
}
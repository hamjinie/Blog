package com.example.blog.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class TestController {

	@GetMapping("/")
    public String test(Model model) {
		
        Post post1 = new Post(1, "오빠", "죄송해여");
        Post post2 = new Post(2, "너무", "늦었어여 ㅠㅠ");

        List<Post> list = new ArrayList<>();
        list.add(post1);
        list.add(post2);

        model.addAttribute("list", list);
        
        return "test";
    }
}
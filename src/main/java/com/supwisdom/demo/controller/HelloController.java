package com.supwisdom.demo.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Demo Controller
 * @author xiaodong.li
 */
@Controller
@RequestMapping("/demo")
public class HelloController {
	
	private static final Logger logger = LoggerFactory.getLogger(HelloController.class);
	
	@RequestMapping("/hello")
	public String hello(Model model) {
		logger.info("to ftl");
        model.addAttribute("welcome", "欢迎");
        return "hello";
    }
	
	@RequestMapping("/world")
	public String world(Model model) {
		logger.info("to jsp");
        model.addAttribute("welcome", "欢迎");
        return "world";
    }
	
}

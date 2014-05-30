package org.codemelon.sample.springmvc.controller;

import org.codemelon.sample.springmvc.config.AppConfig;
import org.codemelon.sample.springmvc.model.TodoItem;
import org.codemelon.sample.springmvc.service.TodoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class HomeController {

	private static final Logger log = LoggerFactory.getLogger(HomeController.class);

	@Autowired
	private AppConfig appConfig;

    @Autowired
    private TodoService todoService;

    @RequestMapping(value = "home", method = RequestMethod.GET)
    public String home(Model model) {
    	log.info("enter into HomeController.home()");

    	log.debug("show github config:");
    	log.debug("github client_id is " + appConfig.getGithubClientId());
    	log.debug("github client_secret is " + appConfig.getGithubClientSecret());

        TodoItem todoItem = todoService.getTodoById(1);

        log.debug("Todo item 1: " + todoItem.getTitle());

    	log.trace("cannot be seen yet");

        model.addAttribute("name", "allege");
        return "home";
    }
}

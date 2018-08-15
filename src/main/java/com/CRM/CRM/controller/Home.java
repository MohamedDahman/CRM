package com.CRM.CRM.controller;


import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.GetMapping;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.SessionAttributes;


@Controller
@SessionAttributes("IsLog")
@ControllerAdvice
public class Home {


    private final Logger log = LoggerFactory.getLogger(Home.class);

    @ModelAttribute("IsLog")
    public String getIsLog() {
      /*  if (SecurityContextHolder.getContext().getAuthentication().getName().
                equals("anonymousUser")) {
            return  "NotLoged";
        }
        else
      */  {
            return "NotLoged";
        }
    }
    @GetMapping("/")
    String page() {
        log.info("Home Page Start");
        return "index";
    }

}

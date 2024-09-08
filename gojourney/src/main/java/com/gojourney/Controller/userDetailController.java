package com.gojourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.gojourney.Entity.UserDetailsEntity;
import com.gojourney.Service.UserDetailsService;
import org.springframework.web.bind.annotation.PostMapping;


@Controller

public class userDetailController {
    @Autowired
    UserDetailsService userDetailsService;
    
    @PostMapping("/TripDetails")
    public String UserDetailsForTrip(UserDetailsEntity userDetailsEntity, Model model){
    String message   = userDetailsService.UserDetailsForTrip(userDetailsEntity);
    model.addAttribute("message", message);
      return "home-page2.html"; 
}
}

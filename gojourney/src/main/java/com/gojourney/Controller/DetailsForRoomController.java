package com.gojourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import com.gojourney.Entity.DetailsForRoomEntity;

import com.gojourney.Service.DetailsForRoomService;

@Controller
public class DetailsForRoomController {
    @Autowired
    DetailsForRoomService detailsForRoomService;
    @PostMapping("/SaveDetailsForRoom")

    public String registerUser(DetailsForRoomEntity detailsForRoomEntity, Model model){
        String message = detailsForRoomService.detailsSaveForRoom(detailsForRoomEntity);
        if("save sucessfully".equals(message)){
            return "home-page2.html";
        }
        else {
            model.addAttribute("message", message);
            return "UserDetails.html";   
        }

    }
}

package com.gojourney.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.gojourney.Entity.UserEntity2;
import com.gojourney.Service.RegisterService;



@Controller
public class HomeController {
    @Autowired
    RegisterService registerService;

    @PostMapping("/saveResgistrationformData")
     public String registerUser(UserEntity2 userEntity2, Model model){
           String message = registerService.registerUser(userEntity2);
      model.addAttribute("message", message);
      return "register"; 

    }
    
    @PostMapping("/login")
    public String userLogin(@RequestParam("email") String email, @RequestParam("password") String password, Model model) {
        String message = registerService.LoginUser(email, password);

        if ("Sucessfully Login".equals(message)) {
          return "home-page.html"; 
           
        } else {
            model.addAttribute("message", message);
            return "login.html";   
        }
    }
    

    @GetMapping("/home")
    public String home() {
        return "home-page";
    }

    @GetMapping("/book-your-trip")
    public String bookYourTrip() {
        return "home-page2";
    }

    @GetMapping("/service")
    public String service() {
        return "service";
    }

    @GetMapping("/about-my-booking")
    public String aboutMyBooking() {
        return "about_booking";
    }

    @GetMapping("/login")
    public String showLoginPage() {
        return "login"; // This returns the login.html file
    }

    @GetMapping("/register")
    public String showRegisterPage() {
        return "register";
    }

    @GetMapping("/register-box")
    public String showRegisterPage2() {
        return "register"; // Returns the register.html file

    }

  
    @GetMapping("/book-your-trip2")
    public String bookYourTrip2() {
        return "currentBooking";
    }

    @GetMapping("/previous-booking")
    public String bookYourTrip3() {
        return "previousBooking.html";
    }

    @GetMapping("/home-page")
    public String bookYourTrip4() {
        return "home-page.html";
    }

    @GetMapping("/contact-us")
    public String bookYourTrip5() {
        return "contact-me.html";
    }

    @GetMapping("/work")
    public String Working_with_us() {
        return "Working_with_us.html";
    }
 
      @GetMapping("/career")
      public String Career(){
        return "careers.html";

      }
      @GetMapping("/About_trip")
      public String About_Gojourney(){
        return "About_Gojourney.html";
      }
      @GetMapping("/contact2")
      public String Contact2(){

        return ("contact-me.html");
      }
      @GetMapping("/homePage2")
      public String  home2find(){
        return "home-page2.html";
      }
     
      @GetMapping("/Booking_Explore")
      public String  Booking_Explore(){
        return "Booking_Explore2.html";
      }
      @GetMapping("/userDetails")
      public String  userDetails1(){
        return "UserDetails.html";
      }
      @GetMapping("/userDetails2")
      public String  BookNow2(){
        return "userdetails_For_Trip.html";
      }
      
      }

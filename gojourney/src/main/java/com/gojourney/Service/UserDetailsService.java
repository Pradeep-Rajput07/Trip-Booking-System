package com.gojourney.Service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gojourney.Entity.UserDetailsEntity;
import com.gojourney.Repository.UserDetailsRepository;



@Service
public class UserDetailsService {
    
    @Autowired
    UserDetailsRepository userDetailsRepository;

    public String UserDetailsForTrip(UserDetailsEntity userDetailsEntity){
        if(userDetailsEntity!=null){
        userDetailsRepository.save(userDetailsEntity);
        return "user Details save sucessfully";
        }
        else{
            return "some is wrong ";
        }
    }
    
}


    



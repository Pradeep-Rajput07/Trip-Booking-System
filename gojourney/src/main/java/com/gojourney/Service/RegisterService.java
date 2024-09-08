package com.gojourney.Service;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.gojourney.Entity.UserEntity2;
import com.gojourney.Repository.UserRepository;

@Service
public class RegisterService {

    @Autowired
    UserRepository userRepository;

    public String registerUser(UserEntity2 userEntity2) {

        Optional<UserEntity2> exitingUser =userRepository.findByEmail(userEntity2.getEmail());
        if(exitingUser.isPresent()){
            return "User already exists";
        }

if(!userEntity2.getPassword().equals(userEntity2.getConfirmPassword())){
    return "Password and Confirm Password does not match";
}

else {

     userRepository.save(userEntity2);
     return "Sucessfully User Register";
}
    }


    public String LoginUser(String email, String password){
        
        UserEntity2 user = userRepository.findByEmail(email).orElse(null);
        if(user!=null && user.getPassword().equals(password)){
            return "Sucessfully Login";
        }
        else{
            return "Email and Password Not Valid";

        }

        
    }


}
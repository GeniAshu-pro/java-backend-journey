package com.example.Controller;

import com.example.Service.UserService;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller
public class UserController {
    private UserService userService ;

    public UserController(UserService userService) {
        this.userService = userService;
    }

    public void createUser(String name){
     userService.addUser(name);
        System.out.println("User added: "+name);
    }

    public void listUser(){
        List<String> users=userService.getAllUser();
        System.out.println("All Users: "+users);
    }
}

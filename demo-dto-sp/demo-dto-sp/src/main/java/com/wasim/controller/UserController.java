package com.wasim.controller;

import com.wasim.dto.UserLocationDTO;
import com.wasim.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/users-location")
    public List<UserLocationDTO> getAllUsersLocations(){
           return userService.getAllUsersLocations();
    }
}

package com.example.SpringJWT.Controller;

import com.example.SpringJWT.Entity.User;
import com.example.SpringJWT.Service.UserService;
import org.slf4j.ILoggerFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class HomeController {
//    Logger logger = LoggerFactory.getLogger(HomeController.class);
@Autowired
 private UserService userService;

    @GetMapping("/users")
    public List<User> getUSer(){
        System.out.println("this is working msg");
        return this.userService.getUser();
    }
}

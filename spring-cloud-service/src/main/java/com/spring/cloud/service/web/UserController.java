package com.spring.cloud.service.web;

/**
 * Created by Tima on 7/20/16.
 */
import java.util.List;

import com.spring.cloud.service.domain.UserService;
import com.spring.cloud.service.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Autowired
    UserService userService;

    @RequestMapping(value="/user",method=RequestMethod.GET)
    public List<User> readUserInfo(){
        List<User> ls=userService.searchAll();
        return ls;
    }
}
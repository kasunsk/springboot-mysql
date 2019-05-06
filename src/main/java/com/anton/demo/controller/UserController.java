package com.anton.demo.controller;

import com.anton.demo.service.UserService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    private static final Logger log = LoggerFactory.getLogger(UserController.class);

    private UserService userService;

    @Autowired
    public UserController(UserService userService) {
        this.userService = userService;
    }

    @CrossOrigin
    @RequestMapping(value = "/{username}", method = RequestMethod.GET)
    public String getUserAddressByUsername(@PathVariable("username") String username) {
        log.info("Username : {}" , username);
        return userService.getUserByUsername(username).getAddress();
    }
}

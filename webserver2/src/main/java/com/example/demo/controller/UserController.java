package com.example.demo.controller;

import com.example.demo.service.UserService;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
class UserControler {

    @Autowired
    private UserService userService;

    @GetMapping("/")
    List<String> all() {
        return userService.getUsers();
    }
}

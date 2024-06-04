package com.example.demo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserServiceImpl implements UserService {

    private static final Log logger = LogFactory.getLog(UserServiceImpl.class);

    @Override
    public List<String> getUsers() {
        logger.info("getUsers() has been called");

        List<String> users = new ArrayList<>();
        users.add("adam");
        users.add("sally");

        return users;
    }
}

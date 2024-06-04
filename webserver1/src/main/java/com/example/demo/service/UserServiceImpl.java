package com.example.demo.service;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.function.client.WebClient;

import java.util.ArrayList;
import java.util.List;

import com.example.demo.model.User;

@Component
public class UserServiceImpl implements UserService {

    private static final Log logger = LogFactory.getLog(UserServiceImpl.class);

    @Override
    public List<String> getUsers() {
        List<String> users = new ArrayList<>();
        users.add("adam");
        users.add("sally");

        try {
            WebClient webClient = WebClient.Builder().baseUrl("http://localhost:8081").build();
            webClient
                .get()
                .uri("/")
                .retrieve()
                .bodyToMono(User.class);
        }catch(Exception e) {
            logger.error("error");
        }

        return users;
    }
}

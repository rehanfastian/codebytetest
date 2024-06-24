package com.coderbyte.test.service;

import com.coderbyte.test.model.User;

import java.util.Arrays;
import java.util.List;

@Service
public class UserService {

    private final RestTemplate restTemplate;

    public UserService(){
        this.restTemplate = new RestTemplate();
    }
    public List<User> getAllUsers(){
        String userUrl = "https://gorest.co.in/public/v2/users";
        User[] users =restTemplate.getForObject(userUrl, User[].class);
        return Arrays.asList(users);
    }
}

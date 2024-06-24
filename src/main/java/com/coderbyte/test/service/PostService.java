package com.coderbyte.test.service;

import com.coderbyte.test.model.Post;
import java.util.List;

@Service
public class PostService {

    private final RestTemplate restTemplate;

    public PostService(){
        this.restTemplate = new RestTemplate();
    }


    public List<Post> getAllPosts(){
        String postUrl = "https://gorest.co.in/public/v2/posts";
        Post[] posts =restTemplate.getForObject(postUrl, Post[].class);
    }
}

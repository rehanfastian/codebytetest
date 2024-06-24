package com.coderbyte.test.service;

import com.coderbyte.test.model.Comment;
import com.coderbyte.test.model.Post;

import java.util.Arrays;
import java.util.List;

@Service
public class CommentService {

    private final RestTemplate restTemplate;

    public CommentService(){
        this.restTemplate = new RestTemplate();
    }


    public List<Comment> getAllComments(){
        String commentsUrl = " https://gorest.co.in/public/v2/comments";
        Comment[] comments =restTemplate.getForObject(commentsUrl, Comment[].class);
        return Arrays.asList(comments);
    }
}

package com.coderbyte.test.controller;

import com.coderbyte.test.model.Comment;
import com.coderbyte.test.model.Post;
import com.coderbyte.test.model.User;
import com.coderbyte.test.service.CommentService;
import com.coderbyte.test.service.PostService;
import com.coderbyte.test.service.UserService;

import java.util.List;

@RestController
public class TestController {
    @Autowired
    private UserService userService;
    @Autowired
    private PostService postService;
    @Autowired
    private CommentService commentService;


    @GetMapping("/users")
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts(){
        return postService.getAllPosts();
    }

    @GetMapping("/comments")
    public List<Comment> getAllComments(){
        return commentService.getAllComments();
    }

}

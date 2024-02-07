package com.example.blog.controller;

import org.springframework.web.bind.annotation.RestController;

import com.example.blog.entity.Blog;
import com.example.blog.service.BlogService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


@RestController
@RequestMapping("/blog")
public class BlogController {
    
    @Autowired
    private BlogService blogService;

    @GetMapping()
    public List<Blog> getAllBlogs() {
        return blogService.getAllBlogs();
    }

    @GetMapping("/{id}")
    public Blog getBlogById(@PathVariable Long id){
        return blogService.getBlogById(id);
    }

    @PostMapping
    public Blog addBlogToCollection(@RequestBody Blog blog){
        return blogService.addBlog(blog);
    }
}

package com.example.blog.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.example.blog.entity.Blog;

@Service
public class BlogService {
    private static List<Blog> blogs = new ArrayList<Blog>(); 
    public Blog getBlogById(long id){
        for (Blog blog : blogs) {
            if(blog.getId().equals(id)) return blog;
        }
        //return blogs.stream().filter(b->b.getId().equals(id)).toList().get(0);
        return null;
    }

    public List<Blog> getAllBlogs (){
        return blogs;
    }

    public Blog addBlog(Blog blog){
        blog.setId((long) (blogs.size()+1));
        blogs.add(blog);
        return blog;
    }
}

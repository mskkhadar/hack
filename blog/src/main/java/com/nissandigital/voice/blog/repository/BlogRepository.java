package com.nissandigital.voice.blog.repository;

import java.util.List;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.nissandigital.voice.blog.repository.model.Blog;

public interface BlogRepository extends MongoRepository<Blog, String> {
	Blog findByBlogId(String blogId);
	List<Blog> findBlogsByCreatedByList(String createdBy);
}

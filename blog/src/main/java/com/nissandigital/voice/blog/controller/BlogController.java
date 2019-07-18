package com.nissandigital.voice.blog.controller;

import java.util.List;

import javax.validation.Valid;

import org.bson.types.ObjectId;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.nissandigital.voice.blog.repository.BlogRepository;
import com.nissandigital.voice.blog.repository.model.Blog;

@RestController
@RequestMapping("/blog")
public class BlogController {

	@Autowired
	private BlogRepository blogRepository;

	@PostMapping("/")
	public @ResponseBody Blog addBlog(@Valid @RequestBody Blog blog) {
		blog.setBlogId(ObjectId.get());
		blogRepository.save(blog);
		return blog;
	}

	@PutMapping("/{blogid}")
	public @ResponseBody String updateBlog(@PathVariable("blogId") ObjectId blogId, @Valid @RequestBody Blog blog) {
		blog.setBlogId(blogId);
		blogRepository.save(blog);
		return "success";
	}

	@GetMapping("/")
	public @ResponseBody List<Blog> getAllBlog() {
		return blogRepository.findAll();
	}

	@GetMapping("/userid")
	public @ResponseBody List<Blog> getAllBlogByUserId(@RequestParam("userid") String createdBy) {
		return blogRepository.findBlogsByCreatedByList(createdBy);
	}

	@GetMapping("/blogid/")
	public @ResponseBody Blog getBlogByBlogId(@RequestParam("blogid") String blogId) {
		return blogRepository.findByBlogId(blogId);
	}

}

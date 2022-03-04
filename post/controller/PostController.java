package com.example.post.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.post.model.CommentsDto;
import com.example.post.model.Post;
import com.example.post.service.PostService;

@RestController
@RequestMapping("/post")
public class PostController {
	
	@Autowired
	PostService service;
	private Object auther;
	
	@GetMapping("/all")
	public List<Post> showAll(){
		return service.displayAllPost();
	}
	
	@PostMapping("/add")
	public String addPost(@RequestBody Post post) {
		return service.inserPost(post);
	}
	
	@DeleteMapping("/delete/{pid}")
	public String deletepost(@PathVariable("pid") int pid) {
		return service.deletePost(pid);
	}
	
	@GetMapping("/auther/{auther}")
	public List<Post> searchByAuther(@PathVariable("auther") String auther) {
			return service.searchPostByAuthor(auther);
	}
	
	@GetMapping("/title/{title}")
	public List<Post> searchByTitle(@PathVariable("title") String title) {
			return service.searchPostByTitle(title);
	}
	
	@GetMapping("/comments/{pid}")
	public List<CommentsDto> findByPid(@PathVariable("pid")int pid){
		
		return service.searchCommentsByPid(pid);
	}

}
package com.example.comment.controller;
import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.comment.service.CommentService;

@RestController
@RequestMapping("/comment")
public class CommentController
{
	
	@Autowired
	CommentService service;
	
	@GetMapping("/all")
	public List<Comment> showAll()
	{
		return service.displayAllComments();
	}
	
	@PostMapping("/add")
	public String addComment(@RequestBody Comment comment) 
	{
		return service.insertComment(comment);
	}
	
	@DeleteMapping("/delete/{cid}")
	public String deletepost(@PathVariable("cid") int cid)
	{
		return service.deleteComment(cid);
	}
	
	@GetMapping("/commenter/{name}")
	public List<Comment> searchByCommenter(@PathVariable("name") String commenter) 
	{
			return service.searchCommentsByCommenter(commenter);
	}
	
	@GetMapping("/pid/{pid}")
	public List<Comment> searchByPid(@PathVariable("pid") int pid)
	{
			return service.searchCommentsByPostId(pid);
	}


}
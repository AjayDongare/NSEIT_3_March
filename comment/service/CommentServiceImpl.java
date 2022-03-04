package com.example.comment.service;


import java.util.List;

import javax.xml.stream.events.Comment;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.comment.repo.CommentRepo;
import com.example.comment.repo.CommentRepo;

@Service
public class CommentServiceImpl implements CommentService
{
	
	@Autowired
	CommentRepo repo;

	@Override
	public String insertComment(Comment comment) 
	{
		// TODO Auto-generated method stub
		repo.save(comment);
		return "Comment Added";
	}

	@Override
	public List<Comment> displayAllComments() 
	{
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deleteComment(int cid)
	{
		// TODO Auto-generated method stub
		repo.deleteById(cid);
		return "Comment Deleted";
	}

	@Override
	public List<Comment> searchCommentsByCommenter(String commenter) 
	{
		// TODO Auto-generated method stub
		return repo.searchCommentsByCommenter(commenter);
	}

	@Override
	public List<Comment> searchCommentsByPostId(int pid)
	{
		// TODO Auto-generated method stub
		return repo.searchCommentsByPostId(pid);
	}

}
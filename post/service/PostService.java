package com.example.post.service;

import java.util.List;


import com.example.post.model.CommentsDto;
import com.example.post.model.Post;

public interface PostService 
{
	
	 public String inserPost(Post post);
	 public List<Post> displayAllPost();
	 public String deletePost(int postId);
	 public List<Post> searchPostByAuthor(String author);
	public List<Post> searchPostByTitle(String title);
	
	public List<CommentsDto> searchCommentsByPid(int pid);
	

}
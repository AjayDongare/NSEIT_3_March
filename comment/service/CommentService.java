package com.example.comment.service;
import java.util.List;

import javax.xml.stream.events.Comment;

public interface CommentService {
	
	public String insertComment(Comment comment);
    public List<Comment> displayAllComments();
  
    public String deleteComment(int cid);
    public List<Comment> searchCommentsByCommenter(String commenter);
	public List<Comment> searchCommentsByPostId(int pid);

}
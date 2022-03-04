package com.example.comment.repo;
import java.util.List;

import javax.transaction.Transactional;
import javax.xml.stream.events.Comment;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
@Transactional

public interface CommentRepo extends JpaRepository<Comment,Integer>{
	
	
	@Query("select c from Comments c where c.commenter=?1")
	public List<Comment> searchCommentsByCommenter(String commenter);
	
	@Query("select c from Comments c where c.pid=?1")
	public List<Comment> searchCommentsByPostId(int pid);

}
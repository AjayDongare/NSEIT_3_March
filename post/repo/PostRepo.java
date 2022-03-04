package com.example.post.repo;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.post.model.Post;

@Repository
@Transactional
public interface PostRepo extends JpaRepository<Post,Integer>{
	
	
	@Query("select p from Post p where p.auther=?1")
	public List<Post> searchPostByAuther(String auther);
	
	@Query("select p from Post p where p.title=?1")
	public List<Post> searchPostByTitle(String title);

}
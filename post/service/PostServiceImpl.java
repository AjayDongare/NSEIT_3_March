package com.example.post.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.example.post.model.CommentsDto;
import com.example.post.model.Post;
import com.example.post.repo.PostRepo;

@Service
public class PostServiceImpl implements PostService{
	
	@Autowired
	PostRepo repo;
	
	//@Autowired
	//RestTemplate template;
	
	@Autowired
	PostFeignProxy proxy;

	@Override
	public String inserPost(Post post) {
		// TODO Auto-generated method stub
		repo.save(post);
		
		return "Post added ";
	}

	@Override
	public List<Post> displayAllPost() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public String deletePost(int postId) {
		// TODO Auto-generated method stub
		repo.deleteById(postId);
		return "Post deleted";
	}

	@Override
	public List<Post> searchPostByAuthor(String auther) {
		// TODO Auto-generated method stub
		return repo.searchPostByAuther(auther);
	}

	@Override
	public List<Post> searchPostByTitle(String title) {
		// TODO Auto-generated method stub
		return repo.searchPostByTitle(title);
	}

	@Override
	public List<CommentsDto> searchCommentsByPid(int pid) {
		// TODO Auto-generated method stub
//	List<CommentsDto> comments = template.getForObject("http://localhost:8082/comment/pid/"+pid,List.class);
		List<CommentsDto> comments = proxy.findCommentsByPid(pid);
		return comments;
	}

}


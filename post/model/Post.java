package com.example.post.model;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "post")
public class Post {

	@Id
	int pid;
	String auther;
	String title;
	String description;

	public Post() {

	}

	public Post(int pid, String author, String title, String description) {
		super();
		this.pid = pid;
		this.auther = auther;
		this.title = title;
		this.description = description;
	}

	public int getPid() {
		return pid;
	}

	public void setPid(int pid) {
		this.pid = pid;
	}

	public String getAuthor() {
		return auther;
	}

	public void setAuthor(String author) {
		this.auther = auther;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

}

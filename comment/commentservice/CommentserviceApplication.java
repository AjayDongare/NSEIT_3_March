package com.example.comment.commentservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.example.comment")
public class CommentserviceApplication {

	public static void main(String[] args) {
		SpringApplication.run(CommentserviceApplication.class, args);
	}

}

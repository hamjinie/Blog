package com.example.blog.controller;

import lombok.Data;

@Data
public class Post {

	private int postId;
	private String nickName;
	private String title;
	
	public Post(int postId, String nickName, String title) {
		this.postId = postId;
		this.nickName = nickName;
		this.title = title;
		
	}
}

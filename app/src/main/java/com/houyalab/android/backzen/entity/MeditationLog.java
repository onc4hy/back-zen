package com.houyalab.android.backzen.entity;

import java.io.IOException;
import java.io.InputStream;

import android.util.Xml;

public class MeditationLog extends BaseEntity{

	private String title;
	private String body;
	private String author;
	private int authorId;
	private String pubDate;
	private int commentCount;
	
	public int getCommentCount() {
		return commentCount;
	}
	public void setCommentCount(int commentCount) {
		this.commentCount = commentCount;
	}
	
	public String getPubDate() {
		return pubDate;
	}	
	public void setPubDate(String pubDate) {
		this.pubDate = pubDate;
	}
	
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	
	public String getBody() {
		return body;
	}
	public void setBody(String body) {
		this.body = body;
	}
	
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	public int getAuthorId() {
		return authorId;
	}
	public void setAuthorId(int authorId) {
		this.authorId = authorId;
	}
}

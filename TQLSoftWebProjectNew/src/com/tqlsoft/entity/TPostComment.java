package com.tqlsoft.entity;

public class TPostComment {

	private int commentId;
	private String commentTime;
	private String commentContent;
	private  TUser TUser;
	private TPost TPost;
	public int getCommentId() {
		return commentId;
	}
	public void setCommentId(int commentId) {
		this.commentId = commentId;
	}
	public String getCommentTime() {
		return commentTime;
	}
	public void setCommentTime(String commentTime) {
		this.commentTime = commentTime;
	}
	public String getCommentContent() {
		return commentContent;
	}
	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
	}
	public TUser getTUser() {
		return TUser;
	}
	public void setTUser(TUser tUser) {
		TUser = tUser;
	}
	public TPost getTPost() {
		return TPost;
	}
	public void setTPost(TPost tPost) {
		TPost = tPost;
	}
	
}

package com.tqlsoft.entity;
import java.util.Set;
public class TPost {

	private int  postId;
	private String postName;
	private String postTime;
	private String postContent;
	private Set TPostComments;
	
	private TUser TUser;
	private TForum TForum;
	public int getPostId() {
		return postId;
	}
	public void setPostId(int postId) {
		this.postId = postId;
	}
	public String getPostName() {
		return postName;
	}
	public void setPostName(String postName) {
		this.postName = postName;
	}
	public String getPostTime() {
		return postTime;
	}
	public void setPostTime(String postTime) {
		this.postTime = postTime;
	}
	public String getPostContent() {
		return postContent;
	}
	public void setPostContent(String postContent) {
		this.postContent = postContent;
	}
	public Set getTPostComments() {
		return TPostComments;
	}
	public void setTPostComments(Set tPostComments) {
		TPostComments = tPostComments;
	}
	public TUser getTUser() {
		return TUser;
	}
	public void setTUser(TUser tUser) {
		TUser = tUser;
	}
	public TForum getTForum() {
		return TForum;
	}
	public void setTForum(TForum tForum) {
		TForum = tForum;
	}
	@Override
	public String toString() {
		return "TPost [postId=" + postId + ", postName=" + postName + ", postTime=" + postTime + ", postContent="
				+ postContent + ", TPostComments=" + TPostComments + ", TUser=" + TUser + ", TForum=" + TForum + "]";
	}

	

}

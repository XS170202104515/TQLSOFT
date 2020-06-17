package com.tqlsoft.entity;

import java.util.Set;

public class TForum {
	private int forumId;
	private String forumName;
	private  Set TPosts;
	private TGame TGame;
	
	
	public TGame getTGame() {
		return TGame;
	}
	public void setTGame(TGame tGame) {
		TGame = tGame;
	}
	public int getForumId() {
		return forumId;
	}
	public void setForumId(int forumId) {
		this.forumId = forumId;
	}
	public String getForumName() {
		return forumName;
	}
	public void setForumName(String forumName) {
		this.forumName = forumName;
	}
	public Set getTPosts() {
		return TPosts;
	}
	public void setTPosts(Set tPosts) {
		TPosts = tPosts;
	}
	@Override
	public String toString() {
		return "TForum [forumId=" + forumId + ", forumName=" + forumName + ", TPosts=" + TPosts + ", TGame=" + TGame
				+ "]";
	}
	

	
}

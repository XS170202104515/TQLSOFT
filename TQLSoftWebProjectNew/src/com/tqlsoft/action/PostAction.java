package com.tqlsoft.action;

import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.service.PostService;
import com.tqlsoft.entity.TPost;
public class PostAction extends ActionSupport{

	List<TPost> postlist;
	private PostService postService;
	private String gameid;
	
	public String getGameid() {
		return gameid;
	}
	public void setGameid(String gameid) {
		this.gameid = gameid;
	}

	
	public PostService getPostService() {
		return postService;
	}
	public void setPostService(PostService postService) {
		this.postService = postService;
	}
	public String  forumcheck() {
		String n=postService.SetList1(gameid);
		return n;
	}
}

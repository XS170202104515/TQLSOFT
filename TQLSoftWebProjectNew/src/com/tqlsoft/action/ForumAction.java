package com.tqlsoft.action;
import com.opensymphony.xwork2.ActionContext;


import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.entity.TGame;
import com.tqlsoft.service.ForumService;

import java.util.List;


public class ForumAction extends ActionSupport {

	List<TGame> forumlist;
	private ForumService forumService;

	public ForumService getForumService() {
		return forumService;
	}
	public void setForumService(ForumService forumService) {
		this.forumService = forumService;
	}
	
	public String  forumcheck() {
		String n=forumService.SetList();
		
		return n;
	}
	

}

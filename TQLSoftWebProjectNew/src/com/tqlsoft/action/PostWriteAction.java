package com.tqlsoft.action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.service.PostWriteService;
import com.tqlsoft.entity.TPost;

public class PostWriteAction extends ActionSupport {
	private PostWriteService postwriteService;
	private String posttitle;
	private String postcontent;
	private String forumid;
	public String getForumid() {
		return forumid;
	}

	public void setForumid(String forumid) {
		this.forumid = forumid;
	}

	public PostWriteService getPostwriteService() {
		return postwriteService;
	}

	public void setPostwriteService(PostWriteService postwriteService) {
		this.postwriteService = postwriteService;
	}


	public String getPosttitle() {
		return posttitle;
	}

	public void setPosttitle(String posttitle) {
		this.posttitle = posttitle;
	}

	public String getPostcontent() {
		return postcontent;
	}

	public void setPostcontent(String postcontent) {
		this.postcontent = postcontent;
	}
	
	public String  forumcheck() {
		
		System.out.println(forumid+posttitle+postcontent);
		postwriteService.add(forumid, posttitle , postcontent);
		return SUCCESS;
	}

}

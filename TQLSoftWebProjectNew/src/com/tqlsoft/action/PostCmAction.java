package com.tqlsoft.action;


import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.service.PostCmService;
import com.tqlsoft.entity.TPostComment;

public class PostCmAction extends ActionSupport{

	List<TPostComment> tpclist;
	private PostCmService postcmService;
	private String postcmid;
	private String posttitle;
	private String postcontent;
	private String commentContent;
	
	public String getCommentContent() {
		return commentContent;
	}

	public void setCommentContent(String commentContent) {
		this.commentContent = commentContent;
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

	public List<TPostComment> getTpclist() {
		return tpclist;
	}

	public void setTpclist(List<TPostComment> tpclist) {
		this.tpclist = tpclist;
	}

	public PostCmService getPostcmService() {
		return postcmService;
	}

	public void setPostcmService(PostCmService postcmService) {
		this.postcmService = postcmService;
	}

	public String getPostcmid() {
		return postcmid;
	}

	public void setPostcmid(String postcmid) {
		this.postcmid = postcmid;
	}

	public String  forumcheck() {
		String u=postcmService.SetList(postcmid);
		return u;
		
	}
	public String write() {
		System.out.println("sdaasssssssssssssssssssssssssssss");
		System.out.println(commentContent+postcmid);
		String u=postcmService.Write(commentContent, postcmid);
		return u;
	}
}

package com.tqlsoft.action;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.entity.TFriendLibrary;
import com.tqlsoft.service.FriendService;

public class FriendAction extends ActionSupport {
	List<TFriendLibrary> friendlist;
	private FriendService friendService;
	private String userid;
	//获取选取的username
	private String chose=null;
	public FriendService getFriendService() {
		return friendService;
	}

	public void setFriendService(FriendService friendService) {
		this.friendService = friendService;
	}

	public String getUserid() {
		return userid;
	}

	public void setUserid(String userid) {
		this.userid = userid;
	}
	
	public String getChose() {
		return chose;
	}

	public void setChose(String chose) {
		this.chose = chose;
	}
	
	
	public String  forumcheck() {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		//ActionContext.getContext().getSession().put("friendid", sess.get("username")); //
		System.out.println("seesionaction---------------------------------------------------------------------------------");
		friendService.SetList1((String)sess.get("username"));

		return SUCCESS;
	}

	public String findFriend() {
		
		System.out.println(userid);
		friendService.findFriend(userid);
		
		
		return SUCCESS;
	}
	
	public String addFriend() {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		try {
			friendService.addFriend();
			
			friendService.SetList1((String)sess.get("username"));
		}catch(Exception e) {
			sess.put("friendMessage", "添加失败，已拥有该好友");
		}
		return SUCCESS;
	}

}

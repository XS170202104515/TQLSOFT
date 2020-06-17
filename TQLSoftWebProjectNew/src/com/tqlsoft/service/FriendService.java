package com.tqlsoft.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.FriendDao;
import com.tqlsoft.dao.FriendDaoImpl;
import com.tqlsoft.entity.TFriendLibrary;
import com.tqlsoft.entity.TUser;

@Transactional
public class FriendService {
	private FriendDao frienddao;

	
	
	public FriendDao getFrienddao() {
		return frienddao;
	}



	public void setFrienddao(FriendDao frienddao) {
		this.frienddao = frienddao;
	}



	public List<TFriendLibrary> SetList1(String id){
		Map<String, Object> sess=ActionContext.getContext().getSession();
		//ActionContext.getContext().getSession().put("friendid", sess.get("username")); //
		List<TFriendLibrary> fs=frienddao.LoginCheck(id);
		sess.put("friendlist", fs);
		sess.put("friendAddlist", null);
		sess.put("friendMessage", null);
		return fs;
	}
	
	public String findFriend(String userid ) {
		Map session = ActionContext.getContext().getSession();		
		
		List<TUser> fs=frienddao.findFriend(userid);
		session.put("friendAddlist", fs);
		
		return "success";
	}
	
	public String addFriend() {
		Map session = ActionContext.getContext().getSession();		
		List<TUser> fs = (List<TUser>) session.get("friendAddlist");
		
		try {
			
			frienddao.addFriend((String)session.get("username"),fs.get(0).getUserAccount(),fs.get(0).getUserName());
			System.out.println(fs.get(0).getUserName());
			session.put("friendMessage", "添加成功");
		}catch(Exception e) {
			System.out.println("false");
			session.put("friendMessage", "添加失败，已拥有该好友");
		}
		session.put("friendAddlist", null);
		return "success";
	}
}

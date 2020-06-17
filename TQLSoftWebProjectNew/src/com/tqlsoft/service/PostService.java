package com.tqlsoft.service;

import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.PostDaoImpl;
import com.tqlsoft.entity.TPost;

@Transactional
public class PostService {


	private PostDaoImpl postdaoimpl;

	public PostDaoImpl getPostdaoimpl() {
		return postdaoimpl;
	}

	public void setPostdaoimpl(PostDaoImpl postdaoimpl) {
		this.postdaoimpl = postdaoimpl;
	}


	public String SetList1(String id){
		List<TPost> ls=postdaoimpl.LoginCheck(id);
		Map<String, Object> sess=ActionContext.getContext().getSession();
		ActionContext.getContext().getSession().put("zmqgameid", id);
		sess.put("postlist", ls);
		return "success";
	
	}
}

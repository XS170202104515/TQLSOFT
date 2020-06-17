package com.tqlsoft.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.Forum;
import com.tqlsoft.dao.PostDao;
import com.tqlsoft.entity.TGame;


@Transactional
public class ForumService {
 
	private Forum forum;
	private PostDao postdao;

	
	public Forum getForum() {
		return forum;
	}

	public void setForum(Forum forum) {
		this.forum = forum;
	}
	
	public String SetList(){
		List<TGame> ls=forum.LoginCheck();
		Map<String, Object> sess=ActionContext.getContext().getSession();
		 sess.put("forumlist", ls);
		return "success";
		
		
		
	}
	

}

package com.tqlsoft.service;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.PostCmDaoImpl;
import com.tqlsoft.entity.TPostComment;

@Transactional
public class PostCmService {

	private PostCmDaoImpl postcmdaoimpl;
	
	public PostCmDaoImpl getPostcmdaoimpl() {
		return postcmdaoimpl;
	}

	public void setPostcmdaoimpl(PostCmDaoImpl postcmdaoimpl) {
		this.postcmdaoimpl = postcmdaoimpl;
	}

	public String SetList(String no){
		List<TPostComment> ls=postcmdaoimpl.LoginCheck(no);
		Map<String, Object> sess=ActionContext.getContext().getSession();
		sess.put("postcmid",no); 
		 sess.put("tpclist",ls);
		return "success";
	}
	public String Write(String commentContent,String postcmid) {
		postcmdaoimpl.write(commentContent, postcmid); 
		return "success";
	}
}

package com.tqlsoft.service;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.UserDao;
import com.tqlsoft.entity.Registeres;


@Transactional
public class UserService {
	private UserDao userDao;	
	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}



	public String LoginCheck(String username,String password) {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		try {
			ArrayList<String> ls = userDao.LoginCheck(username);
			System.out.println(ls.get(0));
			System.out.println(ls.get(1));
			if(ls.get(0).equals("error")) {
				ActionContext.getContext().put("message","用户格式错误,请重新输入" );
			}else {
				if(ls.get(1).equals(password)) {
					sess.put("userName", username);
					ActionContext.getContext().put("username",username);
					System.out.println("登录成功");
				}else {
					System.out.println("密码错误");
					ActionContext.getContext().put("message","密码错误，请重新输入" );
					return "login";
				}
			}		
		}catch(Exception e){
			ActionContext.getContext().put("message","用户不存在" );
			return "login";
		}
		
		return "success";
	}



	public String register(Set<Registeres> rre) {
		// TODO Auto-generated method stub
		Map<String, Object> sess=ActionContext.getContext().getSession();
		System.out.println(rre);
		String result=userDao.Regitser(rre);
		if(result.equals("OK")) {
			return "success";
		}
		return "login";
	}

}

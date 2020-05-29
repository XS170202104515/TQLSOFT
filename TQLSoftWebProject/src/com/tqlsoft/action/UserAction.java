package com.tqlsoft.action;

import java.util.HashSet;
import java.util.Set;

import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.entity.Registeres;
import com.tqlsoft.service.UserService;


public class UserAction extends ActionSupport{
	private UserService userService;
	private Registeres re;//注册数据
	private String username;
	private String password;
	public UserService getUserService() {
		return userService;
	}
	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}	
	public Registeres getRe() {
		return re;
	}
	public void setRe(Registeres re) {
		this.re = re;
	}
	public String logincheck() {
		System.out.println("进入action");
		String result=userService.LoginCheck(username,password);		
		return result;
	}	

	public String register() {
		Set<Registeres> Rre= new HashSet<Registeres>();
		System.out.println(re);
		Rre.add(re);
		System.out.println(Rre);
		String result=userService.register(Rre);
		return result;
	}
}

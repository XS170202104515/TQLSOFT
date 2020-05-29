package com.tqlsoft.entity;

import java.util.Set;

public class TUser {
	private Long userId;
	private String userState;
	private String userAccount;
	private String userName;
	private Set TUsermessages;
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set getTUsermessages() {
		return TUsermessages;
	}
	public void setTUsermessages(Set tUsermessages) {
		TUsermessages = tUsermessages;
	}
	
	
}

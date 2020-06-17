package com.tqlsoft.entity;

import java.util.HashSet;
import java.util.Set;

public class TUser {
	private String userAccount;
	private int userId;
	private String userState;
	private String userName;
	
	//private Set<TFriendLibrary> tFriendLibrary = new HashSet<TFriendLibrary>();
	private Set TGameLibraries;
	private Set TShoppingTrolleies;
	private Set TUsermessages;
	
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getUserState() {
		return userState;
	}
	public void setUserState(String userState) {
		this.userState = userState;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public Set getTGameLibraries() {
		return TGameLibraries;
	}
	public void setTGameLibraries(Set tGameLibraries) {
		TGameLibraries = tGameLibraries;
	}
	public Set getTShoppingTrolleies() {
		return TShoppingTrolleies;
	}
	public void setTShoppingTrolleies(Set tShoppingTrolleies) {
		TShoppingTrolleies = tShoppingTrolleies;
	}
	public Set getTUsermessages() {
		return TUsermessages;
	}
	public void setTUsermessages(Set tUsermessages) {
		TUsermessages = tUsermessages;
	}
	
	/*
	public Set<TFriendLibrary> gettFriendLibrary() {
		return tFriendLibrary;
	}
	public void settFriendLibrary(Set<TFriendLibrary> tFriendLibrary) {
		this.tFriendLibrary = tFriendLibrary;
	}*/
	
	
	
}

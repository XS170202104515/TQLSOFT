/*package com.tqlsoft.entity;

import java.util.HashSet;
import java.util.Set;

public class TFriendLibrary {
	
	
	private String friendUserName;
	private String friendDate;
	
	//
	private TUser TUserByFriendUserAccount;
	private TUser TUserByUserAccount;
	//ÁªºÏÖ÷¼ü
	//private Set<TFriendLibraryid> pk = new HashSet<TFriendLibraryid>(); 
	TFriendLibraryid tFriendLibraryid = new TFriendLibraryid();
	
//	public TFriendLibrary() {
		
//	}
	//public TFriendLibrary(String friendUserName) {
	//	this.friendUserName = friendUserName;
	//}
	public String getFriendUserName() {
		return friendUserName;
	}
	public void setFriendUserName(String friendUserName) {
		this.friendUserName = friendUserName;
	}
	public String getFriendDate() {
		return friendDate;
	}
	public void setFriendDate(String friendDate) {
		this.friendDate = friendDate;
	}

	public TUser getTUserByFriendUserAccount() {
		return TUserByFriendUserAccount;
	}
	public void setTUserByFriendUserAccount(TUser tUserByFriendUserAccount) {
		TUserByFriendUserAccount = tUserByFriendUserAccount;
	}
	public TUser getTUserByUserAccount() {
		return TUserByUserAccount;
	}
	public void setTUserByUserAccount(TUser tUserByUserAccount) {
		TUserByUserAccount = tUserByUserAccount;
	}
	public Set<TFriendLibraryid> getPk() {
		return pk;
	}
	public void setPk(Set<TFriendLibraryid> pk) {
		this.pk = pk;
	}

	

}*/
package com.tqlsoft.entity;

public class TFriendLibrary {
	
	
	private String friendUserName;
	private String friendDate;
	private TUser TUserByFriendUserAccount;
	private TUser TUserByUserAccount;
	TFriendLibraryid tFriendLibraryid = new TFriendLibraryid();
	
	public String getFriendUserName() {
		return friendUserName;
	}
	public void setFriendUserName(String friendUserName) {
		this.friendUserName = friendUserName;
	}
	public String getFriendDate() {
		return friendDate;
	}
	public void setFriendDate(String friendDate) {
		this.friendDate = friendDate;
	}
	public TUser getTUserByFriendUserAccount() {
		return TUserByFriendUserAccount;
	}
	public void setTUserByFriendUserAccount(TUser tUserByFriendUserAccount) {
		TUserByFriendUserAccount = tUserByFriendUserAccount;
	}
	
	
	
	public TUser getTUserByUserAccount() {
		return TUserByUserAccount;
	}
	public void setTUserByUserAccount(TUser tUserByUserAccount) {
		TUserByUserAccount = tUserByUserAccount;
	}
	public TFriendLibraryid gettFriendLibraryid() {
		return tFriendLibraryid;
	}
	public void settFriendLibraryid(TFriendLibraryid tFriendLibraryid) {
		this.tFriendLibraryid = tFriendLibraryid;
	}

	

}

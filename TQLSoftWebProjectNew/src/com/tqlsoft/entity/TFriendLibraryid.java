package com.tqlsoft.entity;

import java.io.Serializable;

public class TFriendLibraryid implements Serializable {
	private String userAccount;
	private String friendUserAccount;
	public String getUserAccount() {
		return userAccount;
	}
	public void setUserAccount(String userAccount) {
		this.userAccount = userAccount;
	}
	public String getFriendUserAccount() {
		return friendUserAccount;
	}
	public void setFriendUserAccount(String friendUserAccount) {
		this.friendUserAccount = friendUserAccount;
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((friendUserAccount == null) ? 0 : friendUserAccount.hashCode());
		result = prime * result + ((userAccount == null) ? 0 : userAccount.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TFriendLibraryid other = (TFriendLibraryid) obj;
		if (friendUserAccount == null) {
			if (other.friendUserAccount != null)
				return false;
		} else if (!friendUserAccount.equals(other.friendUserAccount))
			return false;
		if (userAccount == null) {
			if (other.userAccount != null)
				return false;
		} else if (!userAccount.equals(other.userAccount))
			return false;
		return true;
	}
	
	

}

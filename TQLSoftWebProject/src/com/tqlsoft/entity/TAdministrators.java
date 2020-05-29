package com.tqlsoft.entity;

import java.util.Set;

public class TAdministrators {
	private String adminAccount;
	private String adminName;
	private String adminPassword;
	private Set TAdminauthorities;
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getAdminPassword() {
		return adminPassword;
	}
	public void setAdminPassword(String adminPassword) {
		this.adminPassword = adminPassword;
	}
	public Set getTAdminauthorities() {
		return TAdminauthorities;
	}
	public void setTAdminauthorities(Set tAdminauthorities) {
		TAdminauthorities = tAdminauthorities;
	}
	
	
	
	
}

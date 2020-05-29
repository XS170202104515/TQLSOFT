package com.tqlsoft.entity;

public class TAdminauthority {
	private String adminAccount;
	private String detection;
	private String adminUser;
	private String adminForun;
	private String adminGame;
	private TAdministrators TAdministrators;
	public String getAdminAccount() {
		return adminAccount;
	}
	public void setAdminAccount(String adminAccount) {
		this.adminAccount = adminAccount;
	}
	public String getDetection() {
		return detection;
	}
	public void setDetection(String detection) {
		this.detection = detection;
	}
	public String getAdminUser() {
		return adminUser;
	}
	public void setAdminUser(String adminUser) {
		this.adminUser = adminUser;
	}
	public String getAdminForun() {
		return adminForun;
	}
	public void setAdminForun(String adminForun) {
		this.adminForun = adminForun;
	}
	public String getAdminGame() {
		return adminGame;
	}
	public void setAdminGame(String adminGame) {
		this.adminGame = adminGame;
	}
	public TAdministrators getTAdministrators() {
		return TAdministrators;
	}
	public void setTAdministrators(TAdministrators tAdministrators) {
		TAdministrators = tAdministrators;
	}
	
}

package com.tqlsoft.action;

import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.service.ChangePasswordService;

public class ChangePasswordAction extends ActionSupport{
	private String passwordOld;
	private String passwordNew;
	private String passwordAffirm;
	private ChangePasswordService changePasswordService;

	public String getPasswordOld() {
		return passwordOld;
	}

	public void setPasswordOld(String passwordOld) {
		this.passwordOld = passwordOld;
	}

	public String getPasswordNew() {
		return passwordNew;
	}

	public void setPasswordNew(String passwordNew) {
		this.passwordNew = passwordNew;
	}

	public String getPasswordAffirm() {
		return passwordAffirm;
	}

	public void setPasswordAffirm(String passwordAffirm) {
		this.passwordAffirm = passwordAffirm;
	}
	
	public void setChangePasswordService(ChangePasswordService changePasswordService) {
		this.changePasswordService = changePasswordService;
	}

	public String execute() throws Exception {

		if(!passwordNew.equals(passwordAffirm)) {
			System.out.printf(passwordNew);
			System.out.printf(passwordAffirm);
			ActionContext.getContext().put("changePasswordMessage","密码和确认密码不一致" );
			System.out.printf("密码和确认密码不一致");
			return "close";
		}
		else
			return changePasswordService.updatePassword(passwordOld,passwordNew);
	}




}

package com.tqlsoft.action;


import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.entity.Usermessage;

import com.tqlsoft.service.UpdateMessageService;

public class UpdateMessageAction extends ActionSupport{
	private Usermessage um;
	private UpdateMessageService updateMessageService;
	
	public Usermessage getUm() {
		return um;
	}

	public void setUm(Usermessage um) {
		this.um = um;
	}

	public void setUpdateMessageService(UpdateMessageService updateMessageService) {
		this.updateMessageService = updateMessageService;
	}
	
	public String execute() throws Exception {
		System.out.printf(um.getUserAge());
		System.out.printf(um.getUserEmail());
		System.out.printf(um.getUserName());
		System.out.printf(um.getUserPhone());
		System.out.printf(um.getUserSex());

		return updateMessageService.updatePassword(um);

	}



}

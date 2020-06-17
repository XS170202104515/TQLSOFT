package com.tqlsoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;


import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.UpdateMessageDao;
import com.tqlsoft.entity.Usermessage;


//���ע�� �ɶ���д
@Transactional
public class UpdateMessageService {
	private UpdateMessageDao updateMessageDao;

	public void setUpdateMessageDao(UpdateMessageDao updateMessageDao) {
		this.updateMessageDao = updateMessageDao;
	}

	public String updatePassword(Usermessage um) {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		System.out.println((String)sess.get("username"));

		ArrayList<String> ls =updateMessageDao.updateMessage((String)sess.get("username"),um);
		//�����Ϣ
		sess.put("userMessage", ls);

		if(ls!=null&&!ls.isEmpty()){
			ActionContext.getContext().put("updateMessage", "�޸ĳɹ�");
		}else {

			ActionContext.getContext().put("updateMessage","�޸�ʧ��" );
		}
		return "success";
	}
}

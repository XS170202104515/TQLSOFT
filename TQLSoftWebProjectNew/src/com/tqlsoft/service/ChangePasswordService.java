package com.tqlsoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.ChangePasswordDao;
import com.tqlsoft.entity.Usermessage;


//添加注解 可读可写
@Transactional
public class ChangePasswordService {
	private ChangePasswordDao changePasswordDao;


	public void setChangePasswordDao(ChangePasswordDao changePasswordDao) {
		this.changePasswordDao = changePasswordDao;
	}

	
	public String updatePassword(String passwordOld,String passwordNew) {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		System.out.println((String)sess.get("username"));
		System.out.println(passwordOld);
		List<Usermessage> list=changePasswordDao.updatePassword((String)sess.get("username"),passwordOld,passwordNew);
		System.out.println("service.............."+list);

		if(list!=null&&!list.isEmpty()){
			ActionContext.getContext().put("changePasswordMessage", "修改成功");
		}else {

			ActionContext.getContext().put("changePasswordMessage","原密码错误" );
			return "close";
		}
		return "success";
	}

}

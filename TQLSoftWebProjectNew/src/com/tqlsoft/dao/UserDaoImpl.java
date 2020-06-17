package com.tqlsoft.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.Registeres;
import com.tqlsoft.entity.TAdministrators;
import com.tqlsoft.entity.TUser;
import com.tqlsoft.entity.Usermessage;

public class UserDaoImpl implements UserDao {
	private Usermessage usm;
	private TUser tUser;
	
	private HibernateTemplate hibernateTemplate;	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public void setUsm(Usermessage usm) {
		this.usm = usm;
	}

	public void settUser(TUser tUser) {
		this.tUser = tUser;
	}

	public ArrayList<String> LoginCheck(String username){
		
		ArrayList<String> ls=new ArrayList<String>();
		System.out.println(username);
		if(username.length()==10) {
			//需改为load方法
			Usermessage user=(Usermessage)hibernateTemplate.get(Usermessage.class, username);
			ls.add(user.getUserAccount());
			ls.add(user.getUserPassword());
			//获取用户详细信息
			ls.add(user.getUserAge());
			ls.add(user.getUserDate());
			ls.add(user.getUserEmail());
			ls.add(user.getUserName());
			ls.add(user.getUserPhone());
			ls.add(user.getUserSex());

		}else if(username.length()==2){
			TAdministrators tAdminstrators = (TAdministrators) hibernateTemplate.get(TAdministrators.class, username);
			ls.add(tAdminstrators.getAdminAccount());
			ls.add(tAdminstrators.getAdminPassword());
			ls.add(tAdminstrators.getAdminName());
		}else {
			ls.add("error");
		}		
		return ls;
		
		//entity -> action -> service -> dao -> xml
	}

	public String Regitser(Set<Registeres> rre) {
		System.out.println("开始调用");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=df.format(new Date());
		for (Registeres re:rre) {
			System.out.println(re.getAccount());
			tUser.setUserAccount(re.getAccount());
			System.out.println("1:"+tUser.getUserAccount());
			tUser.setUserName(re.getName());
			tUser.setUserState("离线");
			System.out.println("2:"+tUser.getUserAccount());
			System.out.println(tUser.getUserId());
			
			usm.setUserAccount(re.getAccount());
			usm.setUserAge(re.getAge());
			usm.setUserDate(time);
			usm.setUserEmail(re.getEmail());
			usm.setUserPassword(re.getPassword());
			usm.setUserPhone(re.getPhone());
			usm.setUserSex(re.getSex());
			usm.setUserName(re.getName());
			
			Set<Usermessage> userMessages=(Set<Usermessage>) new HashSet();
			userMessages.add(usm);
			tUser.setTUsermessages(userMessages);
			
			hibernateTemplate.save(tUser);
			hibernateTemplate.save(usm);
			System.out.println(usm);
			
		}
		return "OK";
	}

}

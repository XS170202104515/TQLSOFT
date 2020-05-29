package com.tqlsoft.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import org.apache.catalina.User;
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
			Usermessage user=(Usermessage)hibernateTemplate.get(Usermessage.class, username);
			ls.add(user.getUserAccount());
			ls.add(user.getUserPassword());
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
			System.out.println(re);
			tUser.setUserAccount(re.getAccount());
			tUser.setUserName(re.getName());
			tUser.setUserState("离线");
			
			usm.setUserAccount(re.getAccount());
			usm.setUserAge(re.getAge());
			usm.setUserDate(time);
			usm.setUserEmail(re.getName());
			usm.setUserPassword(re.getPassword());
			usm.setUserPhone(re.getPhone());
			usm.setUserSex(re.getSex());
			usm.setUserName(re.getName());
			
			Set<Usermessage> Useres= new HashSet<Usermessage>();
			Useres.add(usm);
			tUser.setTUsermessages(Useres);
			System.out.println(usm);
			hibernateTemplate.save(tUser);
			hibernateTemplate.save(usm);
		}
		return "OK";
	}

}

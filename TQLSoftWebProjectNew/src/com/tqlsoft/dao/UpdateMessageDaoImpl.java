package com.tqlsoft.dao;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.catalina.User;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.TUser;
import com.tqlsoft.entity.Usermessage;

public class UpdateMessageDaoImpl implements UpdateMessageDao {
	private Usermessage usm;
	private TUser tUser;
	private HibernateTemplate hibernateTemplate;

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	public ArrayList<String> updateMessage(String username,Usermessage um){
		ArrayList<String> ls=new ArrayList<String>();
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=df.format(new Date());
		//String queryString="FROM Usermessage u where userAccount=:userAccount";
		//String[] paramNames=new String[] {"userAccount"};
		//String[] values=new String[] {username};
		
		//List<Usermessage> list = (List<Usermessage>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);		

		//System.out.println(list);

		//if(list!=null&&!list.isEmpty()){
			//��ȡusername�˺ŵ���Ϣ
		usm = this.hibernateTemplate.get(Usermessage.class, username);
		System.out.println("��ѯ�ɹ�");
		//��ȡuser
		tUser =this.hibernateTemplate.get(TUser.class, username);
		
		
		System.out.println(usm);
		System.out.println("��ѯ�ɹ�");
			//try {
		if(um.getUserAge()!=null && !um.getUserAge().equals("")) {
			usm.setUserAge(um.getUserAge());
		}
		if(um.getUserName()!=null && !um.getUserName().equals("")) {
			usm.setUserName(um.getUserName());
			tUser.setUserName(um.getUserName());
		}
		if(um.getUserPhone()!=null && !um.getUserPhone().equals("")) {
			usm.setUserPhone(um.getUserPhone());
		}
		if(um.getUserSex()!=null && !um.getUserSex().equals("")) {
			usm.setUserSex(um.getUserSex());
		}
		usm.setUserDate(time);
		usm.setUserEmail(um.getUserEmail());
		Set<Usermessage> userMessages=(Set<Usermessage>) new HashSet();
		userMessages.add(usm);
		tUser.setTUsermessages(userMessages);
		
		this.hibernateTemplate.update(tUser);
		this.hibernateTemplate.update(usm);
		System.out.println("���³ɹ�");				
			//}catch(Exception e) {
			//	System.out.println("����ʧ��");	
			//}
		ls.add(usm.getUserAccount());
		ls.add(usm.getUserPassword());
		//��ȡ�û���ϸ��Ϣ
		ls.add(usm.getUserAge());
		ls.add(usm.getUserDate());
		ls.add(usm.getUserEmail());
		ls.add(usm.getUserName());
		ls.add(usm.getUserPhone());
		ls.add(usm.getUserSex());
			
		
		return ls;
	}



}

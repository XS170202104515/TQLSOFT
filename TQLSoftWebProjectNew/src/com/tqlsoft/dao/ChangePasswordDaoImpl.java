package com.tqlsoft.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import org.apache.catalina.User;
import org.springframework.orm.hibernate5.HibernateTemplate;


import com.tqlsoft.entity.Usermessage;

public class ChangePasswordDaoImpl implements ChangePasswordDao{
	private HibernateTemplate hibernateTemplate;
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	public List<Usermessage> updatePassword(String username,String password,String passwordNew) {
		// TODO Auto-generated method stub
		//��ȡ��ǰʱ��
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=df.format(new Date());
		String queryString="FROM Usermessage u where userAccount=:userAccount and userPassword=:userPassword";
		String[] paramNames=new String[] {"userAccount","userPassword"};
		String[] values=new String[] {username,password};
		List<Usermessage> list = (List<Usermessage>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);		

		System.out.println(list);

		if(list!=null&&!list.isEmpty()){
			//��ȡusername�˺ŵ���Ϣ
			Usermessage us = this.hibernateTemplate.get(Usermessage.class, username);

			System.out.println(us);
			System.out.println("��ѯ�ɹ�");
			//try {
				us.setUserPassword(passwordNew);
				us.setUserDate(time);
				this.hibernateTemplate.update(us);
				System.out.println("���³ɹ�");				
			//}catch(Exception e) {
			//	System.out.println("����ʧ��");	
			//}

			
		}
		return list;

	}

}

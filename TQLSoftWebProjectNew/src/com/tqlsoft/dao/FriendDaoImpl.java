package com.tqlsoft.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.TUser;
import com.tqlsoft.entity.Usermessage;
import com.tqlsoft.entity.TFriendLibrary;
import com.tqlsoft.entity.TFriendLibraryid;
import com.tqlsoft.entity.TGameLibrary;


public class FriendDaoImpl implements FriendDao {
	
	private HibernateTemplate hibernateTemplate;
	private TUser tuser;
	private TFriendLibrary tfriendlibrary;

	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}


	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	public TUser getTuser() {
		return tuser;
	}


	public void setTuser(TUser tuser) {
		this.tuser = tuser;
	}


	public TFriendLibrary getTfriendlibrary() {
		return tfriendlibrary;
	}


	public void setTfriendlibrary(TFriendLibrary tfriendlibrary) {
		this.tfriendlibrary = tfriendlibrary;
	}


	@Override
	public List<TFriendLibrary> LoginCheck(String id) {
		//1.
		/*
		Session session=null;
		session=hibernateTemplate.getSessionFactory().openSession();
		Transaction ts = session.beginTransaction();
		
		TFriendLibraryid pk = new TFriendLibraryid();
		pk.setUserAccount(id);
		pk.setFriendUserAccount("2277072257");
		System.out.println("id = "+id);
		System.out.println("pk_id = "+pk.getUserAccount());
		System.out.println("pk_f_id = "+pk.getFriendUserAccount());
		
		TFriendLibrary list = session.get(TFriendLibrary.class,pk);
		 */
		String queryString="FROM TFriendLibrary t where t.tFriendLibraryid.userAccount=:account";
		String[] paramNames=new String[] {"account"};
		String[] values=new String[] {id};
		List<TFriendLibrary> list = (List<TFriendLibrary>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);	
		System.out.println(list);
		
		return list;
	}
	public List<TUser> findFriend(String userid){
		String queryString="FROM TUser t where userAccount=:userAccount";
		String paramNames="userAccount";
		String values=userid;
		List<TUser> list = (List<TUser>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);		
		
		System.out.println(list.get(0).getUserName());
		
		return list;
	}

	public void addFriend(String userId,String friendId,String name) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=df.format(new Date());
		TFriendLibrary tf = new TFriendLibrary();
		TFriendLibraryid pk = new TFriendLibraryid();
		pk.setFriendUserAccount(friendId);
		pk.setUserAccount(userId);
		tf.setFriendUserName(name);
		tf.setFriendDate(time);
		tf.settFriendLibraryid(pk);
		
		this.hibernateTemplate.save(tf);
		
	}
}
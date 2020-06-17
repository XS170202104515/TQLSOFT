package com.tqlsoft.dao;

import java.io.Serializable;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashSet;
import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TUser;
import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.entity.TForum;

public class PostWriteDaoImpl implements PostWriteDao {
	private TUser tuser;
	private TPost tpost;
	private TForum tforum;


	public TUser getTuser() {
		return tuser;
	}

	public void setTuser(TUser tuser) {
		this.tuser = tuser;
	}

	public TPost getTpost() {
		return tpost;
	}

	public void setTpost(TPost tpost) {
		this.tpost = tpost;
	}

	public TForum getTforum() {
		return tforum;
	}

	public void setTforum(TForum tforum) {
		this.tforum = tforum;
	}

	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	private HibernateTemplate hibernateTemplate;	
	
		public void add(String forumid,String posttitle ,String postcontent){
			System.out.println("获取时间");
			SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
			String time=df.format(new Date());
			forumid = (String) ActionContext.getContext().getSession().get("forumid");  
			int fid=Integer.valueOf(forumid);
			//塞东西进去TPost
			//tpost.setPostId(11);
			tpost.setPostName(posttitle);
			tpost.setPostContent(postcontent);
			tpost.setPostTime(time);
			//塞东西进去TUser和 TForum
			tuser.setUserAccount("1523562657");
			tforum.setForumId(fid);
			tpost.setTUser(tuser);
			tpost.setTForum(tforum);
			System.out.println(tuser);
			System.out.println(tforum);
			hibernateTemplate.save(tpost);
			System.out.println("新增数据成功");
		}
	}



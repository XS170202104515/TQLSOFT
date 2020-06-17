package com.tqlsoft.dao;

import java.util.List;
import java.util.Set;
import java.util.List;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.entity.TForum;
import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TUser;


public class PostDaoImpl implements PostDao {
	private HibernateTemplate hibernateTemplate;
	private TPost tpost;
	private TForum tforum;
	
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


	public TPost getTpost() {
		return tpost;
	}


	public void setTpost(TPost tpost) {
		this.tpost = tpost;
	}


	public List<TPost> LoginCheck(String u) {
	
		System.out.println("-----------------------------------------------------"+u);
		String queryString="SELECT s FROM TForum s where s.TGame.gameId=:gameid";
		String paramName="gameid";
		int value=Integer.valueOf(u);
		List<TForum> list=(List<TForum>) hibernateTemplate.findByNamedParam(queryString, paramName, value);
		int i=0;
		for(TForum tf:list) {
			i=tf.getForumId();
			System.out.println(tf.getForumId());
			System.out.println(tf.getForumName());
			System.out.println(tf.getTGame().getGameName());
			break;
		}
		//把forumid存在seesion里面
		String s = String.valueOf(i);
		ActionContext.getContext().getSession().put("forumid", s);

		
		String queryString1="FROM TPost t where t.TForum.forumId=:forumId";
		String paramName1="forumId";
		System.out.println(queryString);
		int value1=i;
		System.out.println(value1);
		List<TPost> list2=(List <TPost>)hibernateTemplate.findByNamedParam(queryString1, paramName1, value1);
		System.out.println("123456");
		System.out.println("-------------------------------post id"+u);
		 System.out.println(list2.get(0).getPostName());
	
		return list2;

	}
}

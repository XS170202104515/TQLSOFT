package com.tqlsoft.dao;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.entity.TForum;
import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TPostComment;
import com.tqlsoft.entity.TUser;

public class PostCmDaoImpl implements PostCmDao {

	private HibernateTemplate hibernateTemplate;
	private TPostComment tpostcomment;
	private TUser tuser;
	private TPost tpost;

	
	
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



	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}



	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}



	public TPostComment getTpostcomment() {
		return tpostcomment;
	}



	public void setTpostcomment(TPostComment tpostcomment) {
		this.tpostcomment = tpostcomment;
	}



	public List<TPostComment> LoginCheck(String id) {
		String queryString="SELECT s FROM TPostComment s where s.TPost.postId=:postid";
		String paramName="postid";
		int value=Integer.valueOf(id);
		List<TPostComment> list=(List<TPostComment>) hibernateTemplate.findByNamedParam(queryString, paramName, value);
		System.out.println("璇诲彇鎴愬姛");
		int i=0;
		for(TPostComment tp:list) {
			
			//i=tf.getForumId();
			System.out.println(tp.getCommentContent());
			//System.out.println(tf.getForumName());
			//System.out.println(tf.getTGame().getGameName());
			break;
		}
		return list;
	}
	
	public void write(String commentContent,String postcmid) {
		System.out.println("鑾峰彇鏃堕棿");
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
		String time=df.format(new Date());
		int pid=Integer.valueOf(postcmid);
		//濉炰笢瑗胯繘鍘籘Post
		//tpost.setPostId(11);
		tpostcomment.setCommentTime(time);
		tpostcomment.setCommentContent(commentContent);
		//濉炰笢瑗胯繘鍘籘User鍜� TForum
		tuser.setUserAccount("1523562657");
		tpost.setPostId(pid);
		tpostcomment.setTPost(tpost);
		tpostcomment.setTUser(tuser);
		hibernateTemplate.save(tpostcomment);
		System.out.println("tiezi璇勮鏂板鏁版嵁鎴愬姛");
	}

}

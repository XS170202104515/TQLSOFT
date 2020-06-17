package com.tqlsoft.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.AddGame;
import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TPostComment;
import com.tqlsoft.entity.TUser;

public class AdminDaoImple implements AdminDao {
	private HibernateTemplate hibernateTemplate;
	
	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}


	@Override
	public List<TUser> selceUsers() {
		
		List<TUser> Users = (List<TUser>) hibernateTemplate.find("FROM TUser");		
		return Users;
	}


	@Override
	public void deleteUser(String userAccount) {
		// TODO Auto-generated method stub
		
		//ɾ�� ���� ���� ��Ϣ �����б� ���ﳵ ��Ϸ�� ->�û�
		
		
		
		String queryString="FROM TUser WHERE userAccount=:userAccount";
		String paramName="userAccount";
		String value=userAccount;
		
		List<TUser> Users = (List<TUser>) hibernateTemplate.findByNamedParam(queryString, paramName, value);	

	}


	public List addGame(AddGame game) {
		System.out.println(game.toString());
		// TODO Auto-generated method stub
		TGame tGame=new TGame();
		tGame.setGameId(Integer.valueOf(game.getGameId()));
		tGame.setGameAnother(game.getGameAnother());
		
		tGame.setGameCategory(game.getGameCategory());
		tGame.setGameDiscount(1);
		tGame.setGameIntroduce(game.getGameIntroduce());
		tGame.setGameName(game.getGameName());
		tGame.setGamePrice(game.getGamePrice());
		tGame.setGameSize(game.getGameSize());
		tGame.setGameTime(game.getGameTime());
		tGame.setGameDisposition(game.toString());
		hibernateTemplate.save(tGame);
		List<TGame> list=(List<TGame>) hibernateTemplate.find("FROM TGame");
		return list;
	}


	@Override
	public List<TGame> selectGame(String gameId) {
		// TODO Auto-generated method stub
		String queryString="FROM TGame where gameId=:gameId";
		String paramName="gameId";
		int value=Integer.valueOf(gameId);
		List<TGame> list =(List<TGame>) hibernateTemplate.findByNamedParam(queryString, paramName, value);
		return list;
	}


	@Override
	public void update(AddGame game) {
		// TODO Auto-generated method stub
		System.out.println(game.getGameCategory());
		TGame tGame=hibernateTemplate.get(TGame.class, Integer.valueOf(game.getGameId()));
		tGame.setGameAnother(game.getGameAnother());
		tGame.setGameCategory(game.getGameCategory());
		System.out.println(tGame.getGameCategory());
		tGame.setGameIntroduce(game.getGameIntroduce());
		tGame.setGameName(game.getGameName());
		tGame.setGamePrice(game.getGamePrice());
		tGame.setGameSize(game.getGameSize());
		tGame.setGameTime(game.getGameTime());
		tGame.setGameDisposition(game.toString());
		hibernateTemplate.update(tGame);
	}


	@Override
	public List<TPost> selectPost() {
		// TODO Auto-generated method stub
		return (List<TPost>) hibernateTemplate.find("FROM TPost");
	}
	
	public List<TPost> queryBypage(int pageNo,int pageSize){
		Session session=null;
		Query query=null;
		try{
			session=hibernateTemplate.getSessionFactory().openSession();
			System.out.println("��ʼ��ѯ�û���Ϣ");
			String hql="FROM TPost";

			query=session.createQuery(hql);
			query.setFirstResult((pageNo-1)*pageSize); //������һҳ��ʾ�ĵ�һ����¼������
			//��ʩ��һҳ�����ʾ�ļ�¼����
			query.setMaxResults(pageSize); 
			System.out.println(pageNo);
			System.out.println(pageSize);
			return (List<TPost>) query.list();

		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{//�ر�session
			session.close();
		}
	}


	@Override
	public void deletePost(String string) {
		// TODO Auto-generated method stub
		String queryString="FROM TPostComment t where t.TPost.postId=:postId";
		String paramName="postId";
		int value=Integer.valueOf(string);
		List<TPostComment> list =(List<TPostComment>) hibernateTemplate.findByNamedParam(queryString, paramName, value);
		if(list!=null&&!list.isEmpty()) {
			for(TPostComment tpc:list) {
				System.out.println("�������ݣ�"+tpc.getCommentContent());
				hibernateTemplate.delete(tpc);
			}
		}
		TPost tPost=hibernateTemplate.get(TPost.class,Integer.valueOf(string));
		hibernateTemplate.delete(tPost);
	}


	public List<TPostComment> selectTPostComment(String postid) {
		// TODO Auto-generated method stub
		System.out.println("����Dao");
		String queryString="FROM TPostComment s where s.TPost.postId=:postId";
		String paramName="postId";
		int value=Integer.valueOf(postid);
		List<TPostComment> list=(List<TPostComment>) hibernateTemplate.findByNamedParam(queryString, paramName, value);
		System.out.println("ִ�����");
		for (int i=0 ; i<list.size();i++) {
			System.out.println("�������ݣ�"+list.get(i).getCommentContent());
		}
		return list;	
		
	}


	@Override
	public List<TPostComment> SelectTPostCommentbypage(int pageNoC, int pageSizeC,String postid) {
		// TODO Auto-generated method stub
		Session session=null;
		Query query=null;
		try{
			session=hibernateTemplate.getSessionFactory().openSession();
			String hql="FROM TPostComment s where s.TPost.postId=?0";
			query=session.createQuery(hql);
			query.setFirstResult((pageNoC-1)*pageSizeC); //������һҳ��ʾ�ĵ�һ����¼������	
			//��ʩ��һҳ�����ʾ�ļ�¼����
			query.setMaxResults(pageSizeC);
			query.setParameter(0, Integer.valueOf(postid));
			System.out.println("ִ�з�ҳ���");
			return (List<TPostComment>) query.list();
		}catch (Exception e) {
			e.printStackTrace();
			return null;
		}finally{//�ر�session
			session.close();
		}
	}


	@Override
	public void deletePostComment(String string) {
		// TODO Auto-generated method stub
		TPostComment tPostComment=hibernateTemplate.get(TPostComment.class, Integer.valueOf(string));
		hibernateTemplate.delete(tPostComment);
		System.out.println("ɾ�����");
	}



}

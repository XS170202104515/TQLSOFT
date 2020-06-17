package com.tqlsoft.service;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;


import com.tqlsoft.dao.AdminDao;
import com.tqlsoft.entity.AddGame;
import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TPostComment;
import com.tqlsoft.entity.TUser;


@Transactional
public class AdminService {
	private AdminDao adminDao;
	

	public void setAdminDao(AdminDao adminDao) {
		this.adminDao = adminDao;
	}


	public void selcetUsers() {//查找用户
		// TODO Auto-generated method stub
		Map sess=ActionContext.getContext().getSession();
		List<TUser> Users=adminDao.selceUsers();
		for (int i=0;i<Users.size();i++) {
			System.out.println(Users.get(i).getUserName());
		}
		sess.put("UsersList", Users);
	}


	public void deleteUser(ArrayList<String> chose) {//删除用户
		// TODO Auto-generated method stub
		int i =1;
		Iterator it = chose.iterator();
		while(it.hasNext()) {
			adminDao.deleteUser(it.next().toString());
			System.out.println("删除第"+i++);
		}
		
	}


	public void addGame(AddGame game) {//添加游戏
		// TODO Auto-generated method stub
		System.out.println("gameName:"+game.getGameName());
		List<TGame> gameList=adminDao.addGame(game);
		for (TGame tg:gameList) {
			System.out.println("GameId:"+tg.getGameId());
			System.out.println("GameName:"+tg.getGameName());
		}
	}


	public void selectGame(String gameId) {
		// TODO Auto-generated method stub
		List<TGame> gameList=adminDao.selectGame(gameId);
		Map sess=ActionContext.getContext().getSession();
		sess.put("gameList", gameList);
	}


	public void updateGame(AddGame game) {//更新游戏
		System.out.println(" in Service gameId:"+game.getGameId());
		// TODO Auto-generated method stub
		adminDao.update(game);
	}


	public List selectPost() {
		// TODO Auto-generated method stub
		List<TPost> postList=adminDao.selectPost();
		
		return postList;
	}


	public void deletePost(ArrayList<String> chose) {
		// TODO Auto-generated method stub
		int i=1;
		Iterator<String> it = chose.iterator();
		while(it.hasNext()) {
			adminDao.deletePost(it.next().toString());
			System.out.println("删除第"+i+++"条成功");
		}
	}


	public void SelectPostbypage(int pageNo, int pageSize) {
		// TODO Auto-generated method stub
		Map sess = ActionContext.getContext().getSession();
		List<TPost> postList=adminDao.queryBypage(pageNo, pageSize);
		for (TPost tp:postList) {
			System.out.println("帖子名:"+tp.getPostName()+"\t发布者:"+tp.getTUser().getUserName());
		}
		sess.put("postList",postList);
	}


	public List<TPostComment> selectTPostComment(String postid) {
		// TODO Auto-generated method stub
		System.out.println("进入service");
		return adminDao.selectTPostComment(postid);
	}


	public void SelectTPostCommentbypage(int pageNoC, int pageSizeC,String postid) {
		// TODO Auto-generated method stub
		
		Map sess = ActionContext.getContext().getSession();
		List<TPostComment> commentList=adminDao.SelectTPostCommentbypage(pageNoC,pageSizeC,postid);
		sess.put("commentList", commentList);
	}


	public void deletePostComment(ArrayList<String> chose) {
		// TODO Auto-generated method stub
		int i=1;
		Iterator<String> it = chose.iterator();
		while(it.hasNext()) {
			adminDao.deletePostComment(it.next().toString());
			System.out.println("删除第"+i+++"条成功");
		}
		
		
	}

}

























package com.tqlsoft.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.MetadataSources;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;
import org.hibernate.service.ServiceRegistry;
import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TGameLibrary;
import com.tqlsoft.entity.TUser;
import com.tqlsoft.entity.Usermessage;

public class GameDaoImpl implements GameDao{
	
	//得到hibernateTemplate对象
	private HibernateTemplate hibernateTemplate;	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	//获取个人游戏库内容
	public List<TGameLibrary> getPersonalGame(String username){
		String queryString="FROM TGameLibrary t where TUser.userAccount=:TUser";
		String[] paramNames=new String[] {"TUser"};
		String[] values=new String[] {username};
		List<TGameLibrary> list = (List<TGameLibrary>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);	
		
	//	List<TGame> game = null;
	//	for(TGameLibrary t:list) {
	//		System.out.println(t.getTGame());
	//		List<TGame> ls = (List<TGame>) this.hibernateTemplate.get(TGame.class, t.getTGame().getGameId());
	//		game.add((TGame) ls);
	//	}
		
	//	System.out.println(list);
		
		return list;
	//	return game;
	}
	
	//获取游戏库
	public List<TGame> getGame(){
		List<TGame> game = (List<TGame>) hibernateTemplate.find("from TGame"); 
		System.out.println("game");
		return game;
		
	}
	public List<TGame> choseGame() {
		List<TGame> games = (List<TGame>) hibernateTemplate.find("from TGame"); 

//		List<TGame> games = (List<TGame>) hibernateTemplate.get(TGame.class, 1231);
		System.out.println(games);
		return games;
		
	}
}

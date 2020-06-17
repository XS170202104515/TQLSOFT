package com.tqlsoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.GameDao;
import com.tqlsoft.dao.GameDaoImpl;
import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TGameLibrary;

public class GameService {
	
	//注入dao对象
	private GameDao gameDao;
	public void setGameDao(GameDao gameDao) {
		this.gameDao = gameDao;
	}
	//获取游戏库内容
	public String getGame() {
		List<TGame> game = gameDao.getGame();
		Map session = ActionContext.getContext().getSession();		
		session.put("game", game);
		
		//管理员浏览界面
		System.out.println(session.get("username").toString().length());
		if(session.get("username").toString().length()>5) {
			
			return "success";
		}
		else {
			return "admin";
		}
	}
	
	//获取个人游戏库内容
	public String getPersonalGame() {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		List<TGameLibrary> game = gameDao.getPersonalGame((String)sess.get("username"));
		Map session = ActionContext.getContext().getSession();		
		session.put("personal", game);
		return "success";
	}
	
	//查询相关数据
	public String QueryData(int game_id) {
		
		List<TGame> games = gameDao.choseGame();
		System.out.println(game_id);
		for(TGame game: games) {
			int choosenGame = game.getGameId();
			if(game_id == choosenGame) {
				int no = game_id%10-1;
				System.out.println("no:"+no);
				System.out.println(no);
				Map session = ActionContext.getContext().getSession();
				session.put("imgPath", "indexassets/img/introduce/introduce-"+no+".jpg");
				session.put("games", games);
				session.put("no", no);
				System.out.println(game_id);
				return "chose";
			}
		}
//		for(TGame game: games) {
//			int choosenGame = game.getGameId();
//			if(game_id == choosenGame) {
//				session.put("Game_name", game.getGameName());//游戏名称
//				session.put("Game_category", game.getGameCategory());//游戏类型
//				session.put("Game_size", game.getGameSize());//游戏大小
//				session.put("Game_disposition", game.getGameDisposition());//游戏配置
//				session.put("Game_introduce", game.getGameIntroduce());//游戏介绍
//				session.put("Game_price", game.getGamePrice());//游戏价格
//				session.put("Game_time", game.getGameTime());//发布时间
//				session.put("Game_developer", game.getGameAnother());//开发商
//				session.put(key, value)
//			}
//		}
		
		return "chose";
	}
	
}

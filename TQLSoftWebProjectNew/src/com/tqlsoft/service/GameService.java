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
	
	//ע��dao����
	private GameDao gameDao;
	public void setGameDao(GameDao gameDao) {
		this.gameDao = gameDao;
	}
	//��ȡ��Ϸ������
	public String getGame() {
		List<TGame> game = gameDao.getGame();
		Map session = ActionContext.getContext().getSession();		
		session.put("game", game);
		
		//����Ա�������
		System.out.println(session.get("username").toString().length());
		if(session.get("username").toString().length()>5) {
			
			return "success";
		}
		else {
			return "admin";
		}
	}
	
	//��ȡ������Ϸ������
	public String getPersonalGame() {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		List<TGameLibrary> game = gameDao.getPersonalGame((String)sess.get("username"));
		Map session = ActionContext.getContext().getSession();		
		session.put("personal", game);
		return "success";
	}
	
	//��ѯ�������
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
//				session.put("Game_name", game.getGameName());//��Ϸ����
//				session.put("Game_category", game.getGameCategory());//��Ϸ����
//				session.put("Game_size", game.getGameSize());//��Ϸ��С
//				session.put("Game_disposition", game.getGameDisposition());//��Ϸ����
//				session.put("Game_introduce", game.getGameIntroduce());//��Ϸ����
//				session.put("Game_price", game.getGamePrice());//��Ϸ�۸�
//				session.put("Game_time", game.getGameTime());//����ʱ��
//				session.put("Game_developer", game.getGameAnother());//������
//				session.put(key, value)
//			}
//		}
		
		return "chose";
	}
	
}

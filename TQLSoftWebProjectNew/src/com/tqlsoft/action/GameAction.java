package com.tqlsoft.action;

import java.util.Map;


import org.apache.struts2.interceptor.SessionAware;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.tqlsoft.service.GameService;

public class GameAction extends ActionSupport implements SessionAware{
	
	private GameService gameService;
	private int Game_id;//获取游戏序号
	
	
	private Map<String, Object> session;
	@Override
	public void setSession(Map<String, Object> session) {
		this.session = session;
	}
	public GameService getGameService() {
		return gameService;
	}
	public void setGameService(GameService gameService) {
		this.gameService = gameService;
	}
	public int getGame_id() {
		return Game_id;
	}
	public void setGame_id(int game_id) {
		Game_id = game_id;
	}
	
	//页面跳转实现参数传递
	public String choseGame() {
		String i=gameService.QueryData(Game_id);
		Object no=(Object)ActionContext.getContext().getSession().get("no");
		System.out.println("object:"+Integer.valueOf(no.toString()));	
		return i;
	}
	
	@Override
	public String execute() throws Exception {
		return super.execute();
	}
	
	//获取游戏库内容
	public String getGame() {
		String result = gameService.getGame();
		return result;
	}
	
	//获取个人游戏库内容
	public String getPersonalGame() {
		gameService.getPersonalGame();
		return "success";
	}
}

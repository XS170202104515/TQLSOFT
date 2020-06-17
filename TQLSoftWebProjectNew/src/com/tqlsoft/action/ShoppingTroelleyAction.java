package com.tqlsoft.action;

import com.tqlsoft.service.ShoppingTroelleyService;

public class ShoppingTroelleyAction {
	private String GameId;
	private ShoppingTroelleyService shoppingtroelleyService;
	
	public String getGameId() {
		return GameId;
	}
	public void setGameId(String gameId) {
		GameId = gameId;
	}

	
	public void setShoppingtroelleyService(ShoppingTroelleyService shoppingtroelleyService) {
		this.shoppingtroelleyService = shoppingtroelleyService;
	}
	
	public String execute() throws Exception {
		return shoppingtroelleyService.setShoppList();
	}
	
	public String deShoppCart() {
		shoppingtroelleyService.deShoppCart(GameId);
		return 	shoppingtroelleyService.setShoppList();
	}
	
	public String SubmitCart() {
		shoppingtroelleyService.subCart();
		return "success";
	}
	
	public String ShoppCart() {		
		System.out.println(GameId);
		shoppingtroelleyService.addShoppCart(GameId);
		return shoppingtroelleyService.setShoppList();
	}
}

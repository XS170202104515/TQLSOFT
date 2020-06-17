package com.tqlsoft.dao;

import java.util.List;

import com.tqlsoft.entity.TShoppingTroelley;


public interface ShoppingTroelleyDao {
	public List ShoppList(List<TShoppingTroelley> list);
	public List<TShoppingTroelley> getShoppCart(String username);
	public String ShoppList(String GameId, String username);
	public void deleteShopping(int purchaseId);
	public List subCart(String username);
	public void addGameLibrary(String username, int gameId);
}

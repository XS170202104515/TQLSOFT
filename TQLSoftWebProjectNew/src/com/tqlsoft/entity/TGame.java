package com.tqlsoft.entity;

import java.util.Set;

public class TGame {
	private int gameId;
	private String gameCategory;
	private String gameAnother;
	private String gameSize;
	private String gameName;
	private String gameDisposition;
	private String gameIntroduce;
	private float gamePrice ;
	private float gameDiscount;
	private String gameTime;
	private Set TShoppingTrolleies;
	
	public int getGameId() {
		return gameId;
	}
	public void setGameId(int gameId) {
		this.gameId = gameId;
	}
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}
	public String getGameAnother() {
		return gameAnother;
	}
	public void setGameAnother(String gameAnother) {
		this.gameAnother = gameAnother;
	}
	public String getGameSize() {
		return gameSize;
	}
	public void setGameSize(String gameSize) {
		this.gameSize = gameSize;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameDisposition() {
		return gameDisposition;
	}
	public void setGameDisposition(String gameDisposition) {
		this.gameDisposition = gameDisposition;
	}
	public String getGameIntroduce() {
		return gameIntroduce;
	}
	public void setGameIntroduce(String gameIntroduce) {
		this.gameIntroduce = gameIntroduce;
	}
	public float getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(float gamePrice) {
		this.gamePrice = gamePrice;
	}
	public float getGameDiscount() {
		return gameDiscount;
	}
	public void setGameDiscount(float gameDiscount) {
		this.gameDiscount = gameDiscount;
	}
	public String getGameTime() {
		return gameTime;
	}
	public void setGameTime(String gameTime) {
		this.gameTime = gameTime;
	}
	public Set getTShoppingTrolleies() {
		return TShoppingTrolleies;
	}
	public void setTShoppingTrolleies(Set tShoppingTrolleies) {
		TShoppingTrolleies = tShoppingTrolleies;
	}
}

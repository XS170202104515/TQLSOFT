package com.tqlsoft.entity;

public class AddGame {
	private String gameCategory;
	private String gameId;
	private String gameName;
	private String gameAnother;
	private float gamePrice;
	private String gameTime;
	private String gameSize;
	private String gameIntroduce;
	private String gameOs;
	private String gameProcessor;
	private String gameGraphics;
	private String gameRam;
	private String gameResolution;
	private String gamePreset;
	public String getGameCategory() {
		return gameCategory;
	}
	public void setGameCategory(String gameCategory) {
		this.gameCategory = gameCategory;
	}
	public String getGameId() {
		return gameId;
	}
	public void setGameId(String gameId) {
		this.gameId = gameId;
	}
	public String getGameName() {
		return gameName;
	}
	public void setGameName(String gameName) {
		this.gameName = gameName;
	}
	public String getGameAnother() {
		return gameAnother;
	}
	public void setGameAnother(String gameAnother) {
		this.gameAnother = gameAnother;
	}
	public float getGamePrice() {
		return gamePrice;
	}
	public void setGamePrice(float gamePrice) {
		this.gamePrice = gamePrice;
	}
	public String getGameTime() {
		return gameTime;
	}
	public void setGameTime(String gameTime) {
		this.gameTime = gameTime;
	}
	public String getGameIntroduce() {
		return gameIntroduce;
	}
	public void setGameIntroduce(String gameIntroduce) {
		this.gameIntroduce = gameIntroduce;
	}
	public String getGameOs() {
		return gameOs;
	}
	public void setGameOs(String gameOs) {
		this.gameOs = gameOs;
	}
	public String getGameProcessor() {
		return gameProcessor;
	}
	public void setGameProcessor(String gameProcessor) {
		this.gameProcessor = gameProcessor;
	}
	public String getGameGraphics() {
		return gameGraphics;
	}
	public void setGameGraphics(String gameGraphics) {
		this.gameGraphics = gameGraphics;
	}
	public String getGameRam() {
		return gameRam;
	}
	public void setGameRam(String gameRam) {
		this.gameRam = gameRam;
	}
	public String getGameResolution() {
		return gameResolution;
	}
	public void setGameResolution(String gameResolution) {
		this.gameResolution = gameResolution;
	}
	public String getGamePreset() {
		return gamePreset;
	}
	public void setGamePreset(String gamePreset) {
		this.gamePreset = gamePreset;
	}
	
	
	public String getGameSize() {
		return gameSize;
	}
	public void setGameSize(String gameSize) {
		this.gameSize = gameSize;
	}
	@Override
	public String toString() {
		return  gameOs + ";" + gameProcessor + ";" + gameGraphics
				+ ";" + gameRam + ";" + gameResolution + ";" + gamePreset;
	}
	
	
}

package com.tqlsoft.entity;

public class TGameLibrary {
	private int serialNumber;
	private TGame TGame;
	private TUser TUser;
	private String gameLibraryId;
	public int getSerialNumber() {
		return serialNumber;
	}
	public void setSerialNumber(int serialNumber) {
		this.serialNumber = serialNumber;
	}
	public TGame getTGame() {
		return TGame;
	}
	public void setTGame(TGame tGame) {
		TGame = tGame;
	}
	public TUser getTUser() {
		return TUser;
	}
	public void setTUser(TUser tUser) {
		TUser = tUser;
	}
	public String getGameLibraryId() {
		return gameLibraryId;
	}
	public void setGameLibraryId(String gameLibraryId) {
		this.gameLibraryId = gameLibraryId;
	}
	
}

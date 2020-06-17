package com.tqlsoft.entity;

public class TShoppingTroelley {
	private int purchaseId;
	private String cartId;
	private int gameQuantity;
	private String merchantNo;//…Ãº“∫≈
	
	private TGame TGame;
	private TUser TUser;
	
	public int getPurchaseId() {
		return purchaseId;
	}
	public void setPurchaseId(int purchaseId) {
		this.purchaseId = purchaseId;
	}
	public String getCartId() {
		return cartId;
	}
	public void setCartId(String cartId) {
		this.cartId = cartId;
	}
	
	public int getGameQuantity() {
		return gameQuantity;
	}
	public void setGameQuantity(int gameQuantity) {
		this.gameQuantity = gameQuantity;
	}
	public String getMerchantNo() {
		return merchantNo;
	}
	public void setMerchantNo(String merchantNo) {
		this.merchantNo = merchantNo;
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
	
}

package com.tqlsoft.dao;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;

import com.tqlsoft.entity.*;


public class ShoppingTroelleyDaoImpl implements ShoppingTroelleyDao {
	private HibernateTemplate hibernateTemplate;	
	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}
	
	@Override
	public List ShoppList(List<TShoppingTroelley> list) {
		// TODO Auto-generated method stub
		System.out.println(list);
		TGame tGame=new TGame();
		Iterator it=list.iterator();
		List<TGame> shoppList= new ArrayList<TGame>();		
		for(TShoppingTroelley tst:list) {
			tGame=(TGame)hibernateTemplate.get(TGame.class, tst.getTGame().getGameId());
			shoppList.add(tGame);
		}
		
		for(TGame tg : shoppList) {
			System.out.println(tg.getGameName());
			System.out.println(tg.getGameIntroduce());
		}
		return shoppList;
	}

	@Override
	public List<TShoppingTroelley> getShoppCart(String username) {
		// TODO Auto-generated method stub
		/*String queryString="";
		String paramName="";
		String value="";
		hibernateTemplate.findByNamedParam(queryString, paramName, value);*/
		String queryString="FROM TShoppingTroelley t where cartId=:cartId and t.TUser.userAccount=:userAccount";
		String[] paramNames=new String[] {"cartId","userAccount"};
		String[] values=new String[] {username+"st",username};
		List<TShoppingTroelley> list = (List<TShoppingTroelley>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);		
		System.out.println(list);
		return list;
		/*System.out.println(list.get(0).getTGame().getGameId());
		if(!GameId.equals(list.get(0).getTGame().getGameId())) {
			
		}*/
	}
	
	

	@Override
	public String ShoppList(String GameId,String username) {
		// TODO Auto-generated method stub
		System.out.println(username);
		TShoppingTroelley tShoppingTroelley=new TShoppingTroelley();
		TGame tGame=new TGame();
		TUser tUser=new TUser();
		
		tShoppingTroelley.setGameQuantity(1);
		tShoppingTroelley.setCartId(username+"st");
		tGame.setGameId(Integer.valueOf(GameId));
		tUser.setUserAccount(username);
		
		tShoppingTroelley.setTGame(tGame);
		tShoppingTroelley.setTUser(tUser);
		
		hibernateTemplate.save(tShoppingTroelley);
		System.out.println("–¥»Î≥…π¶");
		return "OK";
	}

	@Override
	public void deleteShopping(int purchaseId) {
		// TODO Auto-generated method stub
		TShoppingTroelley tShoppingTroelley=hibernateTemplate.get(TShoppingTroelley.class, purchaseId);
		hibernateTemplate.delete(tShoppingTroelley);
	}

	@Override
	public List subCart(String username) {
		// TODO Auto-generated method stub
		String queryString="FROM TGameLibrary t where t.gameLibraryId=:gameLibraryId and t.TUser.userAccount=:userAccount";
		String[] paramNames=new String[] {"gameLibraryId","userAccount"};
		String[] values=new String[] {username+"lb",username};
		List<TGameLibrary> list = (List<TGameLibrary>) hibernateTemplate.findByNamedParam(queryString, paramNames, values);		
		System.out.println(list);
		return list;
	}

	@Override
	public void addGameLibrary(String username, int gameId) {
		// TODO Auto-generated method stub
		TGame tGame = new TGame();
		tGame.setGameId(gameId);
		
		TUser tUser =new TUser();
		tUser.setUserAccount(username);
		
		TGameLibrary tGameLibrary=new TGameLibrary();
		tGameLibrary.setGameLibraryId(username+"lb");
		tGameLibrary.setTGame(tGame);
		tGameLibrary.setTUser(tUser);
		
		hibernateTemplate.save(tGameLibrary);
	}
}

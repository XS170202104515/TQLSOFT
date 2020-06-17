package com.tqlsoft.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.transaction.annotation.Transactional;

import com.opensymphony.xwork2.ActionContext;
import com.tqlsoft.dao.ShoppingTroelleyDao;
import com.tqlsoft.entity.*;

@Transactional
public class ShoppingTroelleyService {
	private ShoppingTroelleyDao shoppingtroelleyDao;
	
	
	public void setShoppingtroelleyDao(ShoppingTroelleyDao shoppingtroelleyDao) {
		this.shoppingtroelleyDao = shoppingtroelleyDao;
	}

	public String setShoppList() {
		Map<String, Object> sess=ActionContext.getContext().getSession();
		System.out.println((String)sess.get("username"));
		List<TShoppingTroelley> list=shoppingtroelleyDao.getShoppCart((String)sess.get("username"));
		System.out.println("service.............."+list);
		List shoppList=new ArrayList();
		if(list!=null&&!list.isEmpty()){
			shoppList=shoppingtroelleyDao.ShoppList(list);
			sess.put("shoppList", shoppList);
		}else {
			shoppList.clear();
			ActionContext.getContext().put("message","���ﳵ�տ���Ҳ" );
			sess.put("shoppList", shoppList);
		}
		return "shopp";
	}

	public void addShoppCart(String GameId) {
		// TODO Auto-generated method stub
		Map<String, Object> sess=ActionContext.getContext().getSession();
		String username=(String)sess.get("username");
		System.out.println("username:"+username);
		List<TShoppingTroelley> list=shoppingtroelleyDao.getShoppCart(username);
		System.out.println(GameId);
		int count=0;
		if(list!=null&&!list.isEmpty()){
			System.out.println("list not null");
			for(int i=0;i<list.size();i++) {				
				if(String.valueOf(list.get(i).getTGame().getGameId()).equals(GameId)) {					
					count+=1;
				}															
			}			
			System.out.println(count);
			if(count==0) {
				shoppingtroelleyDao.ShoppList(GameId, username);
				System.out.println("Serviceִ�����");
			}else {
				System.out.println("��Ϸֻ�ܹ���һ��Ŷ");
			}
		}else {
			shoppingtroelleyDao.ShoppList(GameId, username);
			System.out.println("Serviceִ�����");

		}
	}
	
	
	

	public void deShoppCart(String GameId) {
		// TODO Auto-generated method stub
		Map<String, Object> sess=ActionContext.getContext().getSession();
		String username=(String) sess.get("username");		
		List<TShoppingTroelley> list=shoppingtroelleyDao.getShoppCart(username);
		for(TShoppingTroelley tst:list) {
			if(String.valueOf(tst.getTGame().getGameId()).equals(GameId)) {
				shoppingtroelleyDao.deleteShopping(tst.getPurchaseId());
			}
		}
		sess.put("sList", list);
	}

	public String subCart() {
		// TODO Auto-generated method stub
		Map<String, Object> sess=ActionContext.getContext().getSession();
		List<TGame> shoppList=(List<TGame>) sess.get("shoppList");
		List<Integer> list=new ArrayList<Integer>();
		List<String> gName=new ArrayList<String>();
		for(TGame tg:shoppList) {
			list.add(tg.getGameId());
		}
		List<TGameLibrary> res=shoppingtroelleyDao.subCart((String)sess.get("username"));
		if(!res.isEmpty()&&res!=null) {//�ж��Ƿ��и��û�����Ϸ��
			for(int i=0;i<res.size();i++) {//�ж��Ƿ�����ͬ��Ϸ
				for(TGame tg:shoppList) {
					if(tg.getGameId()==res.get(i).getTGame().getGameId()) {
						gName.add(tg.getGameName());
					}
				}
			}
			if(gName!=null&&!gName.isEmpty()) {
				sess.put("gName",gName);
				System.out.println(gName);
				return "fail";
			}else {
				for(TGame tg :shoppList) {					
					shoppingtroelleyDao.addGameLibrary((String)sess.get("username"),tg.getGameId());
				}
			}
		}else {
			
		}
		return "success";
		
	}
}

package com.tqlsoft.dao;

import java.util.List;

import com.tqlsoft.entity.TFriendLibrary;
import com.tqlsoft.entity.TUser;


public interface FriendDao {
	public List<TFriendLibrary> LoginCheck(String u);
	public List<TUser> findFriend(String userid);
	public void addFriend(String userId,String friendId,String name);
}

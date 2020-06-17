package com.tqlsoft.dao;

import java.util.ArrayList;
import java.util.List;

import com.tqlsoft.entity.Usermessage;

public interface UpdateMessageDao {
	public ArrayList<String> updateMessage(String username,Usermessage um);
}

package com.tqlsoft.dao;

import java.util.List;

import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TPost;

public interface PostDao {
	public List<TPost> LoginCheck(String u);
}

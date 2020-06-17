package com.tqlsoft.dao;

import java.util.List;

import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TPostComment;

public interface PostCmDao {
	public List<TPostComment> LoginCheck(String id);
}

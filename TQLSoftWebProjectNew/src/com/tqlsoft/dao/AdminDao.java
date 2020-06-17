package com.tqlsoft.dao;

import java.util.List;

import com.tqlsoft.entity.AddGame;
import com.tqlsoft.entity.TGame;
import com.tqlsoft.entity.TPost;
import com.tqlsoft.entity.TPostComment;
import com.tqlsoft.entity.TUser;

public interface AdminDao {

	public List<TUser> selceUsers();

	public void deleteUser(String userAccount);

	public List addGame(AddGame game);

	public List<TGame> selectGame(String gameId);

	public void update(AddGame game);

	public List<TPost> selectPost();
	
	public List<TPost> queryBypage(int pageNo,int pageSize);

	public void deletePost(String string);

	public List<TPostComment> selectTPostComment(String postid);

	public List<TPostComment> SelectTPostCommentbypage(int pageNoC, int pageSizeC,String postid);

	public void deletePostComment(String string);

}

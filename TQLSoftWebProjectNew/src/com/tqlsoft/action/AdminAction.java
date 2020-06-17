package com.tqlsoft.action;


import java.util.ArrayList;
import java.util.List;

import com.tqlsoft.entity.*;
import com.tqlsoft.service.AdminService;

public class AdminAction {
	private AdminService adminService;
	private ArrayList<String> chose=new ArrayList<String>();
	private AddGame game;
	private final int pageSize=8; //每页显示记录的个数
	private int pageNo=1; //计数器,从第1页开始显示
	private int currentPage; //当前页
	private int totalPage; //总页数
	
	
	private final int pageSizeC=8; //每页显示记录的个数
	private int pageNoC=1; //计数器,从第1页开始显示
	private int currentPageC; //当前页
	private int totalPageC; //总页数
	private String postid;
	
	

	public String getPostid() {
		return postid;
	}


	public void setPostid(String postid) {
		this.postid = postid;
	}


	public int getPageNoC() {
		return pageNoC;
	}


	public void setPageNoC(int pageNoC) {
		this.pageNoC = pageNoC;
	}


	public int getCurrentPageC() {
		return currentPageC;
	}


	public void setCurrentPageC(int currentPageC) {
		this.currentPageC = currentPageC;
	}


	public int getTotalPageC() {
		return totalPageC;
	}


	public void setTotalPageC(int totalPageC) {
		this.totalPageC = totalPageC;
	}


	public int getPageSizeC() {
		return pageSizeC;
	}


	public int getPageNo() {
		return pageNo;
	}


	public void setPageNo(int pageNo) {
		this.pageNo = pageNo;
	}


	public int getCurrentPage() {
		return currentPage;
	}


	public void setCurrentPage(int currentPage) {
		this.currentPage = currentPage;
	}


	public int getTotalPage() {
		return totalPage;
	}


	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}


	public int getPageSize() {
		return pageSize;
	}


	public ArrayList<String> getChose() {
		return chose;
	}


	public void setChose(ArrayList<String> chose) {
		this.chose = chose;
	}


	public AdminService getAdminService() {
		return adminService;
	}
	

	public AddGame getGame() {
		return game;
	}


	public void setGame(AddGame game) {
		this.game = game;
	}
	
	public void setAdminService(AdminService adminService) {
		this.adminService = adminService;
	}
	
	public String manageUsers() {
		adminService.selcetUsers();		
		return "success";		
	}
	
	public String deleteUser() {
		adminService.deleteUser(chose);
		return "success";		

	}
	
	public String AddGame() {
		System.out.println(game.getGameCategory());
		adminService.addGame(game);
		return "success";//改
	}
	
	public String UpdateGame() {
		adminService.updateGame(game);
		System.out.println("更新完成");
		return null;
	}
	
	public String SelectGame() {//查找对应id的游戏信息
		adminService.selectGame(game.getGameId());
		return "update";
	}
	
	public String SelectPost() {
		List<TPost> postList=adminService.selectPost();
		if(postList.size()%pageSize==0){
			totalPage=postList.size()/pageSize;
		}else{//取模有余数，总页数+1
			totalPage=postList.size()/pageSize+1;
		}		
		//控制页码不会越界
		if(pageNo<=0){
			pageNo=1;
		}else if(pageNo>totalPage){
			pageNo=totalPage;
		}
	
		//根据当前页码，查询要在该页上显示的8条数据，列表postList里仅包括当前页要显示的postList数据
		adminService.SelectPostbypage(pageNo,pageSize);
		currentPage=pageNo;
		return "depost";
	}
	
	public String DeletePost() {
		adminService.deletePost(chose);
		System.out.println(chose);
		adminService.SelectPostbypage(pageNo,pageSize);
		return "depost";
	}
	
	public String SelectPostComment() {
		System.out.println("进入Action");
		List<TPostComment> commentList=adminService.selectTPostComment(postid);
		if(commentList.size()%pageSizeC==0){
			totalPageC=commentList.size()/pageSizeC;
		}else{//取模有余数，总页数+1
			totalPageC=commentList.size()/pageSizeC+1;
		}		
		//控制页码不会越界
		if(pageNoC<=0){
			pageNoC=1;
		}else if(pageNoC>totalPageC){
			pageNoC=totalPageC;
		}
		
		System.out.println("分页显示查找");
		//根据当前页码，查询要在该页上显示的8条数据，列表postList里仅包括当前页要显示的postList数据
		adminService.SelectTPostCommentbypage(pageNoC,pageSizeC,postid);
		currentPageC=pageNoC;
		return "postcomment";
	}
	
	public String DeletePostComment() {
		adminService.deletePostComment(chose);
		return "postcomment";
	}
}

package com.tqlsoft.action;


import java.util.ArrayList;
import java.util.List;

import com.tqlsoft.entity.*;
import com.tqlsoft.service.AdminService;

public class AdminAction {
	private AdminService adminService;
	private ArrayList<String> chose=new ArrayList<String>();
	private AddGame game;
	private final int pageSize=8; //ÿҳ��ʾ��¼�ĸ���
	private int pageNo=1; //������,�ӵ�1ҳ��ʼ��ʾ
	private int currentPage; //��ǰҳ
	private int totalPage; //��ҳ��
	
	
	private final int pageSizeC=8; //ÿҳ��ʾ��¼�ĸ���
	private int pageNoC=1; //������,�ӵ�1ҳ��ʼ��ʾ
	private int currentPageC; //��ǰҳ
	private int totalPageC; //��ҳ��
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
		return "success";//��
	}
	
	public String UpdateGame() {
		adminService.updateGame(game);
		System.out.println("�������");
		return null;
	}
	
	public String SelectGame() {//���Ҷ�Ӧid����Ϸ��Ϣ
		adminService.selectGame(game.getGameId());
		return "update";
	}
	
	public String SelectPost() {
		List<TPost> postList=adminService.selectPost();
		if(postList.size()%pageSize==0){
			totalPage=postList.size()/pageSize;
		}else{//ȡģ����������ҳ��+1
			totalPage=postList.size()/pageSize+1;
		}		
		//����ҳ�벻��Խ��
		if(pageNo<=0){
			pageNo=1;
		}else if(pageNo>totalPage){
			pageNo=totalPage;
		}
	
		//���ݵ�ǰҳ�룬��ѯҪ�ڸ�ҳ����ʾ��8�����ݣ��б�postList���������ǰҳҪ��ʾ��postList����
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
		System.out.println("����Action");
		List<TPostComment> commentList=adminService.selectTPostComment(postid);
		if(commentList.size()%pageSizeC==0){
			totalPageC=commentList.size()/pageSizeC;
		}else{//ȡģ����������ҳ��+1
			totalPageC=commentList.size()/pageSizeC+1;
		}		
		//����ҳ�벻��Խ��
		if(pageNoC<=0){
			pageNoC=1;
		}else if(pageNoC>totalPageC){
			pageNoC=totalPageC;
		}
		
		System.out.println("��ҳ��ʾ����");
		//���ݵ�ǰҳ�룬��ѯҪ�ڸ�ҳ����ʾ��8�����ݣ��б�postList���������ǰҳҪ��ʾ��postList����
		adminService.SelectTPostCommentbypage(pageNoC,pageSizeC,postid);
		currentPageC=pageNoC;
		return "postcomment";
	}
	
	public String DeletePostComment() {
		adminService.deletePostComment(chose);
		return "postcomment";
	}
}

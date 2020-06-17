<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8" import="java.util.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ taglib prefix="s" uri="/struts-tags"%>
<%@ page import="com.tqlsoft.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
<title>Insert title here</title>
</head>
<body>
  <%List<TPost> list = (List)ActionContext.getContext().getSession().get("postList"); %>

	<div align="center">
	<form action="adminAction!DeletePost">
	<table border="2px">
	
    	<tr align="center">
    		<td colspan="7" style="font-size:32px">学生信息管理中心</td>
    	</tr>  	
    	<tr align="center">
    	    <td style="height:20px;width:40px "></td>
    		<td style="height:20px;width:20px ">序号</td>
    		<td style="height:20px;width:90px ">论坛名</td>
    		<td style="height:20px;width:150px ">帖子名</td>
    		<td style="height:20px;width:60px ">发布者</td>
    		<td style="height:20px;width:90px ">发布时间</td>    		
    		<td style="height:20px ">帖子内容</td>
    	</tr>
    	<%
    		int i=1;
    		if(!list.isEmpty()&&list!=null){
    		for(TPost tp:list){
    			
    	 %>
    	 <tr align="center">
    	 	<td>
    	 		<input name="chose" type="checkbox" value=<%=tp.getPostId()  %>>
    	 	</td>
    	 	<td><%= i++ %></td>
    	 	<td><%= tp.getTForum().getForumName() %></td>
    	 	<td><a href="adminAction!SelectPostComment?postid=<%=tp.getPostId()%>"><%= tp.getPostName() %></a></td>
    	 	<td><%= tp.getTUser().getUserName() %></td>
    	 	<td><%= tp.getPostTime() %></td>
    	 	<td><%= tp.getPostContent() %></td>
    	 	
    	 </tr>
    	  <%}}%>
    	 <tr align="center">
    		<td colspan="7" style="font-size:32px">
    			<input type="submit" value="删除"/>
			</td>
    	</tr>
    	
    	<tr align="center" >
    	<td colspan="7" style="font-size:20px">
    		 [<a href="adminAction!SelectPost?pageNo=1">首页</a>]
		<c:choose>
			<c:when test="${currentPage>1}">
				[<a href="adminAction!SelectPost?pageNo=${currentPage-1}">上一页</a>]
			</c:when>
		</c:choose>
		
		<c:choose>
			<c:when test="${currentPage<totalPage}">
			[<a href="adminAction!SelectPost?pageNo=${currentPage+1}">下一页</a>]
			</c:when>
		</c:choose>
			[<a href="adminAction!SelectPost?pageNo=${totalPage}">尾页</a>]
		</td>
    	</tr>
    	</form>
    	  </table>
    	 
	</div>
</body>
</html>
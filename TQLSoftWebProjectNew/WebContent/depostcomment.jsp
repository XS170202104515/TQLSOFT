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
  <%List<TPostComment> list = (List)ActionContext.getContext().getSession().get("commentList"); %>

	<div align="center">
	<form action="adminAction!DeletePost">
	<table border="2px">
	
    	<tr align="center">
    		<td colspan="7" style="font-size:32px"><%=list.get(0).getTPost().getPostName() %>的评论</td>
    	</tr>  	
    	<tr align="center">
    	    <td style="height:20px;width:40px "></td>
    		<td style="height:20px;width:20px ">序号</td>
    		<td style="height:20px;width:150px ">帖子名</td>
    		<td style="height:20px;width:60px ">评论者</td>
    		<td style="height:20px;width:90px ">评论时间</td>    		
    		<td style="height:20px ">评论内容</td>
    	</tr>
    	<%
    		int i=1;
    		if(!list.isEmpty()&&list!=null){
    		for(TPostComment tpc:list){
    			
    	 %>
    	 <tr align="center">
    	 	<td>
    	 		<input name="chose" type="checkbox" value=<%=tpc.getCommentId() %>>
    	 	</td>
    	 	<td><%= i++ %></td>
    	 	<td><%= tpc.getTPost().getPostName() %></td>
    	 	<td><%= tpc.getTUser().getUserName() %></td>
    	 	<td><%= tpc.getCommentTime() %></td>
    	 	<td><%= tpc.getCommentContent() %></td>
    	 	
    	 </tr>
    	  <%}}%>
    	 <tr align="center">
    		<td colspan="7" style="font-size:32px">
    			<input type="submit" value="删除"/>
			</td>
    	</tr>
    	
    	<tr align="center" >
    	<td colspan="7" style="font-size:20px">
    		 [<a href="adminAction!SelectPostComment?pageNoC=1">首页</a>]
		<c:choose>
			<c:when test="${currentPageC>1}">
				[<a href="adminAction!SelectPostComment?pageNoC=${currentPageC-1}">上一页</a>]
			</c:when>
		</c:choose>
		
		<c:choose>
			<c:when test="${currentPageC<totalPageC}">
			[<a href="adminAction!SelectPostComment?pageNoC=${currentPageC+1}">下一页</a>]
			</c:when>
		</c:choose>
			[<a href="adminAction!SelectPostComment?pageNoC=${totalPageC}">尾页</a>]
		</td>
    	</tr>
    	</form>
    	  </table>
    	 
	</div>
</body>
</html>
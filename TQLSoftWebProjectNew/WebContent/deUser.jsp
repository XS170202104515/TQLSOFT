<%@ page language="java" contentType="text/html; utf-8"
    pageEncoding="utf-8" import="java.util.*"%>

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
  <%List<TUser> list = (List)ActionContext.getContext().getSession().get("UsersList"); %>

	<div align="center">
	<table border="2px">
    	<tr align="center">
    		<td colspan="6" style="font-size:32px">用户管理中心</td>
    	</tr>  	
    	<tr align="center">
    	    <td style="height:20px width:40px "></td>
    		<td style="height:20px width:200px ">序号</td>
    		<td style="height:20px width:200px ">账号</td>
    		<td style="height:20px width:200px ">用户名</td>
    		<td style="height:20px width:200px ">状态</td>
    	</tr>
    	<%
    		int i=1;
    		if(!list.isEmpty()&&list!=null){
    		for(TUser us:list){
    			
    	 %>
    	 <tr align="center">
    	 	<td>
    	 		<input name="chose" type="checkbox" value=<%=us.getUserAccount()  %>>
    	 	</td>
    	 	<td><%= i++ %></td>
    	 	<td><%= us.getUserAccount() %></td>
    	 	<td><%= us.getUserName() %></td>
    	 	<td><%= us.getUserState() %></td>
    	 	
    	 </tr>
    	  <%}}%>
    	 <tr align="center">
    		<td colspan="6" style="font-size:32px">
    			<a href="adminAction!deleteUser"><input type="button" value="删除"/></a>
			</td>
    	</tr>
    	  </table>
    	 
	</div>
</body>
</html>
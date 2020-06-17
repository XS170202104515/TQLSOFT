<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
        <%@ page import="com.opensymphony.xwork2.ActionContext" %>
    <%@ page import="com.tqlsoft.entity.*" import="java.util.*"%>
    
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>编辑信息</title>
 
    <link rel="stylesheet" type="text/css" href="TqlSoftTest/updateMessage/updateMessage.css"/>
  
</head>
 
 
<body>
  <%List list = (List)ActionContext.getContext().getSession().get("userMessage"); 
  	
  %>
<jsp:include page="menu.jsp"></jsp:include>
<div id="login_frame">
 
    <p id="image_logo"><img src="TqlSoftTest/menu/logo1.png"></p>
 
    <form method="get" action="updateMessage" namespace="/">
        <p><label class="label_input">年龄</label><input type="text" name="um.userAge" class="text_field" value=<%=list.get(2) %>></p>     
		<p><label class="label_input">电子邮箱</label><input type="text" name="um.userEmail" class="text_field" value=<%=list.get(4) %>></p>
		<p><label class="label_input">昵称</label><input type="text" name="um.userName" class="text_field" value=<%=list.get(5) %>></p>
       	<p><label class="label_input">手机号码</label><input type="text" name="um.userPhone" class="text_field" value=<%=list.get(6) %>></p>
        <p><label class="label_input">性别</label><input type="text" name="um.userSex" class="text_field" value=<%=list.get(7) %>></p>       
  
        <p><s:property value="updateMessage" /></p>
 
        <div id="login_control">
            <input type="submit" id="btn_register" value="确认" />
			<a id="return_login" href="index.jsp">返回</a>
        </div>
    </form>
</div>

</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
   
<!DOCTYPE html>
<html>
<head>
<meta charset="">
 <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="login.css"/>
    
</head>
<body>
<div id="login_frame">
 
    <p id="image_logo"><img src=""></p>
 
    <form method="get" action="login">
 		<p><s:property value="message" /></p>
        <p><label class="label_input">用户名</label><input type="text" name="username" class="text_field"/></p>
        <p><label class="label_input">密码</label><input type="text" name="password" class="text_field"/></p>
 
        <div id="login_control">
            <input type="submit" id="btn_login" value="登录" />
            <a href="register.jsp"><input type="button" id="btn_register" value="注册" /></a>
        </div>
    </form>
</div>
</body>
</html>
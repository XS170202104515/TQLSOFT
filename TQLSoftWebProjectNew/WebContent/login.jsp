<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>
   
<!DOCTYPE html>
<html>
<head>
<head>
<meta charset="">
 <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="TqlSoftTest/login/login.css"/>
    <script src="TqlSoftTest/login/jquery1.9.0.min.js"></script>
    <script src="TqlSoftTest/login/bootstrap.min.js"></script>
	<script src="TqlSoftTest/login/checkuser.js"></script>
	
</head>

<body>
<div id="login_frame">
    <p id="image_logo"><img src=""></p>
    <form method="post" name="form1" action="login" onSubmit="return checkLogin()">
 		<p style="color: white"><s:property value="message"/></p>
 		<!-- <p><label class="label_input">账号</label><s:textfield name="username" cssClass="text_field" theme="simple"/></p>
 		<p><label class="label_input">密码</label><s:password name="password" cssClass="text_field"  theme="simple"/></p> -->
        <p><label class="label_input">用户名</label><input type="text" id="username" name="username" class="text_field"/></p>
        <p><label class="label_input">密码</label><input type="text" id="password" name="password" class="text_field"/></p>

        <div id="login_control">
            <input type="submit" id="btn_login" value="登录"/>
			<!-- <s:submit value="登录" ></s:submit> -->
            <a href="register.jsp"><input type="button" id="btn_register" value="注册" /></a>
        </div>
    </form>
</div>
</body>
</html>
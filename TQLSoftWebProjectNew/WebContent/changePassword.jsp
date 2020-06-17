<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ taglib prefix="s" uri="/struts-tags" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="">
 <title>修改密码</title>
    <link rel="stylesheet" type="text/css" href="TqlSoftTest/changePassword/changePassword.css"/>
    
</head>
<body>

<jsp:include page="menu.jsp"></jsp:include>
<div id="login_frame">
 
    <p id="image_logo"><img src="TqlSoftTest/menu/logo1.png"></p>
 
    <form method="get" action="changePassword">
 		<p><s:property value="message" /></p>
        <p><label class="label_input">原密码</label><input type="text" name="passwordOld" class="text_field"/></p>
        <p><label class="label_input">密码</label><input type="text" name="passwordNew" class="text_field"/></p>
        <p><label class="label_input">密码确认</label><input type="text" name="passwordAffirm" class="text_field"/></p>
 		<p><s:property value="changePasswordMessage" /></p>
        <div id="login_control">
            <input type="submit" id="btn_login" value="确认" />
            <a id="return_login" href="index.jsp">返回</a>
            
        </div>
        
    </form>
    
</div>
</body>
</html>
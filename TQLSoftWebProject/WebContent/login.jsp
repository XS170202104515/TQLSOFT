<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="">
 <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="login.css"/>
    
    <script type="text/javascript">
    	function login(){
    		document.getElementById("Login_form").action="";
			document.getElementById("Login_form").submit();
    	}	
    	
    	function register(){
    		
    	}
    </script>
</head>
<body>
<div id="login_frame">
 
    <p id="image_logo"><img src=""></p>
 
    <form method="post" action="" id="Login_form">
 
        <p><label class="label_input">用户名</label><input type="text" id="username" class="text_field"/></p>
        <p><label class="label_input">密码</label><input type="text" id="password" class="text_field"/></p>
 
        <div id="login_control">
            <input type="button" id="btn_login" value="登录" οnclick="login();"/>
            <input type="button" id="btn_register" value="注册" οnclick="register();"/>
        </div>
    </form>
</div>
</body>
</html>
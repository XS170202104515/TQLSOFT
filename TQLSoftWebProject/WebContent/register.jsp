<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>注册页面</title>
 
    <link rel="stylesheet" type="text/css" href="register.css"/>
  
</head>
 
<body>
<div id="login_frame">
 
    <p id="image_logo"><img src=""></p>
 
    <form method="get" action="register" namespace="/">
		<p><label class="label_input">手机号码</label><input type="text" name="re.Phone" class="text_field"/></p>
		<p><label class="label_input">电子邮箱</label><input type="text" name="re.Email" class="text_field"/></p>
		<p><label class="label_input">用户名</label><input type="text" name="re.Account" class="text_field"/></p>
		<p><label class="label_input">昵称</label><input type="text" name="re.Name" class="text_field"/></p>
        <p><label class="label_input">密码</label><input type="text" name="re.Password" class="text_field"/></p>
        <p><label class="label_input">性别</label><input type="text" name="re.Sex" class="text_field"/></p>       
        <p><label class="label_input">年龄</label><input type="text" name="re.Age" class="text_field"/></p>       
        
 
        <div id="login_control">
            <input type="submit" id="btn_register" value="注册" />
			<a id="return_login" href="login.jsp">返回登录</a>
        </div>
    </form>
</div>

</body>
</html>
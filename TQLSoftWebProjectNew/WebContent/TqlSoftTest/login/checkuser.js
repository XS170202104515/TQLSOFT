function checkLogin(){
	var username = $('#username').val();
	var password = $('#password').val();
	if(username == "" || username == null){
		alert('账号不能为空');
		return false;
	}else{
		if(document.form1.username.value.length != 10 && document.form1.username.value.length != 2){
			alert('账号须为10位任意字符');
			return false;
		}
	}
	if(password =="" || password == null){
		alert('密码不能为空');
		return false;
	}
	return true;
}


function checkRegist(){
	var PhoneNumber = $('#Phone').val();
	var Email = $('#Email').val();
	var Account = $('#Account').val();
	var Name = $('#Name').val();
	var Password = $('#Password').val();
	var Sex = $('#Sex').val();
	var Age = $('#Age').val();
	//手机号码验证
	if(PhoneNumber == "" || PhoneNumber == null){
		alert('手机号码不能为空');
		return false;
	}else{
		if (document.form2.Phone.value.length != 11){
			alert('手机号码须为11位');
			return false;
		}
	}
	//邮箱验证
	if(Email == "" || Email == null){
		alert('邮箱不能为空');
		return false;
	}else{
		var pattern_email = /^[A-Za-z0-9\u4e00-\u9fa5]+@[a-zA-Z0-9_-]+(\.[a-zA-Z0-9_-]+)+$/;
		if(!pattern_email.exec(Email)){
			alert('邮箱格式错误');
			return false;
		}
	}
	//账号验证
	if(Account == "" || Account == null){
		alert('账号不能为空');
		return false;
	}else{
		if(document.form2.Account.value.length != 10){
			alert('账号须为10位任意字符');
			return false;
		}
	}
	//昵称验证
	if(Name == "" || Name == null){
		alert('昵称不能为空');
		return false;
	}else{
		var nameLength = document.form2.Name.value.length;
		var pattern_Name = /^[0-9a-zA-Z\u4E00-\u9FA5]/;
		if(nameLength > 11){
			alert('昵称须为1-10位');
			return false;
		}
		if(!pattern_Name.exec(Name)){
			alert('昵称不能包含非法字符！');
			return false;
		}
	}
	
	if(Password == "" || Password == null){
		alert('密码不能为空');
		return false;
	}else{
		//密码须为1-10位由数字或字母组成
		var pattern_password = /^[0-9a-zA-Z]/;
		if(document.form2.Password.value.length > 10){
			alert('密码须为1-10位');
			return false;
		}
		if(!pattern_password.exec(Password)){
			alert('密码须为1-10位由数字或字母组成');
			return false;
		}
		
	}
	if(Age == "" || Age==null){
		alert('年龄不能为空');
		return false;
	}else{
		if(document.form2.Age.value.length > 4){
			alert('年龄非法');
			return false;
		}
	}
	if(Sex == "" || Sex == null){
		alert('性别不能为空');
		return false;
	}
	return true;
}
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
    <%@ page import="com.tqlsoft.entity.*" import="java.util.*"%>
<!DOCTYPE html>
<html>
<head>
<title>购物车</title>
<link href="TqlSoftTest/shopping/css/style.css" rel="stylesheet" type="text/css" media="all"/>

<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /> 
<meta name="keywords" content="Flash Registration Form  Responsive, Login form web template, Sign up Web Templates, Flat Web Templates, Login signup Responsive web template, Smartphone Compatible web template, free webdesigns for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<!--web-fonts-->
</head>
<body  style="background-color:#666666">
  <%List<TGame> list = (List)ActionContext.getContext().getSession().get("shoppList"); 
  	
  %>
		<jsp:include page="menu.jsp"></jsp:include>

		<div class="header" >
			<h1>TQLSoft购物车</h1>
		</div>
		
		<div class="main">
				<div class="main-section">
				
				<%
					float sum=0;
					if(list!=null&&!list.isEmpty()){
	    				for(TGame tg:list){
	    		 		System.out.println(tg.getGameName());
	    		 		sum+=tg.getGamePrice();
				%>
				
					<div class="product-section">
						<div class="product-top">
							<div class="product-left">
								<img src="TqlSoftTest/shopping/images/<%=tg.getGameId()%>logo.jpg">
							</div>
							<div class="product-right">
								<h2><%=tg.getGameName()%></h2>
									<%
										if(tg.getGameIntroduce().length()>20){											
											%>
										<h5><%=tg.getGameIntroduce().substring(0,16)%>...</h5>	
										
									<% }else{%>
										<h5><%=tg.getGameIntroduce() %></h5>
									<%} %>
									<ul class="size">
										<li>Size <%=tg.getGameSize() %></li>
										<li>time <%=tg.getGameTime() %></li>
									</ul>
							</div>
						</div>
						<div class="product-middle">
							<select class="sel">
								<option value="">1</option>
							</select>
						</div>
						<div class="product-right1">
							<p><%=tg.getGamePrice()%><p>
							<div style="position: absolute;right: -1px;width: 32px;height: 32px;top: 2px;"> 
								<a href="shopp!deShoppCart?GameId=<%=tg.getGameId() %>"><img src="TqlSoftTest/shopping/images/close.png"></a>							
							</div>
						</div>
						<div class="clear"></div>
					</div>
					<br><br>
						<%}} %>							
					<div class="product-bottom">
						<h3>summary : <span> ￥<%=sum %></h3>
						<a href="subCart.jsp">settlement</a>
						<div class="clear">
					</div>
				</div>				
			</div>
					
			<div class="footer">
			<p>&copy 2016 Products In Cart . All rights reserved | Design by <a href="http://w3layouts.com">W3layouts</a></p>
		</div>
		</div>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=utf-8" import="java.util.*"
    pageEncoding="utf-8"%>
        <%@ page import="com.tqlsoft.action.*" %>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.tqlsoft.entity.TGame" %>
<!DOCTYPE html>
<html>
	<head>
		<meta charset="utf-8">
		<title>浏览游戏</title>
		<link href="TqlSoftTest/browseGame/browseGame.css" media="screen" rel="stylesheet" type="text/css">
	</head>
	<body class = "">
 		<%List<TGame> list = (List)ActionContext.getContext().getSession().get("game"); %>
 		<div class="Modal">
			<div class="Modal-header">
				<div class = "close-button">

				</div>
			</div>
			<div class="Modal-body"></div>
		</div> 
		
		<div class = "games_top">
			<div class = "game_title">
				<h1>浏览游戏</h1>
				<a href="addgame.jsp">添加游戏</a>
			</div>
		</div>
		<div id="gamelist" class="gamelist">
		     <%
    			for(TGame sm:list){	 	
    		 %>
			<div class = "game-item">
				<div class = "thumbnail">
					<div class = "thumb-pic">
						<a href = "adminAction!SelectGame?game.gameId=<%=sm.getGameId() %>" target="_blank">
							<img src="TqlSoftTest/luntanassets/img/<%=sm.getGameId() %>logo.jpg" alt = "<%=sm.getGameName() %>">
							
						</a>
					</div>
					<div class="caption">
						<h3><%=sm.getGameName() %></h3>
						<p>发布时间：<%=sm.getGameTime() %></p>

					</div>
			
				</div>
			</div>
			 <%} %>
			
		</div>
	</body>
</html>

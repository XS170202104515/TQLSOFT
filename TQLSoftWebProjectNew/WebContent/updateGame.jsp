<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.tqlsoft.entity.*" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="indexassets/css/introduce.css" media="screen" rel="stylesheet" type="text/css">
</head>
<body>
<%
	List<TGame> gamelist=(List<TGame>)ActionContext.getContext().getSession().get("gameList");
%>
	<div style="overflow: hidden; height: 2000px; margin: 0; padding: 0;">
				<jsp:include page="menu.jsp"></jsp:include>
				<div style="backgroud-color: black">
					<div style="display: inline;float: center;" align="center">
					<form action="adminAction!UpdateGame">
						<table border="0" width="1100px">
							<tr>
								<td></td>
								<td><h2 align="right"></h2></td>
							</tr>
							<tr>
								<td rowspan="2"><img src="TqlSoftTest/indexassets/img/introduce/introduce-2.jpg" width="520px"/></td>
							</tr>
							<tr><td>
							<table border="1" width="550px" style="line-height: 45px;" height="auto">
							<%
								if(!gamelist.isEmpty()&&gamelist!=null){
								for(TGame tg:gamelist){
							
							%>
								<tr>
									<td width="100px">游戏类型：</td>
									<td><input type="text" name="game.gameCategory" value=<%=tg.getGameCategory() %> style="width:450px;height:45px"/></td>					
								</tr>
								<tr>
									<td>游戏编号：</td>
									<td><input type="text" name="game.gameId" readonly="readonly" value=<%=tg.getGameId() %> style="width:450px;height:45px"/></td>					
								</tr>
								<tr>
									<td>游戏名称：</td>
									<td><input type="text" name="game.gameName"  value=<%=tg.getGameName() %> style="width:450px;height:45px"/></td>
								</tr>
								<tr>
									<td>开发商：</td>
									<td><input type="text" name="game.gameAnother" value=<%=tg.getGameAnother() %> style="width:450px;height:45px"/></td>
								</tr>
								<tr>
									<td>游戏价格：</td>
									<td><input type="text" name="game.gamePrice" value=<%=tg.getGamePrice() %> style="width:450px;height:45px"/></td>
								</tr><tr>
								<td>游戏大小：</td>
									<td><input type="text" name="game.gameSize" value=<%=tg.getGameSize() %> style="width:450px;height:45px"/></td>
								</tr>
								<tr>
									<td>发布时间：</td>
									<td><input type="text" name="game.gameTime" value=<%=tg.getGameTime() %> style="width:450px;height:45px"/></td>
								</tr>
								<tr><td colspan="2" height="10px"></td></tr>
							</table>
							</td></tr>
							<tr><td colspan="2" height="20px"></td></tr>
							<tr><td>
						
								<table border="0">
									<tr><td colspan="2" style="font-size:30px">游戏介绍</td></tr>
									<tr>
										<td colspan="2" rowspan="7" height="220px" width="500px" style="line-height:30px">
										<textarea style="height:190px;width:500px" name="game.gameIntroduce"><%=tg.getGameIntroduce() %></textarea>
										</td>
									</tr>
								</table>
							</td>
							<%
							String[] splitDisposition= tg.getGameDisposition().split(";");
							%>
							<td>
								<table border="1" width="550px">
									<tr>
										<td width="100px">OS:</td>
										<td><input type="text" name="game.gameOs" value=<%=splitDisposition[0] %> style="width:450px"/></td>
									</tr>
									<tr>
										<td>Processor:</td>
										<td><input type="text" name="game.gameProcessor" value=<%=splitDisposition[1] %> style="width:450px"/></td>
									</tr>
									<tr>
										<td>Graphics:</td>
										<td><input type="text" name="game.gameGraphics" value=<%=splitDisposition[2] %> style="width:450px"/></td>
									</tr>
									<tr>
										<td>System RAM:</td>
										<td><input type="text" name="game.gameRam" value=<%=splitDisposition[3] %> style="width:450px;height:40px"/></td>
									</tr>
									<tr>
										<td>Resolution:</td>
										<td><input type="text" name="game.gameResolution" value=<%=splitDisposition[4] %> style="width:450px"/></td>
									</tr>
									<tr>
										<td>Video Preset:</td>
										<td><input type="text" name="game.gamePreset" value=<%=splitDisposition[5] %> style="width:450px;height:40px"/></td>
									</tr>
								<%}} %>
								</table>
							</td></tr>
							<tr>
								<td colspan="2" align="center">
									<input class="button1" type="submit" value="游戏修改" />
								</td>
							</tr>
						</table>
						</form>
						
						
						
					</div>
					
				</div>
			</div>
</body>
</html>
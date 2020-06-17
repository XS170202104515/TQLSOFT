<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.util.List" %>
<%@ page import="com.tqlsoft.action.*" %>
<%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.tqlsoft.entity.*" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="TqlSoftTest/indexassets/css/introduce.css" media="screen" rel="stylesheet" type="text/css">
</head>
<body>
<%
	List<TGame> list = (List)ActionContext.getContext().getSession().get("games");
	String imgPath = (String)ActionContext.getContext().getSession().get("imgPath");
	Object ob=ActionContext.getContext().getSession().get("no");
	int no = Integer.valueOf(ob.toString());
	String[] splitDisposition= list.get(no).getGameDisposition().split(";");
	System.out.println(splitDisposition.toString());
%>
	<div style="overflow: hidden; height: 2000px; margin: 0; padding: 0;">
				<jsp:include page="menu.jsp"></jsp:include>
				<div style="backgroud-color: black">
					<div style="display: inline;float: center;" align="center">
						<table border="0" width="1100px">
							<tr>
								<td></td>
								<td><h2 align="right"><%=list.get(0).getGameName() %></h2></td>
							</tr>
							<tr>
								<td rowspan="2"><img src="TqlSoftTest/<%=imgPath %>" width="520px"/></td>
							</tr>
							<tr><td>
							<form action="chose" method="get">
							<table border="1" width="550px" style="line-height: 45px;" height="auto">
								<tr>
									<td width="100px">游戏类型：</td>
									<td><%=list.get(no).getGameCategory() %></td>					
								</tr>
								<tr>
									<td>游戏编号：</td>
									<td><%=list.get(no).getGameId() %></td>
								</tr>
								<tr>
									<td>游戏名称：</td>
									<td><%=list.get(no).getGameName() %></td>
								</tr>
								<tr>
									<td>开发商：</td>
									<td><%=list.get(no).getGameAnother() %></td>
								</tr>
								<tr>
									<td>游戏价格：</td>
									<td><%=list.get(no).getGamePrice() %></td>
								</tr>
								<tr>
									<td>发布时间：</td>
									<td><%=list.get(no).getGameTime() %></td>
								</tr>
								<tr><td colspan="2" height="10px"></td></tr>
							</table>
							</form>
							</td></tr>
							<tr><td colspan="2" height="20px"></td></tr>
							<tr><td>
						
								<table border="0">
									<tr><td colspan="2" style="font-size:30px">游戏介绍</td></tr>
									<tr>
										<td colspan="2" rowspan="7" height="220px" width="500px" style="line-height:30px">
											<%=list.get(no).getGameIntroduce() %>
										</td>
									</tr>
								</table>
							</td>
							<td>
								<table border="1" width="550px">
									<tr>
										<td width="100px">OS:</td>
										<td><%=splitDisposition[0] %></td>
									</tr>
									<tr>
										<td>Processor:</td>
										<td><%=splitDisposition[1] %></td>
									</tr>
									<tr>
										<td>Graphics:</td>
										<td><%=splitDisposition[2] %></td>
									</tr>
									<tr>
										<td>System RAM:</td>
										<td><%=splitDisposition[3] %></td>
									</tr>
									<tr>
										<td>Resolution:</td>
										<td><%=splitDisposition[4] %></td>
									</tr>
									<tr>
										<td>Video Preset:</td>
										<td><%=splitDisposition[5] %></td>
									</tr>
					
								</table>
							</td></tr>
							<tr>
								<td colspan="2" align="center">
									<a href="shoppcart?GameId=<%=list.get(no).getGameId()  %>"><input class="button1" type="button" value="游戏购买" /></a>
									<input class="button1" type="submit" value="游戏下载"/>
								</td>
							</tr>
						</table>
						
						
						
					</div>
					
				</div>
			</div>
</body>
</html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
	<%@ page import="com.tqlsoft.action.*" %>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.tqlsoft.entity.TFriendLibrary" %>
<%@ page import="com.tqlsoft.entity.TUser" %>

    
<!DOCTYPE html>
<html >

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Flexor Bootstrap Template - Index</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->


  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="TqlSoftTest/friendassets/friendvendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="TqlSoftTest/friendassets/friendvendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="TqlSoftTest/friendassets/friendvendor/venobox/venobox.css" rel="stylesheet">
  <link href="TqlSoftTest/friendassets/friendvendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <link href="TqlSoftTest/friendassets/friendvendor/aos/aos.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="TqlSoftTest/friendassets/friendcss/style.css" rel="stylesheet">

</head>

<body>

<jsp:include page="menu.jsp"/>
<br><br>
	<%
	List<TFriendLibrary> list = (List)ActionContext.getContext().getSession().get("friendlist"); 
	List<TUser> friendAddList = (List)ActionContext.getContext().getSession().get("friendAddlist"); 
	String message = (String)ActionContext.getContext().getSession().get("friendMessage"); 
	%>
        <!-- 获取游戏id游戏名字和游戏介绍 -->
   
    	 
    <!-- ======= 帖子Section ======= -->
 <section id="faq" class="faq section-bg">
      <div class="container">

        <div class="section-title">
          <h2 data-aos="fade-up">好友列表</h2>
          <br><br>
          
          <br><br>
          			 <font  size="1px">和好友一起享受游戏吧！</font>
          
        </div>


        <div class="faq-list">
          <ul>

  
	<%
    		for(TFriendLibrary sm:list){	 	
    	 %>
             <li data-aos="fade-up" >
              <font  >&nbsp;&nbsp;<%=sm.getFriendUserName()%> &nbsp;&nbsp;&nbsp;&nbsp;<%= sm.gettFriendLibraryid().getFriendUserAccount() %></font>    	
			 <div id="faq-list-2" class="collapse" data-parent=".faq-list">
              </div>
            </li>
    	 <%   } %>


          </ul>
        </div>

      </div>
    </section><!-- End F.A.Q Section -->

    <!-- ======= Contact Section ======= -->
    <section id="contact" class="contact">
		<div class="container">
        	<div class="section-title">
          	<h2 data-aos="fade-up">添加好友</h2>    
				<div class="text-center">
					<form action="findFriend" method="get" namespace="/">
						<input key="查询好友" name="userid" id="userid"/>
						<button type="submit">查询</button>
					</form>
					<% if (message==null){%>						
						<h6 align="center">请输入好友账号</h6>
					<% }else{%>
						<h6 align="center"><%=message %></h6>
					<% } %>
				</div>
            
			</div>
			
			<form action="addFriend">
				 <%

		    		if(friendAddList!=null){
		    		for(TUser us:friendAddList){
	    			
    			 %>	
    			 <div class = "friendbox">
				<ul class = "friendul">
					<li>
						<input name="chose" type="checkbox" value="<%=us.getUserAccount()%>">
					</li>
					<li>
						<font><%=us.getUserAccount()%></font>
					</li>
					<li>
						<font><%=us.getUserName()%></font>
					</li>	
					
					<li>
						<font><%=us.getUserState()%></font>
					</li>	
					<li>
						 <input type="submit" value="添加好友">
					</li>	
				</ul>
				  <%}
		    		}%>
				 
				</div>
			</form>
        </div>
    </section><!-- End Contact Section -->

  </main><!-- End #main -->

  <!-- Vendor JS Files -->
  <script src="TqlSoftTest/friendassets/friendvendor/jquery/jquery.min.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/php-email-form/validate.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/jquery-sticky/jquery.sticky.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/venobox/venobox.min.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/owl.carousel/owl.carousel.min.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="TqlSoftTest/friendassets/friendvendor/aos/aos.js"></script>

  <!-- Template Main JS File -->
  <script src="TqlSoftTest/friendassets/friendjs/main.js"></script>

</body>

</html>
<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import="com.tqlsoft.action.*" %>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.tqlsoft.entity.TGame" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>

	
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
 <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>KnightOne Bootstrap Template - Index</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  

  

  <!-- Vendor CSS Files -->
  <link href="TqlSoftTest/luntanassets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="TqlSoftTest/luntanassets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="TqlSoftTest/luntanassets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  <link href="TqlSoftTest/luntanassets/vendor/remixicon/remixicon.css" rel="stylesheet">
  <link href="TqlSoftTest/luntanassets/vendor/venobox/venobox.css" rel="stylesheet">
  <link href="TqlSoftTest/luntanassets/vendor/owl.carousel/assets/owl.carousel.min.css" rel="stylesheet">
  <!-- Template Main CSS File -->
  <link href="TqlSoftTest/luntanassets/css/style.css" rel="stylesheet">

</head>
<body>
<jsp:include page="menu.jsp"/>
<br><br>
  <%List<TGame> list = (List)ActionContext.getContext().getSession().get("forumlist"); %>


    <!-- ======= Services Section ======= -->
    <section id="services" class="services">
      <div class="container">

        <div class="section-title">
          <h2>游戏社区论坛</h2>

        </div>

        <div class="row"> 
        <%
    			for(TGame sm:list){	 	
    	 %>
         <div class="col-lg-4 col-md-6 d-flex align-items-stretch" >
         
            <div class="icon-box" style="text-align:center;width:300px">
                 <a href="postaction?gameid=<%=sm.getGameId()%>"><img src="TqlSoftTest/luntanassets/img/<%=sm.getGameId() %>logo.jpg" alt=""height="100" width="100">
              <h4><%=sm.getGameName() %></h4></a>
              <p><%=sm.getGameIntroduce() %></p>
            </div>
          </div>
    	 <%} %>
    	 
    	 
        </div>
      </div>
      
      
      
    </section><!-- End Services Section -->



  <!-- Vendor JS Files -->
  <script src="TqlSoftTest/luntanassets/vendor/jquery/jquery.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/jquery.easing/jquery.easing.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/php-email-form/validate.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/waypoints/jquery.waypoints.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/counterup/counterup.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/isotope-layout/isotope.pkgd.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/venobox/venobox.min.js"></script>
  <script src="TqlSoftTest/luntanassets/vendor/owl.carousel/owl.carousel.min.js"></script>

  <!-- Template Main JS File -->
  <script src="TqlSoftTest/luntanassets/js/main.js"></script>
</body>
</html>
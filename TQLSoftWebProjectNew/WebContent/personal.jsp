<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
            <%@ page import="com.tqlsoft.action.*" %>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
    <%@ page import="com.tqlsoft.entity.*" import="java.util.*"%>
<!DOCTYPE html>
<html lang="en">

<head>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>iPortfolio Bootstrap Template - Index</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->

  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="TqlSoftTest/assets/css/bootstrap.min.css" rel="stylesheet">
  <link href="TqlSoftTest/assets/vendor/boxicons/css/boxicons.min.css" rel="stylesheet">
  
  <!-- Template Main CSS File -->
  <link href="TqlSoftTest/assets/css/style.css" rel="stylesheet">

  <!-- =======================================================
  * Template Name: iPortfolio - v1.2.1
  * Template URL: https://bootstrapmade.com/iportfolio-bootstrap-portfolio-websites-template/
  * Author: BootstrapMade.com
  * License: https://bootstrapmade.com/license/
  ======================================================== -->
</head>

<body background="TqlSoftTest/assets/img/back.png">
  <%
  	List user = (List)ActionContext.getContext().getSession().get("userMessage"); 
  List<TGameLibrary> list = (List)ActionContext.getContext().getSession().get("personal"); 
  %>
<jsp:include page="menu.jsp"></jsp:include>
  <!-- ======= Mobile nav toggle button ======= -->
  <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="TqlSoftTest/assets/img/text.png" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="index.html"></a><%=user.get(5) %></h1>

      </div>

      <nav class="nav-menu">
        <ul>
          <li class="active"><a href="index.jsp"><i class="bx bx-home"></i> <span>返回首页</span></a></li>
          <li><a href="#about"><i class="bx bx-user"></i> <span>个人资料</span></a></li>
          <li><a href="forumcheck"><i class="bx bx-file-blank"></i> <span>前往论坛</span></a></li>
          <li><a href="browseGame.jsp"><i class="bx bx-book-content"></i>查看游戏</a></li>
          <li><a href="friendbrowse"><i class="bx bx-server"></i>好友</a></li>
          


        </ul>
      </nav><!-- .nav-menu -->
      <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

    </div>
  </header><!-- End Header -->

  <!-- ======= Hero Section ======= -->

  <main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about">
      <div class="container">

        <div class="section-title">
          <h2>个人资料</h2>
        </div>

        <div class="row">

          <div class="col-lg-8 pt-4 pt-lg-0 content" data-aos="fade-left">

            <div class="row">
              <div class="col-lg-6">
                <ul>
                  <li><i class="icofont-rounded-right"></i> <strong>账号:</strong><%=user.get(0) %></li>
                  <li><i class="icofont-rounded-right"></i> <strong>昵称:</strong> <%=user.get(5) %></li>
                  <li><i class="icofont-rounded-right"></i> <strong>邮箱:</strong> <%=user.get(4) %></li>
                 
                </ul>
              </div>
              <div class="col-lg-6">
                <ul>
                  <li><i class="icofont-rounded-right"></i> <strong>年龄:</strong> <%=user.get(2) %></li>
                  <li><i class="icofont-rounded-right"></i> <strong>性别:</strong> <%=user.get(7) %></li>
                  <li><i class="icofont-rounded-right"></i> <strong>手机号码:</strong> <%=user.get(6) %></li>
                  
                </ul>
              </div>
            </div>
				<a id="update_message" href="updateMessage.jsp">编辑信息</a>
				<a id="update_password" href="changePassword.jsp">修改密码</a>
			
          </div>
        </div>

      </div>
    </section><!-- End About Section -->
    
     <!-- ======= About Section ======= -->
    <section id="game" class="about">
      <div class="container">

        <div class="section-title">
          <h2>拥有游戏</h2>
        </div>

        <div class="row">
			<%
    			for(TGameLibrary sm:list){	 	
    		 %>
			<div class = "game-item">
				<div class = "thumbnail">
					<div class = "thumb-pic">
						<a href = "choseGame!choseGame.action?Game_id=<%=sm.getTGame().getGameId() %>" target="_blank">
							<img src="TqlSoftTest/luntanassets/img/<%=sm.getTGame().getGameId() %>logo.jpg" alt = "<%=sm.getTGame().getGameName() %>">
							
						</a>
					</div>
					<div class="caption">
						<h3><%=sm.getTGame().getGameName() %></h3>
						<p>发布时间：<%=sm.getTGame().getGameTime() %></p>

					</div>
			
				</div>
			</div>
			 <%} %>
			
          
        </div>

      </div>
    </section><!-- End About Section -->
  </main><!-- End #main -->






</body>

</html>
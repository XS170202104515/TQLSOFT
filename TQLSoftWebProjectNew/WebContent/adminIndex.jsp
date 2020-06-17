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

  <title>管理员界面</title>
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

  %>

  <!-- ======= Mobile nav toggle button ======= -->
  <button type="button" class="mobile-nav-toggle d-xl-none"><i class="icofont-navigation-menu"></i></button>

  <!-- ======= Header ======= -->
  <header id="header">
    <div class="d-flex flex-column">

      <div class="profile">
        <img src="TqlSoftTest/assets/img/text1.png" alt="" class="img-fluid rounded-circle">
        <h1 class="text-light"><a href="index.html"></a><%=user.get(2) %></h1>

      </div>

      <nav class="nav-menu">
        <ul>
          <li class="active"><a href="adminAction!manageUsers"><i class="bx bx-home"></i> <span>用户管理</span></a></li>
          <li><a href="getGame"><i class="bx bx-user"></i> <span>游戏管理</span></a></li>
          <li><a href="adminAction!SelectPost"><i class="bx bx-file-blank"></i> <span>帖子管理</span></a></li>
          


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
          <h2>管理员资料</h2>
        </div>

        <div class="row">

          <div class="col-lg-8 pt-4 pt-lg-0 content" data-aos="fade-left">

            <div class="row">
              <div class="col-lg-6">
                <ul>
                  <li><i class="icofont-rounded-right"></i> <strong>账号:</strong><%=user.get(0) %></li>
                  <li><i class="icofont-rounded-right"></i> <strong>昵称:</strong> <%=user.get(2) %></li>
                  
                 
                </ul>
              </div>
            </div>
			
          </div>
        </div>

      </div>
    </section><!-- End About Section -->
    
    
  </main><!-- End #main -->






</body>

</html>
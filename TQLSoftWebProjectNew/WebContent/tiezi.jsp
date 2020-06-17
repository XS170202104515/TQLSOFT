<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page import="com.tqlsoft.action.*" %>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.tqlsoft.entity.TGame" %>
<%@ page import="com.tqlsoft.entity.TPost" %>
<%@ page import="com.tqlsoft.entity.TForum" %>
    <%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html lang="en">

<head>

<style type="text/css">
 #center{
     width: 200px;
     height: 500px;
	   margin: 0 auto;
 }
</style>
  <meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>Flexor Bootstrap Template - Index</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">

  <!-- Favicons -->


  <!-- Google Fonts -->
  <link href="https://fonts.googleapis.com/css?family=Open+Sans:300,300i,400,400i,600,600i,700,700i|Raleway:300,300i,400,400i,500,500i,600,600i,700,700i|Poppins:300,300i,400,400i,500,500i,600,600i,700,700i" rel="stylesheet">

  <!-- Vendor CSS Files -->
  <link href="TqlSoftTest/luntanassets/tiezivendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">

  <!-- Template Main CSS File -->
  <link href="TqlSoftTest/luntanassets/tiezicss/style.css" rel="stylesheet">


</head>

<body>

<jsp:include page="menu.jsp"/>
<br><br>
  <%List<TPost> list = (List)ActionContext.getContext().getSession().get("postlist"); %>
  <%List<TGame> list1 = (List)ActionContext.getContext().getSession().get("forumlist"); %>
        <!-- 获取游戏id游戏名字和游戏介绍 -->
         <%
         String zmqgameid=(String)session.getAttribute("zmqgameid");
          String postgamename=null;
          String postgameit=null;
          int i=Integer.parseInt(zmqgameid);
    	for(TGame sn:list1){	 
   			 if(sn.getGameId()==i){
    			postgamename=sn.getGameName();
    			postgameit=sn.getGameIntroduce();
 			   }  	 	
   	 }	
    	%>
    	 
    <!-- ======= 帖子Section ======= -->
 <section id="faq" class="faq section-bg">
      <div class="container">

        <div class="section-title">
          <h2 data-aos="fade-up">游戏社区TQLSoft</h2>
          <img src="TqlSoftTest/luntanassets/img/<%=zmqgameid %>logo.jpg" height="100" width="100" ><br><br>
          <h2 data-aos="fade-up"><%=postgamename %>论坛专区</h2>
          			<font color="black" size="4px">[<%=postgameit %>]</font><br><br>
          			 <font  size="1px">请大家共同维护兴义吧的文明和谐氛围，不要发帖吵架，互撕，
          			 尽管我们一直重申尊重每个吧友的言论自由，但是也希望大家自律，共同维护好本吧的氛围，
          			 谢谢合作!</font>
          
        </div>


        <div class="faq-list">
          <ul>

		
  
	<% 
				int num=0;
    			for(TPost sm:list){	 	
    				int postid=sm.getPostId();
    				num++;
    	 %>
             <li data-aos="fade-up" >
             <a href="postcmaction!forumcheck?postcmid=<%=sm.getPostId()%>"><img src="TqlSoftTest/luntanassets/img/tiezilogo.jpg" height="30" width="50" >&nbsp;&nbsp;<%=num %>&nbsp;&nbsp;&nbsp;&nbsp;<%=sm.getPostName() %></a>    
			<font color="blue" size="1px">发布时间：<%=sm.getPostTime() %></font>
			 <div id="faq-list-2" class="collapse" data-parent=".faq-list">
              </div>
            </li>
    	 <%} %>
	
   				

          </ul>
        </div>

      </div>
    </section><!-- End F.A.Q Section -->

    <!-- ======= Contact Section ======= -->

  
        
        	
         
   <div id="center">
    <h1><font color="blue">我也要发帖子</font></h1>    <br>
    <form action="postwriteaction" method="get"  namespace="/" >
      <img src="TqlSoftTest/luntanassets/img/tiezilogo2.jpg" alt=""height="45" width="95"> <br><br>
		<textarea rows="1" cols="40" name="posttitle" ></textarea> <br><br>
		<img src="TqlSoftTest/luntanassets/img/tiezilogo1.jpg" alt=""height="45" width="95"> <br><br>
		<textarea rows="5" cols="40" name="postcontent" ></textarea> <br> <br>
 	 <input style="background-image:url('TqlSoftTest/luntanassets/img/tiezilogo3.jpg')" type="submit" value="确认提交" />
	</form>
	</div>   
    


  </main><!-- End #main -->

  <!-- Vendor JS Files -->
  <script src="TqlSoftTest/luntanassets/tiezivendor/bootstrap/js/bootstrap.bundle.min.js"></script>

  <!-- Template Main JS File -->
  <script src="TqlSoftTest/luntanassets/tiezijs/main.js"></script>

</body>

</html>
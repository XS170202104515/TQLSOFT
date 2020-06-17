<%@ page language="java" import="java.util.*" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>
<%@ taglib prefix="s" uri="/struts-tags" %>
    <%@ page import="com.tqlsoft.action.*" %>
    <%@ page import="com.opensymphony.xwork2.ActionContext" %>
<%@ page import="com.tqlsoft.entity.TPostComment" %>
<%@ page import="com.tqlsoft.entity.TPost" %>
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
  #centertest{
     width: 700px;
     height: 100px;
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
  <%List<TPostComment> list = (List)ActionContext.getContext().getSession().get("tpclist"); %>
    <%List<TPost> list1= (List)ActionContext.getContext().getSession().get("postlist"); %>

	<% 			
				String newid=null;  
				int num=0;
				String posttitle=null;
				String postcontent=null;
    			for(TPost sm:list1){	 	
    				String postid=String.valueOf(sm.getPostId());
    				if(postid.equals(session.getAttribute("postcmid"))){
    					newid=postid;
    					posttitle=sm.getPostName();
    					postcontent=sm.getPostContent();
    				}
    			}
    				 %>
					
<div id="centertest">
<font color="blue" size="4">帖子标题：</font><%=posttitle %><br>
<font color="blue" size="4">帖子内容：</font><%=postcontent %>
</div>

    	 
    <!-- ======= 帖子Section ======= -->
 <section id="faq" class="faq section-bg">
      <div class="container">

        <div class="faq-list">
          <ul>

  
	<% 
				int num1=0;
    			for(TPostComment sm:list){	 	
    				num1++;
    	 %>
             <li data-aos="fade-up" >
             <p>玩家id：<%=sm.getTUser().getUserAccount() %></p>
             <img src="TqlSoftTest/luntanassets/img/tiezilogo4.jpg" height="40" width="80" >&nbsp;&nbsp;第<%=num1 %>楼&nbsp;&nbsp;&nbsp;&nbsp;<%=sm.getCommentContent() %> <br>  
			<font color="blue" size="1px">发布时间：<%=sm.getCommentTime() %></font>
			 <div id="faq-list-2" class="collapse" data-parent=".faq-list">
              </div>
            </li>
    	 <% } %>


          </ul>
        </div>

      </div>
    </section><!-- End F.A.Q Section -->

    <!-- ======= Contact Section ======= -->

  
        
        	
         
   <div id="center">
    <h1><font color="blue">快来参与评论吧</font></h1>    <br>
    <form action="postcmaction!write?postcmid=<%=newid%>" method="get"  namespace="/" >
		<textarea rows="3" cols="40" name="commentContent" ></textarea> <br> <br>
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
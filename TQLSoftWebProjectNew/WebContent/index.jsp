<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="utf-8">
  <meta content="width=device-width, initial-scale=1.0" name="viewport">

  <title>TQLSoft游戏-官方网站</title>
  <meta content="" name="descriptison">
  <meta content="" name="keywords">


  <!-- Vendor CSS Files -->
  <link href="TqlSoftTest/indexassets/vendor/bootstrap/css/bootstrap.min.css" rel="stylesheet">
  <link href="TqlSoftTest/indexassets/vendor/icofont/icofont.min.css" rel="stylesheet">
  <link href="TqlSoftTest/indexassets/vendor/animate.css/animate.min.css" rel="stylesheet">


  <!-- Template Main CSS File -->
  <link href="TqlSoftTest/indexassets/css/style.css" rel="stylesheet">

</head>
<body>


  <!-- ======= Header ======= -->
	<jsp:include page="menu.jsp"></jsp:include>

  <!-- ======= Hero Section ======= -->
  <section id="hero">
    <div class="hero-container">
      <div id="heroCarousel" class="carousel slide carousel-fade" data-ride="carousel">

        <ol class="carousel-indicators" id="hero-carousel-indicators"></ol>

        <div class="carousel-inner" role="listbox">

          	<!-- Slide 1 -->
          <div class="carousel-item active" style="background: url(TqlSoftTest/indexassets/img/slide/slide-1.jpg);">
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animated fadeInDown" style="font-size: 20px;">
                	<span style="font-size: 2.6vw;font-weight: bold;color: #3dbaa6;">刺客信条：英灵殿</span> Ubisoft</h2>
	                <p class="animated fadeInUp">踏上荣耀之路，成为维京传奇</p>
	                <br /><br />
	             <div class="button">
                      <a href="choseGame!choseGame.action?Game_id=1231" class="btn-menu animated fadeInUp scrollto">前往下载</a>
	                  <a onclick="document:choseGame.submit()" class="btn-book animated fadeInUp scrollto">了解更多</a>
                </div>
              </div>
            </div>
          </div>

          <!-- Slide 2 -->
          <div class="carousel-item">
          		<video muted="muted" autoplay="autoplay" loop="loop">
					<source src="TqlSoftTest/indexassets/img/2.mp4"></source>
				</video>
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animated fadeInDown">Blizzard</h2>
			        <p class="animated fadeInUp">守望先锋</p>
					<br /><br />
                <div class="button">
                      <a href="choseGame!choseGame.action?Game_id=1232" class="btn-menu animated fadeInUp scrollto">前往下载</a>
	                  <a onclick="document:choseGame.submit()" class="btn-book animated fadeInUp scrollto">了解更多</a>
                </div>
              </div>
            </div>
          </div>

          <!-- Slide 3 -->
          <div class="carousel-item" style="background: url(TqlSoftTest/indexassets/img/slide/slide-3.jpg);">
            <div class="carousel-background"><img src="indexassets/img/slide/slide-3.jpg" alt=""></div>
            <div class="carousel-container">
              <div class="carousel-content">
                <h2 class="animated fadeInDown">Tencent</h2>
				        <p class="animated fadeInUp">英雄联盟</p>
						<br /><br />
	             <div class="button">
	                  <a href="choseGame!choseGame.action?Game_id=1233" class="btn-menu animated fadeInUp scrollto">前往下载</a>
	                  <a href="#book-a-table" class="btn-book animated fadeInUp scrollto">了解更多</a>
	             </div>
              </div>
            </div>
          </div>
		  
		  <!-- Slide 4 -->
		  <div class="carousel-item" style="background: url(TqlSoftTest/indexassets/img/slide/slide-4.jpg);">
		    <div class="carousel-background"><img src="indexassets/img/slide/slide-4.jpg" alt=""></div>
		    <div class="carousel-container">
		      <div class="carousel-content">
		        <h2 class="animated fadeInDown">PLAYERUNKNOWN’S BATTLEGROUNDS</h2>
		        <p class="animated fadeInUp">绝地求生</p>
				<br /><br />
		        <div class="button">
	                  <a href="choseGame!choseGame.action?Game_id=1234" class="btn-menu animated fadeInUp scrollto">前往下载</a>
	                  <a href="#book-a-table" class="btn-book animated fadeInUp scrollto">了解更多</a>
	             </div>
		      </div>
		    </div>
		  </div>
		  
		  <!-- Slide 5 -->
		  <div class="carousel-item" style="background: url(TqlSoftTest/indexassets/img/slide/slide-5.jpg);">
		    <div class="carousel-background"><img src="indexassets/img/slide/slide-5.jpg" alt=""></div>
		    <div class="carousel-container">
		      <div class="carousel-content">
		        <h2 class="animated fadeInDown">Valve</h2>
		        <p class="animated fadeInUp">CSGO</p>
		        <br /><br />
		        <div class="button">
	                  <a href="choseGame!choseGame.action?Game_id=1235" class="btn-menu animated fadeInUp scrollto">前往下载</a>
	                  <a href="#book-a-table" class="btn-book animated fadeInUp scrollto">了解更多</a>
	             </div>
		      </div>
		    </div>
		  </div>
		  
        </div>

        <a class="carousel-control-prev" href="#heroCarousel" role="button" data-slide="prev">
          <span class="carousel-control-prev-icon icofont-simple-left" aria-hidden="true"></span>
          <span class="sr-only">Previous</span>
        </a>

        <a class="carousel-control-next" href="#heroCarousel" role="button" data-slide="next">
          <span class="carousel-control-next-icon icofont-simple-right" aria-hidden="true"></span>
          <span class="sr-only">Next</span>
        </a>

      </div>
    </div>
  </section><!-- End Hero -->

  <main id="main">

    <!-- ======= About Section ======= -->
    <section id="about" class="about" style="background-color: #000000;">
      <div class="container-fluid" style="background-image: ;">
        <div class="row">
		  <div class="tql-title">
			  <h2>游戏预告</h2>
		  </div>
          <div class="col-lg-5 align-items-stretch video-box" 
		  align="center">
            <video height="375px" controls="controls" id="true" autoplay="autoplay" playsinline="playsinline" loop="loop" type="video/mp4" src="TqlSoftTest/indexassets/img/about.mp4"></video>       
		   </div>

          <div class="col-lg-7 d-flex flex-column justify-content-center align-items-stretch">

            <div class="content" style="">
              <h3 style="color: white;">Assassin's creed <strong>Valhalla</strong></h3>
			  <br />
              <p>
                化身无情的战士——维京劫掠者艾沃尔，带领您的氏族从与世隔绝的冰冷挪威出发，到达九世纪丰饶的英格兰，开发新的家园。建立您自己的居民地，不择手段，征服这片充满敌意的土地，赢得英灵殿中的一席之地。
              </p>
              <p class="font-italic">
                
                维京时代的英格兰四分五裂，遍地都是勾心斗角的领主与互相交战的王国。在无尽的混沌之下，隐藏着一片富饶而粗犷的土地，等待着新统治者的到来。您能否胜任这一角色？
              </p>
              <ul>
                <li><i class="bx bx-check-double"></i>你需要安装UPLAY PC应用以运行这个内容</li>
                <li><i class="bx bx-check-double"></i>发售日期 2020</li>
              </ul>
			</div>
			
          </div>

        </div>

      </div>
    </section><!-- End About Section -->

    <!-- ======= Whu Us Section ======= -->
    <section id="why-us" class="why-us">
      <div class="container">

        <div class="section-title">
          <h2>Why choose <span>Us</span></h2>
          <p>选择我们能为用户	带来什么。</p>
        </div>

        <div class="row">

          <div class="col-lg-4">
            <div class="box">
              <span>01</span>
              <h4>庞大的游戏仓库</h4>
              <p>综合各大游戏厂商的巨作，并且结合玩家的体验对各游戏进行评审，优质的游戏将会尽可能展现给进入本站的用户。</p>
            </div>
          </div>

          <div class="col-lg-4 mt-4 mt-lg-0">
            <div class="box">
              <span>02</span>
              <h4>良好的氛围</h4>
              <p>有着独立的游戏论坛提供给游戏用户进行交流，并且有专员进行内容监控，防止键盘侠和网络喷手的存在。</p>
            </div>
          </div>

          <div class="col-lg-4 mt-4 mt-lg-0">
            <div class="box">
              <span>03</span>
              <h4>供玩家独立创作的平台</h4>
              <p>只要成为本站用户并具有一定的条件，用户可以自行编写游戏作品并上传到本站供其他玩家学习或体验。</p>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Whu Us Section -->

   <section id="gallery" class="gallery">
      <div class="container-fluid">

        <div class="section-title">
          <h2>Some photos from <span>Our Games</span></h2>
          <p>有着大量玩家好评的各大游戏厂商游戏巨作.</p>
        </div>

        <div class="row no-gutters">

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-1.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-1.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-2.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-2.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-3.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-3.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-4.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-4.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-5.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-5.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-6.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-6.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-7.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-7.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

          <div class="col-lg-3 col-md-4">
            <div class="gallery-item">
              <a href="TqlSoftTest/indexassets/img/gallery/gallery-8.jpg" class="venobox" data-gall="gallery-item">
                <img src="TqlSoftTest/indexassets/img/gallery/gallery-8.jpg" alt="" class="img-fluid">
              </a>
            </div>
          </div>

        </div>

      </div>
    </section><!-- End Gallery Section -->
</main>

<!-- js文件 -->
  <script src="TqlSoftTest/indexassets/vendor/jquery/jquery.min.js"></script>
  <script src="TqlSoftTest/indexassets/vendor/bootstrap/js/bootstrap.bundle.min.js"></script>
  <script src="TqlSoftTest/indexassets/js/main.js"></script>
</body>
</html>
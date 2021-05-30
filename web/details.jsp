

<%@page import="movies.film"%>
<%@page import="java.util.List"%>
<%@page import="movies.database"%>
<%@page  language = "java" contentType="text/html;  charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page import ="java.sql.*" %>
<%@page import="java.io.*" %>
<!DOCTYPE html>

<!DOCTYPE html>
<%
    if (request.getParameter("id") != null) {
        int id  =  Integer.parseInt(request.getParameter("id"));
        database db = new database();
        film filmlist = db.details(id);
     

%>
<html lang="en">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

        <!-- CSS -->
    <link rel="stylesheet" href="css/bootstrap-reboot.min.css">
        <link rel="stylesheet" href="css/bootstrap-grid.min.css">
            <link rel="stylesheet" href="css/owl.carousel.min.css">
                <link rel="stylesheet" href="css/jquery.mCustomScrollbar.min.css">
                    <link rel="stylesheet" href="css/nouislider.min.css">
                        <link rel="stylesheet" href="css/ionicons.min.css">
                            <link rel="stylesheet" href="css/magnific-popup.css">
                                <link rel="stylesheet" href="css/plyr.css">
                                    <link rel="stylesheet" href="css/photoswipe.css">
                                        <link rel="stylesheet" href="css/default-skin.css">
                                            <link rel="stylesheet" href="css/main.css">

                                                <!-- Favicons -->
                                              
                                       

                                                        <title>Film Fragman</title>
                                                        </head>

                                                        <body class="body">
                                                            <!-- header -->
                                                            <header class="header">
                                                                <div class="container">
                                                                    <div class="row">
                                                                        <div class="col-12">
                                                                            <div class="header__content">
                                                                                <!-- header logo -->
                                                                                  <a href="index.jsp" class="header__logo">
                                                                                    <img src="./esra.jpg" width="150px;" height="55px;" alt="" >
                                                                                </a>
                                                                                <!-- end header logo -->

                                                                                <!-- header nav -->
                                                                                <ul class="header__nav">
                                                                                    <!-- dropdown -->
                                                                               
                                                                                    <!-- end dropdown -->

                                                                                    <!-- dropdown -->
                                                                              <li class="header__nav-item">
                                                                                        <a  href="index.jsp" class="dropdown-toggle header__nav-link" role="button">Anasayfa</a>
                                                                                    <!-- end dropdown -->

                                                                                </ul>
                                                                                <!-- end header nav -->

                                                                                <!-- header auth -->
                                                                       
                                                                                <!-- end header auth -->

                                                                                <!-- header menu btn -->
                                                                                <button class="header__btn" type="button">
                                                                                    <span></span>
                                                                                    <span></span>
                                                                                    <span></span>
                                                                                </button>
                                                                                <!-- end header menu btn -->
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </header>
                                               
                                                      
                                                            <!-- end header -->

                                                            <!-- details -->
                                                        <section class="section section--details section--bg" data-bg="img/filmler/<%=filmlist.getFilm_img()%>">
                                                            <!-- details content -->
                                                            <div class="container">
                                                                <div class="row">
                                                                    <!-- title -->
                                                                    <div class="col-12">
                                                                        <h1 class="section__title section__title--mb"><%=filmlist.getFilm_adi()%></h1>
                                                                    </div>
                                                                    <!-- end title -->

                                                                    <!-- content -->
                                                                    <div class="col-12 col-xl-6">
                                                                        <div class="card card--details">
                                                                            <div class="row">
                                                                                <!-- card cover -->
                                                                                <div class="col-12 col-sm-5 col-md-4 col-lg-3 col-xl-5">
                                                                                    <div class="card__cover">
                                                                                        <img src="img/filmler/<%=filmlist.getFilm_img()%>" alt="">
                                                                                            <span class="card__rate card__rate--green"><%=filmlist.getPuan() %></span><br>
                                                                                            
                                                                                    </div>
                                                                                    <a href="<%=filmlist.getFilm_fragman()%>" class="card__trailer"><i class="icon ion-ios-play-circle"></i> Watch trailer</a>
                                                                                </div>
                                                                                <!-- end card cover -->

                                                                                <!-- card content -->
                                                                                <div class="col-12 col-md-8 col-lg-9 col-xl-7">
                                                                                    <div class="card__content">
                                                                                        <ul class="card__meta">

                                                                                            <li><span>Oyuncular:</span> <a href="#"><%=filmlist.getOyuncular_adi().replace(";;", ",") %></a>
                                                                                            <li><span>Türü:</span> <a href="#">Action</a>
                                                                                                <a href="#"><%=filmlist.getFilm_tur() %></a></li>
                                                                                                <li><span>Puan :</span><%=filmlist.getPuan()%> </li>
                                                                                            <li><span>Süresi:</span> 130 min</li>
                                                                                            <li><span></span> <a href="#"></a></li>
                                                                                        </ul>
                                                                                                <div class="card__description"  >  <br><%=filmlist.getFilm_konu() %></div>
                                                                                    </div>
                                                                                </div>
                                                                                <!-- end card content -->
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <!-- end content -->

                                                                    <!-- player -->
                                                                    <div class="col-12 col-xl-6">
                                                                           <iframe src="https://www.themoviedb.org/video/play?key=odM92ap8_c0" width="500" height="480"  allowfullscreen="true" mozallowfullscreen="true" webkitallowfullscreen="true" frameborder="no" scrolling="no"></iframe>
                                                                               <a href="<%=filmlist.getFilm_fragman()%>" target="_blank">Video seyretmek için tıklayın   </a>
                                                                    </div>
                                                                 

                                                                        
                                                                    <!-- end player -->
                                                                </div>
                                                            </div>
                                                            <!-- end details content -->
                                                        </section>
                                                        <!-- end details -->

                                                        <!-- content -->
                                                 
                                                        <!-- end content -->

                                                        <!-- footer -->
                                                   
                                                        <!-- end footer -->

                                                        <!-- Root element of PhotoSwipe. Must have class pswp. -->
                                                        <div class="pswp" tabindex="-1" role="dialog" aria-hidden="true">

                                                            <!-- Background of PhotoSwipe. 
                                                                    It's a separate element, as animating opacity is faster than rgba(). -->
                                                            <div class="pswp__bg"></div>

                                                            <!-- Slides wrapper with overflow:hidden. -->
                                                            <div class="pswp__scroll-wrap">

                                                                <!-- Container that holds slides. PhotoSwipe keeps only 3 slides in DOM to save memory. -->
                                                                <!-- don't modify these 3 pswp__item elements, data is added later on. -->
                                                                <div class="pswp__container">
                                                                    <div class="pswp__item"></div>
                                                                    <div class="pswp__item"></div>
                                                                    <div class="pswp__item"></div>
                                                                </div>

                                                                <!-- Default (PhotoSwipeUI_Default) interface on top of sliding area. Can be changed. -->
                                                                <div class="pswp__ui pswp__ui--hidden">

                                                                    <div class="pswp__top-bar">

                                                                        <!--  Controls are self-explanatory. Order can be changed. -->

                                                                        <div class="pswp__counter"></div>

                                                                        <button class="pswp__button pswp__button--close" title="Close (Esc)"></button>

                                                                        <button class="pswp__button pswp__button--fs" title="Toggle fullscreen"></button>

                                                                        <!-- Preloader -->
                                                                        <div class="pswp__preloader">
                                                                            <div class="pswp__preloader__icn">
                                                                                <div class="pswp__preloader__cut">
                                                                                    <div class="pswp__preloader__donut"></div>
                                                                                </div>
                                                                            </div>
                                                                        </div>
                                                                    </div>

                                                                    <button class="pswp__button pswp__button--arrow--left" title="Previous (arrow left)"></button>

                                                                    <button class="pswp__button pswp__button--arrow--right" title="Next (arrow right)"></button>

                                                                    <div class="pswp__caption">
                                                                        <div class="pswp__caption__center"></div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </div>

                                                        <!-- JS -->
                                                        <script src="js/jquery-3.5.1.min.js"></script>
                                                        <script src="js/bootstrap.bundle.min.js"></script>
                                                        <script src="js/owl.carousel.min.js"></script>
                                                        <script src="js/jquery.magnific-popup.min.js"></script>
                                                        <script src="js/jquery.mousewheel.min.js"></script>
                                                        <script src="js/jquery.mCustomScrollbar.min.js"></script>
                                                        <script src="js/wNumb.js"></script>
                                                        <script src="js/nouislider.min.js"></script>
                                                        <script src="js/plyr.min.js"></script>
                                                        <script src="js/photoswipe.min.js"></script>
                                                        <script src="js/photoswipe-ui-default.min.js"></script>
                                                        <script src="js/main.js"></script>
                                                        </body>

                                                        </html>
                                                        
                                                        <%}%>
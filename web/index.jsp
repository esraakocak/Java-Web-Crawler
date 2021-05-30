
<%@page import="java.util.List"%>
<%@page import="movies.film"%>
<%@page import="movies.film"%>
<%@page import="movies.database"%>
<%@page  language = "java" contentType="text/html;  charset=UTF-8"  pageEncoding="UTF-8"%>
<%@page errorPage="hata.jsp" %> 
<%@page import ="java.sql.*" %>
<%@page import="java.io.*" %>

<!DOCTYPE html>

<%


    database db = new database();
    List<film> filmlist = db.en_iyi_film();
    List<film> filmlist1 = db.animasyon_en_iyi_film();
    List<film> filmlist2 = db.random_film();



%>



<!DOCTYPE html>
<html lang="tr">

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
                                                <link rel="icon" type="image/png" href="" sizes="32x32">
                                                    <link rel="apple-touch-icon" href="">

                                                        <meta name="description" content="">
                                                        <meta name="keywords" content="">
                                                        <meta name="author" content="Dmitry Volkov">
                                                        <title>Film</title>
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
                                                                                    <img  src="./esra.jpg" width="150px;" height="55px;" alt="" ></img>
                                                                                </a>
                                                                                <!-- end header logo -->

                                                                                <!-- header nav -->
                                                                                <ul class="header__nav">
                                                                                    <li class="header__nav-item">
                                                                                          <a class="dropdown-toggle header__nav-link" href="film_oner.jsp"  role="button">Film Seç</a>
                                                                                        
                                                                                    </li>
                                                                                    <!-- dropdown -->
                                                                            
                                                                              
                                                                                   
                                                                                    
                                                                                    <!-- end dropdown -->


                                                                                    <!-- dropdown -->

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

                                                            <!-- home -->
                                                        <section class="home">
                                                    

                                                            <div class="container">
                                                                <div class="row">
                                                                    <div class="col-12">
                                                                        <h1 class="home__title"><b>EN İYİ 10 FİLM</b></h1>

                                                                        <button class="home__nav home__nav--prev" type="button">
                                                                            <i class="icon ion-ios-arrow-round-back"></i>
                                                                        </button>
                                                                        <button class="home__nav home__nav--next" type="button">
                                                                            <i class="icon ion-ios-arrow-round-forward"></i>
                                                                        </button>
                                                                    </div>

                                                                    <div class="col-12">
                                                                        <div class="owl-carousel home__carousel home__carousel--bg">
                                                                            
                                                                              <%for (int i = 0; i < filmlist.size(); i++) {%>
                                                                                    
                                                                            <div class="card card--big">
                                                                                <div class="card__cover">
                                                                                    <img src="img/filmler/<%=filmlist.get(i).getFilm_img()%>" alt="">
                                                                                        <a href="details.jsp?id=<%=filmlist.get(i).getFilm_id()%>"  class="card__play">
                                                                                            <i class="icon ion-ios-play"></i>
                                                                                        </a>
                                                                                        <span class="card__rate card__rate--yellow"><%=filmlist.get(i).getPuan()%></span>
                                                                                </div>
                                                                                <div class="card__content">
                                                                                    <h3 class="card__title"><a href="details.jsp?id=<%=filmlist.get(i).getFilm_id()%>"><%=filmlist.get(i).getFilm_adi()%></a></h3>
                                                                                    <span class="card__category">
                                                                                        <a href="#"><%=filmlist.get(i).getFilm_tur()%></a>
                                                                                      
                                                                                    </span>
                                                                                </div>
                                                                            </div>
                                                                                
                                                                                        <% }%>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </section>
                                                        <!-- end home -->

                                                        <!-- content -->
                                                        <section class="content">
                                                            <div class="content__head">
                                                                <div class="container">
                                                                    <div class="row">
                                                                        <div class="col-12">
                                                                            <!-- content title -->
                                                                            <h2 class="content__title">Animasyon Türündeki En İyi Filmler</h2>
                                                                            <!-- end content title -->
                                                                              

                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>

                                                            <div class="container">
                                                                <!-- content tabs -->
                                                                <div class="tab-content">
                                                                    <div class="tab-pane fade show active" id="tab-1" role="tabpanel" aria-labelledby="1-tab">
                                                                        <div class="row row--grid">
                                                                            <!-- card -->
                                                                          
                                                                            <!-- end card -->

                                                                            <!-- card -->
                                                                             <%for (int i = 0; i < filmlist1.size(); i++) {%>
                                                                            <div class="col-6 col-sm-4 col-md-3 col-xl-2">
                                                                               
                                                                                <div class="card">
                                                                                    <div class="card__cover">
                                                                                        <img src="img/filmler/<%=filmlist1.get(i).getFilm_img()%>" alt="">
                                                                                            <a href="details.jsp?id=<%=filmlist1.get(i).getFilm_id()%>" class="card__play">
                                                                                                <i class="icon ion-ios-play"></i>
                                                                                            </a>
                                                                                            <span class="card__rate card__rate--green"><%=filmlist1.get(i).getPuan()%></span>
                                                                                    </div>
                                                                                    <div class="card__content">
                                                                                        <h3 class="card__title"><a href="details.jsp?id=<%=filmlist1.get(i).getFilm_id()%>"><%=filmlist1.get(i).getFilm_adi()%></a></h3>
                                                                                        <span class="card__category">
                                                                                            <a href="#"><%=filmlist1.get(i).getFilm_tur()%></a>
                                                                                        </span>
                                                                                    </div>
                                                                                </div>
                                                                                
                                                                            
                                                                            </div>
                                                                                            <%  }   %>
                                                                            <!-- end card -->
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                                <!-- end content tabs -->
                                                            </div>
                                                        </section>
                                                        <!-- end content -->

                                                        <!-- section -->
                                                        <section class="section section--border">
                                                            <div class="container">
                                                                <div class="row">
                                                                    <!-- section title -->
                                                                    <div class="col-12">
                                                                        <div class="section__title-wrap">
                                                                            <h2 class="section__title">İzleyecebileceğiniz Başka Filmler</h2>

                                                                            <div class="section__nav-wrap">
                                                                             

                                                                                <button class="section__nav section__nav--prev" type="button" data-nav="#carousel1">
                                                                                    <i class="icon ion-ios-arrow-back"></i>
                                                                                </button>

                                                                                <button class="section__nav section__nav--next" type="button" data-nav="#carousel1">
                                                                                    <i class="icon ion-ios-arrow-forward"></i>
                                                                                </button>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                    <!-- end section title -->

                                                                    <!-- carousel -->
                                                                    <div class="col-12">
                                                                        <div class="owl-carousel section__carousel" id="carousel1">
                                                                             <%for (int i = 0; i < filmlist2.size(); i++) {%>
                                                                            <div class="card">
                                                                                <div class="card__cover">
                                                                                    <img src="img/filmler/<%=filmlist2.get(i).getFilm_img()%>" alt="">
                                                                                        <a href="details.jsp?id=<%=filmlist.get(i).getFilm_id()%>" class="card__play">
                                                                                            <i class="icon ion-ios-play"></i>
                                                                                        </a>
                                                                                        <span class="card__rate card__rate--green"><%=filmlist2.get(i).getPuan()%></span>
                                                                                </div>
                                                                                <div class="card__content">
                                                                                    <h3 class="card__title"><a href="details.jsp?id=<%=filmlist2.get(i).getFilm_id()%>"><%=filmlist2.get(i).getFilm_adi()%>"></a></h3>
                                                                                    <span class="card__category">
                                                                                        <a> <%=filmlist2.get(i).getFilm_tur()%></a>
                                                                           
                                                                                    </span>
                                                                                </div>
                                                                            </div>
                                                                                  <%  }
                                                                                               %>        
                                                                        </div>
                                                                    </div>
                                                                    <!-- carousel -->
                                                                </div>
                                                            </div>
                                                        </section>
                                                        <!-- end section -->

                                                        <!-- section -->

                                                        <!-- end section -->

                                                        <!-- footer -->
                                                        <footer class="footer">
                                                            <div class="container">
                                                                <div class="row">
                                                                    <div class="col-12">
                                                                        <div class="footer__content">
                                                                            <a href="index.html" class="footer__logo">
                                                                                <img src="../main/img/esra.jpg" alt="">
                                                                            </a>

                                                                            <span class="footer__copyright">© esra, 2021 <br></span>



                                                                            <button class="footer__back" type="button">
                                                                                <i class="icon ion-ios-arrow-round-up"></i>
                                                                            </button>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </div>
                                                        </footer>
                                                        <!-- end footer -->

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
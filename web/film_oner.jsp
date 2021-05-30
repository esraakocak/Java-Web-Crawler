<%@page  language = "java" contentType="text/html;  charset=UTF-8"  pageEncoding="UTF-8"%>

<%@page import ="java.sql.*" %>
<%@page import="java.io.*" %>


<!DOCTYPE html>

<html lang="tr">

    <head>
        <meta charset="utf-8">
        <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
          <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">

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
                                                        <title>Film Önerme </title>
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
                                                                                    <img src="./esra.jpg" width="150px;" height="55px;" alt="">
                                                                                </a>
                                                                                <!-- end header logo -->

                                                                              

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


                                                            <!-- end section -->

                                                            <!-- footer -->
                                                            <footer class="footer">
                                                                <div class="container">
                                                                    <div class="row">
                                                                        <div class="col-12">
                                                                            <div class="footer__content">
                                                                                <a href="index.jsp" class="footer__logo">
                                                                                    <img src="img/logo.svg" alt="">
                                                                                </a>

                                                                            


                                                                                <button class="footer__back" type="button">
                                                                                    <i class="icon ion-ios-arrow-round-up"></i>
                                                                                </button>
                                                                            </div>
                                                                        </div>
                                                                    </div>
                                                                </div>
                                                            </footer>
                                                            <!-- end footer -->

                                                            <!-- form -->

                                                        <div class="login-box">
                                                            <h2></h2>
                                                            <form action="oneri.jsp" method="POST">

                                                                <div>
                                                                    <select class="user-box" name="tur">
                                                                        <option value=" " >Film Türünü Seçiniz</option>
                                                                        <option value="Comedy" >Komedi</option>
                                                                        <option value="Science fiction" >Bilim Kurgu</option>
                                                                        <option value="Family " >Aile</option>
                                                                        <option value="Action " >Aksiyon</option>
                                                                        <option value="Adventure " >Macera</option>
                                                                        <option value="Animation " >Animasyon</option>
                                                                        <option value="Thriller " >Gerilim</option>
                                                                        <option value="Drama " >Dram</option>
                                                                    </select>
                                                                </div>
                                                                <a href="#" onclick="document.forms[0].submit();return false;">
                                                                    <span></span>
                                                                    <span></span>
                                                                    <span></span>
                                                                    <span></span>
                                                                    <span></span>
                                                                    <span></span>
                                                                    İlerle 
                                                                </a>
                                                            </form>
                                                        </div>
                                                        <!-- end form -->

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

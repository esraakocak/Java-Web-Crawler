package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.List;
import movies.film;
import movies.database;
import java.sql.*;
import java.io.*;

public final class kategori_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspService(HttpServletRequest request, HttpServletResponse response)
        throws java.io.IOException, ServletException {

    PageContext pageContext = null;
    HttpSession session = null;
    ServletContext application = null;
    ServletConfig config = null;
    JspWriter out = null;
    Object page = this;
    JspWriter _jspx_out = null;
    PageContext _jspx_page_context = null;

    try {
      response.setContentType("text/html;  charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");

   if (request.getParameter("tur") != null) {
        String tur= request.getParameter("tur");
        database db = new database();
        List<film> filmlist = db.kategori(tur);
          
      out.write("\n");
      out.write("<html lang=\"tr\">\n");
      out.write("       \n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\n");
      out.write("        <!-- CSS -->\n");
      out.write("    <link rel=\"stylesheet\" href=\"css/bootstrap-reboot.min.css\">\n");
      out.write("        <link rel=\"stylesheet\" href=\"css/bootstrap-grid.min.css\">\n");
      out.write("            <link rel=\"stylesheet\" href=\"css/owl.carousel.min.css\">\n");
      out.write("                <link rel=\"stylesheet\" href=\"css/jquery.mCustomScrollbar.min.css\">\n");
      out.write("                    <link rel=\"stylesheet\" href=\"css/nouislider.min.css\">\n");
      out.write("                        <link rel=\"stylesheet\" href=\"css/ionicons.min.css\">\n");
      out.write("                            <link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("                                <link rel=\"stylesheet\" href=\"css/plyr.css\">\n");
      out.write("                                    <link rel=\"stylesheet\" href=\"css/photoswipe.css\">\n");
      out.write("                                        <link rel=\"stylesheet\" href=\"css/default-skin.css\">\n");
      out.write("                                            <link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("\n");
      out.write("                                                <!-- Favicons -->\n");
      out.write("                                                <link rel=\"icon\" type=\"image/png\" href=\"\" sizes=\"32x32\">\n");
      out.write("                                                    <link rel=\"apple-touch-icon\" href=\"\">\n");
      out.write("\n");
      out.write("                                                        <meta name=\"description\" content=\"\">\n");
      out.write("                                                \n");
      out.write("                                                        <title>Film-KATEGORİ</title>\n");
      out.write("                                                        </head>\n");
      out.write("\n");
      out.write("                                                        <body class=\"body\">\n");
      out.write("                                                            <!-- header -->\n");
      out.write("                                                            <header class=\"header\">\n");
      out.write("                                                                <div class=\"container\">\n");
      out.write("                                                                    <div class=\"row\">\n");
      out.write("                                                                        <div class=\"col-12\">\n");
      out.write("                                                                            <div class=\"header__content\">\n");
      out.write("                                                                                <!-- header logo -->\n");
      out.write("                                                                                <a href=\"index.jsp\" class=\"header__logo\">\n");
      out.write("                                                                                    <img  src=\"./esra.jpg\" width=\"150px;\" height=\"55px;\" alt=\"\" >\n");
      out.write("                                                                                </a>\n");
      out.write("                                                                                <!-- end header logo -->\n");
      out.write("\n");
      out.write("                                                                                <!-- header nav -->\n");
      out.write("                                                                                <ul class=\"header__nav\">\n");
      out.write("                                                                             <li class=\"header__nav-item\">\n");
      out.write("                                                                                        <a  href=\"index.jsp\" class=\"dropdown-toggle header__nav-link\" role=\"button\">Anasayfa</a>\n");
      out.write("                                                                                </ul>\n");
      out.write("                                                                                <!-- end header nav -->\n");
      out.write("\n");
      out.write("                                                                                <!-- header auth -->\n");
      out.write("\n");
      out.write("                                                                                <!-- end header auth -->\n");
      out.write("\n");
      out.write("                                                                                <!-- header menu btn -->\n");
      out.write("                                                                                <button class=\"header__btn\" type=\"button\">\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                    <span></span>\n");
      out.write("                                                                                </button>\n");
      out.write("                                                                                <!-- end header menu btn -->\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </header>\n");
      out.write("                                                            <!-- end header -->\n");
      out.write("                                                            <br>\n");
      out.write("                                                                  <br>\n");
      out.write("                                                                        <br>\n");
      out.write("\n");
      out.write("                                                        <!-- content -->\n");
      out.write("                                                        <section class=\"content\">\n");
      out.write("                                                            <div class=\"content__head\">\n");
      out.write("                                                                <div class=\"container\">\n");
      out.write("                                                                    <div class=\"row\">\n");
      out.write("                                                                        <div class=\"col-12\">\n");
      out.write("                                                                            <!-- content title -->\n");
      out.write("                                                                            <h3 class=\"content__title\">Seçtiğiniz  kategorideki filmler aşağıda listelenmiştir.</h3>\n");
      out.write("                                                                            <!-- end content title -->\n");
      out.write("\n");
      out.write("                                                                            \n");
      out.write("                                                                    \n");
      out.write("                                                                            <!-- end content mobile tabs nav -->\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("\n");
      out.write("                                                            <div class=\"container\">\n");
      out.write("                                                                <!-- content tabs -->\n");
      out.write("                                                                <div class=\"tab-content\">\n");
      out.write("                                                                    <div class=\"tab-pane fade show active\" id=\"tab-1\" role=\"tabpanel\" aria-labelledby=\"1-tab\">\n");
      out.write("                                                                        <div class=\"row row--grid\">\n");
      out.write("                                                                            <!-- card -->\n");
      out.write("                                                                            \n");
      out.write("                                                                            <div class=\"col-6 col-sm-4 col-md-3 col-xl-2\">\n");
      out.write("                                                                                <div class=\"card\">\n");
      out.write("                                                                                    <div class=\"card__cover\">\n");
      out.write("                                                                                        <img src=\"img/covers/cover.jpg\" alt=\"\">\n");
      out.write("                                                                                            <a href=\"details.jsp\" class=\"card__play\">\n");
      out.write("                                                                                                <i class=\"icon ion-ios-play\"></i>\n");
      out.write("                                                                                            </a>\n");
      out.write("                                                                                            <span class=\"card__rate card__rate--green\">8.4</span>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                    <div class=\"card__content\">\n");
      out.write("                                                                                        <h3 class=\"card__title\"><a href=\"details.jsp\">I Dream in Another Language</a></h3>\n");
      out.write("                                                                                        <span class=\"card__category\">\n");
      out.write("                                                                                            <a href=\"#\">Action</a>\n");
      out.write("                                                                                            <a href=\"#\">Triler</a>\n");
      out.write("                                                                                        </span>\n");
      out.write("                                                                                    </div>\n");
      out.write("                                                                                </div>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                            <!-- end card -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            \n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <!-- end content tabs -->\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </section>\n");
      out.write("                                                        <!-- end content -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                        <!-- footer -->\n");
      out.write("                                                        <footer class=\"footer\">\n");
      out.write("                                                            <div class=\"container\">\n");
      out.write("                                                                <div class=\"row\">\n");
      out.write("                                                                    <div class=\"col-12\">\n");
      out.write("                                                                        <div class=\"footer__content\">\n");
      out.write("                                                                            <a href=\"index.html\" class=\"footer__logo\">\n");
      out.write("                                                                                <img src=\"../main/img/esra.jpg\" alt=\"\">\n");
      out.write("                                                                            </a>\n");
      out.write("\n");
      out.write("                                                                            <span class=\"footer__copyright\">© esra, 2021 <br></span>\n");
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                            <button class=\"footer__back\" type=\"button\">\n");
      out.write("                                                                                <i class=\"icon ion-ios-arrow-round-up\"></i>\n");
      out.write("                                                                            </button>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </div>\n");
      out.write("                                                        </footer>\n");
      out.write("                                                        <!-- end footer -->\n");
      out.write("\n");
      out.write("                                                        <!-- JS -->\n");
      out.write("                                                        <script src=\"js/jquery-3.5.1.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/bootstrap.bundle.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/owl.carousel.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/jquery.magnific-popup.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/jquery.mousewheel.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/jquery.mCustomScrollbar.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/wNumb.js\"></script>\n");
      out.write("                                                        <script src=\"js/nouislider.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/plyr.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/photoswipe.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/photoswipe-ui-default.min.js\"></script>\n");
      out.write("                                                        <script src=\"js/main.js\"></script>\n");
      out.write("                                                        </body>\n");
      out.write("\n");
      out.write("                                                        </html>\n");
      out.write("                                                        \n");
      out.write("                                                                                            ");
} else {
                                                                                                    response.sendRedirect("kategori.jsp");

                                                                                                }
      out.write('\n');
    } catch (Throwable t) {
      if (!(t instanceof SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          out.clearBuffer();
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}

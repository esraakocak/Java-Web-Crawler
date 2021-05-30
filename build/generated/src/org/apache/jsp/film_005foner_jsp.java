package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.sql.*;
import java.io.*;

public final class film_005foner_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("\n");
      out.write("<html lang=\"tr\">\n");
      out.write("\n");
      out.write("    <head>\n");
      out.write("        <meta charset=\"utf-8\">\n");
      out.write("        <meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("          <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
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
      out.write("                                                        <meta name=\"keywords\" content=\"\">\n");
      out.write("                                                        <meta name=\"author\" content=\"Dmitry Volkov\">\n");
      out.write("                                                        <title>Film Önerme </title>\n");
      out.write("                                                        </head>\n");
      out.write("\n");
      out.write("                                                        <body class=\"body\">\n");
      out.write("\n");
      out.write("                                                            <!-- header -->\n");
      out.write("                                                            <header class=\"header\">\n");
      out.write("                                                                <div class=\"container\">\n");
      out.write("                                                                    <div class=\"row\">\n");
      out.write("                                                                        <div class=\"col-12\">\n");
      out.write("                                                                            <div class=\"header__content\">\n");
      out.write("                                                                                <!-- header logo -->\n");
      out.write("                                                                                <a href=\"index.jsp\" class=\"header__logo\">\n");
      out.write("                                                                                    <img src=\"./esra.jpg\" width=\"150px;\" height=\"55px;\" alt=\"\">\n");
      out.write("                                                                                </a>\n");
      out.write("                                                                                <!-- end header logo -->\n");
      out.write("\n");
      out.write("                                                                              \n");
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
      out.write("\n");
      out.write("                                                            <!-- home -->\n");
      out.write("\n");
      out.write("\n");
      out.write("                                                            <!-- end section -->\n");
      out.write("\n");
      out.write("                                                            <!-- footer -->\n");
      out.write("                                                            <footer class=\"footer\">\n");
      out.write("                                                                <div class=\"container\">\n");
      out.write("                                                                    <div class=\"row\">\n");
      out.write("                                                                        <div class=\"col-12\">\n");
      out.write("                                                                            <div class=\"footer__content\">\n");
      out.write("                                                                                <a href=\"index.jsp\" class=\"footer__logo\">\n");
      out.write("                                                                                    <img src=\"img/logo.svg\" alt=\"\">\n");
      out.write("                                                                                </a>\n");
      out.write("\n");
      out.write("                                                                            \n");
      out.write("\n");
      out.write("\n");
      out.write("                                                                                <button class=\"footer__back\" type=\"button\">\n");
      out.write("                                                                                    <i class=\"icon ion-ios-arrow-round-up\"></i>\n");
      out.write("                                                                                </button>\n");
      out.write("                                                                            </div>\n");
      out.write("                                                                        </div>\n");
      out.write("                                                                    </div>\n");
      out.write("                                                                </div>\n");
      out.write("                                                            </footer>\n");
      out.write("                                                            <!-- end footer -->\n");
      out.write("\n");
      out.write("                                                            <!-- form -->\n");
      out.write("\n");
      out.write("                                                        <div class=\"login-box\">\n");
      out.write("                                                            <h2></h2>\n");
      out.write("                                                            <form action=\"oneri.jsp\" method=\"POST\">\n");
      out.write("\n");
      out.write("                                                                <div>\n");
      out.write("                                                                    <select class=\"user-box\" name=\"tur\">\n");
      out.write("                                                                        <option value=\" \" >Film Türünü Seçiniz</option>\n");
      out.write("                                                                        <option value=\"Comedy\" >Komedi</option>\n");
      out.write("                                                                        <option value=\"Science fiction\" >Bilim Kurgu</option>\n");
      out.write("                                                                        <option value=\"Family \" >Aile</option>\n");
      out.write("                                                                        <option value=\"Action \" >Aksiyon</option>\n");
      out.write("                                                                        <option value=\"Adventure \" >Macera</option>\n");
      out.write("                                                                        <option value=\"Animation \" >Animasyon</option>\n");
      out.write("                                                                        <option value=\"Thriller \" >Gerilim</option>\n");
      out.write("                                                                        <option value=\"Drama \" >Dram</option>\n");
      out.write("                                                                    </select>\n");
      out.write("                                                                </div>\n");
      out.write("                                                                <a href=\"#\" onclick=\"document.forms[0].submit();return false;\">\n");
      out.write("                                                                    <span></span>\n");
      out.write("                                                                    <span></span>\n");
      out.write("                                                                    <span></span>\n");
      out.write("                                                                    <span></span>\n");
      out.write("                                                                    <span></span>\n");
      out.write("                                                                    <span></span>\n");
      out.write("                                                                    İlerle \n");
      out.write("                                                                </a>\n");
      out.write("                                                            </form>\n");
      out.write("                                                        </div>\n");
      out.write("                                                        <!-- end form -->\n");
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

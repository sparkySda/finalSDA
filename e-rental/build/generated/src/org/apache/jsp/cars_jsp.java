package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class cars_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(2);
    _jspx_dependants.add("/opensource.jsp");
    _jspx_dependants.add("/navibar1.jsp");
  }

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
      response.setContentType("text/html");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;
      _jspx_resourceInjector = (org.glassfish.jsp.api.ResourceInjector) application.getAttribute("com.sun.appserv.jsp.resource.injector");

      out.write("\t<!DOCTYPE html>\n");
      out.write("\t<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("<!------------------- Script ------------------->\n");
      out.write("<meta charset=\"utf-8\">\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\n");
      out.write("  \n");
      out.write("<!--image logo-->    \n");
      out.write("<link rel=\"icon\" href=\"../img/xslogo1.png\">\n");
      out.write("\n");
      out.write("<!--opensource css--> \n");
      out.write("<link rel=\"stylesheet\" href=\"https://getbootstrap.com/docs/4.1/dist/css/bootstrap.min.css\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"https://getbootstrap.com/docs/4.1/examples/album/album.css\" >\n");
      out.write("<link rel=\"stylesheet\" href=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/css/bootstrap.min.css\">\n");
      out.write("<link rel=\"stylesheet\" href=\"https://use.fontawesome.com/releases/v5.5.0/css/all.css\" integrity=\"sha384-B4dIYHKNBt8Bc12p+WXckhzcICo0wtJAoU8YZTY5qE0Id1GSseTk6S+L3BlXeVIU\" crossorigin=\"anonymous\">\n");
      out.write("<script src=\"https://ajax.googleapis.com/ajax/libs/jquery/3.3.1/jquery.min.js\"></script>\n");
      out.write("<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\"></script>\n");
      out.write("<script src=\"https://maxcdn.bootstrapcdn.com/bootstrap/4.0.0/js/bootstrap.min.js\"></script>\n");
      out.write("\n");
      out.write("<!--style.css--> \n");
      out.write("<link rel=\"stylesheet\" href=\"style.css\" >");
      out.write("\n");
      out.write("<!------------------- ------ ------------------->\n");
      out.write("<title>BH - CUSTOMER</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"img/backs.jpg\">\n");
      out.write("<!----------------- Navigation ----------------->\n");
      out.write("<nav class=\"navbar navbar-expand-md navbar-dark bg-dark sticky-top\">\n");
      out.write("<div class=\"container-fluid\">\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\"><img src=\"img/logo.png\" width=\"150px\"></a>\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarResponsive\">\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("  </button>\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarResponsive\">\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\n");
      out.write("      <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><i class=\"fas fa-bars\"></i> Profile</a></li>\n");
      out.write("      \n");
      out.write("    <li class=\"nav-item\"><a class=\"nav-link\" href=\"customer_orderpage.jsp\"> Order Bicycle</a></li>\n");
      out.write("\n");
      out.write("    ");
      out.write("\n");
      out.write("    </ul>\n");
      out.write("\n");
      out.write("    <ul class=\"navbar-nav ml-auto\">\n");
      out.write("      <li class=\"nav-item\"><a class=\"nav-link\" href=\"#\"><i class=\"fas fa-user-cog\"></i> CUSTOMER</a></li>\n");
      out.write("      <li class=\"nav-item\"><a class=\"nav-link\" href=\"customer_logout.jsp\"><i class=\"fas fa-sign-out-alt\"></i> Logout</a></li>\n");
      out.write("    </ul>\n");
      out.write("  </div>\n");
      out.write("</div>\n");
      out.write("</nav>");
      out.write("\n");
      out.write("<!----------------- ---------- ----------------->\n");
      out.write("\n");
      out.write("\t\t\t<!-- start banner Area -->\n");
      out.write("\t\t\t<section class=\"banner-area relative\" id=\"home\">\t\n");
      out.write("\t\t\t\t<div class=\"overlay overlay-bg\"></div>\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row d-flex align-items-center justify-content-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"about-content col-lg-12\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"text-white\">\n");
      out.write("\t\t\t\t\t\t\t\tBicycles\t\t\t\n");
      out.write("\t\t\t\t\t\t\t</h1>\t\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-white link-nav\"><a href=\"index.html\">Home </a>  <span class=\"lnr lnr-arrow-right\"></span>  <a href=\"cars.html\"> Bicycles</a></p>\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End banner Area -->\t\n");
      out.write("\n");
      out.write("\t\t\t<!-- Start model Area -->\n");
      out.write("\t\t\t<section class=\"model-area section-gap\" id=\"cars\">\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row d-flex justify-content-center pb-40\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-md-8 pb-40 header-text\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"text-center pb-10\">Choose your Desired Bicycles </h1>\n");
      out.write("\t\t\t\t\t\t\t<p class=\"text-center\">\n");
      out.write("\t\t\t\t\t\t\t\tWho are in extremely love to ride.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\t\t\t\t\n");
      out.write("\t\t\t\t\t<div class=\"active-model-carusel\">\n");
      out.write("\t\t\t\t\t\t<div class=\"row align-items-center single-model item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title justify-content-between d-flex\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"mt-20\">Mountain Bike</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>$20<span>/day</span></h2>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tMountain bikes usually have 26â or 29â³ wide knobby tires which allow them to be ridden in loose dirt and over obstacles. These bikes have flat handlebars and rugged frames and components. Mountain bikes often have suspension to help any cyclist navigate rocky mountain trails. Many people ride mountain bikes on roads as well as trails. This does the bike no harm. It could be likened to one driving an SUV on the highway: the vehicle will operate fineâit is simply not the most efficient choice. While mountain-style bikes come in all price ranges, the lower end recreational versions are not suited for aggressive mountain biking but work great for trips on smooth dirt paths.\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-uppercase primary-btn\" href=\"#\">Book This Bicycles Now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"img/mountain1.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row align-items-center single-model item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title justify-content-between d-flex\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"mt-20\">Hybrid/Comfort bike</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>$15<span>/day</span></h2>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tHybrids and Sport Comfort Bikes share the same comfort features but are distinguished by wheel size. Traditionally, hybrids have a larger road bike sized wheel with a slightly thinner compared to the comfort bikes which yield smaller, mountain style wheels.  Both bikes are loaded with comfort features and will work equally well on smooth dirt, paved trails, and family cycling trips. These bikes have a very upright position meant for comfort.\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-uppercase primary-btn\" href=\"#\">Book This Bicycles Now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"img/road.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t<div class=\"row align-items-center single-model item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title justify-content-between d-flex\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"mt-20\">BMX/Trick Bike</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>$18<span>/day</span></h2>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tBMX stands for Bicycle Motor Cross because these single-speed bikes are raced around a short dirt track similar to the motor sport.  Frequently, the term BMX is used to describe any single-speed bike with a 20â wheel. These bikes are often very robust and durable and would be the best selection for anyone intending to do jumps or tricks\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-uppercase primary-btn\" href=\"#\">Book This Bicycles Now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"img/bmx.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t<div class=\"row align-items-center single-model item\">\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-left\">\n");
      out.write("\t\t\t\t\t\t\t\t<div class=\"title justify-content-between d-flex\">\n");
      out.write("\t\t\t\t\t\t\t\t\t<h4 class=\"mt-20\">Cyclocross Bike</h4>\n");
      out.write("\t\t\t\t\t\t\t\t\t<h2>$25<span>/day</span></h2>\n");
      out.write("\t\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\t\tA cyclocross bike has road bike style drop handlebars but with wider knobby tires. These bikes are designed to be raced around a dirt trail where obstacles have been placed at various intervals. These obstacles require the rider to dismount and carry the bicycle for short periods of time. Cyclocross events are a lot of fun and the bikes are versatile so they are a great do-anything bike.\n");
      out.write("\t\t\t\t\t\t\t\t</p>\n");
      out.write("\n");
      out.write("\t\t\t\t\t\t\t\t<a class=\"text-uppercase primary-btn\" href=\"#\">Book This Bicycles Now</a>\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t\t<div class=\"col-lg-6 model-right\">\n");
      out.write("\t\t\t\t\t\t\t\t<img class=\"img-fluid\" src=\"img/cyclocross.jpg\" alt=\"\">\n");
      out.write("\t\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t\t</div>\t\t\t\t\t\t\n");
      out.write("\t\t\t\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End model Area -->\t\t\t\n");
      out.write("\n");
      out.write("\t\t\t<!-- Start callaction Area -->\n");
      out.write("\t\t\t<section class=\"callaction-area relative section-gap\">\n");
      out.write("\t\t\t\t<div class=\"overlay overlay-bg\"></div>\n");
      out.write("\t\t\t\t<div class=\"container\">\n");
      out.write("\t\t\t\t\t<div class=\"row justify-content-center\">\n");
      out.write("\t\t\t\t\t\t<div class=\"col-lg-10\">\n");
      out.write("\t\t\t\t\t\t\t<h1 class=\"text-white\">Experience Great Support</h1>\n");
      out.write("\t\t\t\t\t\t\t<p>\n");
      out.write("\t\t\t\t\t\t\t\tLorem ipsum dolor sit amet, consectetur adipisicing elit, sed do eiusmod tempor incididunt ut labore  et dolore magna aliqua. Ut enim ad minim veniam, quis nostrud exercitation.\n");
      out.write("\t\t\t\t\t\t\t</p>\n");
      out.write("\t\t\t\t\t\t\t<a class=\"callaction-btn text-uppercase\" href=\"#\">Reach Our Support Team</a>\t\n");
      out.write("\t\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t\t</div>\n");
      out.write("\t\t\t\t</div>\t\n");
      out.write("\t\t\t</section>\n");
      out.write("\t\t\t<!-- End callaction Area -->\n");
      out.write("\n");
      out.write("\t\t\t\n");
      out.write("\t\n");
      out.write("\t\t\n");
      out.write("\n");
      out.write("\t\t\t<script src=\"js/vendor/jquery-2.2.4.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.12.9/umd/popper.min.js\" integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\" crossorigin=\"anonymous\"></script>\n");
      out.write("\t\t\t<script src=\"js/vendor/bootstrap.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script type=\"text/javascript\" src=\"https://maps.googleapis.com/maps/api/js?key=AIzaSyBhOdIF3Y9382fqJYt5I_sswSrEw5eihAA\"></script>\n");
      out.write("\t\t\t<script src=\"https://code.jquery.com/ui/1.12.1/jquery-ui.js\"></script>\t\t\t\n");
      out.write("  \t\t\t<script src=\"js/easing.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/hoverIntent.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/superfish.min.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/jquery.ajaxchimp.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.magnific-popup.min.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/owl.carousel.min.js\"></script>\t\t\t\n");
      out.write("\t\t\t<script src=\"js/jquery.sticky.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.nice-select.min.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/waypoints.min.js\"></script>\n");
      out.write("\t\t\t<script src=\"js/jquery.counterup.min.js\"></script>\t\t\t\t\t\n");
      out.write("\t\t\t<script src=\"js/parallax.min.js\"></script>\t\t\n");
      out.write("\t\t\t<script src=\"js/mail-script.js\"></script>\t\n");
      out.write("\t\t\t<script src=\"js/main.js\"></script>\t\n");
      out.write("\t\t</body>\n");
      out.write("\t</html>\n");
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

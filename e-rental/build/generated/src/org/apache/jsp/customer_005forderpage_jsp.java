package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.Random;
import bean.Customer;
import java.util.ArrayList;

public final class customer_005forderpage_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navibar1.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_if_test;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_if_test = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_if_test.release();
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
      response.setContentType("text/html;charset=UTF-8");
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
      //  c:if
      org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_if_0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _jspx_tagPool_c_if_test.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
      _jspx_th_c_if_0.setPageContext(_jspx_page_context);
      _jspx_th_c_if_0.setParent(null);
      _jspx_th_c_if_0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.CUSTOMER == null}", java.lang.Boolean.class, (PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_if_0 = _jspx_th_c_if_0.doStartTag();
      if (_jspx_eval_c_if_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("    ");
 response.sendRedirect(request.getContextPath() + "/customer_logout.jsp"); 
          out.write('\n');
          int evalDoAfterBody = _jspx_th_c_if_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_if_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
        return;
      }
      _jspx_tagPool_c_if_test.reuse(_jspx_th_c_if_0);
      out.write('\n');
      out.write('\n');
      bean.Customer CUSTOMER = null;
      synchronized (session) {
        CUSTOMER = (bean.Customer) _jspx_page_context.getAttribute("CUSTOMER", PageContext.SESSION_SCOPE);
        if (CUSTOMER == null){
          CUSTOMER = new bean.Customer();
          _jspx_page_context.setAttribute("CUSTOMER", CUSTOMER, PageContext.SESSION_SCOPE);
        }
      }
      out.write("\n");
      out.write("\n");
      out.write("<!doctype html>\n");
      out.write("<html lang=\"en\">\n");
      out.write("<head>\n");
      out.write("\n");
      out.write("\t\t<!-- Mobile Specific Meta -->\n");
      out.write("\t\t<meta name=\"viewport\" content=\"width=device-width, initial-scale=1, shrink-to-fit=no\">\n");
      out.write("\t\t<!-- Favicon-->\n");
      out.write("\t\t<link rel=\"shortcut icon\" href=\"img/elements/fav.png\">\n");
      out.write("\t\t<!-- Author Meta -->\n");
      out.write("\t\t<meta name=\"author\" content=\"colorlib\">\n");
      out.write("\t\t<!-- Meta Description -->\n");
      out.write("\t\t<meta name=\"description\" content=\"\">\n");
      out.write("\t\t<!-- Meta Keyword -->\n");
      out.write("\t\t<meta name=\"keywords\" content=\"\">\n");
      out.write("\t\t<!-- meta character set -->\n");
      out.write("\t\t<meta charset=\"UTF-8\">\n");
      out.write("\t\t<!-- Site Title -->\n");
      out.write("\t\t<title>Bicycles</title>\n");
      out.write("\n");
      out.write("\t\t<link href=\"https://fonts.googleapis.com/css?family=Poppins:100,200,400,300,500,600,700\" rel=\"stylesheet\"> \n");
      out.write("\t\t\t<!--\n");
      out.write("\t\t\tCSS\n");
      out.write("\t\t\t============================================= -->\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/linearicons.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/owl.carousel.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/font-awesome.min.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/nice-select.css\">\t\t\t\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/magnific-popup.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/bootstrap.css\">\n");
      out.write("\t\t\t<link rel=\"stylesheet\" href=\"css/main.css\">\n");
      out.write("<!------------------- Script ------------------->\n");
      out.write("\n");
      out.write("<!------------------- ------ ------------------->\n");
      out.write("<title>BH - CUSTOMER</title>\n");
      out.write("</head>\n");
      out.write("<body background=\"img/backs.jpg\">\n");
      out.write("\n");
      out.write("    \n");
      out.write("    \n");
      out.write("\n");
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
      out.write("    <li class=\"nav-item\"><a class=\"nav-link\" href=\"bicycles.jsp\">Bicycles Catalog</a></li>\n");
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
 int duration=Integer.parseInt(request.getParameter("rentDuration"));
   int time=Integer.parseInt(request.getParameter("startRent")); 

      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!------------------- Coding ------------------->\n");
      out.write("<form action=\"customer_orderBicycles\"  method=\"POST\">\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row justify-content-lg-center\">\n");
      out.write("    <div class=\"col col-lg-8\">\n");
      out.write("      <div class=\"card card-outline-secondary my-4\" style=\"background-color:#E6E6FA\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("          Info\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\" >\n");
      out.write("          <!----------------------------------------------------->  \n");
      out.write("         <table class=\"table table-bordered\" align=\"center\">\n");
      out.write("            <tr>\n");
      out.write("              <td colspan=\"2\" align=\"center\"><h2>ORDER BICYCLE</h2>\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Name : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("                <input readonly type=\"name\" class=\"form-control\" name=\"custName\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((bean.Customer)_jspx_page_context.findAttribute("CUSTOMER")).getCustomerName())));
      out.write("\" required >\n");
      out.write("                \n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Customer ID : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("                <input readonly type=\"name\" class=\"form-control\" name=\"custId\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((bean.Customer)_jspx_page_context.findAttribute("CUSTOMER")).getCustomerID())));
      out.write("\" protected >\n");
      out.write("            </tr>\n");
      out.write("            <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Contact Number : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("                <input readonly type=\"name\" class=\"form-control\" name=\"custContact\" value=\"");
      out.write(org.apache.jasper.runtime.JspRuntimeLibrary.toString((((bean.Customer)_jspx_page_context.findAttribute("CUSTOMER")).getcustomerPhone())));
      out.write("\" protected >\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Bicycle ID : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("                ");
      out.print( request.getParameter("bookID"));
      out.write("\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Pickup time : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("                ");
      out.print( request.getParameter("startRent"));
      out.write(" PM\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("            <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Duration rent : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("                ");
      out.print( request.getParameter("rentDuration"));
      out.write(" Hours\n");
      out.write("            </tr>\n");
      out.write("            \n");
      out.write("             <tr>\n");
      out.write("              <td width=\"50%\" align=\"right\">Return time : \n");
      out.write("              <td class=\"p-2\">\n");
      out.write("               ");
out.print(duration+time);
      out.write(" PM\n");
      out.write("            </tr>\n");
      out.write("               \n");
      out.write("            \n");
      out.write("\n");
      out.write("            \n");
      out.write("          \n");
      out.write("            \n");
      out.write("          </table>\n");
      out.write("          <hr>         \n");
      out.write("        </div>\n");
      out.write("        <button type=\"submit\" class=\"btn btn-success m-2\">Rent Bicycle</button>\n");
      out.write("        <a href=\"bicycles.jsp\" class=\"btn btn-danger m-2\">Cancel</a>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</form>");
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

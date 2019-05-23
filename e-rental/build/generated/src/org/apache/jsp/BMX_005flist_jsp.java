package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import java.util.ArrayList;
import bean.Bike;

public final class BMX_005flist_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent {

  private static final JspFactory _jspxFactory = JspFactory.getDefaultFactory();

  private static java.util.List<String> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.ArrayList<String>(1);
    _jspx_dependants.add("/navibar1.jsp");
  }

  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_forEach_varStatus_var_items;
  private org.apache.jasper.runtime.TagHandlerPool _jspx_tagPool_c_out_value_nobody;

  private org.glassfish.jsp.api.ResourceInjector _jspx_resourceInjector;

  public java.util.List<String> getDependants() {
    return _jspx_dependants;
  }

  public void _jspInit() {
    _jspx_tagPool_c_forEach_varStatus_var_items = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
    _jspx_tagPool_c_out_value_nobody = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _jspx_tagPool_c_forEach_varStatus_var_items.release();
    _jspx_tagPool_c_out_value_nobody.release();
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
      out.write("\n");
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
      out.write("<title>BMX</title>\n");
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
      out.write("\n");
      out.write("<!------------------- Coding ------------------->\n");
      out.write("\n");
      out.write("<div class=\"container\">\n");
      out.write("  <div class=\"row justify-content-lg-center\">\n");
      out.write("    <div class=\"col col-lg-8\">\n");
      out.write("      <div class=\"card card-outline-secondary my-4\" style=\"background-color:#E6E6FA\">\n");
      out.write("        <div class=\"card-header\">\n");
      out.write("          BMX Bike List\n");
      out.write("        </div>\n");
      out.write("        <div class=\"card-body\" >\n");
      out.write("          <!----------------------------------------------------->  \n");
      out.write("          \n");
      out.write("         <table class=\"table table-bordered\" align=\"center\">\n");
      out.write("                     <tr>\n");
      out.write("                            <td>BIKE ID</td>\n");
      out.write("                            <td>PRICE PER HOUR</td>\n");
      out.write("                            <td>BIKE TYPE</td>\n");
      out.write("                            <td>BIKE STATUS</td>\n");
      out.write("                     </tr> \n");
      out.write("          ");
      if (_jspx_meth_c_forEach_0(_jspx_page_context))
        return;
      out.write("\n");
      out.write("\n");
      out.write("          </table>\n");
      out.write("          \n");
      out.write("<form action=\"#\">\n");
      out.write("  Enter Bicycle ID to Book:\n");
      out.write("  <input type=\"number\" name=\"bookID\">\n");
      out.write("  Enter time start rent:\n");
      out.write("  <input type=\"number\" name=\"startRent\">\n");
      out.write("  Enter rent duration (Hours):\n");
      out.write("  <input type=\"number\" name=\"rentDuration\">\n");
      out.write("  \n");
      out.write("  <input type=\"submit\" value=\"BOOK\">\n");
      out.write("</form> \n");
      out.write("               \n");
      out.write("        </div>\n");
      out.write("      </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("</body>\n");
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

  private boolean _jspx_meth_c_forEach_0(PageContext _jspx_page_context)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:forEach
    org.apache.taglibs.standard.tag.rt.core.ForEachTag _jspx_th_c_forEach_0 = (org.apache.taglibs.standard.tag.rt.core.ForEachTag) _jspx_tagPool_c_forEach_varStatus_var_items.get(org.apache.taglibs.standard.tag.rt.core.ForEachTag.class);
    _jspx_th_c_forEach_0.setPageContext(_jspx_page_context);
    _jspx_th_c_forEach_0.setParent(null);
    _jspx_th_c_forEach_0.setItems((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${sessionScope.BMX}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    _jspx_th_c_forEach_0.setVar("orderlist");
    _jspx_th_c_forEach_0.setVarStatus("loop");
    int[] _jspx_push_body_count_c_forEach_0 = new int[] { 0 };
    try {
      int _jspx_eval_c_forEach_0 = _jspx_th_c_forEach_0.doStartTag();
      if (_jspx_eval_c_forEach_0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\n");
          out.write("                     \n");
          out.write("                     <tr>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_0((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_1((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_2((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            <td>");
          if (_jspx_meth_c_out_3((javax.servlet.jsp.tagext.JspTag) _jspx_th_c_forEach_0, _jspx_page_context, _jspx_push_body_count_c_forEach_0))
            return true;
          out.write("</td>\n");
          out.write("                            \n");
          out.write("                            \n");
          out.write("                     </tr>\n");
          out.write("           ");
          int evalDoAfterBody = _jspx_th_c_forEach_0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_forEach_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
    } catch (Throwable _jspx_exception) {
      while (_jspx_push_body_count_c_forEach_0[0]-- > 0)
        out = _jspx_page_context.popBody();
      _jspx_th_c_forEach_0.doCatch(_jspx_exception);
    } finally {
      _jspx_th_c_forEach_0.doFinally();
      _jspx_tagPool_c_forEach_varStatus_var_items.reuse(_jspx_th_c_forEach_0);
    }
    return false;
  }

  private boolean _jspx_meth_c_out_0(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_0 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_0.setPageContext(_jspx_page_context);
    _jspx_th_c_out_0.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_0.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderlist.bikeID}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_0 = _jspx_th_c_out_0.doStartTag();
    if (_jspx_th_c_out_0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_0);
    return false;
  }

  private boolean _jspx_meth_c_out_1(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_1 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_1.setPageContext(_jspx_page_context);
    _jspx_th_c_out_1.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_1.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderlist.bikePrice}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_1 = _jspx_th_c_out_1.doStartTag();
    if (_jspx_th_c_out_1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_1);
    return false;
  }

  private boolean _jspx_meth_c_out_2(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_2 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_2.setPageContext(_jspx_page_context);
    _jspx_th_c_out_2.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_2.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderlist.bikeType}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_2 = _jspx_th_c_out_2.doStartTag();
    if (_jspx_th_c_out_2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_2);
    return false;
  }

  private boolean _jspx_meth_c_out_3(javax.servlet.jsp.tagext.JspTag _jspx_th_c_forEach_0, PageContext _jspx_page_context, int[] _jspx_push_body_count_c_forEach_0)
          throws Throwable {
    PageContext pageContext = _jspx_page_context;
    JspWriter out = _jspx_page_context.getOut();
    //  c:out
    org.apache.taglibs.standard.tag.rt.core.OutTag _jspx_th_c_out_3 = (org.apache.taglibs.standard.tag.rt.core.OutTag) _jspx_tagPool_c_out_value_nobody.get(org.apache.taglibs.standard.tag.rt.core.OutTag.class);
    _jspx_th_c_out_3.setPageContext(_jspx_page_context);
    _jspx_th_c_out_3.setParent((javax.servlet.jsp.tagext.Tag) _jspx_th_c_forEach_0);
    _jspx_th_c_out_3.setValue((java.lang.Object) org.apache.jasper.runtime.PageContextImpl.evaluateExpression("${orderlist.bikeStatus}", java.lang.Object.class, (PageContext)_jspx_page_context, null));
    int _jspx_eval_c_out_3 = _jspx_th_c_out_3.doStartTag();
    if (_jspx_th_c_out_3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
      _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
      return true;
    }
    _jspx_tagPool_c_out_value_nobody.reuse(_jspx_th_c_out_3);
    return false;
  }
}

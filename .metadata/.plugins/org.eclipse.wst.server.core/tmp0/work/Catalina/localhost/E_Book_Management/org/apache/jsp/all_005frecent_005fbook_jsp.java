/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/10.1.10
 * Generated at: 2024-02-28 16:19:11 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.jsp.*;
import com.kuu.beans.UserBO;
import com.kuu.beans.BookDetails;
import java.util.List;
import com.kuu.dao.BookDAOImpl;

public final class all_005frecent_005fbook_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports,
                 org.apache.jasper.runtime.JspSourceDirectives {

  private static final jakarta.servlet.jsp.JspFactory _jspxFactory =
          jakarta.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/WEB-INF/lib/taglibs-standard-impl-1.2.5-migrated-0.0.1.jar", Long.valueOf(1685729518000L));
    _jspx_dependants.put("jar:file:/F:/Mini%20project%20in%20java/.metadata/.plugins/org.eclipse.wst.server.core/tmp0/wtpwebapps/E_Book_Management/WEB-INF/lib/taglibs-standard-impl-1.2.5-migrated-0.0.1.jar!/META-INF/c.tld", Long.valueOf(1578911364000L));
    _jspx_dependants.put("/all_component/navbar.jsp", Long.valueOf(1709126970983L));
    _jspx_dependants.put("/all_component/allcss.jsp", Long.valueOf(1706633409180L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("jakarta.servlet");
    _jspx_imports_packages.add("jakarta.servlet.http");
    _jspx_imports_packages.add("jakarta.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("com.kuu.dao.BookDAOImpl");
    _jspx_imports_classes.add("java.util.List");
    _jspx_imports_classes.add("com.kuu.beans.UserBO");
    _jspx_imports_classes.add("com.kuu.beans.BookDetails");
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile jakarta.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public boolean getErrorOnELNotFound() {
    return false;
  }

  public jakarta.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final jakarta.servlet.http.HttpServletRequest request, final jakarta.servlet.http.HttpServletResponse response)
      throws java.io.IOException, jakarta.servlet.ServletException {

    if (!jakarta.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final jakarta.servlet.jsp.PageContext pageContext;
    jakarta.servlet.http.HttpSession session = null;
    final jakarta.servlet.ServletContext application;
    final jakarta.servlet.ServletConfig config;
    jakarta.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    jakarta.servlet.jsp.JspWriter _jspx_out = null;
    jakarta.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=ISO-8859-1");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>All Recent Book</title>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css\"\r\n");
      out.write("	integrity=\"sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm\"\r\n");
      out.write("	crossorigin=\"anonymous\">\r\n");
      out.write("\r\n");
      out.write("<script src=\"https://code.jquery.com/jquery-3.2.1.slim.min.js\"\r\n");
      out.write("	integrity=\"sha384-KJ3o2DKtIkvYIK3UENzmM7KCkRr/rE9/Qpg6aAZGJwFDMVNA/GpGFF93hXpG5KkN\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js\"\r\n");
      out.write("	integrity=\"sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<script\r\n");
      out.write("	src=\"https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js\"\r\n");
      out.write("	integrity=\"sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl\"\r\n");
      out.write("	crossorigin=\"anonymous\"></script>\r\n");
      out.write("<link rel=\"stylesheet\"\r\n");
      out.write("	href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/6.5.1/css/all.min.css\"\r\n");
      out.write("	integrity=\"sha512-DTOQO9RWCH3ppGqcWaEA1BIZOC6xxalwEsw9c2QQeAIftl+Vegovlnee1c9QX4TctnWMn13TZye+giMm8e2LwA==\"\r\n");
      out.write("	crossorigin=\"anonymous\" referrerpolicy=\"no-referrer\" />\r\n");
      out.write("	\r\n");
      out.write("	<link  rel=\"stylesheet\" href=\"all_component/style.css\"/>");
      out.write("\r\n");
      out.write("</head>\r\n");
      out.write("<body style=\"background-color: #f7e7e6\">\r\n");
      out.write("	");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid\" style=\"height : 10px ; background-color:  #7B1FA2 \"></div>\r\n");
      out.write("\r\n");
      out.write("<div class=\"container-fluid p-3 bg-light\">\r\n");
      out.write(" <div class=\"row\">\r\n");
      out.write("     <div class=\"col-md-3 text-success\">\r\n");
      out.write("        <h3 > <i class=\"fa-solid fa-book\"></i>Pustakalaya</h3>\r\n");
      out.write("     </div>\r\n");
      out.write("    <div class=\"col-md-6\">\r\n");
      out.write("       <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Search\" aria-label=\"Search\">\r\n");
      out.write("      <button class=\"btn btn-primary my-2 my-sm-0\" type=\"submit\">Search</button>\r\n");
      out.write("    </form>\r\n");
      out.write("    \r\n");
      out.write("    </div>\r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write("    ");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("    \r\n");
      out.write(" </div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</div>\r\n");
      out.write("\r\n");
      out.write("<nav class=\"navbar navbar-expand-lg navbar-dark bg-custom\">\r\n");
      out.write("  <a class=\"navbar-brand\" href=\"#\"><i class=\"fa-solid fa-house-chimney\"></i></a>\r\n");
      out.write("  <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\r\n");
      out.write("    <span class=\"navbar-toggler-icon\"></span>\r\n");
      out.write("  </button>\r\n");
      out.write("\r\n");
      out.write("  <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\r\n");
      out.write("    <ul class=\"navbar-nav mr-auto\">\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"index.jsp\">Home <span class=\"sr-only\">(current)</span></a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"all_recent_book.jsp\"> <i class=\"fa-solid fa-book-open\"></i> Recent Book</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link\" href=\"all_new_book.jsp\"> <i class=\"fa-solid fa-book-open\"></i> New Book</a>\r\n");
      out.write("      </li>\r\n");
      out.write("      \r\n");
      out.write("      </li>\r\n");
      out.write("      <li class=\"nav-item active\">\r\n");
      out.write("        <a class=\"nav-link disabled\" href=\"all_old_book.jsp\"> <i class=\"fa-solid fa-book-open\"></i> Old Book</a>\r\n");
      out.write("      </li>\r\n");
      out.write("    </ul>\r\n");
      out.write("    <form class=\"form-inline my-2 my-lg-0\">\r\n");
      out.write("      <a href=\"setting.jsp\" class=\"btn btn-light my-2 my-sm-0\" type=\"submit\"><i class=\"fa-solid fa-gear\"></i> Setting</a>\r\n");
      out.write("      <button class=\"btn btn-light my-2 my-sm-0 ml-1\" type=\"submit\"><i class=\"fa-solid fa-phone\"></i> Contact Us</button>\r\n");
      out.write("    </form>\r\n");
      out.write("  </div>\r\n");
      out.write("</nav>");
      out.write('\r');
      out.write('\n');
      out.write('	');
 

   UserBO user =(UserBO)session.getAttribute("userobj") ;


      out.write("\r\n");
      out.write("	<div class=\"container\">\r\n");
      out.write("		<h3 class=\"text-center\">All Recent Book</h3>\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("\r\n");
      out.write("			");

			BookDAOImpl dao = new BookDAOImpl();
			List<BookDetails> list= dao.getAllRecentBook();
			for (BookDetails book : list) {
			
      out.write("\r\n");
      out.write("			<div class=\"col-md-3.5\">\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("				<div class=\"card\">\r\n");
      out.write("					<div class=\"card-body text-center\">\r\n");
      out.write("						<img alt=\"\" src=\"books/");
      out.print(book.getPhotoName());
      out.write("\"\r\n");
      out.write("							style=\"width: 150px; height: 200px\" class=\"img-thumblin\">\r\n");
      out.write("						<p>");
      out.print(book.getBookname());
      out.write("</p>\r\n");
      out.write("						<p>");
      out.print(book.getAuthor());
      out.write("</p>\r\n");
      out.write("						<p>\r\n");
      out.write("							");

							if (book.getBookCategory().equalsIgnoreCase("Old")) {
							
      out.write("\r\n");
      out.write("\r\n");
      out.write("							Categories :\r\n");
      out.write("							");
      out.print(book.getBookCategory());
      out.write("</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							<a href=\"view_books.jsp?bid=");
      out.print(book.getBookId() );
      out.write("\" class=\"btn btn-success btn-sm ml-1\">View Details</a> <a\r\n");
      out.write("								href=\"\" class=\"btn btn-danger btn-sm ml-1\">");
      out.print(book.getPrice());
      out.write("\r\n");
      out.write("								<i class=\"fa-solid fa-indian-rupee-sign\"></i></a>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						");

						} else {
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("						Categories :\r\n");
      out.write("						");
      out.print(book.getBookCategory());
      out.write("</p>\r\n");
      out.write("						<div class=\"row\">\r\n");
      out.write("							");

						
						if(user==null){
							
							
      out.write("\r\n");
      out.write("							<a href=\"login.jsp\" class=\"btn btn-danger btn-sm ml-1\"><i\r\n");
      out.write("								class=\"fa-solid fa-cart-shopping\"></i>Add Cart</a>\r\n");
      out.write("							");

						}else{
							
      out.write("\r\n");
      out.write("							<a href=\"cart?bid=");
      out.print(book.getBookId() );
      out.write("&&uid=");
      out.print(user.getId() );
      out.write("\" class=\"btn btn-danger btn-sm ml-1\"><i\r\n");
      out.write("								class=\"fa-solid fa-cart-shopping\"></i>Add Cart</a>\r\n");
      out.write("							");

						}
						
						
						
      out.write("\r\n");
      out.write("							\r\n");
      out.write("							 <a href=\"view_books.jsp?bid=");
      out.print(book.getBookId() );
      out.write("\"\r\n");
      out.write("								class=\"btn btn-success btn-sm ml-1\">View Details</a> <a href=\"\"\r\n");
      out.write("								class=\"btn btn-danger btn-sm ml-1\">");
      out.print(book.getPrice());
      out.write(" <i\r\n");
      out.write("								class=\"fa-solid fa-indian-rupee-sign\"></i></a>\r\n");
      out.write("\r\n");
      out.write("						</div>\r\n");
      out.write("\r\n");
      out.write("						");

						}
						
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("\r\n");
      out.write("			");

			}
			
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof jakarta.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /all_component/navbar.jsp(18,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${not empty userobj }", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <div class=\"col-md-3\">\r\n");
          out.write("    \r\n");
          out.write("    <a href=\"checkout.jsp\" class=\"btn btn-ligh\"><i class=\"fa-solid fa-cart-shopping  \"></i></a>\r\n");
          out.write("    \r\n");
          out.write("      <a href=\"\" class=\"btn btn-success\"><i class=\"fa-solid fa-user-plus\"></i>");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userobj.name }", java.lang.String.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write("</a>\r\n");
          out.write("      <a href=\"logout\" class=\"btn btn-primary\"><i class=\"fa-solid fa-right-to-bracket\"></i> Logout</a>\r\n");
          out.write("      \r\n");
          out.write("    </div>\r\n");
          out.write("    \r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(jakarta.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    jakarta.servlet.jsp.PageContext pageContext = _jspx_page_context;
    jakarta.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /all_component/navbar.jsp(30,4) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${ empty userobj }", boolean.class, (jakarta.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != jakarta.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("    <div class=\"col-md-3\">\r\n");
          out.write("      <a href=\"login.jsp\" class=\"btn btn-success\"><i class=\"fa-solid fa-right-to-bracket\"></i> Login</a>\r\n");
          out.write("      <a href=\"register.jsp\" class=\"btn btn-primary\"><i class=\"fa-solid fa-user-plus\"></i> Register</a>\r\n");
          out.write("      \r\n");
          out.write("    </div>\r\n");
          out.write("    \r\n");
          out.write("    ");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != jakarta.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == jakarta.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }
}

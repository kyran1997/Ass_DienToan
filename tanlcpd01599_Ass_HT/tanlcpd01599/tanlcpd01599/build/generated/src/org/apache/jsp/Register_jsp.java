package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class Register_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<link href=\"CSS/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("       \n");
      out.write("        <title>JSP Page</title>\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("       \n");
      out.write("    <div class=\"dangky\">\n");
      out.write("    <center>\n");
      out.write("        <h1>ĐĂNG KÍ</h1><form action=\"AccountServlet\" method=\"get\">\n");
      out.write("            \n");
      out.write("            <table width=\"500\" height=\"300\" border=\"1px\" > \n");
      out.write("                \n");
      out.write("                    <tr>\n");
      out.write("                        <th  scope=\"row\" >Tên đăng nhập: </th>\n");
      out.write("                        <td><input type=\"text\" name=\"tentk\" value=\"\" size=\"30\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th  scope=\"row\">Mật khẩu:</th>\n");
      out.write("                        <td><input type=\"password\" name=\"pass\" value=\"\" size=\"30\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\" >Họ tên:</th>\n");
      out.write("                        <td><input type=\"text\" name=\"hoten\" value=\"\" size=\"30\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\" >Vai tro:</th>\n");
      out.write("                        <td><input type=\"text\" name=\"vaitro\" value=\"\" size=\"30\" /></td>\n");
      out.write("                    </tr>\n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">Địa chỉ:</th>\n");
      out.write("                        <td>\n");
      out.write("                           <input type=\"text\" name=\"diachi\" value=\"\" size=\"30\" />\n");
      out.write("                        </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                    <tr>\n");
      out.write("                        <th scope=\"row\">Email:</th>\n");
      out.write("                        <td><input type=\"text\" name=\"email\" value=\"\" size=\"30\" /> </td>\n");
      out.write("                    </tr>\n");
      out.write("\n");
      out.write("                    <tr>                   \n");
      out.write("                        <th scope=\"row\">SĐT: </th>\n");
      out.write("                        <td>  <input type=\"text\" name=\"sdt\" value=\"\" size=\"30\" />  </td>\n");
      out.write("                    </tr>\n");
      out.write("                    <th scope=\"row\">&nbsp;</th>\n");
      out.write("                    <td>\n");
      out.write("                        <input type=\"submit\" name=\"dk\" value=\"Đăng kí\" />\n");
      out.write("                    </td>\n");
      out.write("                    </tr>\n");
      out.write("                    \n");
      out.write("                \n");
      out.write("            </table></from>\n");
      out.write("        </div>\n");
      out.write("    </body>\n");
      out.write("</html>\n");
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

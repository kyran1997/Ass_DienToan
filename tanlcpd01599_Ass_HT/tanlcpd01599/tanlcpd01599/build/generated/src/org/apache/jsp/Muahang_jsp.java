package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import Model.Product;
import DAO.ProductDAO;
import Model.Catalogue;
import DAO.CalelogueDAO;

public final class Muahang_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("\n");
      out.write("\n");
      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <link href=\"CSS/Style.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"CSS/boxover.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/javascript.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jquery.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv2.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv3.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv4.js\" type=\"text/javascript\"></script>\n");
      out.write("        <script src=\"CSS/jv_1.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"CSS/main.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <link href=\"CSS/test_1.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("        <script src=\"File/SpryAssets/SpryMenuBar.js\" type=\"text/javascript\"></script>\n");
      out.write("        <link href=\"File/SpryAssets/SpryMenuBarHorizontal.css\" rel=\"stylesheet\" type=\"text/css\"/>\n");
      out.write("\t<title></title>\n");
      out.write("    </head>\n");
      out.write("   \n");
      out.write("       \n");
      out.write("       <body  class=\"home\">\n");
      out.write("           ");

            CalelogueDAO calelogueDAO = new CalelogueDAO();
            
      out.write("\n");
      out.write("            \n");
      out.write("            ");

                ProductDAO productDAO = new ProductDAO();
                String Ma_loai ="";
                if (request.getParameter("Catalogue")!=null) {
                        Ma_loai = request.getParameter("Catalogue");
                    } 
                
      out.write("\n");
      out.write("<div class=\"wrapper_all\">\n");
      out.write("<div class=\"wrapper\">\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"header\">\n");
      out.write("\n");
      out.write("\t<div class=\"header_left\"><img src=\"../Image/lg2.jpg\" width=\"300\" height=\"200\" /></div>\n");
      out.write("    <div class=\"header_right\">\n");
      out.write("    \t<div class=\"header_right_top\">\n");
      out.write("        <a href=\"#\" style=\"color:#F03\"><strong>Đăng nhập</strong></a> I\n");
      out.write("     <a href=\"#\" style=\"color:#F03\"><strong>Đăng ký</strong></a></div>\n");
      out.write("        <div class=\"header_right_bottom\">\n");
      out.write("          <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("             <li><a href=\"1.html#trangchu\"><center><strong>TRANG CHỦ</strong></center></a>\n");
      out.write("             \n");
      out.write("                \n");
      out.write("             <li><a href=\"1.html#bosuutap\"><center><strong>BỘ SƯU TẬP</strong></center></a>\n");
      out.write("             \n");
      out.write("                <ul>\n");
      out.write("                       ");

                           for (Catalogue c : calelogueDAO.getListCategory()){
                               
      out.write("\n");
      out.write("                <li><a href=\"Muahang.jsp?Catalogue=");
      out.print(c.getMaloai());
      out.write('"');
      out.write('>');
      out.print( c.getTenloai());
      out.write("</a></li>\n");
      out.write("               \n");
      out.write("                ");

                    }
                    
      out.write("\n");
      out.write("                </li>\n");
      out.write("          </ul>\n");
      out.write("             </li>\n");
      out.write("             <li><a href=\"1.html#sanpham\"><center><strong>SẢN PHẨM</strong></center></a></li>\n");
      out.write("             <li><a href=\"1.html#lienhe\"><center><strong>LIÊN HỆ</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>FANPAGE</strong></center></a></li>\n");
      out.write("          </ul>\n");
      out.write("          \n");
      out.write("        </div>\n");
      out.write("        \n");
      out.write("    </div>\n");
      out.write("    \n");
      out.write("</div>\n");
      out.write("\n");
      out.write("\n");
      out.write("<div class=\"content\">\n");
      out.write("\n");
      out.write("<div id=\"trangchu\">\n");
      out.write("\t<div class=\"content_1\">\n");
      out.write("    \n");
      out.write("       <hr />\n");
      out.write("  \t\t<div class=\"inner clearfix\">  \n");
      out.write("\t\t<div class=\"home-slider-wrapper\">\n");
      out.write("  <ul class=\"bxslider\">\n");
      out.write("    <li><img src=\"../Image/mt1.jpg\" width=\"1024\" height=\"550\" /></li>\n");
      out.write("    \n");
      out.write("  </ul>\n");
      out.write(" \n");
      out.write("\t\t</div>\n");
      out.write("  \t<script>!function(d,s,id){var js,fjs=d.getElementsByTagName(s)[0],p=/^http:/.test(d.location)?'http':'https';if(!d.getElementById(id)){js=d.createElement(s);js.id=id;js.src=p+'://platform.twitter.com/widgets.js';fjs.parentNode.insertBefore(js,fjs);}}(document, 'script', 'twitter-wjs');</script>\n");
      out.write("  \t\t</div>\n");
      out.write("        \n");
      out.write("        </div>\n");
      out.write("        <div id=\"bosuutap\">\n");
      out.write("<ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("   <center><hr /> <li><a href=\"#\"><strong><span style=\"color: red\">BỘ SƯU TẬP</span></strong></a></li></center></ul>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   \n");
      out.write("    <div class=\"content_2\">\n");
      out.write("     <hr />\n");
      out.write("     \n");
      out.write("    \t   <div id=\"bigPic\">\n");
      out.write("          \n");
      out.write("\t\t\t\t<img src=\"../Image/1.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/2.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/9.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/10.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/3.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/4.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/7.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/8.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/5.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("\t\t\t\t<img src=\"../Image/6.jpg\" alt=\"\" width=\"1024\" height=\"500\" />\n");
      out.write("            \n");
      out.write("\t\t\t</div>\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t\n");
      out.write("\t\t\t<ul id=\"thumbs\">\n");
      out.write("          \n");
      out.write("\t\t\t\t<li class='active' rel='1'><img src=\"../Image/1.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='2'><img src=\"../Image/2.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='3'><img src=\"../Image/9.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='4'><img src=\"../Image/10.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='5'><img src=\"../Image/3.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='6'><img src=\"../Image/4.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='7'><img src=\"../Image/7.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='8'><img src=\"../Image/8.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='9'><img src=\"../Image/5.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t\t<li rel='10'><img src=\"../Image/6.jpg\" alt=\"\" /></li>\n");
      out.write("\t\t\t</ul>\n");
      out.write("            <div class='clearfix'></div>\n");
      out.write("\t\t<div id='push'></div>\n");
      out.write("\t\t<script type=\"text/javascript\">\n");
      out.write("\tvar currentImage;\n");
      out.write("    var currentIndex = -1;\n");
      out.write("    var interval;\n");
      out.write("    function showImage(index){\n");
      out.write("        if(index < $('#bigPic img').length){\n");
      out.write("        \tvar indexImage = $('#bigPic img')[index]\n");
      out.write("            if(currentImage){   \n");
      out.write("            \tif(currentImage != indexImage ){\n");
      out.write("                    $(currentImage).css('z-index',2);\n");
      out.write("             \n");
      out.write("                    $(currentImage).fadeOut(250, function() {\n");
      out.write("\t\t\t\t\t   \n");
      out.write("\t\t\t\t\t    $(this).css({'display':'none','z-index':1})\n");
      out.write("\t\t\t\t\t});\n");
      out.write("                }\n");
      out.write("            }\n");
      out.write("            $(indexImage).css({'display':'block', 'opacity':1});\n");
      out.write("            currentImage = indexImage;\n");
      out.write("            currentIndex = index;\n");
      out.write("            $('#thumbs li').removeClass('active');\n");
      out.write("            $($('#thumbs li')[index]).addClass('active');\n");
      out.write("        }\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    function showNext(){\n");
      out.write("        var len = $('#bigPic img').length;\n");
      out.write("        var next = currentIndex < (len-1) ? currentIndex + 1 : 0;\n");
      out.write("        showImage(next);\n");
      out.write("    }\n");
      out.write("    \n");
      out.write("    var myTimer;\n");
      out.write("    \n");
      out.write("    $(document).ready(function() {\n");
      out.write("\t    \n");
      out.write("\t\tshowNext(); //loads first image\n");
      out.write("        $('#thumbs li').bind('click',function(e){\n");
      out.write("        \tvar count = $(this).attr('rel');\n");
      out.write("        \tshowImage(parseInt(count)-1);\n");
      out.write("        });\n");
      out.write("\t});\t\n");
      out.write("\t</script>\t\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("   \n");
      out.write("   <div id=\"sanpham\">\n");
      out.write("      \n");
      out.write("    </div> \n");
      out.write("    <br/>\n");
      out.write("   <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\">\n");
      out.write("  \n");
      out.write(" <p><hr />  <center> <li><a href=\"#\"><strong><span style=\"color: red\">SẢN PHẨM</span></strong></a></li></center></ul></p>\n");
      out.write("    <div class=\"content_3\"> \n");
      out.write("    <hr />\n");
      out.write("    <center>\n");
      out.write("<table width=\"1024\" border=\"1px\">\n");
      out.write("  <tr>\n");
      out.write("    <td> <ul>\n");
      out.write("          ");

                for (Product p :  productDAO.getListProductByCategory(Ma_loai)){
                
      out.write("\n");
      out.write("            <img src=\"");
      out.print(p.getHinhanh());
      out.write("\" alt=\"\"/>\n");
      out.write("            ");
      out.print(p.getMota());
      out.write("\n");
      out.write("            ");
      out.print(p.getMaloai());
      out.write("\n");
      out.write("            ");

                }
                
      out.write("\n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul>  </td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("    <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("    <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("    <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("    <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("       \n");
      out.write("   </ul></td>\n");
      out.write("    <td> <ul>\n");
      out.write("      \n");
      out.write("   </ul></td>\n");
      out.write("  </tr>\n");
      out.write("  <tr>\n");
      out.write("   <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("   <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("   <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("   <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("   <td><input type=\"submit\" name=\"dathang\"  value=\"Đặt hàng\" onclick=\" \" /></td>\n");
      out.write("   \n");
      out.write("  </tr>\n");
      out.write("   \n");
      out.write("</table></center>\n");
      out.write("\t</div>\n");
      out.write("\t</div>\n");
      out.write("\n");
      out.write("<div class=\"footer\">\n");
      out.write("\t<div class=\"footer_left\"><img src=\"../Image/lg2.jpg\" width=\"300\" height=\"155\" /></div>\n");
      out.write("    <div class=\"footer_right\">\n");
      out.write("    <div class=\"footer1_1\">\n");
      out.write("      <ul id=\"MenuBar1\" class=\"MenuBarHorizontal\"> \n");
      out.write("             <li><a href=\"#\"><center><strong>Giới thiệu</strong></center></a></li>\n");
      out.write("             \n");
      out.write("             <li><a href=\"#\"><center><strong>Trợ giúp</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Góp ý</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Điều khoản</strong></center></a></li>\n");
      out.write("             <li><a href=\"#\"><center><strong>Bản quyền</strong></center></a></li>\n");
      out.write("          </ul>\n");
      out.write("           <div class=\"footer2\">\n");
      out.write("  <table width=\"355\" border=\"0\" height=\"150\">\n");
      out.write("  <tr>\n");
      out.write("  <td> Bản quyền và phát triển bởi Công ty Đông Ri. Chịu trách nhiệm nội dung: Nhà báo, Tiến sĩ Lê Công Tân - Trưởng chi nhánh phía Nam Đà Nẵng - Phó giám đốc Công ty Đông Ri.\n");
      out.write("<p>Giấy phép số 29/GP-TTĐT do Bộ Thông tin và Truyền thông cấp ngày 11/02/2010 và giấy phép số 88/GP-TTĐT của Sở Thông tin và Truyền thông TP.Đà Nẵng cấp ngày 28/7/2015.</p>\n");
      out.write("  </td>\n");
      out.write("  </tr>\n");
      out.write("</table></div>\n");
      out.write("    <div class=\"footer3\">\n");
      out.write("  \n");
      out.write("   \n");
      out.write("  \n");
      out.write("  <table width=\"355\" border=\"0\" height=\"150\">\n");
      out.write("  <tr>\n");
      out.write("    <td>\n");
      out.write("Địa chỉ: 333 Lê Duẩn, TP.Đà Nẵng.\n");
      out.write("<p>Điện thoại: (84-8) 38251028 -  Fax: (84-8) 38251049.</p>\n");
      out.write("Quảng cáo: 0936009959 - Email: dongri.ad@gmail.com\n");
      out.write("<p>Toà soạn & hỗ trợ: (84-8)38251028Email: dongri@bongda.com</td>\n");
      out.write("  </tr>\n");
      out.write("</table></div>\n");
      out.write("    </div>\n");
      out.write("    </div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("</div>\n");
      out.write("</div>\n");
      out.write("\n");
      out.write("<script type=\"text/javascript\">\n");
      out.write("var MenuBar1 = new Spry.Widget.MenuBar(\"MenuBar1\", {imgDown:\"SpryAssets/SpryMenuBarDownHover.gif\", imgRight:\"SpryAssets/SpryMenuBarRightHover.gif\"});\n");
      out.write("</script>\n");
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

package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class home_jsp extends org.apache.jasper.runtime.HttpJspBase
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
      out.write("<!DOCTYPE html>\n");
      out.write("<html>\n");
      out.write("    <head>\n");
      out.write("        <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\">\n");
      out.write("        <title>Trang chủ</title>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://cdnjs.cloudflare.com/ajax/libs/jquery/3.1.1/jquery.min.js\"/>\n");
      out.write("        <link rel=\"stylesheet\" href=\"https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css\" integrity=\"sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T\" crossorigin=\"anonymous\">\n");
      out.write("    </head>\n");
      out.write("    <body>\n");
      out.write("        <div class=\"container\">\n");
      out.write("            <div class=\"base\">\n");
      out.write("                <div class=\"menu\">\n");
      out.write("                   <div class=\"icon\">\n");
      out.write("                      <div class=\"bar\"></div>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"icons\">\n");
      out.write("                   <i class=\"fa fa-user\" aria-hidden=\"true\"></i>\n");
      out.write("                   <i class=\"fa fa-calendar-o\" aria-hidden=\"true\"></i>\n");
      out.write("                   <i class=\"fa fa-tachometer\" aria-hidden=\"true\"></i>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"section\">\n");
      out.write("                   <div class=\"cover1\">\n");
      out.write("                      <div class=\"cover2\">\n");
      out.write("                         <a class=\"content\" href=\"#calender\"></a>\n");
      out.write("                      </div>\n");
      out.write("                   </div>\n");
      out.write("                </div>\n");
      out.write("                <a class=\"section-static top\" href=\"#profile\"></a>\n");
      out.write("                <a class=\"section-static bottom\" href=\"#dashboard\"></a>\n");
      out.write("             </div>\n");
      out.write("            <div style=\"background-image: url(https://images.freecreatives.com/wp-content/uploads/2016/03/White-Snow-Background.jpg); background-repeat: no-repeat; text-indent:10px; height: 400px\">\n");
      out.write("                <div id=\"header\">\n");
      out.write("                    <span class=\"left\"><a href=\"home.jsp\"><img src=\"http://www.hocvienact.edu.vn/images/actlogo1.png\"/></a></span>\n");
      out.write("                </div>\n");
      out.write("                <div id=\"navbar\">\n");
      out.write("                    <nav class=\"navbar navbar-expand-lg navbar-light bg-light\" style=\"border-radius: 5px; margin-left: 10px; margin-right: 10px\">\n");
      out.write("                        <a class=\"navbar-brand\" href=\"home.jsp\">ACT Techkid</a>\n");
      out.write("                        <button class=\"navbar-toggler\" type=\"button\" data-toggle=\"collapse\" data-target=\"#navbarSupportedContent\" aria-controls=\"navbarSupportedContent\" aria-expanded=\"false\" aria-label=\"Toggle navigation\">\n");
      out.write("                            <span class=\"navbar-toggler-icon\"></span>\n");
      out.write("                        </button>\n");
      out.write("\n");
      out.write("                        <div class=\"collapse navbar-collapse\" id=\"navbarSupportedContent\">\n");
      out.write("                            <ul class=\"navbar-nav mr-auto\">\n");
      out.write("                                <li class=\"nav-item active\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\">Về chúng tôi <span class=\"sr-only\">(current)</span></a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item dropdown\">\n");
      out.write("                                    <a class=\"nav-link dropdown-toggle\" href=\"#\" id=\"navbarDropdown\" role=\"button\" data-toggle=\"dropdown\" aria-haspopup=\"true\" aria-expanded=\"false\">\n");
      out.write("                                    Các khóa học\n");
      out.write("                                    </a>\n");
      out.write("                                    <div class=\"dropdown-menu\" aria-labelledby=\"navbarDropdown\">\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Action</a>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Another action</a>\n");
      out.write("                                        <div class=\"dropdown-divider\"></div>\n");
      out.write("                                        <a class=\"dropdown-item\" href=\"#\">Something else here</a>\n");
      out.write("                                    </div>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link\" href=\"#\">Học online</a>\n");
      out.write("                                </li>\n");
      out.write("                                <li class=\"nav-item\">\n");
      out.write("                                    <a class=\"nav-link disabled\" href=\"#\" tabindex=\"-1\" aria-disabled=\"true\">Thư viện</a>\n");
      out.write("                                </li>\n");
      out.write("                            </ul>\n");
      out.write("                            <form class=\"form-inline my-2 my-lg-0\">\n");
      out.write("                                <input class=\"form-control mr-sm-2\" type=\"search\" placeholder=\"Tìm kiếm\" aria-label=\"Search\">\n");
      out.write("                                <button class=\"btn btn-outline-success my-2 my-sm-0\" type=\"submit\">Tìm kiếm</button>\n");
      out.write("                            </form>\n");
      out.write("                        </div>\n");
      out.write("                    </nav>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"bd-example\" style=\"margin-top: 20px\">\n");
      out.write("                    <div id=\"carouselExampleCaptions\" class=\"carousel slide\" data-ride=\"carousel\">\n");
      out.write("                        <ol class=\"carousel-indicators\">\n");
      out.write("                            <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"0\" class=\"active\"></li>\n");
      out.write("                            <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"1\"></li>\n");
      out.write("                            <li data-target=\"#carouselExampleCaptions\" data-slide-to=\"2\"></li>\n");
      out.write("                        </ol>\n");
      out.write("                        <div class=\"carousel-inner\">\n");
      out.write("                            <div class=\"carousel-item active\">\n");
      out.write("                                <img src=\"http://www.hocvienact.edu.vn/images/slider/Java1.png\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item\">\n");
      out.write("                                <img src=\"http://www.hocvienact.edu.vn/images/slider/PHP1.png\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                            <div class=\"carousel-item\">\n");
      out.write("                                <img src=\"http://www.hocvienact.edu.vn/images/slider/KhoaArduino.png\" class=\"d-block w-100\" alt=\"\">\n");
      out.write("                            </div>\n");
      out.write("                        </div>\n");
      out.write("                        <a class=\"carousel-control-prev\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"prev\">\n");
      out.write("                            <span class=\"carousel-control-prev-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                            <span class=\"sr-only\">Previous</span>\n");
      out.write("                        </a>\n");
      out.write("                        <a class=\"carousel-control-next\" href=\"#carouselExampleCaptions\" role=\"button\" data-slide=\"next\">\n");
      out.write("                            <span class=\"carousel-control-next-icon\" aria-hidden=\"true\"></span>\n");
      out.write("                            <span class=\"sr-only\">Next</span>\n");
      out.write("                        </a>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"course-name\" style=\"margin-top: 50px\">\n");
      out.write("                <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\" style=\"background-color: white; color: black; border: none; font-size: 30px\">Các khóa học Dạy lập trình cho trẻ em tại ACT TECHKID</button>\n");
      out.write("                    <hr style=\"border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;\"/>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"row\" style=\"margin-top: 30px\">                \n");
      out.write("                <div class=\"col-sm-6\" style=\"margin-bottom: 30px\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"course-image\">\n");
      out.write("                            <img src=\"http://img.f34.dulich.vnecdn.net/2017/07/12/10-1499826046_680x0.jpg\" style=\"width: 538px; height: 200px\"/>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Lập trình bằng ngôn ngữ tự nhiên</h5>\n");
      out.write("                            <p class=\"card-text\">Phù hợp với trẻ em từ 8 tuổi trở lên.</p>\n");
      out.write("                            <p class=\"card-text\">Với xứ mệnh đưa trẻ đến gần hơn với khả năng lập trình, khóa học giúp trẻ: </p>\n");
      out.write("                            <p class=\"card-text\">Với cách thức giảng dạy mới mẻ, thân thiện, môi trường học tập đầy đủ trang thiết bị sẽ kích thích sự hứng thú và ham học hỏi ở trẻ. Tạo nền tảng lập trình ban đầu vững chắc cho các bé.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\">Chi tiết</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\" style=\"margin-bottom: 30px\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"course-image\">\n");
      out.write("                            <img src=\"http://img.f34.dulich.vnecdn.net/2017/07/12/10-1499826046_680x0.jpg\" style=\"width: 538px; height: 200px\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Lập trình C căn bản</h5>\n");
      out.write("                            <p class=\"card-text\">Phù hợp với trẻ em từ 8 tuổi trở lên.</p>\n");
      out.write("                            <p class=\"card-text\">Tiếp nối khóa học Lập trình bằng ngôn ngữ tự nhiên, khóa học này sẽ giúp trẻ thay đổi thói quen sử dụng máy tính.</p>\n");
      out.write("                            <p class=\"card-text\">Với chương trình học phù hợp với khả năng tiếp nhận theo lứa tuổi, khóa học sẽ đưa đến cho các bé các kiến thức căn bản của ngôn ngữ Lập trình C.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\">Chi tiết</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"course-image\">\n");
      out.write("                            <img src=\"http://img.f34.dulich.vnecdn.net/2017/07/12/10-1499826046_680x0.jpg\" style=\"width: 538px; height: 200px\"/>\n");
      out.write("                        </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Khóa học Giải thuật căn bản</h5>\n");
      out.write("                            <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\">Chi tiết</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("                <div class=\"col-sm-6\">\n");
      out.write("                    <div class=\"card\">\n");
      out.write("                        <div class=\"course-image\">\n");
      out.write("                            <img src=\"http://img.f35.dulich.vnecdn.net/2017/07/12/5-1499826045_680x0.jpg\" style=\"width: 538px; height: 200px\"/>\n");
      out.write("                    </div>\n");
      out.write("                        <div class=\"card-body\">\n");
      out.write("                            <h5 class=\"card-title\">Khóa học giải thuật căn bản và nâng cao</h5>\n");
      out.write("                            <p class=\"card-text\">With supporting text below as a natural lead-in to additional content.</p>\n");
      out.write("                            <a href=\"#\" class=\"btn btn-primary\">Chi tiết</a>\n");
      out.write("                        </div>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("            <div class=\"benefits\">\n");
      out.write("                <div class=\"course-name\" style=\"margin-top: 50px\">\n");
      out.write("                    <button type=\"button\" class=\"btn btn-primary btn-lg btn-block\" style=\"background-color: white; color: black; border: none; font-size: 30px\">Tại sao chọn ACT TECHKID là nơi gửi gắm các bé?</button>\n");
      out.write("                        <hr style=\"border-top: 2px solid #2a75ab; width: 120px; height: 2px; margin: 10px auto 10px;\"/>\n");
      out.write("                </div>\n");
      out.write("            </div>\n");
      out.write("        </div>\n");
      out.write("        <script>\n");
      out.write("            $(\".menu\").click(function(){\n");
      out.write("                $(this).parent().toggleClass(\"close\");\n");
      out.write("             });\n");
      out.write("\n");
      out.write("        </script>\n");
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

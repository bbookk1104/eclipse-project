/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/8.5.82
 * Generated at: 2022-09-20 04:22:15 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import kr.co.ansany.member.model.vo.Member;

public final class index_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(2);
    _jspx_dependants.put("/WEB-INF/views/common/header.jsp", Long.valueOf(1663647730070L));
    _jspx_dependants.put("/WEB-INF/views/common/footer.jsp", Long.valueOf(1663636373144L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("kr.co.ansany.member.model.vo.Member");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
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

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
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
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    final java.lang.String _jspx_method = request.getMethod();
    if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method) && !javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
      return;
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\n");
      out.write("<!DOCTYPE html>\n");
      out.write("<html lang=\"ko\">\n");
      out.write("<head>\n");
      out.write("    <meta charset=\"UTF-8\">\n");
      out.write("    <meta http-equiv=\"X-UA-Compatible\" content=\"IE=edge\">\n");
      out.write("    <meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\n");
      out.write("    <title>메인 페이지</title>\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/mainPage.css\">\n");
      out.write("    <link rel=\"stylesheet\" href=\"/css/notosans.css\">\n");
      out.write("    <script src=\"https://code.jquery.com/jquery-3.6.0.js\"></script>\n");
      out.write("</head>\n");
      out.write("<body>\n");
      out.write("	");
      out.write("\n");
      out.write("\n");
      out.write("	    ");

    	Member m = (Member)session.getAttribute("m");
    
      out.write("\n");
      out.write("<link href=\"https://fonts.googleapis.com/icon?family=Material+Icons\"\n");
      out.write("	rel=\"stylesheet\">\n");
      out.write("<!-- jquery -->\n");
      out.write("<script src=\"/js/jquery-3.6.0.js\"></script>\n");
      out.write("<!-- 기본 CSS -->\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/header.css\" />\n");
      out.write("\n");
      out.write("<div class=\"header-body\">\n");
      out.write("	<div class=\"header-fixed\">\n");
      out.write("		<div class=\"header-wrap\">\n");
      out.write("			<div class=\"header-top\">\n");
      out.write("				<div class=\"header-logo\">\n");
      out.write("					<a href=\"/index.jsp\"><img src=\"/img/logo2.png\" alt=\"\"></a>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"header-navi\">\n");
      out.write("					<ul>\n");
      out.write("						<li><a href=\"#\">제품</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"#\">헤드폰/이어폰</a></li>\n");
      out.write("								<li><a href=\"#\">스피커</a></li>\n");
      out.write("								<li><a href=\"#\">턴테이블</a></li>\n");
      out.write("								<li><a href=\"#\">워크맨</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li><a href=\"#\">커뮤니티</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"/noticeList.do?reqPage=1\">공지사항</a></li>\n");
      out.write("								<li><a href=\"#\">구매후기</a></li>\n");
      out.write("								<li><a href=\"#\">사진전</a></li>\n");
      out.write("								<li><a href=\"#\">자유게시판</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li><a href=\"#\">멤버십</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"#\">등급&혜택 안내</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li><a href=\"#\">고객 서비스</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"#\">FAQ / Q<span>&</span>A\n");
      out.write("								</a></li>\n");
      out.write("								<li><a href=\"#\"></a></li>\n");
      out.write("							</ul></li>\n");
      out.write("						<li><a href=\"#\">직영점 안내</a>\n");
      out.write("							<ul>\n");
      out.write("								<li><a href=\"/map.do\">찾아오시는길</a></li>\n");
      out.write("							</ul></li>\n");
      out.write("					</ul>\n");
      out.write("				</div>\n");
      out.write("				<div class=\"header-icon\">\n");
      out.write("					<div class=\"icon-wrap\">\n");
      out.write("						<div>\n");
      out.write("							<a href=\"/cartView.do\"> <span class=\"material-icons\">shopping_cart</span>\n");
      out.write("							</a>\n");
      out.write("						</div>\n");
      out.write("						<div>\n");
      out.write("							");

							if (m == null) {
							
      out.write("\n");
      out.write("							<a href=\"/loginFrm.do\"> <span class=\"material-icons\">person</span>\n");
      out.write("							</a>\n");
      out.write("							");

							} else {
							
      out.write("\n");
      out.write("							<a href=\"#\"> <span class=\"material-icons\"\n");
      out.write("								style=\"color: #5865f5\">person</span>\n");
      out.write("							</a>\n");
      out.write("							");

							}
							
      out.write("\n");
      out.write("						</div>\n");
      out.write("						<div>\n");
      out.write("							<a href=\"#\"> <span class=\"material-icons\">search</span>\n");
      out.write("							</a>\n");
      out.write("						</div>\n");
      out.write("					</div>\n");
      out.write("				</div>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</div>\n");
      out.write("<script src=\"/js/header.js\"></script>\n");
      out.write("\n");
      out.write("	<!-- 메인 컨텐츠 시작 -->\n");
      out.write("	 <div class=\"main-wrap\">\n");
      out.write("        <div class=\"main-top\">\n");
      out.write("            <video muted autoplay loop src=\"img/mainVideo.mp4\"></video>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-mid\">\n");
      out.write("            <h2 class=\"main-mid-title\">PRODUCT</h2>\n");
      out.write("            <ul class=\"main-mid-list\">\n");
      out.write("                <li class=\"main-mid-list-1\"><a href=\"#\">Headphone</a></li>\n");
      out.write("                <li class=\"main-mid-list-2\"><a href=\"#\">Speaker</a></li>\n");
      out.write("                <li class=\"main-mid-list-3\"><a href=\"#\">Turntable</a></li>\n");
      out.write("                <li class=\"main-mid-list-4\"><a href=\"#\">Walkman</a></li>\n");
      out.write("            </ul>\n");
      out.write("        </div>\n");
      out.write("        <div class=\"main-bot\">\n");
      out.write("            <h2 class=\"main-bot-title\">EVENT</h2>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"main-bot-1\">\n");
      out.write("                    <div class=\"main-bot-comment\">\n");
      out.write("                        <span>연휴 특강 필수템</span><br>\n");
      out.write("                        <span>IDC-TX660</span>\n");
      out.write("                        <p>강의 녹음이 필요할 땐 작고 가벼운 IDC-TX660!</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"main-bot-2\">\n");
      out.write("                    <div class=\"main-bot-comment\">\n");
      out.write("                        <span>올 가을은</span><br>\n");
      out.write("                        <span>안사니스토어와 함께</span>\n");
      out.write("                        <p>안사니스토어 당산점을 방문 하시면 다양한 혜택을 드립니다.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("            <a href=\"#\">\n");
      out.write("                <div class=\"main-bot-3\">\n");
      out.write("                    <div class=\"main-bot-comment\">\n");
      out.write("                        <span>ECM</span><br>\n");
      out.write("                        <span>가을 소리를 듣다</span>\n");
      out.write("                        <p>컴팩트 마이크를 어디에서나 사용해보세요.</p>\n");
      out.write("                    </div>\n");
      out.write("                </div>\n");
      out.write("            </a>\n");
      out.write("        </div>\n");
      out.write("    </div>\n");
      out.write("	<!-- 메인 컨텐츠 끝 -->\n");
      out.write("	");
      out.write("\n");
      out.write("<link rel=\"stylesheet\" href=\"/css/footer.css\" />\n");
      out.write("<footer>\n");
      out.write("	<div class=\"footer-content\">\n");
      out.write("		<div class=\"footer-left\">\n");
      out.write("			<div class=\"footer-link\">\n");
      out.write("				<ul>\n");
      out.write("					<li><a href=\"#\">이용약관</a></li>\n");
      out.write("					<li><a href=\"#\">개인정보처리방침</a></li>\n");
      out.write("					<li><a href=\"#\">소비자 피해 보상보험</a></li>\n");
      out.write("					<li><a href=\"#\">사이트 맵</a></li>\n");
      out.write("				</ul>\n");
      out.write("			</div>\n");
      out.write("			<p class=\"small-size\">* 본 사이트의 컨텐츠는 저작권법의 보호를 받는 바, 상업적 목적의 무단전재,\n");
      out.write("				복사, 배포 등을 금합니다.</p>\n");
      out.write("			<p class=\"small-size\">* 소비자피해보상보험 고객님은 안전거래를 위해 현금 등으로 결제 시 저희\n");
      out.write("				쇼핑몰에서 가입한 구매안전서비스를 이용하실 수 있습니다.</p>\n");
      out.write("			<p class=\"bold-size\">사업장 주소: 서울특별시 영등포구 선유동2로 57 이레빌딩 19층 A강의실</p>\n");
      out.write("			<p class=\"bold-size\">개인정보관리책임자: AnSany TEL: 안사니 고객센터 1588-4444\n");
      out.write("				EMAIL: ansany_contact@ansany.com</p>\n");
      out.write("			<p class=\"bold-size\">Copyright © An Sany Corporation. All rights\n");
      out.write("				reserved.</p>\n");
      out.write("		</div>\n");
      out.write("		<div class=\"footer-right\">\n");
      out.write("			<div class=\"followus\">FOLLOW US</div>\n");
      out.write("			<div class=\"site-logos\">\n");
      out.write("				<a href=\"https://www.facebook.com/sonykorea\" target=\"_blank\"><img\n");
      out.write("					src=\"/img/facebook.png\" class=\"logos\"></a> <a\n");
      out.write("					href=\"https://www.instagram.com/sonykorea/\" target=\"_blank\"><img\n");
      out.write("					src=\"/img/instagram.png\" class=\"logos\"></a> <a\n");
      out.write("					href=\"https://www.youtube.com/user/sonystyleblog\" target=\"_blank\"><img\n");
      out.write("					src=\"/img/youtube.png\" class=\"logos\"></a> <a\n");
      out.write("					href=\"https://stylezineblog.com/?intcmp=Main_Blog\" target=\"_blank\"><img\n");
      out.write("					src=\"/img/blog.png\" class=\"logos\"></a>\n");
      out.write("			</div>\n");
      out.write("		</div>\n");
      out.write("	</div>\n");
      out.write("</footer>");
      out.write("\n");
      out.write("</body>\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
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
}

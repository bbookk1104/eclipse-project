package kr.or.iei.controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ResponseTestServlet
 */
@WebServlet(name = "responseTest.do", urlPatterns = { "/responseTest.do" })
public class ResponseTestServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ResponseTestServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("서버응답~~~");
		//클라이언트한테 응답할 문서의 형식을 html로 지정하고
		//문자셋은 utf-8을 사용하겠다.
		response.setContentType("text/html;charset=utf-8");
		//사용자가 볼 HTML문서를 작성할 객체 생성
		PrintWriter out = response.getWriter();
		//HTML문서 작성
		out.println("<!DOCTYPE html>");
		out.println("<html><head><title>응답페이지</title></head>");
		out.println("<body>");
		out.println("<style>");
		out.println("h1{ color:red;}");
		out.println("</style>");
		out.println("<h1>서블릿 응답 페이지</h1>");
		out.println("<a href='/'>메인으로 돌아가기</a>");
		out.println("</body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

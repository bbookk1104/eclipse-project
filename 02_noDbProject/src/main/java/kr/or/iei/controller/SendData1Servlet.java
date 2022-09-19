package kr.or.iei.controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendDataServlet
 */
@WebServlet(name = "sendData1", urlPatterns = { "/sendData1.do" })
public class SendData1Servlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendData1Servlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("sendData1호출");
		//1. 요청정보 중 한글이 포함되어있을 수 있으므로 전체 인코딩
		request.setCharacterEncoding("utf-8");
		//2. 요청정보 중 전달된 데이터를 추출
		//name=부가원		&		test=abc
		//없는 이름을 요청하면 null리턴
		String data1 = request.getParameter("name");
		String data2 = request.getParameter("test");
		System.out.println(data1);
		System.out.println(data2);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

package http.method;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * HTTP GET / POST ��û�� ����� ó���� �� �ִ� ���� Ŭ����
 */
@WebServlet("/getPost")
public class GetPostServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * HTTP GET ��û�� ó���ϴ� Ŭ���� 
	 */
	protected void doGet(HttpServletRequest request
			           , HttpServletResponse response) 
			        		  throws ServletException, IOException {

		// 1. ���信 ���� �ѱ�ó��
		response.setContentType("text/html;charset=utf-8");
		
		// 2. ���� ����ó�� 
		PrintWriter out = response.getWriter();
  		out.println("<h2>doGet �޼ҵ尡 �����Ͽ����ϴ�.</h2>");
  		
  		out.close();
		
	}

	/**
	 * HTTP POST ��û�� ó���ϴ� Ŭ����
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// 1. ���信 ���� �ѱ�ó��
		response.setContentType("text/html;charset=utf-8");
		
		// 2. ���� ����ó�� 
		PrintWriter out = response.getWriter();
  		out.println("<h2>doPost �޼ҵ尡 �����Ͽ����ϴ�.</h2>");
  		
  		out.close();
	}

}

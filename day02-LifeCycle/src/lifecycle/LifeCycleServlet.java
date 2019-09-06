package lifecycle;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * ������ �����ֱ�(LifeCycle)�� �����ϴ� �� ���� �޼ҵ�
 * init(), service(), destroy() �� ����غ��� 
 * ���� Ŭ����
 */
@WebServlet("/lifecycle")
public class LifeCycleServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	// init(), service() �޼ҵ��� �۵� Ȯ���� ���� 
	// �۵� Ƚ���� ������ ��� ����
	private int count;
	
	/**
	 * �� ������ ���ʷ� ȣ��Ǿ��� ��
	 * �� �����̳�(��Ĺ)�� ���� �� �ѹ� ȣ��Ǹ�
	 * ������ �ʱ�ȭ�� ����ϴ� �޼ҵ�
	 */
	@Override
	public void init(ServletConfig config) 
			         throws ServletException {
		 count = 0;
		 System.out.println("init() �޼ҵ尡 ����Ǿ����ϴ�.");
	}

	/**
	 * �� ������ ���񽺷κ��� ������ ��(unload)�� ��
	 * (������ ����� ��)
	 * �� �����̳�(��Ĺ)�� ���� �� �ѹ� ȣ��Ǹ�
	 * ���� ���񽺸� �����ϴ� �޼ҵ�
	 */
	public void destroy() {
		System.out.println("destroy() �޼ҵ尡 ����Ǿ����ϴ�.");
	}

	/**
	 * Ŭ���̾�Ʈ�� ��û(request)�� ���� ó���ϴ� ������ ����Ŭ �޼ҵ�
	 * �� ��û�� ���ؼ� ����(response)�� ó���Ѵ�.
	 * �� �޼ҵ��� �Է� �Ķ������ request, response ��ü��
	 * �� �����̳�(��Ĺ)�� ���� �����Ͽ� �Ѱ��ִ� ������� �۵�
	 */
	protected void service(HttpServletRequest request
			             , HttpServletResponse response) 
			           throws ServletException, IOException {
		response.setContentType("text/html;charset=utf-8");
		
		// ȭ��(������)�� HTML �ڵ带 ����ϱ� ���ؼ�
		// ��°�ü(out)�� ���䰴ü(response)�� ���� ��.
		PrintWriter out = response.getWriter();
		
		// System.out.println() �� �����ϰ� ����ϱ� ���ؼ� 
		// out �� PrintWriter Ÿ������ ��
		out.println("<html>");
			out.println("<head><title>Hello ����</title></head>");
			out.println("<body>");
				out.println("<h2>�ȳ��ϼ���, Servlet!" + ++count + "</h2>");
			out.println("</body>");
		out.println("</html>");
		
		out.close();
		// ������� �������� ���
		
		// ����� ���� �ܼ�â ���
		System.out.println("service() �޼ҵ尡 ����Ǿ����ϴ�.");
		System.out.println("service �޼ҵ� ���� Ƚ�� " + count);
		
	}

}

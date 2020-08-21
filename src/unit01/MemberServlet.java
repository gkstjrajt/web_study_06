package unit01;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/MemberServlet")
public class MemberServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		processRequest(request, response);
	}

	private void processRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		request.setCharacterEncoding("UTF-8");
//		String name = request.getParameter("name");
//		String userId = request.getParameter("userId");
//		String nickName = request.getParameter("nickName");
//		String pwd = request.getParameter("pwd");
//		String email = request.getParameter("email");
//		String phone = request.getParameter("phone");
//		
//		request.setAttribute("name", name);
//		request.setAttribute("userId", userId);
//		request.setAttribute("nickName", nickName);
//		request.setAttribute("pwd", pwd);
//		request.setAttribute("email", email);
//		request.setAttribute("phone", phone);
//		
//		RequestDispatcher dispatcher = request.getRequestDispatcher("03_result.jsp");
//		dispatcher.forward(request, response);
		
		request.getRequestDispatcher("03_resultServlet.jsp").forward(request, response);
		
	}
}

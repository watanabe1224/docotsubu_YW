package servlet;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.LoginLogic;
import model.User;

/**
 * Servlet implementation class Login
 */
@WebServlet("/Login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("aaaa");
		RequestDispatcher d =
				request.getRequestDispatcher("/login.jsp");
		d.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");

		int id1 = Integer.parseInt(id);
		int pw1 = Integer.parseInt(pw);

		User loginUser = new User(id1 ,pw1);

		// ログイン処理
		LoginLogic ll = new LoginLogic();
		boolean result = ll.execute(loginUser);
		if(result) {
			HttpSession session = request.getSession();
			session.setAttribute("loginUser", loginUser);
		}
		System.out.println("aaa");

			RequestDispatcher d = request.getRequestDispatcher("/loginResult.jsp");
			d.forward(request, response);
	}

}

package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

public class RegisterA extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private UserServece userServece = UserServece.getUserServece();
	
    public RegisterA() {
        super();
    }
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
        String password = request.getParameter("password");
        String email = request.getParameter("email");

        userServece.saveUser(new User(firstName, lastName, email, password));
        HttpSession session = request.getSession(true);
        session.setAttribute("userEmail", email);
        session.setAttribute("userFirstname", firstName);
        
      request.getRequestDispatcher("cabinet.jsp").forward(request, response);
	
	}

}

import java.beans.Statement;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.main.constants.ProjectConstants;

/**
 * Servlet implementation class Ex
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
		
		
		
		
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
			Class.forName("com.mysql.jdbc.Driver");
		 // loads driver
		Connection c = (Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dms", "root", "root"); // gets a new connection
 
		PreparedStatement ps = (PreparedStatement) c.prepareStatement("select * from login_master where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
 
		ResultSet rs = ps.executeQuery();
		
		if(rs.next()) {
			Integer id = rs.getInt("id");
			String user_type = rs.getString("user_type");
			HttpSession session=request.getSession();  
	        session.setAttribute("id", id);
	        
	        if(user_type.equalsIgnoreCase(ProjectConstants.ADMIN)) {
	        	response.sendRedirect("index.jsp");
	        }
	        else if(user_type.equalsIgnoreCase(ProjectConstants.TESTER)) {
	        	response.sendRedirect("tester.jsp");
	        }
	        else if(user_type.equalsIgnoreCase(ProjectConstants.DEVELOPER)) {
	        	response.sendRedirect("developer.jsp");
	        }
		}
		else {
			response.sendRedirect("unauthorised.jsp");
		}

		} catch (Exception e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
		
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}
	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
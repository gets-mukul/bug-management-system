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
		
		
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		// Connect to mysql and verify username password
		String email=request.getParameter("email");
		String password=request.getParameter("password");
		try {
			
			Class.forName("com.mysql.jdbc.Driver");
		 
		Connection c = DriverManager.getConnection("jdbc:mysql://localhost:3306/dms", "root", "root"); // gets a new connection
		
		java.sql.Statement stmt=c.createStatement();
		String sql="select name from dms.login_master where email = ' " +email+ " ' and password = ' "+password+ " '";
		System.out.println(sql);
		ResultSet rs= stmt.executeQuery(sql);
		while(rs.first()) {
		String name = rs.getString("name");
		System.out.println(name);
		}
		
	/*	
	 * where email = ' " +email+ " ' and password = ' "+password+ " '
	 * 
		PreparedStatement ps = c.prepareStatement("select email,password from login_master where email=? and password=?");
		ps.setString(1, email);
		ps.setString(2, password);
 */
		//ResultSet rs = ps.executeQuery();
		System.out.println(rs);
		if(rs.next()) {
			/*String user_type = rs.getString("user_type");
			System.out.println(user_type);
			if(user_type==ProjectConstants.TESTER)
				response.sendRedirect("register.jsp");
			
			else if(user_type==ProjectConstants.DEVELOPER)
				response.sendRedirect("developer.jsp");
			
			else if(user_type==ProjectConstants.ADMIN)
				response.sendRedirect("index.jsp");*/
			
		}
		
		 HttpSession session=request.getSession();  
	        session.setAttribute("id",request.getParameter("id"));  
	        String id = request.getParameter("id");
	        System.out.println(id);
		}
		
		 catch (Exception e) {
			// TODO Auto-generated catch block
			((Throwable) e).printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}

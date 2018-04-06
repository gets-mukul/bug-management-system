

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class FetchDefect
 */
@WebServlet("/FetchDefect")
public class FetchDefect extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public FetchDefect() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		try
		{
		Class.forName("com.mysql.jdbc.Driver");
		Connection c=(Connection) DriverManager.getConnection("jdbc:mysql://localhost:3306/dms","root","root");
		Statement statement = (Statement) c.createStatement();
        ResultSet rs =statement.executeQuery("select * from defect_info"); 
        RequestDispatcher rd= null;
        if(rs.next()){
     	   
     	   request.setAttribute("defectList", rs);   	  
     	
     	   
     	   rd=request.getRequestDispatcher("/index.jsp");
     	   rd.forward(request, response);
     	   
        }   
       /* else{
     	   
     	   request.setAttribute("defectList", rs);
     	   
     	   rd=request.getRequestDispatcher("/index.jsp");
     	   rd.forward(request, response);  	   
        }*/
		}catch(Exception e) {
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

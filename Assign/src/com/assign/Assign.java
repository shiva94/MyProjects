package com.assign;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Assign
 */
@WebServlet("/Assign")
public class Assign extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Assign() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
	
	
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter pw= response.getWriter();
		try
		{
			Class.forName("oracle.jdbc.driver.OracleDriver"); //Registering JDBC driver
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:orcl", "scott", "tiger"); //Opening connection
			Statement st= con.createStatement();
			String sql="select * from student where name="+request.getParameter("value");
			ResultSet rs= st.executeQuery(sql);
			
			while(rs.next())
			{
				pw.print("<ol>"
						+"<li>"+rs.getString(1)+"</li>"
						+ "<li>"+rs.getInt(2)+"<li>"
						+ "<li>"+rs.getString(3)+"<li>"
						+ "<li>"+rs.getInt(4)+"<li>"
						);
			}
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
	
	
	}



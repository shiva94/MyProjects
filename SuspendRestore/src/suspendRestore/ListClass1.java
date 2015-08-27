package suspendRestore;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ListClass1
 */
@WebServlet("/ListClass1")
public class ListClass1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Connection connection;
		Statement statement;
		ResultSet result;
		List<CustomerBean> services = new ArrayList<CustomerBean>();
		//CustomerBean[] cust = new CustomerBean[10];
		CustomerBean cu;
		CustomerBean cust;
		int i = 0;
		try
		{
		double id=Double.parseDouble(request.getParameter("custid"));
		Class.forName("oracle.jdbc.OracleDriver");
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		connection=DriverManager.getConnection(url,"scott","tiger");
		if(connection.toString() != null){System.out.println("conn created");}
		statement=connection.createStatement();
		String st = "select s.serviceid,sd.servicename,s.status from services s,servicedesc sd where s.customerid="+id+" and s.serviceid=sd.serviceid";
		result=statement.executeQuery(st);
		System.out.println(result.getFetchSize());
		while(result.next())
		{
			cust = new CustomerBean();
			cust.setServiceID(result.getDouble(1));
			
			cust.setService(result.getString(2));
			cust.setStatus(result.getString(3));
			services.add(cust);
			
		}
		}
		catch(ClassNotFoundException | SQLException e)
		{
			System.out.println(e);
		}
		Iterator<CustomerBean> itr=services.iterator();
		PrintWriter pw= response.getWriter();
		while(itr.hasNext())
		{
			cu=itr.next();
			pw.println(cu.getService());
			pw.println(cu.getServiceID());
			pw.println(cu.getStatus());
		}
	}

}

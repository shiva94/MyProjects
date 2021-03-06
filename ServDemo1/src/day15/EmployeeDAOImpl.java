package day15;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class EmployeeDAOImpl implements EmployeeDAO {
	private Connection con;
	private PreparedStatement pst;
	private ResultSet rs;
	private Statement st;
	
	@Override
	public void getDBConnection() {
		// TODO Auto-generated method stub
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			con=DriverManager.getConnection(url,"scott","tiger");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}
		
	}

	@Override
	public void closeDBConnection() {
		try
		{
			con.close();
		}	
		catch(SQLException e){
				e.printStackTrace();
			}
		
		
	}

	@Override
	public void addEmployee(Employee employee) {
		// TODO Auto-generated method stub
		getDBConnection();
		String query="insert into employee values(?,?,?)";
			try{
			pst=con.prepareStatement(query);
			pst.setInt(1,employee.getEmpcode());
			pst.setString(2,employee.getEmpname());
			pst.setDouble(3,employee.getSalary());
			pst.executeUpdate();
		}
		catch(SQLException e)
		{
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
	}

	@Override
	public List<Employee> getEmployees() {
		// TODO Auto-generated method stub
		getDBConnection();
		Employee emp;
		List<Employee> empls = new ArrayList<Employee>();
		try
		{
			pst=con.prepareStatement("select * from employee");
			rs=pst.executeQuery();
			while(rs.next())
			{
				emp= new Employee();
				emp.setEmpcode(rs.getInt("empcode"));
				//emp.setEmpcode(rs.getInt(1));
				emp.setEmpname(rs.getString("empname"));
				emp.setSalary(rs.getDouble(3));
				empls.add(emp);
			}
		}
		catch(SQLException e){
			e.printStackTrace();
		}
		finally{
			closeDBConnection();
		}
		return empls;
	}

	@Override
	public void update(Employee employee) {
		getDBConnection();
		try {
			st=con.createStatement();
		 
	//	String query="update employee set empname='" +employee.getEmpname()+"'" +"where empcode=" +employee.getEmpcode();
			String query="delete from employee where empcode= "+employee.getEmpcode();
			st.executeQuery(query);
			// TODO Auto-generated catch block	
		}
		catch(SQLException e1){
			e1.printStackTrace();
		}
		finally
		{
			closeDBConnection();
		}
	}
	}



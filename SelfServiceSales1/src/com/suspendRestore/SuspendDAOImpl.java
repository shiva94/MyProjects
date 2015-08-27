package com.suspendRestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.RequestDispatcher;

public class SuspendDAOImpl implements SuspendDAO {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void getDBConnection() {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			connection=DriverManager.getConnection(url,"scott","tiger");
		}catch(ClassNotFoundException | SQLException e){
			e.printStackTrace();
		}	
	}
	@Override
	public void closeDBConnection() {
		try {
			connection.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}	
	}
	@Override
	public List<SuspendBean> getServices(int customerID) {
		getDBConnection();
		System.out.println("connection established");
		System.out.println(customerID);
		SuspendBean bean;
		List<SuspendBean> suspendls= new ArrayList<SuspendBean>(customerID);
		try {
			statement=connection.prepareStatement("select * from services where is_suspended like 'n'");
			statement=connection.prepareStatement(" select s.serviceid,sd.servicename from services s,servicedesc sd where s.customerid=1000 and s.serviceid=sd.serviceid");
			result=statement.executeQuery();
			while(result.next()){
				bean=new SuspendBean();
				//bean.setCustomerID(result.getInt("customerID"));
				//bean.setOrderID(result.getInt("orderID"));
				bean.setStatus(result.getString("is_suspended"));
				bean.setService(result.getString("services"));
				
				suspendls.add(bean);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		/*finally{
			closeDBConnection();
		}*/
		System.out.println("connection closed");
		return suspendls;
	}
}

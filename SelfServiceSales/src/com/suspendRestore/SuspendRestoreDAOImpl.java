package com.suspendRestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class SuspendRestoreDAOImpl implements SuspendRestoreDAO {
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet result;
	@Override
	public void getDBConnection() {
		try{
			Class.forName("oracle.jdbc.OracleDriver");
			String url="jdbc:oracle:thin:@localhost:1521:orcl";
			connection=DriverManager.getConnection(url,"scott","tiger");
		}
		catch(ClassNotFoundException | SQLException e){
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
	public List<SuspendBean> suspend() {
		getDBConnection();
		String query="select * from services where isSuspended like 'n'";
		SuspendBean suspend;
		List<SuspendBean> bean= new ArrayList<SuspendBean>();
		try {
			statement=connection.prepareStatement(query);
			result=statement.executeQuery();
			while(result.next()){
				suspend = new SuspendBean();
				suspend.setServices(result.getString("services"));
				suspend.setStatus(result.getString("isSuspended"));
				bean.add(suspend);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return bean;	
	}
}

package suspendRestore;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.apache.catalina.connector.Request;

public class ListClass {

	public static void main(String[] args) {
		Connection connection;
		PreparedStatement statement;
		ResultSet result;
		List<CustomerBean> services = new ArrayList<CustomerBean>();
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String url="jdbc:oracle:thin:@localhost:1521:orcl";
		try {
			connection=DriverManager.getConnection(url,"scott","tiger");
			
			//statement= connection.prepareStatement("select s.serviceid,sd.servicename from services s,servicedesc sd where s.customerid"=+ and s.serviceid=sd.serviceid");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

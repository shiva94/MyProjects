package com.suspendRestore;

import java.util.List;

public interface SuspendDAO {
	public void getDBConnection();
	public void closeDBConnection();
	List<SuspendBean> getServices(int customerID);
}

package com.suspendRestore;

import java.util.List;

public interface SuspendRestoreDAO {
	public void getDBConnection();
	public void closeDBConnection();
	List<SuspendBean> suspend();
}

package com.cts.demo.singleton;

import java.sql.SQLException;

public class EmployeeMain {

	public static void main(String[] args) throws SQLException {
		EmployeeDB employeeDB=new EmployeeDB();
		employeeDB.readEmployeeData();

	}

}

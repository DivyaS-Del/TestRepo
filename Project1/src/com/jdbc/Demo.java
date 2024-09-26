package com.jdbc;

import java.sql.Connection;
import java.sql.Driver;

public class Demo {

	Driver driver=com.mysql.jdbc.Driver();
	DriverManager.registerDriver(driver);
	
	Connection conn=DriverManager.getConnection(jdbc:mysql://localhost1;3306,"root","root");
}

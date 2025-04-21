package com.daoconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection{
	public static Connection getConnection()
	{
		Connection con=null;

		try {
		Class.forName("org.postgresql.Driver");
		con= DriverManager.getConnection("jdbc:postgresql://localhost/anil","postgres","7032018987A@anil");
	}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return con;
	}
}


package com.jdbc;

import java.sql.*;

import com.daoconnection.DBConnection;

public class Demo1 {

	public static void main(String[] args) {
		try {
			
	Connection con=	DBConnection.getConnection();	
		
Statement st=con.createStatement();
ResultSet rs=st.executeQuery("select * from employee");
while(rs.next())
{
	System.out.println(rs.getInt(1)+" "+rs.getString(2));
}

	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}
}

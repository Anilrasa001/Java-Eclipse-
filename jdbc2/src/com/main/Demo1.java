package com.main;
import com.connection.*;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Demo1 {
	public static Void main(String[] args)
	
	{
		try {
		Connection con=DBconnection.getConnection();
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery("select * from Employee_info");
		while(rs.next())
		{
			System.out.println(rs.getInt(1)+" "+rs.getString(2));
			
		}
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
		return null;
		
	}
	

}

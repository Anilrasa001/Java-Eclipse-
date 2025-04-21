package com.bookutil.BookUtil;
import java.beans.Statement;
import java.sql.Connection;
import java.sql.ResultSet;

import com.dao.dblayer.DBConnection;

public class BookUtil {
	public static void main(String[] args) {
		try {
			
	Connection con=	DBConnection.getConnection();	
		
Statement st=(Statement) con.createStatement();
ResultSet rs=((java.sql.Statement) st).executeQuery("select * from BookStore");
while(rs.next())
{
	System.out.println(rs.getInt(1)+" "+rs.getString(2)+" "+rs.getString(3)+" "+rs.getString(4)+" "+rs.getFloat(5));
}

	}
		catch(Exception e)
		{
			System.out.println(e);
		}

}

}

package ramesh9705;

import java.sql.*;

public class RameshDummy
{
	public static void main(String[] args)
	{
		Connection con =null;
		Statement stmt = null;
		String s1="insert into ra,.student valuers(1, 'Rams',970)";
		try {
			Class.forName("com.mysql.jdbc.Driver");
			con=DriverManager.getConnection(s1)
			
		} catch (ClassNotFoundException|SQLException e) {
			// TODO: handle exception
		}
	}
}

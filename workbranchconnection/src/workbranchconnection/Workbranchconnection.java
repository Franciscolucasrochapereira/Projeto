package workbranchconnection;

import java.sql.Connection;
import java.sql.DriverManager;

public class Workbranchconnection {

	public static void main(String[] args) {
		
		Connection con = null;
		try {
			
			con = (Connection)DriverManeger.getConnection("jdbc:mysql://localhost:3306/sqlconnection", "root", "Flrp@2023");
			
			if(con!=null)
			{
				System.out.println("database is connected");
			}
		}catch (Exception e) {
			System.out.println("not connected");
		}
		
	}
}

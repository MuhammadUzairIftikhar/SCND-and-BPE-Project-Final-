package main;
import java.sql.*;
public class Category {

	public CategoryObject[] getAllCategories() {
		CategoryObject[] catInfo = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system","root","");
			Statement stmt=con.createStatement();
			String query= "select * from category";
			
			ResultSet rs=stmt.executeQuery(query);
			
			rs.last();
			int no_of_rows = rs.getRow();
			rs.beforeFirst();
			
			catInfo= new CategoryObject[no_of_rows];

			int i = 0;
			
			while(rs.next())
			{
				catInfo[i] = new CategoryObject();
				
				catInfo[i].categoryID= rs.getInt(1);
				catInfo[i].categoryName=rs.getString(2);
				
				i++;
			}
			
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return catInfo;
	}

}

package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class supplier {

	public SupplierObject getsupplier(int id) {
		SupplierObject suppinfo=null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system","root","");
			Statement stmt=con.createStatement();
			String query= "select * from supplier where supplier.SupplierID = \"" + id + "\";";
			ResultSet rs=stmt.executeQuery(query);

			suppinfo= new SupplierObject();
			rs.next();
			suppinfo.SupplierID = rs.getInt(1);
			suppinfo.SupplierName= rs.getString(2);
			suppinfo.SupplierAddress= rs.getString(3);
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return suppinfo;
	}

}
package main;
import java.sql.*;
public class Payment {

	public Paymentobject[] getAllPayment() {
		Paymentobject[] payInfo = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system","root","");
			Statement stmt=con.createStatement();
			String query= "select * from payment";
			
			ResultSet rs=stmt.executeQuery(query);
			
			rs.last();
			int no_of_rows = rs.getRow();
			rs.beforeFirst();
			
			payInfo= new Paymentobject[no_of_rows];

			int i = 0;
			
			while(rs.next())
			{
				payInfo[i] = new Paymentobject();
				
				payInfo[i].PaymentID= rs.getInt(1);
				payInfo[i].customerID=rs.getInt(2);
				payInfo[i].PaymentMethod=rs.getString(3);
				
				i++;
			}
			
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return payInfo;
	}

}

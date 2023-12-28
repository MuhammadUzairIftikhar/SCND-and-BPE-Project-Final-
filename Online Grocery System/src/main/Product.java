package main;
import java.sql.*;
public class Product {

	public ProductObject[] getAllProduct() {
		ProductObject[] prodInfo = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system","root","");
			Statement stmt=con.createStatement();
			String query= "select * from product";
			
			ResultSet rs=stmt.executeQuery(query);
			
			rs.last();
			int no_of_rows = rs.getRow();
			rs.beforeFirst();
			
			prodInfo= new ProductObject[no_of_rows];

			int i = 0;
			
			while(rs.next())
			{
				prodInfo[i] = new ProductObject();
				
				prodInfo[i].productID= rs.getInt(1);
				prodInfo[i].productName=rs.getString(2);
				prodInfo[i].productPrice=rs.getDouble(3);
				prodInfo[i].productModel=rs.getString(4);
				prodInfo[i].customerID=rs.getInt(5);
				
				i++;
			}
			
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return prodInfo;
	}

	 public boolean checkProductAvailability(String productName) {
	        boolean isAvailable = false;
	        try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
	            String query = "SELECT * FROM product WHERE productName = ?";
	            PreparedStatement stmt = con.prepareStatement(query);
	            stmt.setString(1, productName);

	            ResultSet rs = stmt.executeQuery();

	            if (rs.next()) {
	                isAvailable = true;
	            }

	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	        return isAvailable;
	    }
	 
	 
}

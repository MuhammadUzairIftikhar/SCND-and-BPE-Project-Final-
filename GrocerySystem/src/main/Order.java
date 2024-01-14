package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.Random;
import java.sql.PreparedStatement;

public class Order {

	public OrderObject getOrder(int id) {
		OrderObject orderinfo = null;
		try {
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root",
					"");
			Statement stmt = con.createStatement();
			String query = "SELECT * FROM `order` WHERE ORDER.orderID = " + id;
			ResultSet rs = stmt.executeQuery(query);

			orderinfo = new OrderObject();
			rs.next();
			orderinfo.OrderID = rs.getInt(1);
			orderinfo.ProductName = rs.getString(2);
			orderinfo.Quantity = rs.getInt(3);
			con.close();
		} catch (Exception e) {
			System.out.println(e);
		}
		return orderinfo;
	}

	public int generateOrderId() {
		Random random = new Random();
		return random.nextInt(100000);
	}

	public void createOrder(OrderObject order) {
		  int orderId = generateOrderId();
	
		  try {
	            Class.forName("com.mysql.jdbc.Driver");
	            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
	            String query = "INSERT INTO `order` (orderId, productName, quantity, discountID) VALUES (?, ?, ?, ?)";
	            PreparedStatement stmt = con.prepareStatement(query);
	            stmt.setInt(1, orderId);
	            stmt.setString(2, order.ProductName);
	            stmt.setInt(3, order.Quantity);
	            stmt.setInt(4, order.discountID);
	            stmt.executeUpdate();
	            con.close();
	        } catch (Exception e) {
	            System.out.println(e);
	        }
	
}
	
	
}
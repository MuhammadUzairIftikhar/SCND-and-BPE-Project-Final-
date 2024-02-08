package main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Discount {
	public static String getDiscount(String d_name,String percentage) {
		try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
            String query = "INSERT INTO `discount` (Name, PercentDiscount) VALUES (?, ?)";
            PreparedStatement stmt = con.prepareStatement(query);
            stmt.setString(1, d_name);
            stmt.setString(2, percentage);
            stmt.executeUpdate();
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
		return " ";
	}
}

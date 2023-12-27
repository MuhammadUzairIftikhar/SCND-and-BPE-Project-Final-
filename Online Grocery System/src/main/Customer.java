package main;
import java.sql.*;
public class Customer {

	public CustomerObject[] getAllCustomers() {
		CustomerObject[] cusInfo = null;
		try{
			Class.forName("com.mysql.jdbc.Driver");
			Connection con =
			DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system","root","");
			Statement stmt=con.createStatement();
			String query= "select * from customer";
			
			ResultSet rs=stmt.executeQuery(query);
			
			rs.last();
			int no_of_rows = rs.getRow();
			rs.beforeFirst();
			
			cusInfo= new CustomerObject[no_of_rows];

			int i = 0;
			
			while(rs.next())
			{
				cusInfo[i] = new CustomerObject();
				
				cusInfo[i].CustomerID= rs.getInt(1);
				cusInfo[i].cuspassword=rs.getString(2);
				cusInfo[i].CustomerName=rs.getString(3);
				cusInfo[i].CustomerAddress=rs.getString(4);
				
				i++;
			}
			
			con.close();
			} catch(Exception e)
			{
			System.out.println(e);
			}
		return cusInfo;
	}
	
	public void signUp(String customerName, String customerAddress, String cuspassword) {
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
	        
	        connection.setAutoCommit(false);

	        int customerId = generateUniqueCustomerId(connection);

	        String query = "INSERT INTO customer (CustomerID, CustomerName, CustomerAddress, cuspassword) VALUES (?, ?, ?, ?)";
	        PreparedStatement preparedStatement = connection.prepareStatement(query);

	        preparedStatement.setInt(1, customerId);
	        preparedStatement.setString(2, customerName);
	        preparedStatement.setString(3, customerAddress);
	        preparedStatement.setString(4, cuspassword);

	        System.out.println("Generated Query: " + preparedStatement.toString()); // Print the generated query for debugging

	        int rowsAffected = preparedStatement.executeUpdate();

	        if (rowsAffected > 0) {
	            connection.commit();
	            System.out.println("Data saved successfully.");
	        } else {
	            connection.rollback();
	            System.out.println("Failed to save data.");
	        }

	        preparedStatement.close();
	        connection.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	}
	   
	private int generateUniqueCustomerId(Connection connection) throws SQLException {
	        String query = "SELECT MAX(CustomerID) FROM customer";
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        ResultSet resultSet = preparedStatement.executeQuery();

	        int maxCustomerId = 0;
	        if (resultSet.next()) {
	            maxCustomerId = resultSet.getInt(1);
	        }

	        return maxCustomerId + 1;
	 }
	
	public boolean signIn(String customerName, String cuspassword) {
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");

	        String query = "SELECT * FROM customer WHERE CustomerName = ? AND cuspassword = ?";
	        PreparedStatement preparedStatement = connection.prepareStatement(query);
	        preparedStatement.setString(1, customerName);
	        preparedStatement.setString(2, cuspassword);

	        ResultSet resultSet = preparedStatement.executeQuery();

	        if (resultSet.next()) {
	            connection.close();
	            return true;
	        }

	        connection.close();
	    } catch (Exception e) {
	        e.printStackTrace();
	    }
	    
	    return false;
	}
	
	
	}


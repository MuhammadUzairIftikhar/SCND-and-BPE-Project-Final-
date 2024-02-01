package main;
import java.sql.*;
public class TrackingDetails {

	public static int TrackingNo;
	public static int courierNo;
	
	public static String getTracking(int TrackingNo) {
			
			try{
				Class.forName("com.mysql.jdbc.Driver");
				Connection con =
				DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system","root","");
				Statement stmt=con.createStatement();
				ResultSet rs=stmt.executeQuery("select * from trackingdetails where trackingdetails.TrackingNo = '"+TrackingNo+"'");
				
				
				rs.next();
				TrackingNo = rs.getInt(1);
				courierNo = rs.getInt(2);
				
				con.close(); 
				} catch(Exception e)
				{
				System.out.println(e);
				}
			return" ";
			}
		
	
	public void createTrackingDetails(int TrackingNo,int courierNo) {
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
	        String query = "INSERT INTO `trackingdetails` (TrackingNo,courierNo) VALUES (?, ?)";
	        PreparedStatement stmt = con.prepareStatement(query);
	        stmt.setInt(1, TrackingNo);
	        stmt.setInt(2, courierNo);
	        stmt.executeUpdate();
	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}
	public static int getTrackingno() {
		return TrackingNo;
	}
	public static int courierNo() {
		return courierNo;
	}
}

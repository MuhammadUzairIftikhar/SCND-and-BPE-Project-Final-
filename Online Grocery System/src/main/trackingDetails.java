package main;
import java.sql.*;
public class trackingDetails {

	public TrackingDetailsObject[] getAllTrackingDetails() {
	    TrackingDetailsObject[] tracInfo = null;
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
	        Statement stmt = con.createStatement();

	        // Get the maximum tracking number from the database
	        String getMaxTrackingNoQuery = "SELECT MAX(TrackingNo) FROM trackingdetails";
	        ResultSet maxTrackingNoRS = stmt.executeQuery(getMaxTrackingNoQuery);
	        int maxTrackingNo = 0;
	        if (maxTrackingNoRS.next()) {
	            maxTrackingNo = maxTrackingNoRS.getInt(1);
	        }
	        int newTrackingNo = maxTrackingNo + 1;

	        // Get the maximum courier number from the database
	        String getMaxCourierNoQuery = "SELECT MAX(courierNo) FROM trackingdetails";
	        ResultSet maxCourierNoRS = stmt.executeQuery(getMaxCourierNoQuery);
	        int maxCourierNo = 0;
	        if (maxCourierNoRS.next()) {
	            maxCourierNo = maxCourierNoRS.getInt(1);
	        }
	        int newCourierNo = maxCourierNo + 1;

	        String query = "SELECT * FROM trackingdetails";
	        ResultSet rs = stmt.executeQuery(query);

	        rs.last();
	        int no_of_rows = rs.getRow();
	        rs.beforeFirst();

	        tracInfo = new TrackingDetailsObject[no_of_rows];

	        int i = 0;

	        while (rs.next()) {
	            tracInfo[i] = new TrackingDetailsObject();

	            tracInfo[i].TrackingNo = newTrackingNo;
	            tracInfo[i].courierNo = newCourierNo;

	            i++;
	            newTrackingNo++;
	            newCourierNo++;
	        }

	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	    return tracInfo;
	}
	
	public void createTrackingDetails(TrackingDetailsObject order) {
	    try {
	        Class.forName("com.mysql.jdbc.Driver");
	        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/online grocery system", "root", "");
	        String query = "INSERT INTO `trackingdetails` (TrackingNo,courierNo) VALUES (?, ?)";
	        PreparedStatement stmt = con.prepareStatement(query);
	        stmt.setInt(1, order.TrackingNo);
	        stmt.setInt(2, order.courierNo);
	        stmt.executeUpdate();
	        con.close();
	    } catch (Exception e) {
	        System.out.println(e);
	    }
	}
}

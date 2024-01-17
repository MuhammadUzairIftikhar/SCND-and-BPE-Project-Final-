<%@ page import="main.*" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
    // Create an instance of the TrackingDetails web service
    TrackingDetails trackingService = new TrackingDetailsProxy().getTrackingDetails();

    // Check if the form is submitted
    if (request.getMethod().equalsIgnoreCase("post")) {
        // Retrieve user input
        int trackingNo = Integer.parseInt(request.getParameter("trackingNo"));
        int courierNo = Integer.parseInt(request.getParameter("courierNo"));

        // Create new tracking details
        TrackingDetailsObject newTrackingDetails = new TrackingDetailsObject();
        
        newTrackingDetails.setTrackingNo(trackingNo);
        newTrackingDetails.setCourierNo(courierNo);

        trackingService.createTrackingDetails(newTrackingDetails);
    }
    // Get all tracking details
    TrackingDetailsObject[] trackingDetailsArray = trackingService.getAllTrackingDetails();

 %>
    
<table border="1">
    <tr>
        <th>TrackingNo</th>
        <th>CourierNo</th>
    </tr>
    <% for (TrackingDetailsObject trackingDetails : trackingDetailsArray) { %>
        <tr>
            <td><%= trackingDetails.getTrackingNo() %></td>
            <td><%= trackingDetails.getCourierNo() %></td>
        </tr>
    <% } %>
</table>
</body>
</html>
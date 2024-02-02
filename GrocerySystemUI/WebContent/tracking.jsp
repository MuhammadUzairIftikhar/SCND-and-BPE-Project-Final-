<%@ page import="main.*" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tracking Details</title>
</head>
<body>
<h1>Tracking Details</h1>
<%
    // Create an instance of the TrackingDetails web service
    TrackingDetails trackingService = new TrackingDetailsProxy().getTrackingDetails();
    

    // Get all tracking details
    TrackingDetailsObject[] trackingDetailsArray = trackingService.getAllTrackingDetails();
%>



<!-- Form to create new tracking details -->
<form action="Tracking_req.jsp" method="post">
    <label for="trackingNo">Tracking No:</label>
    <input type="text" name="trackingNo" id="trackingNo" required/><br>

    <label for="courierNo">Courier No:</label>
    <input type="text" name="courierNo" id="courierNo" required/><br>

    <button type="submit">Create Tracking Details</button>
</form>


</body>
</html>

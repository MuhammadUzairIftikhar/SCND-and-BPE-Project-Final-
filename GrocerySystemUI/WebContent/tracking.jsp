<%@page import="main.*"%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Tracking Details</title>
</head>
<body>

<%
    // Check if the create form is submitted
    if (request.getMethod().equalsIgnoreCase("post") && request.getParameter("createSubmit") != null) {
        // Retrieve user input for creating tracking details
        int createTrackingNo = Integer.parseInt(request.getParameter("createTrackingNo"));
        int createCourierNo = Integer.parseInt(request.getParameter("createCourierNo"));

        // Create tracking details
        TrackingDetails trackingService = new TrackingDetailsProxy().getTrackingDetails();
        trackingService.createTrackingDetails(createTrackingNo, createCourierNo);
    }

    // Check if the search form is submitted
    if (request.getMethod().equalsIgnoreCase("post") && request.getParameter("searchSubmit") != null) {
        // Retrieve user input for searching tracking details
        int searchTrackingNo = Integer.parseInt(request.getParameter("searchTrackingNo"));
        TrackingDetails trackingService = new TrackingDetailsProxy().getTrackingDetails();
        trackingService.getTracking(searchTrackingNo);
        
%>
        <h2>Search Results for Tracking No: <%= searchTrackingNo %></h2>
        <table border="1">
            <tr>
                <th>Tracking No</th>
                <th>Courier No</th>
            </tr>
            <tr>
                <td><%= searchTrackingNo %></td>
                <td><%= trackingService.courierNo() %></td>
            </tr>
        </table>
<%
    }
%>

<h1>Create Tracking Details</h1>

<!-- Form to create tracking details -->
<form action="tracking.jsp" method="post">
    <label for="createTrackingNo">Enter Tracking No:</label>
    <input type="text" name="createTrackingNo" id="createTrackingNo" required/><br>

    <label for="createCourierNo">Enter Courier No:</label>
    <input type="text" name="createCourierNo" id="createCourierNo" required/><br>

    <button type="submit" name="createSubmit">Create Tracking Details</button>
</form>

<h1>Search Tracking Details</h1>

<!-- Form to search tracking details -->
<form action="tracking.jsp" method="post">
    <label for="searchTrackingNo">Enter Tracking No to Search:</label>
    <input type="text" name="searchTrackingNo" id="searchTrackingNo" required/><br>

    <button type="submit" name="searchSubmit">Search Tracking Details</button>
</form>

</body>
</html>

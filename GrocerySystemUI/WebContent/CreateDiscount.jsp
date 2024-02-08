<%@page import="main.DiscountProxy"%>
<%@page import="main.Discount"%>
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
    // Check if the form is submitted
    if (request.getMethod().equalsIgnoreCase("post")) {
        // Retrieve user input
        String d_name = request.getParameter("DiscountName");
        String percentage = request.getParameter("discountperc");
        // Create an instance of the Order web service
        Discount DiscountService = new DiscountProxy().getDiscount();

        // Create a new order
        

        DiscountService.getDiscount(d_name, percentage);

        // Display success message
%>
        <h2>Discount Created Successfully!</h2>
<%
    }
%>

</body>
</html>
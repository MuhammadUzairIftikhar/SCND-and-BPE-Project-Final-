<%@ page import="main.*, main.*" %>
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
        String productName = request.getParameter("productName");
        int quantity = Integer.parseInt(request.getParameter("quantity"));
        int discountID = Integer.parseInt(request.getParameter("discountID"));

        // Create an instance of the Order web service
        Order orderService = new OrderProxy().getOrder();

        // Create a new order
        
        OrderObject newOrder = new OrderObject();
        newOrder.setProductName(productName);
        newOrder.setQuantity(quantity);
        newOrder.setDiscountID(discountID);

        orderService.createOrder(newOrder);

        // Display success message
%>
        <h2>Order Created Successfully!</h2>
<%
    }
%>
</body>
</html>
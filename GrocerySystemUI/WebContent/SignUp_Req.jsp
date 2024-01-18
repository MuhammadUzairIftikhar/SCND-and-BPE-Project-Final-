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
        String CustomerName = request.getParameter("CustomerName");
        String customerAddress = request.getParameter("CustomerAddress");
        String cuspassword = request.getParameter("cuspassword");
       
        // Create an instance of the Order web service
        Customer CustomerService = new CustomerProxy().getCustomer();
        CustomerService.signUp(CustomerName, customerAddress, cuspassword);

        // Display success message
    }
%>
<h1>You are registered Successfully</h1>
</body>
</html>
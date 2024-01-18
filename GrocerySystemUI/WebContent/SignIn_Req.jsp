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
<h1>
<%
    // Check if the form is submitted
    if (request.getMethod().equalsIgnoreCase("post")) {
        // Retrieve user input
        String CustomerName = request.getParameter("CustomerName");
        String cuspassword = request.getParameter("cuspassword");
       
        // Create an instance of the Order web service
        Customer CustomerService = new CustomerProxy().getCustomer();
        boolean output = CustomerService.signIn(CustomerName, cuspassword);
if(output==true){
	out.println("You Have Logged in Successfully");
	
}
else {
	out.println("Log In Failed");
}

        // Display success message

    }
%></h1>
</body>
</html>
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
<form action="ProductAvailiblity.jsp" method="post">
    <label for="productName">productName:</label>
    <input type="text" name="productName" id="productName" required/><br>

    <button type="submit">Check</button>
    <h1>
<%
    // Check if the form is submitted
    if (request.getMethod().equalsIgnoreCase("post")) {
        // Retrieve user input
        String productName = request.getParameter("productName");
       
        // Create an instance of the Order web service
        Product ProductService = new ProductProxy().getProduct();
        boolean output = ProductService.checkProductAvailability(productName);
if(output==true){
	out.println("Product is availible");
	
}
else {
	out.println("Product is not availible");
}

        // Display success message

    }
%></h1>
</form>
</body>
</html>
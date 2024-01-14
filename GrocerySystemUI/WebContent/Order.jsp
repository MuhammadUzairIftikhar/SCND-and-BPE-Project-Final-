
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Create Order</h1>
<form action="createOrder.jsp" method="post">
    <label for="productName">Product Name:</label>
    <input type="text" name="productName" id="productName" required/><br>

    <label for="quantity">Quantity:</label>
    <input type="text" name="quantity" id="quantity" required/><br>

    <label for="discountID">Discount ID:</label>
    <input type="text" name="discountID" id="discountID" required/><br>

    <button type="submit">Create Order</button>
</form>

</body>
</html>
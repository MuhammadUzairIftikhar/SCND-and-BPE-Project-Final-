<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create Discount</h1>
<form action="CreateDiscount.jsp" method="post">
    <label for="DiscountName">Discount Name:</label>
    <input type="text" name="DiscountName" id="DiscountName" required/><br>

    <label for="discountperc">Discount percentage:</label>
    <input type="text" name="discountperc" id="discountperc" required/><br>

    <button type="submit">Create Discount</button>
</form>
</body>
</html>
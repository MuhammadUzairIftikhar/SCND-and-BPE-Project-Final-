<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Sign In</h1>
<form action="SignIn_Req.jsp" method="post">
    <label for="productName">User:</label>
    <input type="text" name="CustomerName" id="CustomerName" required/><br>


    <label for="discountID">Password:</label>
    <input type="text" name="cuspassword" id="cuspassword" required/><br>

    <button type="submit">Sign In</button>
</form>

</body>
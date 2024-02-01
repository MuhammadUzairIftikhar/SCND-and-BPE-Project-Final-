<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<h1>Sign Up</h1>
<form action="SignUp_Req.jsp" method="post">
    <label for="CustomerName">CustomerName:</label>
    <input type="text" name="CustomerName" id="CustomerName" required/><br>

    <label for="cuspassword">Customer password:</label>
    <input type="text" name="cuspassword" id="cuspassword" required/><br>

    <label for="CustomerAddress">CustomerAddress:</label>
    <input type="text" name="CustomerAddress" id="CustomerAddress" required/><br>

    <button type="submit">Sign Up</button>
</form>

</body>
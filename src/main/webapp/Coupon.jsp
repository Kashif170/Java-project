<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>Create coupon</h1>
<form action="coupons" method="post">
<pre>
Coupon code:<input type="text" name="coupon_code"/>
Discount:<input type="text" name="Discount"/>
ExpDate:<input type="text" name="ExpDate"/>
<input type="hidden" name="action" value="create"/>
<input type="submit" value="save"/>
</pre>
</form>
</body>
</html>
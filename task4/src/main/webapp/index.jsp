
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>

<form action="registration" method="post">
    
    <label for="firstName">First name :</label><input name="firstName">
    <br>
    <label for="lastName">Last name :</label><input name="lastName">
    <br>
    <label for="email"> Email :</label><input name="email">
    <br>
    <label for="password"> Password :</label><input name="password">

    <input type="submit" value="submit">
</form>


<jsp:include page="footer.jsp"></jsp:include>


</body>
</html>
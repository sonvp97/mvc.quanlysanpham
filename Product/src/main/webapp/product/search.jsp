<%--
  Created by IntelliJ IDEA.
  User: ASUS TUF GAMING
  Date: 11/30/2022
  Time: 10:11 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Search Name</title>
</head>
<body>
<h1>Search By Name</h1>
<p><a href="/product">Back to Product</a></p>

<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Describe</td>
        <td>Producer</td>
        <td>Quantity</td>
    </tr>
    <c:forEach items='${requestScope["searchProduct"]}' var="prod">
        <tr>
            <td>${prod.getId()}</td>
            <td><a href="/product?action=view&id=${prod.getId()}">${prod.getName()}</a></td>
            <td>${prod.getPrice()}</td>
            <td>${prod.getDescribe()}</td>
            <td>${prod.getProducer()}</td>
            <td>${prod.getQuantity()}</td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

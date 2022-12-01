<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: ASUS TUF GAMING
  Date: 11/29/2022
  Time: 2:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Product</h1>
<form method="post" action="/product?action=search">
    <input type="text" name="search">
    <input type="submit" value="Search">
</form>
<table border="1">
    <tr>
        <td>Id</td>
        <td>Name</td>
        <td>Price</td>
        <td>Describe</td>
        <td>Producer</td>
        <td>Quantity</td>
    </tr>
    <c:forEach items='${requestScope["products"]}' var="prod">
        <tr>
            <td>${prod.getId()}</td>
            <td><a href="/product?action=view&id=${prod.getId()}">${prod.getName()}</a></td>
            <td>${prod.getPrice()}</td>
            <td>${prod.getDescribe()}</td>
            <td>${prod.getProducer()}</td>
            <td>${prod.getQuantity()}</td>
            <td><a href="/product?action=edit&id=${prod.getId()}">Edit</a></td>
            <td><a href="/product?action=delete&id=${prod.getId()}">Delete</a></td>
        </tr>
    </c:forEach>
</table>
</body>
</html>

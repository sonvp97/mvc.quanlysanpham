<%--
  Created by IntelliJ IDEA.
  User: ASUS TUF GAMING
  Date: 11/30/2022
  Time: 8:30 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View Product</title>
</head>
<body>
<p><a href="/product">Back to Product</a></p>
<table border="1">
    <tr>
        <td>Name</td>
        <td>Price</td>
        <td>=Describe</td>
        <td>Producer</td>
        <td>Quantity</td>

    </tr>
    <tr>
        <td><input type="text" value="${requestScope["product"].getName()}"></td>
       <td><input type="text" value="${requestScope["product"].getPrice()}"></td>
        <td><input type="text" value="${requestScope["product"].getDescribe()}"></td>
        <td><input type="text" value="${requestScope["product"].getProducer()}"></td>
       <td> <input type="text" value="${requestScope["product"].getQuantity()}"></td>
    </tr>
</table>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: ASUS TUF GAMING
  Date: 11/30/2022
  Time: 9:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete Product</title>
</head>
<body>
<form method="post">
    <fieldset>
        <legend>
            Edit Product
        </legend>
        <table>
            <tr>
                <td>Id</td><td><input type="number" name="name" value="${requestScope["product"].getId()}" disabled></td>
            </tr>
            <tr>
                <td>Name</td><td><input type="text" name="name" value="${requestScope["product"].getName()}"disabled></td>
            </tr>
            <tr>
                <td>Price</td><td><input type="number" name="price" value="${requestScope["product"].getPrice()}"disabled></td>
            </tr>
            <tr>
                <td>Describe</td><td><input type="text" name="describe" value="${requestScope["product"].getDescribe()}"disabled></td>
            </tr>
            <tr>
                <td>Producer</td><td><input type="text" name="producer" value="${requestScope["product"].getProducer()}"disabled></td>
            </tr>
            <tr>
                <td>Quantity</td><td><input type="number" name="quantity" value="${requestScope["product"].getQuantity()}"disabled></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Delete Product"></td>
            </tr>
        </table>
    </fieldset>
</form>

</form>
</body>
</html>

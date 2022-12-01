<%--
  Created by IntelliJ IDEA.
  User: ASUS TUF GAMING
  Date: 11/29/2022
  Time: 3:55 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create new customer</title>
</head>
<body>
<h1>Create new product</h1>
<p>
    <c:if test='${requestScope["message"] != null}'>
    <span class="message">${requestScope["message"]}</span>
</c:if>
</p>
<p>
    <a href="/product"> Back to product list</a>
</p>
<form method="post">
    <fieldset>
        <legend>
            Product information
        </legend>
        <table>
            <tr>
                <td>Id</td>
                <td><input type="number" name="id" id="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" id="name"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td>
                    <input type="number" name="price" id="price">
                </td>
            </tr>
            <tr>
                <td>Describe</td>
                <td><input type="text" name="describe" id="describe"></td>
            </tr>
            <tr>
                <td>Producer</td>
                <td><input type="text" name="producer" id="producer"></td>
            </tr>
            <tr>
                <td>Quantity</td>
                <td><input type="text" name="quantity" id="quantity"></td>
            </tr>
            <tr>
                <td></td>
                <td><input type="submit" value="Create product"></td>
            </tr>

        </table>
    </fieldset>
</form>
</body>
</html>

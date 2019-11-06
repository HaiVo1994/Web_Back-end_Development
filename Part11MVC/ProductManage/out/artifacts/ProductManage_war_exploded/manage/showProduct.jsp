<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 05/11/2019
  Time: 16:15
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Product</title>
</head>
<body>
    <h4><a href="?doing=create">Create Product</a></h4>
    <h4>
        <form method="get" action="product">
            <label>
                <input type="text" name="nameToSearch">
                <input type="text" name="doing" value="find" hidden>
            </label>
            <input type="submit" value="Search">
        </form>
    </h4>
    <table>
        <tr>
            <td>Name</td>
            <td>Price</td>
            <td>Depiction</td>
            <td>Producer</td>
            <td>Update</td>
            <td>Delete</td>
            <td>View</td>
        </tr>
        <c:forEach items='${requestScope["productArray"]}' var="product">
            <tr>
                <td>${product.getName()}</td>
                <td>${product.getPrice()}</td>
                <td>${product.getDepiction()}</td>
                <td>${product.getProducer()}</td>
                <td><a href="?doing=update&id=${product.getId()}">Update</a></td>
                <td><a href="?doing=delete&id=${product.getId()}">Delete</a></td>
                <td><a href="?doing=view&id=${product.getId()}">View</a></td>
            </tr>
        </c:forEach>
    </table>
</body>
</html>

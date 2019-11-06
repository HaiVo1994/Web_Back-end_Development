<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 06/11/2019
  Time: 10:20
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Update</title>
</head>
<body>
    <form method="post">
        <table>
            <tr>
                <td>Id</td>
                <td>${requestScope['productUpdate'].getId()}</td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name" value="${requestScope['productUpdate'].getName()}"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" name="price" value="${requestScope['productUpdate'].getPrice()}"></td>
            </tr>
            <tr>
                <td>Depiction</td>
                <td><input type="text" name="depiction" value="${requestScope['productUpdate'].getDepiction()}"></td>
            </tr>
            <tr>
                <td>Producer</td>
                <td><input type="text" name="producer" value="${requestScope['productUpdate'].getProducer()}"></td>
            </tr>
        </table>
        <input type="submit" value="Update">
    </form>
</body>
</html>

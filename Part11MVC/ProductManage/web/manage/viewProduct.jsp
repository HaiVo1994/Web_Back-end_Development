<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 06/11/2019
  Time: 11:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>View</title>
</head>
<body>
    <table>
        <tr>
            <td>Id</td>
            <td>${requestScope['productFound'].getId()}</td>
        </tr>
        <tr>
            <td>Name</td>
            <td>${requestScope['productFound'].getName()}</td>
        </tr>
        <tr>
            <td>Price</td>
            <td>${requestScope['productFound'].getPrice()}</td>
        </tr>
        <tr>
            <td>Depiction</td>
            <td>${requestScope['productFound'].getDepiction()}</td>
        </tr>
        <tr>
            <td>Producer</td>
            <td>${requestScope['productFound'].getProducer()}</td>
        </tr>
    </table>
    <a href="product">Return</a>
</body>
</html>

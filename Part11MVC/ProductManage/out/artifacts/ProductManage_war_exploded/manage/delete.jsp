<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 06/11/2019
  Time: 11:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Delete</title>
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
                <td>${requestScope['productUpdate'].getName()}</td>
            </tr>
            <tr>
                <td>Price</td>
                <td>${requestScope['productUpdate'].getPrice()}</td>
            </tr>
            <tr>
                <td>Depiction</td>
                <td>${requestScope['productUpdate'].getDepiction()}</td>
            </tr>
            <tr>
                <td>Producer</td>
                <td>${requestScope['productUpdate'].getProducer()}</td>
            </tr>
        </table>
        <p>Do you want to delete this product?</p>
        <input type="submit" value="Delete"> <a href="product">Cancel</a>
    </form>
</body>
</html>

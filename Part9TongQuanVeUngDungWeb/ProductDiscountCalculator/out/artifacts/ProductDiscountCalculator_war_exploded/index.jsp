<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 01/11/2019
  Time: 14:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Calculator</title>
  </head>
  <body>
  <form method="post" action="discount">
    Product Description
    <input type="text" name="productDescription"><br>
    List Price
    <input type="number" name="listPrice"><br>
    Discount Percent
    <input type="number" name="discountPercent"><br>
    <input type="submit" value="Calculate Discount">
  </form>
  </body>
</html>

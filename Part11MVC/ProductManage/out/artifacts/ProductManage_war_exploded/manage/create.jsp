<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 05/11/2019
  Time: 20:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Create</title>
</head>
<body>
    <form method="post">
        <table>
            <tr>
                <td>Id</td>
                <td><input type="number" name="id"></td>
            </tr>
            <tr>
                <td>Name</td>
                <td><input type="text" name="name"></td>
            </tr>
            <tr>
                <td>Price</td>
                <td><input type="number" name="price"></td>
            </tr>
            <tr>
                <td>Depiction</td>
                <td><input type="text" name="depiction"></td>
            </tr>
            <tr>
                <td>Producer</td>
                <td><input type="text" name="producer"></td>
            </tr>
        </table>
        <input type="submit" value="Create">
    </form>
</body>
</html>

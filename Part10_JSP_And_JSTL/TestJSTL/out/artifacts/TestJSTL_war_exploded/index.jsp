<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 04/11/2019
  Time: 13:42
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title></title>
  </head>
 <body>
        <table>
            <tr>
                <th>Name</th>
                <th>Birthday</th>
                <th>Address</th>
                <th>img</th>
            </tr>
            <tr>
                <td>
                    <c:out value="${'Vo Phi Hai'}" />
                </td>
                <td>
                    <c:out value="${'22-09-1994'}"/>
                </td>
                <td>
                    <c:out value="${'Hue'}" />
                </td>
                <td>
                    <c:set var="img1"
                           value="https://thuthuatnhanh.com/wp-content/uploads/2018/07/hinh-nen-anime-dep-de-thuong-cute-585x390.jpg" />
                    <img src="${img1}" >
                </td>
            </tr>
        </table>
  </body>
</html>

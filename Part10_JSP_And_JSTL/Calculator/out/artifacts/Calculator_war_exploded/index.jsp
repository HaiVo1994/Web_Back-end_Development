<%--
  Created by IntelliJ IDEA.
  User: haivo1994
  Date: 04/11/2019
  Time: 15:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Calculator</title>
  </head>
  <body>
    <h1>Simple Calculator</h1>
    <div>
      Calculator
      <form method="post" action="calculator">
        <div>
          <div>
            First Operand: <input type="number" name="firstOperand">
          </div>
          <div>
            Operator:
            <select name="operator">
              <option value="1">+</option>
              <option value="2">-</option>
              <option value="3">x</option>
              <option value="4">/</option>
            </select>
          </div>
          <div>
            Second Operand: <input type="number" name="secondOperand">
          </div>
          <div>
            <input type="submit" value="Result">
          </div>
        </div>
      </form>
    </div>
  </body>
</html>

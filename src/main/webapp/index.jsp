<%--
  Created by IntelliJ IDEA.
  User: SON NGUYEN
  Date: 10/24/2018
  Time: 3:50 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Bank Deposit</title>
  </head>
  <body>
  <form method="post" action="/total">
      <table>
          <tr>
              <td><label>Số lượng tiền cho vay: </label></td>
              <td><input type="text" name="chovay"/></td>
          </tr>
          <tr>
              <td><label>Tỉ lệ lãi suất theo tháng(%): </label></td>
              <td><input type="text" name="tilai"/></td>
          </tr>
          <tr>
              <td><label>Số tháng cho vay: </label></td>
              <td><input type="text" name="sothang"/></td>
          </tr>
          <tr>
              <td><input type="submit" name="calculate" value="calculate"/></td>
          </tr>
      </table>
  </form>
  </body>
</html>

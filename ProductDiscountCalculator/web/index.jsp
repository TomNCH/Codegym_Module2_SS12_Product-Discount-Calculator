<%--
  Created by IntelliJ IDEA.
  User: HieuNC
  Date: 9/12/2019
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Discount Calculator</title>
  </head>
  <body>
    <form method="post" action="/display-discount">
      <table>
        <tr>
          <td><label>Product Description : </label></td>
          <td><input type="text" name="ProductDescription" placeholder="Product Description"></td>
        </tr>
        <tr>
          <td><label>List Price : </label></td>
          <td><input type="number" name="ListPrice" placeholder="List Price"></td>
        </tr>
        <tr>
          <td><label>Discount Percent : </label></td>
          <td><input type="number" name="DiscountPercent" placeholder="Discount Percent"></td>
        </tr>
      </table>
      <input type = "submit" id = "submit" value = "Calculator Discount"/>
    </form>
  </body>
</html>

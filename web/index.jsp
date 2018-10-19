<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 10/19/2018
  Time: 9:22 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>Product Discount Account</title>
  </head>
  <body>
  <form action="calculator" method="post">
    <div class="login">
      <h2>Discount percent</h2>
      <textarea name="description" rows="5" placeholder="Product Description"></textarea>
      <br>
      <input type="number" name="price" size="30" placeholder="Price product"/>
      <br>
      <input type="number" name="discount" size="30" placeholder="Discount percent"/>
      <br>
      <input type="submit" value="Calculator"/>
    </div>
  </form>
  </body>
</html>

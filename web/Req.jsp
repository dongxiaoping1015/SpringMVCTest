<%--
  Created by IntelliJ IDEA.
  User: dong
  Date: 2018/10/30
  Time: 6:40 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <script src="https://apps.bdimg.com/libs/jquery/2.1.4/jquery.min.js">
    </script>
    <script>
       function Go() {
           $.ajax({
               url:"/test/register.do?name=zhang&age=12"

           });
       }
    </script>
    <title>注册</title>
</head>
<body>
<form action="/test/register.do">
    <input type="text" name="age">
    <input type="text" name="birthday">
    <input type="submit" value="go">
</form>
   <%--<input type="button" onclick="Go()" value="Go" />--%>
</body>
</html>

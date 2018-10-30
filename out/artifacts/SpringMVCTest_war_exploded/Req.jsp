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
               url:"my.do",
               success:function(result){
                   $(result).each(function (t) {
                       alert(result[t].name + " " + result[t].age);
                   });
           }});
       }
    </script>
    <title>注册</title>
</head>
<body>
   <input type="button" onclick="Go()" value="Go" />
</body>
</html>

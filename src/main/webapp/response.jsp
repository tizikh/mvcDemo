<%--
  Created by IntelliJ IDEA.
  User: pc
  Date: 2019/4/9
  Time: 19:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>Title</title>


    <script src="js/jquery.min.js"></script>



</head>
<body>
    <a href="/spring/user/testResponse">testResponse</a>

    <a href="/spring/user/testModelAndView">testModelAndView</a>

    <a href="/spring/user/testForwardOrRedirect">testForwardOrRedirect</a>
    <br>
    <%--用户登陆功能,异步ajax请求,响应json数据--%>
    <input id="btn" type="button" value="点击异步获取数据">
    <script>
        $(function () {
            $("#btn").click(function () {
                //发送异步请求
                $.ajax({
                    url:"user/textAjax",
                    data:'{"username":"Afu","password":"123456"}',
                    type:"POST",
                    contentType:"application/json;charset=utf-8",
                    dataType:"json",
                    success:function (data) {
                        alert(data)
                    }
                });
            });
        });
    </script>


</body>
</html>

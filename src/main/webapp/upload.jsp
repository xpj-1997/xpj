<%--
  Created by IntelliJ IDEA.
  User: Lenovo
  Date: 2021/5/24
  Time: 下午 2:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Upload</title>
</head>
<body text="fuchsia" style="text-align: center">
    <form action="${pageContext.request.contextPath}/file/upload" method="post" enctype="multipart/form-data">
        <input type="file" name="upload"><br/>
        <input type="submit" value="上传">
    </form>
</body>
</html>

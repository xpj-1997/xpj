<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false" %>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../css/style.css">
    <style>
        form {
            width: 270px;
        }

        input {
            width: 70%;
            background: #eee;
        }

        input:focus {
            background: #fff;
        }

        form {
            padding: 0 12px 12px;
        }

        label {
            display: block;
            padding-bottom: 12px;
        }

        .label-text {
            width: 30%;
            float: left;
        }
    </style>
</head>
<body>
<div id="wrap">
    <div id="header">
        <div style="float: right;padding-top: 24px">2009/11/20</div>
        <h1>旅游信息管理系统</h1>
    </div>
    <div id="header-bar"></div>
    <div id="content" style="height: 360px">
        <img src="../img/timg.jpg" style="float: right;height: 320px">
        <h2>修改省份</h2>
        <form action="provincelist.jsp" method="post">
            <label>
                <div class="label-text">省&emsp;份：</div>
                <input type="text" name="pname" value="北京市">
            </label>
            <label>
                <div class="label-text">标&emsp;签：</div>
                <input type="text" name="ptag" value="首都、天安门">
            </label>
            <button type="submit">提 交</button>&emsp;
            <a href="provincelist.jsp">返回</a>
        </form>
    </div>
    <div id="footer">
        ABC@126.com
    </div>
</div>
</body>
</html>
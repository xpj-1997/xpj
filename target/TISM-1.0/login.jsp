<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="${pageContext.request.contextPath}/css/style.css">
    <style>
        form{
            width:270px;
        }
        input{
            width: 70%;
            background: #eee;
        }
        input:focus{
            background: #fff;
        }
        form{
            padding: 0 12px 12px;
        }
        label{
            display: block;
            padding-bottom:12px;
        }
        #img-vcode{
            width: 56px;
            height: 21px;
            float:right;
            position: relative;
            top:2px;
            left:-6px
        }
        .label-text{
            width: 30%;
            float: left;
        }
    </style>
</head>
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.0.0.min.js"></script>
<body>
    <div id="wrap">
        <div id="header">
            <div style="float: right;padding-top: 24px">2009/11/20</div>
            <h1>旅游信息管理系统</h1>
        </div>
        <div id="header-bar"></div>
        <div id="content" style="height: 360px">
            <img src="${pageContext.request.contextPath}/img/timg.jpg" style="float: right;height: 320px">
            <h2>登录</h2>
            <form action="${pageContext.request.contextPath}/user/login" method="post">
                <label>
                    <div class="label-text">账&nbsp;&nbsp;号:</div>
                    <input type="text" name="account">
                </label>
                <label>
                    <div class="label-text">密&nbsp;&nbsp;码:</div>
                    <input type="password" name="password">
                </label>
                <label>
                    <div class="label-text">验证码:</div>
                    <input type="text" name="code" style="width: 70px ;float: left">
                </label>
                <img src="${pageContext.request.contextPath}/user/code" id="img-code"/>
                <br/>
                <button type="submit">提 交</button>&emsp;
                <a href="${pageContext.request.contextPath}/reg.jsp">去注册</a>
            </form>
        </div>
        <div id="footer">
            ABC@126.com
        </div>
    </div>
</body>
</html>
<script type="text/javascript">
    $("#img-code").click(function () {
        $(this).attr("src","${pageContext.request.contextPath}/user/code?"+Math.random());
    });
</script>
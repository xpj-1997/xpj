<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../css/style.css">
    <style>
        table{
            width: 100%;
            margin-bottom: 15px;
            border-collapse: collapse;
            table-layout: fixed;
        }
        th,td{
            border: 1px solid #CBD6DE;
            padding-left: 10px;
            line-height: 28px;
        }
        th{
            text-align: left;
            background: linear-gradient(#edf2f5,#dce9f2,#edf2f5);
            color:#467aa7;
        }
        tbody tr:nth-child(even){
            background: #f2f2f2;
        }
        #pages{
            text-align: center;
            padding-top: 8px;
        }
        .page{
            min-width: 50px;
            display: inline-block;
        }
    </style>
</head>
<body>
<div id="wrap">
    <div id="header">
        <div style="float: right;padding-top: 24px">
            2009/11/20&emsp;
            <a href="../login.jsp" style="color:#fff;float: right">安全退出</a>
        </div>
        <h1>旅游信息管理系统</h1>
    </div>
    <div id="header-bar"></div>
    <div id="content" style="height: 360px">
        <h2>省份列表</h2>
        <table>
            <thead>
            <tr>
                <th width="15%">ID</th>
                <th width="20%">省份</th>
                <th width="25%">标签</th>
                <th width="15%">景点个数</th>
                <th width="25%">操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td>1</td>
                <td>北京市</td>
                <td>首都、天安门</td>
                <td>20</td>
                <td>
                    <a href="#">删除省份</a>
                    <a href="../viewspot/viewspotlist.jsp">景点列表</a>
                    <a href="updateprovince.jsp">修改省份</a>
                </td>
            </tr>
            <tr>
                <td>2</td>
                <td>山东省</td>
                <td>啤酒节、风筝节</td>
                <td>8</td>
                <td>
                    <a href="#">删除省份</a>
                    <a href="../viewspot/viewspotlist.jsp">景点列表</a>
                    <a href="updateprovince.jsp">修改省份</a>
                </td>
            </tr>
            <tr>
                <td>3</td>
                <td>河南省</td>
                <td>唐三彩、少林寺</td>
                <td>5</td>
                <td>
                    <a href="#">删除省份</a>
                    <a href="../viewspot/viewspotlist.jsp">景点列表</a>
                    <a href="updateprovince.jsp">修改省份</a>
                </td>
            </tr>
            <tr>
                <td>4</td>
                <td>辽宁省</td>
                <td>二人转、小品</td>
                <td>10</td>
                <td>
                    <a href="#">删除省份</a>
                    <a href="../viewspot/viewspotlist.jsp">景点列表</a>
                    <a href="updateprovince.jsp">修改省份</a>
                </td>
            </tr>
            <tr>
                <td>5</td>
                <td>广西壮族自治区</td>
                <td>桂林山水、少数名族聚居地</td>
                <td>10</td>
                <td>
                    <a href="#">删除省份</a>
                    <a href="../viewspot/viewspotlist.jsp">景点列表</a>
                    <a href="updateprovince.jsp">修改省份</a>
                </td>
            </tr>
            </tbody>
        </table>
        <a href="addprovince.jsp">
            <button type="button">添加省份</button>
        </a>
        <div id="pages">
            <a href="#" class="page">&lt;上一页</a>
            <a href="#" class="page">1</a>
            <a href="#" class="page">2</a>
            <a href="#" class="page">3</a>
            <a href="#" class="page">4</a>
            <a href="#" class="page">5</a>
            <a href="#" class="page">下一页&gt;</a>
        </div>
    </div>
    <div id="footer">
        ABC@126.com
    </div>
</div>
</body>
</html>
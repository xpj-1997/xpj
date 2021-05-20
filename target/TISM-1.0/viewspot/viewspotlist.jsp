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
        tbody tr:nth-child(4n),tbody tr:nth-child(4n-1){
            background: #f2f2f2;
        }
        #pages{
            text-align: center;
            padding: 8px 0;
        }
        .page{
            min-width: 50px;
            display: inline-block;
        }
        .viewspotimg{
            width: 135px;
            height: 135px;
            margin-left: -10px;
            display: block;
            object-fit: cover;
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
    <div id="content">
        <h2>景点列表</h2>
        <table>
            <thead>
            <tr>
                <th width="14%">ID</th>
                <th width="20%">景点</th>
                <th width="12%">印象图</th>
                <th width="16%">旺季时间</th>
                <th width="10%">旺季门票</th>
                <th width="10%">淡季门票</th>
                <th width="18%">操作</th>
            </tr>
            </thead>
            <tbody>
            <tr>
                <td rowspan="2">1</td>
                <td rowspan="2">天安门</td>
                <td><img src="../img/tianam.jpg" class="viewspotimg"></td>
                <td>——</td>
                <td>——</td>
                <td>——</td>
                <td style="text-align: center">
                    <a href="#">删除景点</a><br>
                    <a href="updateviewspot.jsp">修改景点</a>
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <div style="height: 56px;font-size: 14px;line-height: normal">
                        <b style="color:#467aa7">简介：</b>天安门，坐落在中华人民共和国首都北京市的中心、故宫的南端，与天安门广场以及人民英雄纪念碑、毛主席纪念堂、人民大会堂、中国国家博物馆隔长安街相望，占地面积4800平方米，以杰出的建筑艺术和特殊的政治地位为世人所瞩目。
                    </div>
                </td>
            </tr>
            <tr>
                <td rowspan="2">2</td>
                <td rowspan="2">故宫</td>
                <td><img src="../img/gug.jpg" class="viewspotimg"></td>
                <td>——</td>
                <td>￥60</td>
                <td>￥60</td>
                <td style="text-align: center">
                    <a href="#">删除景点</a><br>
                    <a href="updateviewspot.jsp">修改景点</a>
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <div style="height: 56px;font-size: 14px;line-height: normal">
                        <b style="color:#467aa7">简介：</b>北京故宫是中国明清两代的皇家宫殿，旧称紫禁城，位于北京中轴线的中心，是中国古代宫廷建筑之精华。北京故宫以三大殿为中心，占地面积72万平方米，建筑面积约15万平方米，有大小宫殿七十多座，房屋九千余间。是世界上现存规模最大、保存最为完整的木质结构古建筑之一。
                    </div>
                </td>
            </tr>
            <tr>
                <td rowspan="2">3</td>
                <td rowspan="2">颐和园</td>
                <td><img src="../img/yihy.jpg" class="viewspotimg"></td>
                <td>4.1~10.31</td>
                <td>￥30</td>
                <td>￥20</td>
                <td style="text-align: center">
                    <a href="#">删除景点</a><br>
                    <a href="updateviewspot.jsp">修改景点</a>
                </td>
            </tr>
            <tr>
                <td colspan="5">
                    <div style="height: 56px;font-size: 14px;line-height: normal">
                        <b style="color:#467aa7">简介：</b>颐和园，中国清朝时期皇家园林，前身为清漪园，坐落在北京西郊，距城区15公里，占地约290公顷，与圆明园毗邻。它是以昆明湖、万寿山为基址，以杭州西湖为蓝本，汲取江南园林的设计手法而建成的一座大型山水园林，也是保存最完整的一座皇家行宫御苑，被誉为“皇家园林博物馆”，也是国家重点旅游景点。
                    </div>
                </td>
            </tr>
            </tbody>
        </table>
        <a href="addviewspot.jsp"><button type="button">添加景点</button></a>&emsp;
        <a href="../province/provincelist.jsp">返回省份列表</a>
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
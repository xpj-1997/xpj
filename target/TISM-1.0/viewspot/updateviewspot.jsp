<%@page contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<html lang="zh-cn">
<head>
    <meta charset="UTF-8">
    <title>Title</title>
    <link rel="stylesheet" href="../css/style.css">
    <style>
        form{
            width:270px;
        }
        input{
            width: 64%;
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
        .label-text{
            width: 36%;
            float: left;
        }
        #img-show{
            width: 135px;
            height: 135px;
            display: block;
            margin: 0 auto;
            object-fit: cover;
        }
    </style>
    <script>
        function imgfileChange() {
            var img_show = document.getElementById("img-show");
            var imgfile = document.getElementById("imgfile");

            var freader = new FileReader();
            freader.readAsDataURL(imgfile.files[0]);
            freader.onload = function (e) {
                img_show.src = e.target.result;
            };
        }
    </script>
</head>
<body>
    <div id="wrap">
        <div id="header">
            <div style="float: right;padding-top: 24px">2009/11/20</div>
            <h1>旅游信息管理系统</h1>
        </div>
        <div id="header-bar"></div>
        <div id="content" style="height: 410px">
            <img src="../img/timg.jpg" style="float: right;height: 320px">
            <h2>修改景点</h2>
            <form action="viewspotlist.jsp" method="post">
                <label>
                    <div class="label-text">景&emsp;&emsp;点：</div>
                    <input type="text" name="vname" value="颐和园">
                </label>
                <label>
                    <div class="label-text">印象图片：</div>
                    <div style="text-align: center;padding-left: 36%">
                        <img src="../img/yihy.jpg" alt="" id="img-show">
                        <input type="file" id="imgfile" style="display: none" onchange="imgfileChange()">
                    </div>
                </label>
                <label>
                    <div class="label-text">旺季时间：</div>
                    <input type="text" name="hottime" value="4.1~10.31">
                </label>
                <label>
                    <div class="label-text">旺季门票：</div>
                    <input type="text" name="hotprice" value="30">
                </label>
                <label>
                    <div class="label-text">淡季门票：</div>
                    <input type="text" name="normalprice" value="20">
                </label>
                <label>
                    <div class="label-text">所属省份：</div>
                    <select name="ofprovince">
                        <option value="1">北京市</option>
                        <option value="2">山东省</option>
                        <option value="3">河南省</option>
                        <option value="4">辽宁省</option>
                        <option value="5">广西壮族自治区</option>
                    </select>
                </label>
                <button type="submit">提 交</button>&emsp;
                <a href="viewspotlist.jsp">返回</a>
            </form>
        </div>
        <div id="footer">
            ABC@126.com
        </div>
    </div>
</body>
</html>
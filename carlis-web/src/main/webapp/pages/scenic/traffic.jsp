<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html lang="en">
	<head>
	<meta charset="utf-8">
	<title>交通指南</title>
	</head>
<body>
	<!--内容s-->
    <div class="wrap-box">
        <div class="wrap">
            <!--发布栏s-->
            <div class="release">
                <span class="msg">带红色全部编辑完成才可以发布...</span>
                <a href="javascript:;" class="push">发布</a>
            </div>
            <!--发布栏e-->
            <!--基本信息s-->
            <div class="con-box">
                <h2 class="title-one">
                    <span>交通指南</span>
                    <a href="javscript:;" class="add" id="trafficAdd">添加</a>
                </h2>
                <ul class="basic-spot mar-traffic">
                    <li class="j">
                        <p class="title-two">
                            <span>防洪纪念塔</span>
                            <a href="javscript:;" class="editg" data-id="trafficEdit">编辑</a>
                        </p>
                    </li>
                    <li class="o">
                        <span class="title">景区地址：</span>
                        <span class="con">哈尔滨市道里区通江街</span>
                    </li>
                    <li class="j">
                        <span class="title">大巴公交：</span>
                        <span class="con">大巴/公交</span>
                    </li>
                    <li class="j">
                        <span class="title">自驾：</span>
                        <span class="con">沿着公路大桥行驶</span>
                    </li>
                    <li class="j">
                        <span class="title">地图：</span>
                    </li>
                    <li class="j p-traffic-img">
                        <img src="images/map-traffic.jpg" class="map-img">
                        <img src="images/map-traffic.jpg" class="map-img">
                    </li>
                </ul>
                <ul class="basic-spot mar-traffic">
                    <li class="j">
                        <p class="title-two">
                            <span>防洪纪念塔</span>
                            <a href="javscript:;" class="editg" data-id="trafficEdit">编辑</a>
                        </p>
                    </li>
                    <li class="o">
                        <span class="title">景区地址：</span>
                        <span class="con">哈尔滨市道里区通江街</span>
                    </li>
                    <li class="j">
                        <span class="title">大巴公交：</span>
                        <span class="con">大巴/公交</span>
                    </li>
                    <li class="j">
                        <span class="title">自驾：</span>
                        <span class="con">沿着公路大桥行驶</span>
                    </li>
                    <li class="j">
                        <span class="title">地图：</span>
                    </li>
                    <li class="j p-traffic-img">
                        <img src="images/map-traffic.jpg" class="map-img">
                        <img src="images/map-traffic.jpg" class="map-img">
                    </li>
                </ul>
            </div>
            <!--基本信息e-->
        </div>
        <!--shadow s-->
        <div class="shadow"></div>
        <!--shadow e-->

        <!--交通信息编辑s-->
        <div class="edit-traffic edit-box">
            <h1 class="title-edit">添加交通指南</h1>
            <div class="line">
                <h2 class="title">景点名称<i class="r"></i></h2>
                <div class="input-text">
                    <div class="input-box">
                        <input type="text" placeholder="请输入景点名称">
                    </div>
                    <div class="num">
                        <p>
                            <span class="r">0</span>/15
                        </p>
                    </div>
                </div>
            </div>
            <div class="line">
                <h2 class="title">景区地址<i class="r"></i></h2>
                <div class="input-text">
                    <div class="input-box">
                        <input type="text" placeholder="请输入景区地址">
                    </div>
                    <div class="num">
                        <p>
                            <span class="r">0</span>/30
                        </p>
                    </div>
                </div>
            </div>
            <div class="line">
                <h2 class="title">大巴/公交<i class="r"></i></h2>
                <div class="textarea-box">
                    <textarea placeholder="请输入大巴/公交方案"></textarea>
                    <p class="num">
                        <span class="r">0</span>/400
                    </p>
                </div>
            </div>
            <div class="line">
                <h2 class="title">自驾<i class="r"></i></h2>
                <div class="textarea-box">
                    <textarea placeholder="输入自驾交通方案"></textarea>
                    <p class="num">
                        <span class="r">0</span>/400
                    </p>
                </div>
            </div>

            <div class="line">
                <h2 class="title">地图<i class="r"></i></h2>
                <div class="image-box">
                    <p class="file-uplode">
                        <a class="flie-btn">添加</a>
                    </p>
                    <div class="img-detile">
                        <img src="images/map-traffic.jpg" class="map-img">
                        <img src="images/map-traffic.jpg" class="map-img">
                    </div>
                </div>
            </div>
            <div class="edit-btn-box">
                <ul>
                    <li class="ok">
                        <a href="javascript:;">确定</a>
                    </li>
                    <li class="no">
                        <a href="javascript:;">取消</a>
                    </li>
                </ul>
            </div>
        </div>
        <!--交通信息编辑e-->
    </div>
    <!--内容e-->
	<script type="text/javascript">
		seajs.use('static/scenic/traffic/event');
	</script>
</body>
</html>
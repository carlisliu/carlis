<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="utf-8">
    <meta name="keywords" content="盛世爱游,旅游,在线旅游,旅游分享,景区">
    <meta name="description" content="盛世爱游景区管理系统">
    <meta name="author" content="Carlis Liu<carlisliu@live.com>">
    <title><decorator:title default="盛世爱游"/></title>
    <link href="${staticPath}/css/reset.css" rel="stylesheet" type="text/css">
    <link href="${staticPath}/css/ayAllStyle.css" rel="stylesheet" type="text/css">
    <decorator:head/>
    <script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea.js" id="seajsnode"></script>
    <script type="text/javascript">
    	window['__base__'] = '${rootPath}';
    	window['__static__'] = '${staticPath}';
    </script>
    <script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea-config.js"></script>
</head>
<body>
    <div class="main-box">
        <!--头部s-->
        <div class="header">
            <h2 class="logo"></h2>
            <div class="head-nav">
                <h1>爱游景区管理系统</h1>
                <ul>
                    <li><a href="javascript:;" class="login"><span>登陆</span></a></li>
                    <li><a href="javascript:;" class="msg"><span class="num">99+</span><span>站内消息</span></a></li>
                    <li><a href="javascript:;" class="help"><span>帮助</span></a></li>
                </ul>
            </div>
            <div class="choose" id="choose">
                <div class="select-city">
                    <span>康西草原</span>
                </div>
            </div>
        </div>
        <!--头部e-->

        <!--菜单s-->
        <div class="nav">
            <ul class="main-nav">
                <li><a href="${rootPath}/map/index.html" class="map"><span>地图概览</span></a></li>
                <li><a href="${rootPath}/statistics/index.html" class="data" ><span>数据统计</span></a></li>
                <li><a href="javascript:void(0);" class="spot-management selected"><span>景区管理</span><span class="arrow"></span></a></li>
            </ul>
            <ul class="second-nav">
                <li><a href="${rootPath}/introduction/index.html" class="selected" data-category="introduction"><span>景区介绍</span></a></li>
                <li><a href="${rootPath}/photo/index.html" data-category="photo"><span>景区照片展示</span></a></li>
                <li><a href="${rootPath}/album/index.html" data-category="album"><span>景区相册</span></a></li>
                <li><a href="${rootPath}/entertainment/index.html" data-category="entertainment"><span>娱乐项目</span></a></li>
                <li><a href="${rootPath}/navigation/index.html" data-category="navigation"><span>景区导览</span></a></li>
                <li><a href="${rootPath}/landscape/index.html" data-category="landscape"><span>景观讲解</span><span class="not-com">不完整!</span></a></li>
                <li><a href="${rootPath}/traffic/index.html" data-category="traffic"><span>交通指南</span></a></li>
                <li><a href="${rootPath}/aiyouticket/index.html" data-category="aiyouticket"><span>爱游票务</span></a></li>
                <li><a href="${rootPath}/sos/index.html" data-category="sos"><span>一键救援</span></a></li>
                <li><a href="${rootPath}/comment/index.html" data-category="comment"><span>景区评论</span></a></li>
                <li><a href="${rootPath}/activity/index.html" data-category="activity"><span>活动页面</span></a></li>
                <li><a href="${rootPath}/cateringaccommodation/index.html" data-category="cateringaccommodation"><span>餐饮及住宿服务</span></a></li>
                <li><a href="${rootPath}/ontrip/index.html" data-category="ontrip"><span>人在旅途</span></a></li>
            </ul>
        </div>
        <script type="text/javascript">
        	seajs.use(['jquery'], function($){
        		var r = new RegExp('.*/([^/]*)/(.*\\.html)', 'i');
        		var category = r.exec(window.location.href);
        		if (category && category[1]) {
        			var navigation = $('.second-nav');
        			var current = navigation.find('[data-category=' + category[1].toLowerCase() + ']');
        			if (current.length) {
        				navigation.find('a').removeClass('selected');
        				current.addClass('selected');
        			}
        		}
        	});
        </script>
        <!--菜单e-->
        <decorator:body/>
    </div>
</body>
</html>
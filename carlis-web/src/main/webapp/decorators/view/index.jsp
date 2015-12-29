<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
	<title><decorator:title default="标题"/></title>
	<meta name="description" content="${company.name }官方网站">
	<meta name="keywords" content="${company.keywords }">
	<link href="${assetsPath}/css/base.css" rel="stylesheet" type="text/css">
	<decorator:head/>
	<!--[if lt IE 9]>
		<script>
			(function(){
	    		window.location.href = '/view/update-browser.jsp';
			})();
		</script>
	<![endif]-->
	<script type="text/javascript" src="${assetsPath}/javascripts/sea-modules/seajs/3.0.0/sea.js" id="seajsnode"></script>
    <script type="text/javascript">
    	window['__viewbase__'] = '${rootPath}';
    	window['__viewassets__'] = '${assetsPath}';
    </script>
    <script type="text/javascript" src="${assetsPath}/javascripts/sea-modules/seajs/3.0.0/sea-config.js"></script>
</head>
<body>
	<div class="top">
		<div class="container">
			<div class="logo"></div>
			<div class="action">
				<div>
					<a href="">设为首页</a>|<a href="">加入收藏</a>
				</div>
				<div class="contact"></div>
			</div>
		</div>
	</div>

	<div class="nav-container">
		<ul class="nav fix">
			<li class="horizontal">
				<h3>
					<a href="${rootPath }/">公司首页</a>
				</h3>
			</li>
			<li class="horizontal">
				<h3>
					<a href="${rootPath }/view/products.html">产品中心</a>
				</h3>
			</li>
			<li class="horizontal">
				<h3>
<%-- 					<a href="${rootPath }/view/cases.html">客户案例</a> --%>
					<a href="${rootPath }/view/home.html">客户案例</a>
				</h3>

			</li>
			<li class="horizontal">
				<h3>
					<a href="${rootPath }/view/video.html">视频展示</a>
				</h3>
			</li>
			<li class="horizontal">
				<h3>
					<a href="${rootPath }/view/introduction.html">公司简介</a>
				</h3>
			</li>
			<li class="horizontal">
				<h3>
					<a href="${rootPath }/view/contact.html">联系我们</a>
				</h3>
			</li>
		</ul>
	</div>

	<decorator:body/>
	
	<div class="footer">
		<div class="container">
			<div class="content">
				<p>${company.copyright} ${company.name }</p>
			</div>
		</div>
	</div>
</body>
</html>
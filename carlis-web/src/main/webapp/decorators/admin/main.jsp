<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html>
<html>
    <head>
        <title><decorator:title default="盛世爱游"/></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!--[if lt IE 9]>
			<script>
				(function(){
		    		window.location.href = '/update-browser.jsp';
				})();
			</script>
		<![endif]-->
        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="${staticPath}/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="${staticPath}/css/bootstrap-theme.min.css">

        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="${staticPath}/css/bootstrap-admin-theme.css">
        <link rel="stylesheet" media="screen" href="${staticPath}/css/bootstrap-admin-theme-change-size.css">
        
        <decorator:head/>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="${staticPath}/js/html5shiv.js"></script>
           <script type="text/javascript" src="${staticPath}/js/respond.min.js"></script>
        <![endif]-->
        <style type="text/css">
        	.error {
        		color:#a94442;
        	}
        </style>
        <script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea.js" id="seajsnode"></script>
        <script type="text/javascript">
        	window['__base__'] = '${rootPath}';
        	window['__static__'] = '${staticPath}';
        </script>
        <script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea-config.js"></script>
    </head>
    <body  class="bootstrap-admin-with-small-navbar">
        <!-- small navbar -->
        <nav class="navbar navbar-default navbar-fixed-top bootstrap-admin-navbar-sm" role="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="collapse navbar-collapse">
                            <ul class="nav navbar-nav navbar-right">
                                <li class="dropdown">
                                    <a href="#" role="button" class="dropdown-toggle" data-hover="dropdown"> <i class="glyphicon glyphicon-user"></i> ${sessionScope.__login_user__.loginName}<i class="caret"></i></a>
                                    <ul class="dropdown-menu">
<%--                                         <li><a href="#">${company.name }</a></li> --%>
                                        <li><a href="${rootPath}/userSettingInit.action">修改密码</a></li>
                                        <li role="presentation" class="divider"></li>
                                        <li><a href="${rootPath}/doLogout.action">退出</a></li>
                                    </ul>
                                </li>
                            </ul>
                        </div>
                    </div>
                </div>
            </div>
        </nav>

        <!-- main / large navbar -->
        <nav class="navbar navbar-default navbar-fixed-top bootstrap-admin-navbar bootstrap-admin-navbar-under-small" role="navigation">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <div class="navbar-header">
                            <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".main-navbar-collapse">
                                <span class="sr-only">Toggle navigation</span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                                <span class="icon-bar"></span>
                            </button>
                            <a class="navbar-brand" href="${rootPath}/guide.action">管理控制台</a>
                        </div>
                    </div>
                </div>
            </div><!-- /.container -->
        </nav>

        <div class="container">
            <!-- left, vertical navbar & content -->
            <div class="row">
                <!-- left, vertical navbar -->
                <div class="col-md-2 bootstrap-admin-col-left" id="menu-contents">
                    <ul class="nav navbar-collapse collapse bootstrap-admin-navbar-side">
                        <li>
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i>地图概览</a>
                        </li>
                        <li>
                            <a href="#"><i class="glyphicon glyphicon-chevron-right"></i>数据统计</a>
                        </li>
                        <li>
                            <a href="javascript:void(0);"><i class="glyphicon glyphicon-chevron-down"></i>景区管理</a>
                            <ul class="nav navbar-collapse bootstrap-admin-navbar-side">
                                <li><a href="#"><i class="glyphicon glyphicon-chevron-right"></i>景区介绍</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-chevron-right"></i>景区照片展示</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-chevron-right"></i>景区相册</a></li>
                                <li><a href="#"><i class="glyphicon glyphicon-chevron-right"></i>娱乐项目</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="javascript:void(0);"><i class="glyphicon glyphicon-chevron-down"></i>示例</a>
                            <ul class="nav navbar-collapse bootstrap-admin-navbar-side">
                                <li><a href="${rootPath}/showcase/ueditor.html"><i class="glyphicon glyphicon-chevron-right"></i>UEditor</a></li>
                                <li><a href="${rootPath}/showcase/mybatisPager.html"><i class="glyphicon glyphicon-chevron-right"></i>mybatis分页</a></li>
                            </ul>
                        </li>
                    </ul>
                </div>
                
                <div style="padding-left:200px;">
                	<!-- content -->
					<decorator:body/>
                </div>
				
            </div>
        </div>

        <!-- footer -->
        <div class="navbar navbar-footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <footer role="contentinfo">
                            <p class="left">盛世爱游</p>
                            <p class="right">盛世爱游 &nbsp; <a href="#" target="_blank">盛世爱游</a></p>
                        </footer>
                    </div>
                </div>
            </div>
        </div>
		
    </body>
</html>

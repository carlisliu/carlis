<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<!DOCTYPE html>
<html>
    <head>
        <title><decorator:title default="${company.name }"/></title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
		<!--[if lt IE 9]>
			<script>
				(function(){
		    		window.location.href = '/view/update-browser.jsp';
				})();
			</script>
		<![endif]-->
        <!-- Bootstrap -->
        <link rel="stylesheet" media="screen" href="${adminAsset}/css/bootstrap.min.css">
        <link rel="stylesheet" media="screen" href="${adminAsset}/css/bootstrap-theme.min.css">

        <!-- Bootstrap Admin Theme -->
        <link rel="stylesheet" media="screen" href="${adminAsset}/css/bootstrap-admin-theme.css">
        <link rel="stylesheet" media="screen" href="${adminAsset}/css/bootstrap-admin-theme-change-size.css">
        
        <decorator:head/>

        <!-- HTML5 shim and Respond.js IE8 support of HTML5 elements and media queries -->
        <!--[if lt IE 9]>
           <script type="text/javascript" src="${adminAsset}/js/html5shiv.js"></script>
           <script type="text/javascript" src="${adminAsset}/js/respond.min.js"></script>
        <![endif]-->
        <style type="text/css">
        	.error {
        		color:#a94442;
        	}
        </style>
        <script type="text/javascript" src="${adminAsset}/js/sea-modules/seajs/3.0.0/sea.js" id="seajsnode"></script>
        <script type="text/javascript">
        	window['__base__'] = '${adminAsset}';
        	window['__actionBase__'] = '${adminRoot}';
        </script>
        <script type="text/javascript" src="${adminAsset}/js/sea-modules/seajs/3.0.0/sea-config.js"></script>
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
                                        <li><a href="${adminRoot}/userSettingInit.action">修改密码</a></li>
                                        <li role="presentation" class="divider"></li>
                                        <li><a href="${adminRoot}/doLogout.action">退出</a></li>
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
                            <a class="navbar-brand" href="${adminRoot}/guide.action">管理控制台</a>
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
                            <a href="${adminRoot}/guide.action"><i class="glyphicon glyphicon-chevron-right"></i>概述</a>
                        </li>
                        <li>
                            <a href="${adminRoot}/settingInit.action"><i class="glyphicon glyphicon-chevron-right"></i>网站全局设置</a>
                        </li>
                        <li>
                            <a href="${adminRoot}/categoryInit.action"><i class="glyphicon glyphicon-chevron-right"></i> 类别信息</a>
                        </li>
                        <li class="active">
                            <a href="${adminRoot}/companyInit.action"><i class="glyphicon glyphicon-chevron-right"></i> 公司信息</a>
                        </li>
                        <li>
                            <a href="javascript:void(0);"><i class="glyphicon glyphicon-chevron-down"></i>产品信息</a>
                            <ul class="nav navbar-collapse bootstrap-admin-navbar-side">
                                <li><a href="${adminRoot}/createProductInit.action"><i class="glyphicon glyphicon-chevron-right"></i>新增</a></li>
                                <li><a href="${adminRoot}/productQuery.action"><i class="glyphicon glyphicon-chevron-right"></i>查询</a></li>
                            </ul>
                        </li>
                        <li>
                            <a href="${adminRoot}/videoInit.action"><i class="glyphicon glyphicon-chevron-right"></i>视频信息</a>
                        </li>
                        <li>
                            <a href="${adminRoot}/messagesInit.action"><i class="glyphicon glyphicon-chevron-right"></i>客户留言</a>
                        </li>
<!--                         <li> -->
<%--                             <a href="${adminRoot}/userInit.action"><i class="glyphicon glyphicon-chevron-right"></i>用户设置</a> --%>
<!--                         </li> -->
                         <li>
                            <a href="${adminRoot}/userSettingInit.action"><i class="glyphicon glyphicon-chevron-right"></i>用户设置</a>
                        </li>
                    </ul>
                </div>

 				<!-- content -->
				<decorator:body/>
				
            </div>
        </div>

        <!-- footer -->
        <div class="navbar navbar-footer">
            <div class="container">
                <div class="row">
                    <div class="col-lg-12">
                        <footer role="contentinfo">
                            <p class="left">${company.name }</p>
                            <p class="right">${company.copyright } &nbsp; <a href="${company.website }" target="_blank">${company.website }</a></p>
                        </footer>
                    </div>
                </div>
            </div>
        </div>
		
        <script type="text/javascript">
        	seajs.use(['jQuery', 'hover-dropdown'], function($){
        		var path = window.location.pathname;
        		path && $('#menu-contents ul li').removeClass('active').each(function(){
        			var $this = $(this), href = $this.children('a').attr('href');
        			if (href && href.indexOf(path) > -1) {
        				$this.addClass('active');
        				return false;
        			}
        		});
        	});
        </script>
    </body>
</html>

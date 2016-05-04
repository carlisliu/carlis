<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html class="bootstrap-admin-vertical-centered">
    <head>
        <title>登录</title>
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
        <!-- Custom styles -->
        <style type="text/css">
            .alert{
                margin: 0 auto 20px;
            }
        </style>
        <script type="text/javascript">
        	window['__static__'] = '${staticPath}';
        </script>
    </head>
    <body class="bootstrap-admin-without-padding">
        <div class="container">
            <div class="row">
                <div class="col-lg-12">
                    <div class="alert alert-info">
                        System Login...
                    </div>
                    <form method="post" action="${action}/doLogin.action" class="bootstrap-admin-login-form">
                        <h1>登录</h1>
                        <div class="form-group">
                            <input class="form-control required" type="text" name="loginId" id="loginId" placeholder="登录名">
                        </div>
                        <div class="form-group">
                            <input class="form-control required" type="password" name="password" id="password" placeholder="密码">
                        </div>
                        <button class="btn btn-lg btn-primary" type="submit" id="submit-id">登录</button>
                    </form>
                </div>
            </div>
        </div>
		<script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea.js" id="seajsnode"></script>
		<script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea-config.js"></script>
        <script type="text/javascript">
        	seajs.use(['jquery', 'bootstrap', 'validate'], function($){
        		$(function() {
                    // Setting focus
                    $('input[name="loginId"]').focus();

                    // Setting width of the alert box
                    var alert = $('.alert');
                    var formWidth = $('.bootstrap-admin-login-form').innerWidth();
                    var alertPadding = parseInt($('.alert').css('padding'));

                    if (isNaN(alertPadding)) {
                        alertPadding = parseInt($(alert).css('padding-left'));
                    }
                    $('.alert').width(formWidth - 2 * alertPadding);
                    
                    $('#submit-id').click(function(e){
                    	$('form').validate({
                            highlight: function (label) {
                                $(label).parent().addClass('has-error');
                            },
                            success: function (label) {
                            	$(label).parent().removeClass('has-error');
                            }
                        });
                    });
                });
        	});
        </script>
    </body>
</html>
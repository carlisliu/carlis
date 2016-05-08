<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
    <head>
        <title>登录</title>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <!--[if lt IE 9]>
			<script>
				(function(){
		    		window.location.href = '/update-browser.jsp';
				})();
			</script>
		<![endif]-->
        <script type="text/javascript">
        	window['__static__'] = '${staticPath}';
        </script>
    </head>
    <body>
        <div class="container">
            <div>
                <form method="post" action="${rootPath}/doLogin.action">
                    <h1>登录</h1>
                    <div>
                        <input class="form-control required" type="text" name="loginId" id="loginId" placeholder="登录名">
                    </div>
                    <div>
                        <input class="form-control required" type="password" name="password" id="password" placeholder="密码">
                    </div>
                    <s:actionerror/>
                    <button type="submit" id="submit-id">登录</button>
                </form>
            </div>
        </div>
		<script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea.js" id="seajsnode"></script>
		<script type="text/javascript" src="${staticPath}/js/sea-modules/seajs/3.0.0/sea-config.js"></script>
        <script type="text/javascript">
        	seajs.use(['jquery'], function($){
        		$(function() {
                    // Setting focus
                    $('input[name="loginId"]').focus();

                    $('#submit-id').click(function(e){
                    	var loginId = $('#loginId').val();
                    	if (!loginId) {
                    		alert('login id required');
                    		return false;
                    	}
                    	var password = $('#password').val();
                    	if (!password) {
                    		alert('password id required');
                    		return false;
                    	}
                    });
                });
        	});
        </script>
    </body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>盛世爱游-Mybatis分页示例页面</title>
</head>
<body>
	<h1>Welcome to mybatis-pager</h1>
	<label for="page">page:</label>
	<input type="text" id="page" />
	<label for="pageSize">pageSize:</label>
	<input type="text" id="pageSize" />
	<button id="pager-test">分页测试</button>
	<button id="nopager-test">普通测试</button>
	<div id="container"></div>
	<script type="text/javascript">
		seajs.use(['jquery'], function($){
			$('#pager-test').click(function(e){
				$.getJSON('${rootPath}/showcase/testPager.html', {
					page: parseInt($.trim($('#page').val())),
					pageSize: parseInt($.trim($('#pageSize').val()))
				}, function(data){
					data = JSON.stringify(data);
					$('#container').html(data);
				}).fail(function(e){
					console.log(e);
				});
			});
			
			$('#nopager-test').click(function(e){
				$.getJSON('${rootPath}/showcase/testNoPager.html', function(data){
					data = JSON.stringify(data);
					$('#container').html(data);
				}).fail(function(e){
					console.log(e);
				});
			});
		});
	</script>
</body>
</html>
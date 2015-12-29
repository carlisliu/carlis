<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<title>联系我们</title>
</head>
<body>
	<div class="content">
		<div class="company c-container">
			<h3>
				<span>联系我们</span> <b>Welcome to contact us</b>
			</h3>
			<div class="contact">
				<div>
					<strong>地址：</strong><span>${company.address }</span>
				</div>
				<div>
					<strong>电话：</strong><span>${company.tel }</span>
				</div>
				<div>
					<strong>手机：</strong><span>${company.cell }</span>
				</div>
				<div>
					<strong>联系人：</strong><span>${company.contact }</span>
				</div>
				<div>
					<strong>网站：</strong><span>${company.website }</span>
				</div>
				<div>
					<strong>邮箱：</strong><span>${company.email }</span>
				</div>
			</div>
			<div class="map" style="margin-left:25px;">
				<iframe src="${rootPath}/view/map.jsp" style="width: 95%; height:400px;"></iframe>
			</div>
		</div>
	</div>
</body>
</html>
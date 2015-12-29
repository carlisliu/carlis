<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="/struts-tags" prefix="s" %>
<!DOCTYPE html>
<html>
<head>
<title>客户留言</title>
<style type="text/css">
.media,.media-body {
	overflow: hidden;
	zoom: 1
}

.media-body {
	width: 10000px
}

.media-object {
	display: block
}

.media-object.img-thumbnail {
	max-width: none
}

.media-right,.media>.pull-right {
	padding-left: 10px
}

.media-left,.media>.pull-left {
	padding-right: 10px
}

.media-body,.media-left,.media-right {
	display: table-cell;
	vertical-align: top
}

.media-middle {
	vertical-align: middle
}

.media-bottom {
	vertical-align: bottom
}

.media-heading {
	margin-top: 0;
	margin-bottom: 5px
}
</style>
</head>
<body class="bootstrap-admin-with-small-navbar">
	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">客户留言</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal">
							<s:iterator value="messages" id="message" status="stat">
								<div class="media">
									<div class="media-left">
										<img class="media-object" alt="64x64" src="${adminAsset}/images/profile.png" data-holder-rendered="true" style="width: 64px; height: 64px;">
									</div>
									<div class="media-body">
										<h4 class="media-heading">
											${messager }
											<s:if test="%{tel!=null}">
												|电话：${tel }
											</s:if>
											<s:if test="%{cell!=null}">
												|手机：${cell }
											</s:if>
											<s:if test="%{email!=null}">
												|邮箱：${email }
											</s:if>
											</h4>
										<div>
											${content }
										</div>
										<div class="pull-right">
											${formatedDate }
										</div>
									</div>
								</div>
							</s:iterator>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
	</div>
	<script type="text/javascript">
		//seajs.use('static/company/event');
	</script>
</body>
</html>

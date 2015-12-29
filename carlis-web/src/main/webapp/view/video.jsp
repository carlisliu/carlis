<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>公司视频展示</title>
<style type="text/css">
.vl-container {
	width: 990px;
	margin: 0 auto;
	padding: 10px 0px;
}

.vl-container ul {
	float: left;
}

.vl-container ul li {
	margin: 15px;
	overflow: auto;
}

.vl-container ul li div {
	float: left;
}

.cover {
	width: 480px;
	height: 400px;
}

.cover img {
	width: 480px;
	height: 400px;
}

.video-info {
	margin-left: 50px;
}

.video-info .title {
	width: 380px; line-height : 30px;
	font-size: 24px;
	font-weight: normal;
	font-family: 'microsoft yaHei', '微软雅黑', arial;
	color: #333;
	line-height: 30px;
}

.video-info .context {
	margin-top: 30px;
}
</style>
</head>
<body>
	<div class="content">
		<div class="vl-container">
			<div class="">
				<ul>
					<s:if test="videos==null or videos.size()==0">
						暂无
						<div style="width: 20px; height: 400px;"></div>
					</s:if>
					<s:else>
						<s:iterator value="videos" id="video" status="state">
							<li>
								<div class="cover">
									<s:if test="embedCode == null || embedCode == ''">
										<a href="<s:property value="url"/>">
											<img src="${assetsPath}/images/not-provided.jpg">
										</a>
									</s:if>
									<s:else>
										<s:property escape="0" value="embedCode" />
									</s:else>
								</div>
								<div class="video-info">
									<div class="title">
										<h3>
											<a href="<s:property value="url"/>"><s:property value="name" /></a>
										</h3>
									</div>
									<div class="clear"></div>
									<div class="context">
										<span> <s:property value="memo" />
										</span>
									</div>
								</div>
								<div class="clear"></div>
							</li>
						</s:iterator>
					</s:else>
				</ul>
				<div class="clear"></div>
			</div>
			<div class="clear"></div>
		</div>
		<div class="clear"></div>
	</div>
	<script type="text/javascript">
		seajs.use('jquery', function($) {
			$(function() {
				$('embed').each(function(index, content) {
					var $this = $(this);
					if ($this.width() !== 480 || $this.height() !== 400) {
						$this.css({
							width : 480,
							height : 400
						});
					}
				});
			});
		});
	</script>
</body>
</html>
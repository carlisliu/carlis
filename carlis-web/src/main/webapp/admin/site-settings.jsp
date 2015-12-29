<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>网站设置</title>
	<link rel="stylesheet" media="screen" href="${adminAsset}/js/vendors/uploadify/uploadify.css">
	<link rel="stylesheet" media="screen" href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
	<style type="text/css">
		.center {
			text-align: center;
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
						<div class="text-muted bootstrap-admin-box-title">网站设置</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="setting-form">
							<fieldset>
								<legend>设置</legend>
								<div class="alert alert-info">
                                    <a class="close" data-dismiss="alert" href="#">×</a>
                                    <strong>提示</strong> QQ代码请到http://shang.qq.com/v3/index.html进行设置
                                </div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="banner-num">Banner数量</label>
									<div class="col-lg-10">
										<s:if test="setting.bannerNum != 0">
											<input class="form-control number" id="banner-num" name="banner-num" placeholder="默认为3张,最多5张"
												type="text" data-property="banner-num" value="<s:property value="setting.bannerNum"/>">
										</s:if>
										<s:else>
											<input class="form-control number" id="banner-num" name="banner-num" placeholder="默认为3张,最多5张"
												type="text" data-property="banner-num" value="">
										</s:else>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="video-url">流程图片数量</label>
									<div class="col-lg-10">
										<s:if test="setting.processNum != 0">
											<input class="form-control number" id="process-num" name="process-num" placeholder="默认为1张,最多5张"
												type="text" data-property="process-num" value="<s:property value="setting.processNum"/>">
										</s:if>
										<s:else>
											<input class="form-control number" id="process-num" name="process-num" placeholder="默认为1张,最多5张"
												type="text" data-property="process-num" value="">
										</s:else>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="qq-code">QQ代码</label>
									<div class="col-lg-10">
										<textarea rows="5" class="form-control" id="qq-code" data-property="qq">${setting.qq }</textarea>
									</div>
								</div>
								<button type="submit" class="btn btn-primary" id="pic-num-save">保存</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">全局设置</div>
					</div>
					<div class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" enctype="multipart/form-data">
							<fieldset>
								<legend>全局设置</legend>
								<div class="alert alert-info">
                                    <a class="close" data-dismiss="alert" href="#">×</a>
                                    <strong>提示</strong> 为保证网站显示美观，Logo请选择宽*高为30px*16px的图片，二维码请选择宽*高为30px*16px的图片
                                </div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="logo">网站Logo</label>
									<div class="col-lg-10">
										<input class="form-control" name="logo" type="file" id="logo" data-property="logo">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="icon">网站Icon</label>
									<div class="col-lg-10">
										<input class="form-control" name="icon" type="file" id="icon" data-property="icon">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="wechat">微信二维码</label>
									<div class="col-lg-10">
										<input class="form-control" name="wechat" type="file" id="wechat" data-property="wechat">
									</div>
								</div>
								<button class="btn btn-primary" id="settings-save">上传</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">Banner上传</div>
					</div>
					<div class="bootstrap-admin-panel-content">
						<div class="alert alert-info">
                            <a class="close" data-dismiss="alert" href="#">×</a>
                            <strong>提示</strong> 为保证网站显示美观，Banner请选择宽*高为900px*387px的图片,上传成功后重新<a href="javascript:window.location.reload();" style="padding:0px 5px">刷新页面</a>显示最新上传内容。
                        </div>
						<div class="row">
							<s:iterator value="banners" id="banner" status="state">
								<div class="col-md-4">
	                                <a href="${rootPath }/resources/<s:property value="type"/>/<s:property value="fileName"/>" class="thumbnail">
	                                    <img alt="<s:property value="fileName"/>-260x180" style="width: 260px; height: 180px;" src="${rootPath }/resources/<s:property value="type"/>/<s:property value="fileName"/>">
	                                    <button class="btn btn-xs btn-danger" data-action="delete" data-id="<s:property value="id"/>">删除</button>
	                                    <s:if test="inIndex">
	                                    	 <button style="margin-left:8px;" class="btn btn-xs btn-default" data-action="tongle" data-id="<s:property value="id"/>">取消首页显示</button>
	                                    </s:if>
	                                    <s:else>
	                                    	<button style="margin-left:8px;" class="btn btn-xs btn-primary" data-action="tongle" data-id="<s:property value="id"/>">设置首页显示</button>
	                                    </s:else>
	                                </a>
	                            </div>
							</s:iterator>
						</div>
						<form class="form-horizontal">
							<div class="form-group">
								<label class="col-lg-2 control-label" for="banner">网站Banner</label>
								<div class="col-lg-10">
									<input class="form-control" name="banner" type="file" id="banner" data-property="logo">
								</div>
							</div>
							<button class="btn btn-primary" id="banner-save" data-type="banner">上传</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">流程图片上传</div>
					</div>
					<div class="bootstrap-admin-panel-content">
						<div class="alert alert-info">
                            <a class="close" data-dismiss="alert" href="#">×</a>
                            <strong>提示</strong> 为保证网站显示美观，流程图片请选择宽*高为900px*380px的图片,上传成功后重新<a href="javascript:window.location.reload();" style="padding:0px 5px">刷新页面</a>显示最新上传内容。
                        </div>
						<div class="row">
							<s:iterator value="process" id="pro" status="state">
								<div class="col-md-4">
	                                <a href="${rootPath }/resources/<s:property value="type"/>/<s:property value="fileName"/>" class="thumbnail">
	                                    <img alt="<s:property value="fileName"/>-260x180" style="width: 260px; height: 180px;" src="${rootPath }/resources/<s:property value="type"/>/<s:property value="fileName"/>">
	                                    <button class="btn btn-xs btn-danger" data-action="delete" data-id="<s:property value="id"/>">删除</button>
	                                    <s:if test="inIndex">
	                                    	<button style="margin-left:8px;" class="btn btn-xs btn-default" data-action="tongle" data-id="<s:property value="id"/>">取消首页显示</button>
	                                    </s:if>
	                                    <s:else>
	                                    	<button style="margin-left:8px;" class="btn btn-xs btn-primary" data-action="tongle" data-id="<s:property value="id"/>">设置首页显示</button>
	                                    </s:else>
	                                </a>
	                            </div>
							</s:iterator>
						</div>
						<form class="form-horizontal">
							<div class="form-group">
								<label class="col-lg-2 control-label" for="process">流程图片</label>
								<div class="col-lg-10">
									<input class="form-control" name="process" type="file" id="process" data-property="logo">
								</div>
							</div>
							<button class="btn btn-primary" id="process-save" data-type="process">上传</button>
						</form>
					</div>
				</div>
			</div>
		</div>
		
	</div>
	<script type="text/javascript" src="${adminAsset}/js/vendors/uploadify/flash.js"></script>
	<script type="text/javascript">
		seajs.use('static/settings/event');
	</script>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>视频信息</title>
<link rel="stylesheet" media="screen"
	href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
</head>
<body class="bootstrap-admin-with-small-navbar">

	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">新增视频信息</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="video-form">
							<fieldset>
								<legend>视频信息</legend>
								<div class="alert alert-info">
                                    <a class="close" data-dismiss="alert" href="#">×</a>
                                    <strong>提示</strong> 网站视频资源均为网站外部资源，如优酷、土豆等。视频地址为外部视频资源的URL地址，嵌入代码为外部网站提供的js代码，一般位于外部网站视频资源下面的分享中。
                                </div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="video-name">视频名称</label>
									<div class="col-lg-10">
										<input class="form-control required" id="video-name" name="video-name"
											type="text" data-property="name" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="video-url">视频URL地址</label>
									<div class="col-lg-10">
										<input class="form-control required" id="video-url" name="video-url"
											type="text" data-property="url" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="embed-code">嵌入代码</label>
									<div class="col-lg-10">
										<textarea rows="5" class="form-control" id="embed-code" name="embed-code" data-property="embedCode"></textarea>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="video-memo">备注</label>
									<div class="col-lg-10">
										<input class="form-control" id="video-memo" type="text"
											data-property="memo" value="">
									</div>
								</div>
								<button type="submit" class="btn btn-primary" id="video-save">保存</button>
								<button type="reset" class="btn btn-default" id="video-reset">重置</button>
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
						<div class="text-muted bootstrap-admin-box-title">视频信息列表</div>
					</div>
					<div class="alert alert-info">
                        <a class="close" data-dismiss="alert" href="#">×</a>
                        <strong>提示</strong> 首页最多显示3个视频,记录中没有“首页显示”按钮表示已显示在首页
                    </div>
					<div class="bootstrap-admin-panel-content">
						<table class="table bootstrap-admin-table-with-actions" id="video-content">
							<thead>
								<tr>
									<th>序号</th>
									<th class="hide"></th>
									<th>视频名称</th>
									<th>视频URL地址</th>
									<th class="hide"></th>
									<th class="hide"></th>
									<th class="hide"></th>
									<th style="width:220px;">操作</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="videos" id="video" status="stuts">
									<tr>
										<td><s:property value="#stuts.index+1"/></td>
										<td data-property="id" class="hide">
											<s:property value="id"/>
										</td>
										<td data-property="name">
											<s:property value="name"/>
										</td>
										<td data-property="url">
											<s:property value="url"/>
										</td>
										<td data-property="embedCode" class="hide">
											<s:property value="embedCode"/>
										</td>
										<td data-property="inIndex" class="hide">
											<s:property value="inIndex"/>
										</td>
										<td data-property="memo" class="hide">
											<s:property value="memo"/>
										</td>
										<td class="actions" style="width:220px;">
											<a href="#upd-modal" data-toggle="modal">
												<button class="btn btn-sm btn-primary">
													<i class="glyphicon glyphicon-pencil"></i>编辑
												</button>
											</a>
											<a href="#del-modal" data-toggle="modal">
												<button class="btn btn-sm btn-danger">
													<i class="glyphicon glyphicon-trash"></i>删除
												</button>
											</a>
											<s:if test="inIndex">
												<a>
													<button class="btn btn-sm btn-default">取消显示</button>
												</a>
											</s:if>
											<s:else>
												<a>
													<button class="btn btn-sm btn-success">首页显示</button>
												</a>
											</s:else>
										</td>
									</tr>
								</s:iterator>
							</tbody>
						</table>
					</div>
				</div>
			</div>
		</div>
	</div>
	
	<div id="upd-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 id="myModalLabel" class="modal-title">修改视频信息</h4>
				</div>
				<div class="modal-body">
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-primary" data-persistence="save">保存</button>
				</div>
			</div>
		</div>
	</div>
	
	<div id="del-modal" class="modal fade" tabindex="-1" role="dialog"
		aria-labelledby="myModalLabel" aria-hidden="true">
		<div class="modal-dialog">
			<div class="modal-content">
				<div class="modal-header">
					<button type="button" class="close" data-dismiss="modal"
						aria-hidden="true">&times;</button>
					<h4 id="myModalLabel" class="modal-title">警告</h4>
				</div>
				<div class="modal-body">
					<p>确认删除？</p>
				</div>
				<div class="modal-footer">
					<button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
					<button type="button" class="btn btn-danger" data-persistence="delete">删除</button>
				</div>
			</div>
		</div>
	</div>

	
	<script type="x/template" id="video-row-template">
		<tr>
			<td>0</td>
			<td class="hide">{id}</td>
			<td>{name}</td>
			<td>{url}</td>
			<td>{memo}</td>
			<td class="actions">
				<a href="#upd-modal" data-toggle="modal">
					<button class="btn btn-sm btn-primary">
						<i class="glyphicon glyphicon-pencil"></i>编辑
					</button>
				</a>
				<a href="#del-modal" data-toggle="modal">
					<button class="btn btn-sm btn-danger">
						<i class="glyphicon glyphicon-trash"></i>删除
					</button>
				</a>
			</td>
		</tr>
	</script>
	
	<script type="x/template" id="video-upd-template">
		<form class="form-horizontal" id="video-form-upd">
			<fieldset>
				<div class="form-group">
					<label class="col-lg-2 control-label" for="video-name">视频名称</label>
					<div class="col-lg-10">
						<input class="form-control required" id="video-name" name="video-name"
							type="text" data-property="name" value="{name}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-2 control-label" for="video-url">视频URL地址</label>
					<div class="col-lg-10">
						<input class="form-control required" id="video-url" name="video-url"
							type="text" data-property="url" value="{url}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-2 control-label" for="video-url">嵌入代码</label>
					<div class="col-lg-10">
						<textarea rows="5" class="form-control" id="company-introduction" data-property="embedCode">{embedCode}</textarea>
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-2 control-label" for="video-memo">备注</label>
					<div class="col-lg-10">
						<input class="form-control" id="video-memo" type="text"
							data-property="memo" value="{memo}">
					</div>
				</div>
				<input type="hidden" data-property="id" value="{id}" />
			</fieldset>
		</form>
	</script>
	<script type="text/javascript">
		seajs.use('static/video/event');
	</script>
</body>
</html>

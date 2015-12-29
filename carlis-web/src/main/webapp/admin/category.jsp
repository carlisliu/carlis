<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>类别信息</title>
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
						<div class="text-muted bootstrap-admin-box-title">新增类别信息</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="category-form">
							<fieldset>
								<legend>类别信息</legend>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="category-name">类别名称</label>
									<div class="col-lg-10">
										<input class="form-control required" id="category-name"
											type="text" data-property="name" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="category-memo">备注</label>
									<div class="col-lg-10">
										<input class="form-control" id="category-memo" type="text"
											data-property="memo" value="">
									</div>
								</div>
								<button type="submit" class="btn btn-primary" id="category-save">保存</button>
								<button type="reset" class="btn btn-default" id="category-reset">重置</button>
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
						<div class="text-muted bootstrap-admin-box-title">类别信息列表</div>
					</div>
					<div class="bootstrap-admin-panel-content">
						<table class="table bootstrap-admin-table-with-actions" id="category-content">
							<thead>
								<tr>
									<th>序号</th>
									<th class="hide">id</th>
									<th>类别名称</th>
									<th>备注</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="categories" id="category" status="stuts">
									<tr>
										<td><s:property value="#stuts.index+1"/></td>
										<td data-property="id" class="hide">
											<s:property value="id"/>
										</td>
										<td data-property="name">
											<s:property value="name"/>
										</td>
										<td data-property="memo">
											<s:property value="memo"/>
										</td>
										<td class="actions"><a href="#upd-modal" data-toggle="modal">
												<button class="btn btn-sm btn-primary">
													<i class="glyphicon glyphicon-pencil"></i>编辑
												</button>
										</a> <a href="#del-modal" data-toggle="modal">
												<button class="btn btn-sm btn-danger">
													<i class="glyphicon glyphicon-trash"></i>删除
												</button>
										</a></td>
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
					<h4 id="myModalLabel" class="modal-title">修改类别信息</h4>
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

	<script type="x/template" id="category-upd-template">
		<form class="form-horizontal" id="category-update-form">
			<fieldset>
				<div class="form-group">
					<label class="col-lg-2 control-label" for="category-upd-name">类别名称</label>
					<div class="col-lg-10">
						<input class="form-control required" id="category-upd-name" type="text"
							data-property="name" value="{name}">
					</div>
				</div>
				<div class="form-group">
					<label class="col-lg-2 control-label" for="category-upd-memo">备注</label>
					<div class="col-lg-10">
						<input class="form-control" id="category-upd-memo" type="text"
							data-property="memo" value="{memo}">
					</div>
				</div>
			</fieldset>
			<input type="hidden" data-property="id" value="{id}" />
		</form>
	</script>
	<script type="x/template" id="category-row-template">
		<tr>
			<td>0</td>
			<td data-property="id" class="hide">{id}</td>
			<td data-property="name">{name}</td>
			<td data-property="memo">{memo}</td>
			<td class="actions"><a href="#upd-modal" data-toggle="modal">
					<button class="btn btn-sm btn-primary">
						<i class="glyphicon glyphicon-pencil"></i>编辑
					</button>
			</a> <a href="#del-modal" data-toggle="modal">
					<button class="btn btn-sm btn-danger">
						<i class="glyphicon glyphicon-trash"></i>删除
					</button>
			</a></td>
		</tr>
	</script>
	<script type="text/javascript">
		seajs.use('static/category/event');
	</script>
</body>
</html>

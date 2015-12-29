<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>产品明细</title>
	<link rel="stylesheet" media="screen" href="${adminAsset}/js/vendors/uploadify/uploadify.css">
	<link rel="stylesheet" media="screen" href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
	<style type="text/css">
		.center {
			text-align: center;
		}
	</style>
</head>
<body class="bootstrap-admin-with-small-navbar">
	<input type="hidden" value="${product.id}" id="product-id-global">
	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">产品基本信息</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="product-detail-form">
							<fieldset>
								<legend>产品基本信息</legend>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-name-span">产品名称</label>
									<div class="col-lg-10">
										<span class="form-control" id="product-name-span"
											data-property="name">${product.name}</span>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label"
										for="product-category-id-span">产品类别</label>
									<div class="col-lg-10">
										<span class="form-control" id="product-category-id-span"
											data-property="name">${product.category.name}</span>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label"
										for="product-description-span">产品描述</label>
									<div class="col-lg-10">
										<span class="form-control" id="product-description-span"
											data-property="description" style="height: auto;">${product.description}&nbsp;</span>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label"
										for="product-parameters-span">产品主要技术参数</label>
									<div class="col-lg-10">
										<span class="form-control" id="product-parameters-span"
											data-property="parameters" style="height: auto;">${product.parameters}&nbsp;</span>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-memo-span">备注</label>
									<div class="col-lg-10">
										<span class="form-control" id="product-memo-span"
											data-property="memo">${product.memo}</span>
									</div>
								</div>
								<button type="submit" class="btn btn-primary" id="product-edit">编辑</button>
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
						<div class="text-muted bootstrap-admin-box-title">产品图片</div>
					</div>
					<div class="bootstrap-admin-panel-content" id="images-container">
						
					</div>
				</div>
			</div>
		</div>
		
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">上传产品图片</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="product-form">
							<fieldset>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-pic-path">产品图片</label>
									<div class="col-lg-10">
										<input class="form-control" name="uploadFile" type="file" id="product-pic-path" data-property="picPath">
									</div>
								</div>
								<button class="btn btn-primary" id="product-upload">上传</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
	<script type="x/template" id="product-upd-template">
		<fieldset>
			<legend>产品基本信息</legend>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="product-name">产品名称</label>
				<div class="col-lg-10">
					<input class="form-control required" id="product-name" type="text"
						data-property="name" value="${product.name}">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="product-category-id">产品类别</label>
				<div class="col-lg-10">
					<s:select label="产品类别" name="category" list="categories"
						listKey="id" listValue="name" cssClass="form-control required" data-property="category.id" value="product.category.id">
					</s:select>
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="product-description">产品描述</label>
				<div class="col-lg-10">
					<textarea rows="5" class="form-control"
						id="product-description" data-property="description">${product.description}</textarea>
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="product-parameters">产品主要技术参数</label>
				<div class="col-lg-10">
					<textarea rows="4" class="form-control"
						id="product-parameters" data-property="parameters">${product.parameters}</textarea>
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="product-memo">备注</label>
				<div class="col-lg-10">
					<input class="form-control" id="product-memo" type="text"
						data-property="memo" value="${product.memo}">
				</div>
			</div>
			<input type="hidden" data-property="id" value="${product.id}" />
			<button type="submit" class="btn btn-primary" id="product-save">保存</button>
			<button type="reset" class="btn btn-default" id="product-reset">重置</button>
		</fieldset>
	</script>
	<script type="x/images-data" id="upload-image-data">
		[
		<s:iterator value="product.uploads" id="upload" status="stuts">
		{"id":"<s:property value="id" />","fileName":"<s:property value="fileName" />"},
		</s:iterator>
		{}]
	</script>
	<!-- executing this code explicitly , don't know why, maybe need global context.-->
	<script type="text/javascript" src="${adminAsset}/js/vendors/uploadify/flash.js"></script>
	<script type="text/javascript">
		seajs.use('static/product/detail');
		seajs.use('jQuery', function($){
			var html = '';
			var images = $.parseJSON($.trim($('#upload-image-data').html()));
			images.pop();
			if (images.length) {
				var rows = parseInt(images.length / 3), remainder = images.length % 3;
				if (rows) {
					for (var r = 0; r < rows; r++) {
						html += '<div class="row bootstrap-admin-light-padding-bottom center">';
						for (var i = 0; i < 3; i++) {
							html += '<div class="col-md-4"><a href="#" class="thumbnail"><img data-src="holder.js/260x180" alt="260x180" style="width: 260px; height: 180px;" src="${rootPath}/resources/product/${product.id}/' + images[r*3 + i]['fileName'] + '"></a><button class="btn btn-xs btn-danger" data-upload-id="' + images[r*3 + i]['id'] + '">删除</button><button style="margin-left:8px;" class="btn btn-xs btn-default" data-cover="' + images[r*3 + i]['fileName'] + '" data-upload-id="' + images[r*3 + i]['id'] + '">设为封面</button></div>';
						}
						html += '</div>';
					}
				}
				html += '<div class="row bootstrap-admin-light-padding-bottom center">';
				for (var j = 0; j < remainder; j++) {
					html += '<div class="col-md-4"><a href="#" class="thumbnail"><img data-src="holder.js/260x180" alt="260x180" style="width: 260px; height: 180px;" src="${rootPath}/resources/product/${product.id}/' + images[rows*3 + j]['fileName'] + '"></a><button class="btn btn-xs btn-danger" data-upload-id="' + images[rows*3 + j]['id'] + '">删除</button><button style="margin-left:8px;" class="btn btn-xs btn-default" data-cover="' + images[rows*3 + j]['fileName'] + '" data-upload-id="' + images[rows*3 + j]['id'] + '">设为封面</button></div>';
				}
				html += '</div>';
			}
			if (html) {
				$('#images-container').html(html);
			}
		});
	</script>
</body>
</html>

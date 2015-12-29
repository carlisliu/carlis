<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>产品信息</title>
	<link rel="stylesheet" media="screen" href="${adminAsset}/js/vendors/uploadify/uploadify.css">
	<link rel="stylesheet" media="screen" href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
</head>
<body class="bootstrap-admin-with-small-navbar">
	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">产品信息</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="product-form">
							<fieldset>
								<legend>产品信息</legend>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-name">产品名称</label>
									<div class="col-lg-10">
										<input class="form-control required" id="product-name" type="text"
											data-property="name" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-category-id">产品类别</label>
									<div class="col-lg-10">
										<s:select label="产品类别" name="category" list="categories"
											listKey="id" listValue="name" cssClass="form-control required" data-property="category.id">
										</s:select>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-description">产品描述</label>
									<div class="col-lg-10">
										<textarea rows="5" class="form-control"
											id="product-description" data-property="description"></textarea>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-pic-path">产品图片</label>
									<div class="col-lg-10">
										<input class="form-control" name="uploadFile" type="file" id="product-pic-path" data-property="picPath">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-parameters">产品主要技术参数</label>
									<div class="col-lg-10">
										<textarea rows="4" class="form-control"
											id="product-parameters" data-property="parameters"></textarea>
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="product-memo">备注</label>
									<div class="col-lg-10">
										<input class="form-control" id="product-memo" type="text"
											data-property="memo" value="">
									</div>
								</div>
								<button type="submit" class="btn btn-primary" id="product-save">保存</button>
								<button type="reset" class="btn btn-default" id="product-reset">重置</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	<!-- executing this code explicitly , don't know why, maybe need global context.-->
	<script type="text/javascript" src="${adminAsset}/js/vendors/uploadify/flash.js"></script>
	<script type="text/javascript">
		seajs.use('static/product/event');
	</script>
</body>
</html>

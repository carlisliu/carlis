<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
	<title>公司信息</title>
	<link rel="stylesheet" media="screen" href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
</head>
<body class="bootstrap-admin-with-small-navbar">
	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">公司信息</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal" id="company-form">
							<s:if test="%{company!=null}">
								<fieldset>
									<legend>公司信息</legend>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-name">公司名称</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="name">${company.name }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-address">公司地址</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="address">${company.address }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-keywords">宣传关键字</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="keywords">${company.keywords }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-tel">公司电话</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="tel">${company.tel }</span>
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-cell">手机</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="cell">${company.cell }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-fax">传真</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="fax">${company.fax }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-copyright">版权信息</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="copyright">${company.copyright }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-website">网址</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="website">${company.website }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-email">邮箱</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="email">${company.email }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-contact">联系人</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="contact">${company.contact }</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label"
											for="company-introduction">公司简介</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="introduction"
												style="height: auto;">${company.introduction }&nbsp;</span>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-memo">备注</label>
										<div class="col-lg-10">
											<span class="form-control" data-property="memo">${company.memo }</span>
										</div>
									</div>
									<button type="submit" class="btn btn-primary" id="company-edit">编辑</button>
								</fieldset>
							</s:if>
							<s:else>
								<fieldset>
									<legend>公司信息</legend>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-name">公司名称</label>
										<div class="col-lg-10">
											<input class="form-control required" id="company-name"
												type="text" data-property="name" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-address">公司地址</label>
										<div class="col-lg-10">
											<input class="form-control required" id="company-address"
												type="text" data-property="address"
												value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-keywords">宣传关键字</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-keywords" name="company-keywords" type="text"
												data-property="keywords" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-tel">公司电话</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-tel" type="text"
												data-property="tel" value="">
										</div>
									</div>

									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-cell">手机</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-cell" type="text"
												data-property="cell" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-fax">传真</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-fax" type="text"
												data-property="fax" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-copyright">版权信息</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-copyright"
												type="text" data-property="copyright"
												value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-website">网址</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-website" type="text"
												data-property="website" maxlength="45" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-email">邮箱</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-email" type="text"
												data-property="email" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-contact">联系人</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-contact" type="text"
												data-property="contact" value="">
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label"
											for="company-introduction">公司简介</label>
										<div class="col-lg-10">
											<textarea rows="5" class="form-control" id="company-introduction" data-property="introduction" value=""></textarea>
										</div>
									</div>
									<div class="form-group">
										<label class="col-lg-2 control-label" for="company-memo">备注</label>
										<div class="col-lg-10">
											<input class="form-control" id="company-memo" type="text"
												data-property="memo" value="">
										</div>
									</div>
									<button type="submit" class="btn btn-primary" id="company-save">保存</button>
									<button type="reset" class="btn btn-default" >重置</button>
								</fieldset>
							</s:else>
						</form>
					</div>
				</div>
			</div>
		</div>

	</div>
	</div>

	<script type="x/template" id="uneditable-mode">
		<fieldset>
			<legend>公司信息</legend>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-name">公司名称</label>
				<div class="col-lg-10">
					<input class="form-control required" id="company-name" name="company-name" type="text"
											data-property="name" value="${company.name }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-address">公司地址</label>
				<div class="col-lg-10">
					<input class="form-control required" id="company-address" name="company-address" type="text"
											data-property="address" value="${company.address }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-keywords">宣传关键字</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-keywords" name="company-keywords" type="text"
											data-property="keywords" value="${company.keywords}">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-tel">公司电话</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-tel" type="text"
						data-property="tel" value="${company.tel }">
				</div>
			</div>
		
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-cell">手机</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-cell" type="text"
						data-property="cell" value="${company.cell }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-fax">传真</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-fax" type="text"
						data-property="fax" value="${company.fax }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-copyright">版权信息</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-copyright" type="text"
						data-property="copyright" value="${company.copyright }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-website">网址</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-website" type="text"
						data-property="website" maxlength="45" value="${company.website }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-email">邮箱</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-email" type="text"
						data-property="email" value="${company.email }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-contact">联系人</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-contact" type="text"
						data-property="contact" value="${company.contact }">
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label"
					for="company-introduction">公司简介</label>
				<div class="col-lg-10">
					<textarea rows="5" class="form-control" id="company-introduction" data-property="introduction" >${company.introduction }</textarea>
				</div>
			</div>
			<div class="form-group">
				<label class="col-lg-2 control-label" for="company-memo">备注</label>
				<div class="col-lg-10">
					<input class="form-control" id="company-memo" type="text"
						data-property="memo" value="${company.memo }">
				</div>
			</div>
			<button type="submit" class="btn btn-primary" id="company-save">保存</button>
			<button type="reset" class="btn btn-default" id="company-cancel">取消</button>
		</fieldset>
	</script>
	<script type="text/javascript">
		seajs.use('static/company/event');
	</script>
</body>
</html>

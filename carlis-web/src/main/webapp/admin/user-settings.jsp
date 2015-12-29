<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>用户设置</title>
	<link rel="stylesheet" media="screen" href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
</head>
<body class="bootstrap-admin-with-small-navbar">
	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default bootstrap-admin-no-table-panel">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">用户信息</div>
					</div>
					<div
						class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
						<form class="form-horizontal">
							<fieldset>
								<legend>更改密码</legend>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="original-password">原密码</label>
									<div class="col-lg-10">
										<input class="form-control required" id="riginal-password"
											name="original-password" type="password"
											data-property="original" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label" for="new-password">新密码</label>
									<div class="col-lg-10">
										<input class="form-control required" id="new-password"
											name="new-password" type="password"
											data-property="newPassword" value="">
									</div>
								</div>
								<div class="form-group">
									<label class="col-lg-2 control-label"
										for="new-password-duplication">重复新密码</label>
									<div class="col-lg-10">
										<input class="form-control required"
											id="new-password-duplication" name="new-password-duplication"
											type="password" data-property="newPasswordDuplication"
											value="">
									</div>
								</div>
								<button type="submit" class="btn btn-primary" id="password-save">保存</button>
								<button type="reset" class="btn btn-default">重置</button>
							</fieldset>
						</form>
					</div>
				</div>
			</div>
		</div>
	</div>
	</div>
	<script type="text/javascript">
		seajs.use([ 'jQuery', 'validate', 'validate-option', 'jgrowl' ], function($, validate, option) {
			$.validator.setDefaults({
				onsubmit : false
			});
			$(document).on('click', '#password-save', function(e) {
				e.preventDefault();
				var form = $('form'), that = this;
				form.validate(option);
				if (form.valid()) {
					var data = {};
					$('input[type=password]').each(function() {
						var $this = $(this);
						data[$this.attr('data-property')] = $this.val();
					});
					console.log(data);
					if (data['original'] === data['newPassword']) {
						$.jGrowl('新旧密码不能相同');
						return;
					}
					if (data['newPasswordDuplication'] !== data['newPassword']) {
						$.jGrowl('两次输入的新密码不一致');
						return;
					}
					$.post('${adminRoot}/changePassword.action', data).done(function(data) {
						if (data && data.status === 'success') {
							$.jGrowl('更新成功');
							$(that).siblings().trigger('click');
						} else {
							$.jGrowl(data.msg || '更新失败');
						}
					}).fail(function(e) {
						$.jGrowl('更新失败');
					});
				}
			});
		});
	</script>
</body>
</html>

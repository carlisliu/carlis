<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
<head>
<title>产品查询</title>
<link rel="stylesheet" media="screen" href="${adminAsset}/css/DT_bootstrap.css">
</head>
<body class="bootstrap-admin-with-small-navbar">
	<!-- content -->
	<div class="col-md-10">
		<div class="row">
			<div class="col-lg-12">
				<div class="panel panel-default">
					<div class="panel-heading">
						<div class="text-muted bootstrap-admin-box-title">产品列表</div>
					</div>
					<div class="bootstrap-admin-panel-content">
						<table class="table table-striped table-bordered"
							id="product-list">
							<thead>
								<tr>
									<th class="hide">id</th>
									<th>序号</th>
									<th>产品名称</th>
									<th>产品类别</th>
									<th>图片(张)</th>
									<th>操作</th>
								</tr>
							</thead>
							<tbody>
								<s:iterator value="products" id="product" status="stuts">
									<s:if test="#stuts.odd == true">
										<tr class="odd gradeX">
									</s:if>
									<s:else>
										<tr class="even gradeC">
									</s:else>
									<td><s:property value="#stuts.index+1" /></td>
									<td data-property="id" class="hide"><s:property value="id" />
									</td>
									<td data-property="name"><a
										href="${adminRoot}/productDetail.action?id=<s:property value="id"/>"
										target="_blank"><s:property value="name" /></a></td>
									<td data-property="category.name"><s:property
											value="category.name" /></td>
									<td><s:property value="uploads.size()" /></td>
									<td class="actions"><a href="#del-modal"
										data-toggle="modal">
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
					<button type="button" class="btn btn-danger"
						data-persistence="delete">删除</button>
				</div>
			</div>
		</div>
	</div>

	<script type="text/javascript">
		seajs.use([ 'jQuery', 'datatable', 'bootstrap', 'dt-bootstrap', 'jgrowl' ], function($) {

			/* Table initialisation */
			$(document).ready(function() {
				$('#product-list').dataTable({
					"sDom" : "<'row'<'col-md-6'l><'col-md-6'f>r>t<'row'<'col-md-6'i><'col-md-6'p>>",
					"sPaginationType" : "bootstrap",
					"oLanguage" : {
						"sLengthMenu" : "_MENU_ 条记录每页"
					}
				});

				$(document).on('click', '[data-persistence=delete]', function(e) {
					e.preventDefault();
					var that = this;
					var target = $(document).data('_target').parents('tr');
					var id = $.trim(target.find('[data-property=id]').html());
					$.post(window['__actionBase__'] + '/deleteProduct.action', {
						id : parseInt(id)
					}).done(function(data) {
						if (data && data.status === 'success') {
							target.remove();
							$(that).siblings().click();
							$.jGrowl('删除成功');
						} else {
							$.jGrowl(data.msg);
						}
					}).fail(function(e) {
						$.jGrowl('删除失败');
					});
				}).on('click', 'td .btn-danger', function(e) {
					e.preventDefault();
					$(document).data('_target', $(this));
				});
			});
		});
	</script>
</body>
</html>

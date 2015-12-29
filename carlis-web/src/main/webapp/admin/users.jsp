<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html>
<html>
    <head>
        <title>用户信息</title>
        <link rel="stylesheet" media="screen" href="${adminAsset}/vendors/jGrowl/jquery.jgrowl.css">
    </head>
    <body class="bootstrap-admin-with-small-navbar">
        <!-- content -->
        <div class="col-md-10">
            <div class="row">
                <div class="col-lg-12">
                    <div class="panel panel-default bootstrap-admin-no-table-panel">
                        <div class="panel-heading">
                            <div class="text-muted bootstrap-admin-box-title">新增用户信息</div>
                        </div>
                        <div class="bootstrap-admin-no-table-panel-content bootstrap-admin-panel-content collapse in">
                            <form class="form-horizontal" id="category-form">
                                <fieldset>
                                    <legend>类别信息</legend>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" for="category-name">用户名称</label>
                                        <div class="col-lg-10">
                                            <input class="form-control" id="category-name" type="text" data-property="name" value="">
                                        </div>
                                    </div>
                                    <div class="form-group">
                                        <label class="col-lg-2 control-label" for="category-memo">备注</label>
                                        <div class="col-lg-10">
                                            <input class="form-control" id="category-memo" type="text" data-property="memo" value="">
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
                        	<div class="text-muted bootstrap-admin-box-title">用户信息列表</div>
                        </div>
                        <div class="bootstrap-admin-panel-content">
                        	<table class="table bootstrap-admin-table-with-actions">
                            	<thead>
                                	<tr>
                                    	<th>序号</th>
                                        <th>用户名</th>
                                        <th>备注</th>
                                        <th>操作</th>
                                    </tr>
                                </thead>
                                <tbody>
                                	<tr>
                                    	<td>1</td>
                                        <td>Mark</td>
                                        <td>Otto</td>
                                        <td class="actions">
                                        	<a href="#">
                                            	<button class="btn btn-sm btn-primary">
                                                	<i class="glyphicon glyphicon-pencil"></i>Edit
                                                </button>
                                            </a>
                                            <a href="#">
                                            	<button class="btn btn-sm btn-danger">
                                                	<i class="glyphicon glyphicon-trash"></i>Delete
                                                </button>
                                            </a>
                                        </td>
                                   	</tr>
                                </tbody>
                            </table>
                        </div>
                    </div>
                </div>
            </div>
        </div>

		<script type="text/javascript">
			seajs.use('static/user/event');
		</script>
    </body>
</html>

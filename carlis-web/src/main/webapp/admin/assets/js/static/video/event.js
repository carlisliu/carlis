/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), Video = require('./video'), option = require('../utils/validate-option'), util = require('../utils/util');
	require('bootstrap');
	require('jgrowl');
	require('validate');

	$.validator.setDefaults({
		onsubmit : false
	});

	$(function() {
		var video = new Video('#video-form', '#video-upd-template');

		$('#video-save').on('click', function(e) {
			e.preventDefault();
			var form = $('form');
			form.validate(option);
			if (form.valid()) {
				video.save(function(data) {
					$('#video-content').prepend(util.template($.trim($('#video-row-template').html()), data.video));
					$('#video-reset').click();
					$.jGrowl('保存成功');
				});
			}
		});

		$('#video-content').on('click', 'td .btn-primary', function(e) {
			e.preventDefault();
			var data = {}, parent = $(this).parents('tr');
			parent.find('[data-property]').each(function(index, content) {
				var $this = $(this);
				data[$this.attr('data-property')] = $.trim($this.html());
			});
			video.setUpdateFormValue(data, parent);
		}).on('click', 'td .btn-danger', function(e) {
			e.preventDefault();
			$(document).data('_removeTarget', $(this).parents('tr'));
		}).on('click', 'td .btn-success', function(e) {
			e.preventDefault();
			var id = $.trim($(this).parents('tr').find('[data-property="id"]').html()), that = this;
			video.tongle(parseInt(id), true, function() {
				$(that).removeClass('btn-success btn-default').addClass('btn-default').html('取消显示');
				$.jGrowl('设置成功');
			});
			$(document).data('_removeTarget', $(this).parents('tr'));
		}).on('click', 'td .btn-default', function(e) {
			e.preventDefault();
			var id = $.trim($(this).parents('tr').find('[data-property="id"]').html()), that = this;
			video.tongle(id, false, function() {
				$(that).removeClass('btn-success btn-default').addClass('btn-success').html('首页显示');
				$.jGrowl('设置成功');
			});
		});

		$(document).on('click', '[data-persistence="save"]', function(e) {
			e.preventDefault();
			var form = $('#video-form-upd'), $this = $(this);
			form.validate(option);
			if (form.valid()) {
				video.update(form, function(data) {
					$this.siblings().click();
					$(document).data('_target').find('[data-property]').each(function(index, content) {
						var $this = $(this);
						$this.html(data.video[$this.attr('data-property')]);
					});
					$(document).removeData('_target');
					$.jGrowl('保存成功');
				});
			}
		}).on('click', '[data-persistence="delete"]', function(e) {
			e.preventDefault();
			var removeTarget = $(document).data('_removeTarget'), that = this;
			video.remove($.trim(removeTarget.find('[data-property="id"]').html()), function() {
				$(that).siblings().click();
				removeTarget.remove();
				$(document).removeData('_removeTarget');
				$.jGrowl('删除成功');
			});
		});

	});
});
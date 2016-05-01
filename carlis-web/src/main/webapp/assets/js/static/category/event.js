/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), Category = require('./category'), option = require('../utils/validate-option'), util = require('../utils/util');
	require('bootstrap');
	require('jgrowl');
	require('validate');

	$.validator.setDefaults({
		onsubmit : false
	});

	$(function() {
		var category = new Category('#category-form', '#category-upd-template');
		$('#category-save').on('click', function(e) {
			e.preventDefault();
			var form = $('form');
			form.validate(option);
			if (form.valid()) {
				category.save(function(data) {
					$('#category-content').prepend(util.template($.trim($('#category-row-template').html()), data.category));
					$('#category-reset').click();
					$.jGrowl('保存成功');
				});
			}
		});

		$('#category-content').on('click', 'td .btn-primary', function(e) {
			e.preventDefault();
			var data = {}, parent = $(this).parents('tr');
			parent.find('[data-property]').each(function(index, content) {
				var $this = $(this);
				data[$this.attr('data-property')] = $.trim($this.html());
			});
			category.setUpdateFormValue(data, parent);
		}).on('click', 'td .btn-danger', function(e) {
			e.preventDefault();
			$(document).data('_removeTarget', $(this).parents('tr'));
		});

		$(document).on('click', '[data-persistence="save"]', function(e) {
			e.preventDefault();
			var form = $('#category-update-form'), $this = $(this);
			form.validate(option);
			if (form.valid()) {
				category.update(form, function(data) {
					$this.siblings().click();
					$(document).data('_target').find('[data-property]').each(function(index, content) {
						var $this = $(this);
						$this.html(data.category[$this.attr('data-property')]);
					});
					$(document).removeData('_target');
					$.jGrowl('保存成功');
				});
			}
		}).on('click', '[data-persistence="delete"]', function(e) {
			e.preventDefault();
			var removeTarget = $(document).data('_removeTarget'), that = this;
			category.remove($.trim(removeTarget.find('[data-property="id"]').html()), function() {
				$(that).siblings().click();
				removeTarget.remove();
				$(document).removeData('_removeTarget');
				$.jGrowl('删除成功');
			});
		});
	});
});
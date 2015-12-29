/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), Company = require('./company'), option = require('../utils/validate-option');
	require('bootstrap');
	require('jgrowl');
	require('validate');

	$.validator.setDefaults({
		onsubmit : false
	});

	$(function() {
		// data-property="introduction"
		$(document).on('click', '#company-edit', function(e) {
			e.preventDefault();
			var uneditable = $(this).parents('fieldset');
			$(document).data('uneditable-form', uneditable);
			uneditable.replaceWith($.trim($('#uneditable-mode').html()));
		}).on('click', '#company-save', function(e) {
			e.preventDefault();
			var company = new Company('#company-form');
			var form = $('#company-form');
			form.validate(option);
			if (form.valid()) {
				company.save(function(data) {
					$.jGrowl('保存成功');
					setTimeout(function() {
						location.reload();
					}, 1500);
				});
			}
		}).on('click', '#company-cancel', function(e) {
			e.preventDefault();
			$('form fieldset').replaceWith($(document).data('uneditable-form'));
		});
	});
});
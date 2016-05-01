/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), Product = require('./product'), option = require('../utils/validate-option');
	require('jgrowl');
	require('validate');

	$.validator.setDefaults({
		onsubmit : false
	});

	$(function() {
		var product = new Product('#product-detail-form');
		product.bindUploadify();
		var form = $('form');
		$(document).on('click', '#product-save', function(e) {
			e.preventDefault();
			form.validate(option);
			if (form.valid()) {
				product.update(function(data) {
					$.jGrowl('产品基本信息保存成功');
					setTimeout(function() {
						location.reload();
					}, 1500);
				});
			}
		}).on('click', '#product-edit', function(e) {
			e.preventDefault();
			form.html($.trim($('#product-upd-template').html()));
		}).on('click', '#images-container button.btn-danger', function(e) {
			e.preventDefault();
			var that = this;
			product.deleteImage(parseInt($(this).attr('data-upload-id')), function() {
				$(that).parents('div.col-md-4').remove();
				$.jGrowl('删除成功');
			});
		}).on('click', '#images-container button.btn-default', function(e) {
			e.preventDefault();
			var $this = $(this);
			product.setCoverImage(parseInt($('#product-id-global').val()), $this.attr('data-cover'), function() {
				$.jGrowl('设置成功');
			});
		}).on('click', '#product-upload', function(e) {
			e.preventDefault();
			product.data = product.data || {};
			product.data.id = $('#product-id-global').val();
			product.triggerUploadify();
		});

	});
});
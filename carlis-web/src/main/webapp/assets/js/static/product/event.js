/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), Product = require('./product'), option = require('../utils/validate-option'), sp = require('../utils/sub-pub');
	require('jgrowl');
	require('validate');

	$.validator.setDefaults({
		onsubmit : false
	});

	$(function() {
		var product = new Product('#product-form');
		product.bindUploadify();
		var form = $('form');
		$('#product-save').on('click', function(e) {
			e.preventDefault();
			form.validate(option);
			if (form.valid()) {
				$(document).queue('product', function(next) {
					product.save(function(data) {
						$.jGrowl('产品信息保存成功，正在上传图片...');
						product.data.id = data.product.id;
						next();
					});
				}).queue('product', function(next) {
					sp.subscribe('success', function() {
						$('#product-reset').trigger('click');
						$.jGrowl('保存成功');
					}).subscribe('fail', function() {
						$('#product-reset').trigger('click!');
						$.jGrowl(product.getUploadResult());
					});
					next();
				}).queue('product', function(next) {
					product.triggerUploadify();
					next();
				}).dequeue('product');
			}
		});
		$('#product-reset').on('click.upload', function(e) {
			product.cancelUploadify();
		});
	});
});
/**
 * Carlis
 */
define(function(require, exports, module) {

	var $ = require('jQuery'), util = require('../utils/util'), Base = require('../base/base'), sp = require('../utils/sub-pub');
	require('uploadify');

	function Product(container, template) {
		Base.call(this, container, template);
	}

	module.exports = Product;

	Product.prototype = {
		bindUploadify : function() {
			var that = this;
			$('#product-pic-path').uploadify({
				'swf' : window['__base__'] + '/js/vendors/uploadify/uploadify.swf',
				'uploader' : window['__actionBase__'] + '/uploadImages.action',
				'fileObjName' : 'uploadFile',
				'auto' : false,
				'onUploadError' : function(file, errorCode, errorMsg, errorString) {
					// alert('The file ' + file.name + ' could not be uploaded:
					// ' + errorString);
				},
				'onUploadSuccess' : function(file, data, response) {
					// alert('The file ' + file.name + ' was successfully
					// uploaded ' + response + ':' + data);
				},
				'buttonText' : '选择图片'
			});
			return this;
		},
		triggerUploadify : function() {
			$("#product-pic-path").uploadify("settings", "formData", {
				'productId' : this.data.id
			});
			$('#product-pic-path').uploadify('upload', '*');
			return this;
		},
		cancelUploadify : function() {
			$('#product-pic-path').uploadify('cancel', '*');
			return this;
		},
		save : function(callback) {
			this.data = this.collectData(this.container);
			return this.post(window['__actionBase__'] + '/saveProduct.action', util.addPrefix(this.data, 'product'),
					callback);
		},
		update : function(callback) {
			this.data = this.collectData(this.container);
			return this.post(window['__actionBase__'] + '/updateProduct.action', util.addPrefix(this.data, 'product'),
					callback);
		},
		deleteImage : function(id, callback) {
			return this.post(window['__actionBase__'] + '/deleteProductImage.action', {
				id : id
			}, callback);
		},
		setCoverImage : function(id, cover, callback) {
			return this.post(window['__actionBase__'] + '/setCoverImage.action', {
				id : id,
				cover : cover
			}, callback);
		},
		getUploadResult : function() {
			return '';
		}
	};

	util.inherits(Product, Base);
});
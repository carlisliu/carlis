/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery');
	require('uploadify');
	require('bootstrap');
	require('validate');
	require('jgrowl');
	var validateOption = require('../utils/validate-option');

	$.validator.setDefaults({
		onsubmit : false
	});

	var defaultOpt = {
		'swf' : window['__base__'] + '/js/vendors/uploadify/uploadify.swf',
		'uploader' : window['__actionBase__'] + '/uploadSetting.action',
		'fileObjName' : 'uploadObj',
		'auto' : false,
		'onUploadError' : function(file, errorCode, errorMsg, errorString) {
			$.jGrowl('文件(' + file.name + ')上传失败：' + errorString);
		},
		'onUploadSuccess' : function(file, data, response) {
			data = $.parseJSON(data);
			if (data.status != 'success') {
				$.jGrowl(data.msg);
			} else {
				$.jGrowl('文件(' + file.name + ')上传成功');
			}
		},
		'onSelectError' : function() {
			$.jGrowl('只能选择一个文件');
		},
		'buttonText' : '选择图片',
		'multi' : false,
		'queueSizeLimit' : 1
	};

	function bindUploadify(target, opt) {
		if ($.type(target) === 'array') {
			$.each(target, function(index, item) {
				item.uploadify($.extend({}, defaultOpt, opt));
			});
		} else {
			target.uploadify($.extend({}, defaultOpt, opt));
		}
	}

	var targets = {
		'logo' : $('#logo'),
		'icon' : $('#icon'),
		'wechat' : $('#wechat')
	};

	var options = {
		'logo' : {},
		'icon' : {},
		'wechat' : {}
	};

	$.each(targets, function(key, target) {
		bindUploadify(target, options[key] || {});
	});

	bindUploadify([ $('#process'), $('#banner') ], {
		'multi' : true,
		'queueSizeLimit' : 20
	});

	$(document).on('click', '#settings-save, #process-save, #banner-save', function(e) {
		e.preventDefault();
		var $this = $(this), id = $this.attr('id'), type = $this.attr('data-type');
		if (id === 'settings-save') {
			$.each(targets, function(key, target) {
				target.uploadify("settings", "formData", {
					'type' : key
				});
				target.uploadify('upload', '*');
			});
		} else {
			var data = {
				'type' : type
			};
			data['picture.type'] = data['type'];
			var target = $this.siblings().find('object').parent();
			target.uploadify("settings", "formData", data);
			target.uploadify('upload', '*');
		}
	}).on('click', 'button[data-action=tongle]', function(e) {
		e.preventDefault();
		var target = $(this);
		post('/tongleActive.action', $.trim(target.attr('data-id')), function(data) {
			var cssClass = Boolean(data.picture.inIndex);
			target.removeClass('btn-primary btn-default').addClass(cssClass ? 'btn-default' : 'btn-primary');
			target.html(cssClass ? '取消首页显示' : '设置首页显示')
		});

	}).on('click', 'button[data-action=delete]', function(e) {
		e.preventDefault();
		var target = $(this);
		post('/deletePicture.action', $.trim(target.attr('data-id')), function() {
			target.parents('.col-md-4').remove();
		});
	}).on('click', '#pic-num-save', function(e) {
		e.preventDefault();
		var form = $('#setting-form');
		form.validate(validateOption);
		if (form.valid()) {
			var data = {}, bannerNum = $.trim($('#banner-num').val()), processNum = $.trim($('#process-num').val());
			if (!bannerNum && !processNum) {
				$.jGrowl('没有填写数量，无需保存');
				return;
			}
			bannerNum = parseInt(bannerNum);
			processNum = parseInt(processNum);
			if (bannerNum <= 0) {
				$.jGrowl('Banner数量填写错误');
				return;
			} else {
				data['setting.bannerNum'] = bannerNum;
			}
			if (processNum <= 0) {
				$.jGrowl('流程数量填写错误');
				return;
			} else {
				data['setting.processNum'] = processNum;
			}
			data['setting.qq'] = $('#qq-code').val();
			$.post(window['__actionBase__'] + '/saveNumbers.action', data).done(function(data) {
				if (data.status != 'success') {
					$.jGrowl(data.msg);
				} else {
					$.jGrowl('操作成功');
				}
			}).fail(function(e) {
				$.jGrowl('操作失败');
			});
		}
	});

	function post(action, id, callback) {
		$.post(window['__actionBase__'] + action, {
			'picture.id' : id
		}).done(function(data) {
			if (data.status != 'success') {
				$.jGrowl(data.msg);
			} else {
				callback && callback(data);
				$.jGrowl('操作成功');
			}
		}).fail(function(e) {
			$.jGrowl('操作失败');
		});
	}
});
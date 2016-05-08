/**
 * 
 */
define('static/scenic/introduction/event', [ 'jquery', 'aiyou', '../../utils/util', 'uploadify' ], function(require,
		exports, module) {
	require('aiyou')
	require('uploadify');
	var $ = require('jquery');
	var util = require('../../utils/util');

	$(function() {
		$('#editBasic').data('modal-option', {
			requestBeforeClose : function(close, container) {
				var postData = util.getData(container);
				$.post(window['__base__'] + '/introduction/save.html', postData).done(function(data) {
					if (data.status === 'success') {
						close();
						util.updateContainer($('.basic-spot'), postData);
					} else {
						alert(data.message || '保存异常');
					}
				}).fail(function(e) {
					alert(e.message || '系统保存异常!');
				});
			}
		});

		$('#spotEdit').data('modal-option', {
			beforeOpen : function() {
			},
			opened : function(container) {
				var uploader = container.find('#spot-uploader');
				uploader.uploadify({
					'swf' : window['__static__'] + '/js/vendors/uploadify/uploadify.swf',
					'uploader' : window['__base__'] + '/common/upload.html',
					'fileObjName' : 'uploadFile',
					'onUploadError' : function(file, errorCode, errorMsg, errorString) {
						console.log(arguments);
					},
					'onUploadSuccess' : function(file, data, response) {
						console.log(arguments);
					},
					'buttonClass': 'flie-btn',
					'itemTemplate': true,
					'buttonText': '选择图片',
					'debug': false,
					'formData': {id:1}
				});
			}
		});

		$('#publish-scenic').click(function(e) {
			e.preventDefault();
			var $this = $(this);
			var published = !!$this.attr('data-published');
			var scenicSpotId = $.trim($this.attr('data-scenic-spot-id'));
			if (scenicSpotId) {
				scenicSpotId = parseInt(scenicSpotId, 10);
			}
			var data = util.addPrefix({
				published : !published,
				scenicSpotId : scenicSpotId
			}, 'scenicSpot');
			$.post(window['__base__'] + '/introduction/publish.html', data).done(function(data) {
				if (data.status === 'success') {
					window.location.reload();
				}
			}).fail(function(e) {
				alert('操作失败')
			});

		})
	})
});
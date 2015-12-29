/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), util = require('../utils/util');
	require('jgrowl');

	function Base(container, template) {
		this.container = $(container);
		this.template = $.trim($(template).html());
		this.updateModal = $('#upd-modal');
		this.data = null;
	}

	module.exports = Base;

	Base.prototype = {
		collectData : function(container) {
			var data = {};
			container.find('input[type=text], input[type=hidden], textarea, select').each(function(index, content) {
				var $this = $(this), val = $.trim($this.val()), key = $this.attr('data-property');
				data[key] = val;
			});
			return data;
		},
		post : function(url, params, callback) {
			$.post(url, params).done(function(data) {
				if (data && data.status !== 'success') {
					return $.jGrowl(data.msg);
				}
				callback(data);
			}).fail(function(e) {
				$.jGrowl((e && e.message ? e.message : e.toString()) || 'Error');
			});
			return this;
		},
		setUpdateFormValue : function(data, target) {
			var tmp = $('<div>' + util.template(this.template, data) + '</div>');
			$.each(data, function(key, value) {
				tmp.find('[data-property="' + key + '"]').val(value);
			});
			$(document).data('_target', target);
			this.updateModal.find('.modal-body').html(tmp.html());
			return this;
		}
	};
});

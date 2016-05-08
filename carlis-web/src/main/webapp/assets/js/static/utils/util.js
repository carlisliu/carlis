/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jquery');
	module.exports = {
		inherits : function(ctor, superCtor) {
			if (!superCtor || !superCtor.prototype) {
				throw new TypeError('super construcotr is required.');
			}
			function F() {
			}
			F.prototype = superCtor.prototype;
			var f = new F();
			for ( var key in f) {
				ctor.prototype[key] = f[key];
			}
			return ctor;
		},
		addPrefix : function(data, prefix) {
			var result;
			if (!prefix || typeof prefix !== 'string') {
				return data;
			}
			result = {};
			if ($.type(data) === 'object') {
				$.each(data, function(key, val) {
					result[prefix + '.' + key] = val;
				});
			} else if ($.type(data) === 'array') {
				$.each(data, function(index, content) {
					$.each(content, function(key, value) {
						result[prefix + '[' + index + '].' + key] = val;
					});
				});
			}
			return result;
		},
		template : function(tmpl, data) {
			if (!tmpl || !data) {
				return tmpl;
			}
			return tmpl.replace(/\{(\w+.?\w+)\}/g, function(m, i) {
				return data[i] || '';
			}).replace(/\{(\d+)\}/g, function(m, i) {
				return data[i] || '';
			});
		},
		getData : function(container) {
			var data = {};
			container.find('input[type=text], input[type=hidden], textarea, select').each(function(index, content) {
				var $this = $(this), val = $.trim($this.val()), key = $this.attr('data-property');
				key && (data[key] = val);
			});
			return data;
		},
		updateContainer : function(container, data) {
			if (container) {
				var targets = container.find('[data-property]');
				targets.each(function() {
					var $target = $(this);
					var key = $target.attr('data-property');
					if (key) {
						var isValueEl = $target.is('input') || $target.is('select') || $target.is('textarea');
						if (isValueEl) {
							$target.val(data[key] || '');
						} else {
							$target.html(data[key] || '');
						}
					}
				});
			}
		}
	}
});

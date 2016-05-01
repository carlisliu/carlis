/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery');
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
		}
	}
});

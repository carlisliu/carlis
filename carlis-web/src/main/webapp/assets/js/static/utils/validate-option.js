/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery');
	module.exports = {
		highlight : function(label) {
			$(label).parents('.form-group').removeClass('has-success').addClass('has-error');
		},
		success : function(label) {
			$(label).parents('.form-group').removeClass('has-error').addClass('has-success');
		}
	};
});
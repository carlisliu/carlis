/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), _target = $({});

	module.exports = {
		subscribe : function(name, fn) {
			_target.bind(name, fn);
			return this;
		},
		unsubscribe : function(name) {
			_target.unbind(name);
			return this;
		},
		publish : function(name) {
			_target.trigger(name);
			return this;
		}
	}
});
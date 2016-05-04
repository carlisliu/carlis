/**
 * Carlis Liu
 * 
 * Component Module
 */
define('static/base/component', [ 'jquery', '../utils/util', '../utils/events' ], function(require, exports, module) {
	var $ = require('jquery');
	var util = require('../utils/util');
	var Event = require('../utils/events');

	function Component(container) {
		this.container = $(container) || $('form');
		// optimization for v8 hidden class
		this.validated = false;
		Event.call(this);
	}

	module.exports = Component;

	var fn = Component.prototype = {};

	fn.data = function() {
		return util.getData(this.container);
	};

	fn.render = function(data) {
		return util.template(this.container, data);
	};

	fn.save = function() {
		var that = this;

		var data = this.data();

		this.emit('data', data, this);

		// add intercept for state check, if `check` event can proceed to this
		// point, means all user validation already passed.
		this.on('check', function() {
			that.validated = true;
		});
		this.emit('check', this);

		if (this.validated) {
			this.emit('submit', data, this);
		}
		return this;
	};

	util.inherits(Component, Event);

});
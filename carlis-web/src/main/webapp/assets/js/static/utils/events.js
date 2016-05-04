/**
 * Carlis Liu
 * 
 * Mini Event Module
 * 
 */
define('static/utils/events', [ 'jquery' ], function(require, exports, module) {
	var $ = require('jquery');

	function Event(opt) {
		this._eventOpt = opt || {};
		this.callbacks = {};
	}

	module.exports = Event;

	var fn = Event.prototype = {};

	fn.on = function(event, handler) {
		if (typeof event === 'string') {
			if (typeof handler === 'function') {
				(this.callbacks[event] || (this.callbacks[event] = [])).push(handler);
			} else if (typeof handler === 'object' && handler.length) {
				var that = this;
				each(hanlder, function(h) {
					that.on(event, h);
				});
			}
		}
		return this;
	};

	fn.once = function(event, handler) {
		var that = this;
		if (typeof handler === 'function') {
			this.on(event, function(){
				handler.apply(this, arguments);
				that.off(event, handler);
			})
		} else {
			hanlder.push(function(){
				each(hanlder, function(h){
					that.off(event, h);
				});
			});
			this.on(event, handler);
		}
		return this;
	};

	fn.off = function(event, handler) {
		if (!handler) {
			this.callbacks[event] = [];
		} else {
			var callbacks = this.callbacks;
			each(callbacks, function(callback, index){
				if (handler === callback) {
					callbacks.splice(index, 1);
					return false;
				}
			});
		}
		return this;
	};

	fn.emit = function(event) {
		var args = Array.prototype.slice.call(arguments, 1);
		var callbacks = this.callbacks[event];
		if (callbacks) {
			each(callbacks, function(callback){
				return callback.apply(this, args);
			});
		}
	};

	function each(arr, callback) {
		if (arr) {
			for (var i = 0, length = arr.length; i < length; i++) {
				if (callback.call(arr, arr[i], i) === false) {
					break;
				}
			}
		}
	}

});
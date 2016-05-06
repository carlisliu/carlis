/**
 * AiYou UI Plugins
 * 
 * Version: 1.0.0
 * 
 * Carlis Liu
 */
define('aiyou', [ 'jquery' ], function(require, exports, module) {

	var AiYou = module.exports = {};
	AiYou.version = 'v1.0.0';

	AiYou.Modal = function() {
		function Modal() {
		}

		var modal = Modal.prototype = {};

		modal.show = function() {
		};

		modal.hide = function() {
		};

		return Modal;
	}();

	AiYou.DropDown = function() {
		function DropDown() {
		}

		var dropDown = DropDown.prototype = {};

		dropDown.show = function() {
		};

		dropDown.hide = function() {
		};

		return DropDown;
	}();

});
/**
 * AiYou UI Plugins
 * 
 * Version: 1.0.0
 * 
 * Carlis Liu
 */
define('aiyou', [ './modal' ], function(require, exports, module) {

	module.exports = AiYou = {};

	AiYou.Modal = require('./modal');
});
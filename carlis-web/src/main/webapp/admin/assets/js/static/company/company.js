/**
 * Carlis
 */
define(function(require, exports, module) {

	var $ = require('jQuery'), util = require('../utils/util'), Base = require('../base/base');

	function Company(container, template) {
		Base.call(this, container, template);
	}

	module.exports = Company;

	Company.prototype = {
		save : function(callback) {
			this.data = this.collectData(this.container);
			return this.post(window['__actionBase__'] + '/saveCompany.action', util.addPrefix(this.data, 'company'), callback);
		}
	};

	util.inherits(Company, Base);

});
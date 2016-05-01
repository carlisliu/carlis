/**
 * Category
 */
define(function(require, exports, module) {

	var $ = require('jQuery'), Base = require('../base/base'), util = require('../utils/util');

	function Category(container, template) {
		Base.call(this, container, template);
	}

	module.exports = Category;

	Category.prototype = {
		save : function(callback) {
			this.data = this.collectData(this.container);
			return this.post(window['__actionBase__'] + '/saveCategory.action', util.addPrefix(this.data, 'category'), callback);
		},
		update : function(container, callback) {
			this.data = this.collectData(container);
			return this.post(window['__actionBase__'] + '/updateCategory.action', util.addPrefix(this.data, 'category'), callback);
		},
		remove : function(id, callback) {
			return this.post(window['__actionBase__'] + '/deleteCategory.action', {
				'category.id' : parseInt(id)
			}, callback);
		}
	};

	util.inherits(Category, Base);
});
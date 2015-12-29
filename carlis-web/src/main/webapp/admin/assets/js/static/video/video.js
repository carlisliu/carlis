/**
 * Carlis
 */
define(function(require, exports, module) {
	var $ = require('jQuery'), Base = require('../base/base'), util = require('../utils/util');

	function Video(container, template) {
		Base.call(this, container, template);
	}

	module.exports = Video;

	Video.prototype = {
		save : function(callback) {
			this.data = this.collectData(this.container);
			return this.post(window['__actionBase__'] + '/saveVideo.action', util.addPrefix(this.data, 'video'),
					callback);
		},
		remove : function(id, callback) {
			return this.post(window['__actionBase__'] + '/deleteVideo.action', {
				id : id
			}, callback);
		},
		update : function(container, callback) {
			this.data = this.collectData(container);
			return this.post(window['__actionBase__'] + '/updateVideo.action', util.addPrefix(this.data, 'video'),
					callback);
		},
		tongle : function(id, inIndex, callback) {
			return this.post(window['__actionBase__'] + '/tongleVideoActive.action', {
				'video.id' : id,
				'video.inIndex' : inIndex
			}, callback);
		}
	};

	util.inherits(Video, Base);
});
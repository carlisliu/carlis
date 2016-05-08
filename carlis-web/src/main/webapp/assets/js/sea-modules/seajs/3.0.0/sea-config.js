(function(seajs, base) {
	seajs.config({
		base : base + '/js',
		alias : {
			'jquery' : 'sea-modules/jquery/2.0.3/jquery.js',
			'aiyou' : 'aiyou/aiyou.js',
			'uploadify' : 'vendors/uploadify/jquery.uploadify.js'
		},
		paths: {
			'aiyou': 'sea-modules/aiyou/1.0.0'
		}
	});
})(seajs, window['__static__']);
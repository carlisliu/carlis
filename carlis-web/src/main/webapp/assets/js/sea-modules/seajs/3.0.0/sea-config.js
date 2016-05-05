(function(seajs, base) {
	seajs.config({
		base : base + '/js',
		alias : {
			'jquery' : 'sea-modules/jquery/2.0.3/jquery.js'
		}
	});
})(seajs, window['__static__']);
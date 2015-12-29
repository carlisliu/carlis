(function(seajs, base) {
	seajs.config({
		base: base + '/javascripts',
		alias: {
			'jquery': 'sea-modules/jquery/1.7.2/jquery.js',
			'superslide': 'sea-modules/superslide/2.1.1/jquery.superslide.js'
		}
	});
})(seajs, window['__viewassets__']);
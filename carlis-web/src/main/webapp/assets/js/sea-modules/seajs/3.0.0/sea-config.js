(function(seajs, base) {
	seajs.config({
		base : base + '/js',
		alias : {
			'jquery' : 'sea-modules/jquery/2.0.3/jquery.js',
			'bootstrap' : 'sea-modules/bootstrap/3.1.1/bootstrap.js',
			'hover-dropdown' : 'sea-modules/bootstrap-hover-dropdown/0.0.0/twitter-bootstrap-hover-dropdown.min.js',
			'validate' : 'sea-modules/validate/1.13.1/jquery.validate.js',
			'validate-option' : 'static/utils/validate-option',
			'jgrowl' : 'vendors/jGrowl/jquery.jgrowl.js',
			'datatable' : 'vendors/datatables/jquery.dataTables.min.js',
			'dt-bootstrap' : 'vendors/dt/DT_bootstrap.js',
			'uploadify' : 'vendors/uploadify/jquery.uploadify.js',
			'uniform' : 'vendors/uniform/jquery.uniform.js'
		}
	});
})(seajs, window['__static__']);
/**
 * AiYou UI Plugins
 * 
 * Version: 1.0.0
 * 
 * Carlis Liu
 */
define('aiyou/modal', [ 'jquery' ], function(require, exports, module) {

	function Modal(el, options) {
		this.$el = $(el);
		this.options = $.extend({}, options || {});
		this.shadow = null;
		this.isScript = false;
	}

	Modal.DEFAULT_OPTS = {};

	var modal = Modal.prototype = {};

	modal.show = function() {
		var options = this.options;
		var el = this.$el;
		if (options.beforeOpen) {
			options.beforeOpen(this.$el, this);
		}
		var shadow = this.shadow = $('div.shadow');
		if (!shadow.length) {
			shadow = $('<div class="shadow"></div>');
		}
		shadow.show();
		if ((this.isScript = el.is('script'))) {
			this.$el = $($.trim(el.html())).appendTo('body').show();
		} else {
			el.show();
		}
		el.trigger('show.ay.modal');
		
		var that = this;
		this.$el.on('click.ay.close', '[data-close=close]', function(e) {
			var $this = $(this);
			if ($this.is('a')) {
				e.preventDefault();
			}
			if ($this.attr('check-required')) {
				$this.trigger('check');
				if ($this.attr('check-passed')) {
					that.hide();
				}
			} else {
				that.hide();
			}
		});
		this.$el.on('click.ay.close', '[data-remote-close=close]', function(e) {
			var $this = $(this);
			if ($this.is('a')) {
				e.preventDefault();
			}
			if ($this.attr('check-required')) {
				$this.trigger('check');
			}
			var done = options.requestBeforeClose; 
			done && done($.proxy(that.hide, that), that.$el, that);
		});
		if (options.opened) {
			options.opened(this.$el, this);
		}
		return this;
	};

	modal.hide = function() {
		this.shadow.hide();
		if (this.isScript) {
			this.$el.remove();
		} else {
			this.$el.hide();
		}
		this.$el.trigger('hidden.ay.modal');
		this.$el.off('click.ay.close');
		return this;
	};

	$(document).on('click.ay.modal', '[data-behavior=modal]', function(e) {
		var $this = $(this);
		var options = $this.data('modal-option') || {};
		var href = $this.attr('href');
		var $target = $($this.attr('data-target') || (href && href.replace(/.*(?=#[^\s]+$)/, '')));
		if ($this.is('a')) {
			e.preventDefault();
		}
		if (!$target.length) {
			return;
		}
		$target.one('show.ay.modal', function(e) {
			if (e.isDefaultPrevented()) {
				return;
			}
			$target.one('hidden.ay.modal', function() {
				$this.is(':visible') && $this.trigger('focus');
			});
		});
		var modal = new Modal($target, options);
		modal.show();
	});

	Modal.version = 'v1.0.0';

	module.exports = Modal;

});
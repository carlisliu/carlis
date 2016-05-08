/**
 * 
 */
define('static/scenic/introduction/event', ['jquery'], function(require, exports, module){
	var $ = require('jquery');
	$(function(){
	    $('#choose').click(function(){
	        $('.shadow,.choice').show();
	    });
	    $('.choice .btn').click(function(){
	        $('.shadow,.choice').hide();
	    });
	    $('#choiceS').click(function(){
	        $('.shadow').show();
	        $('.option-box[data-id=choiceS]').show();
	    });
	    $('#choiceCity').click(function(){
	        $('.shadow').show();
	        $('.option-box[data-id=choiceCity]').show();
	    });
	    $('#choiceSport').click(function(){
	        $('.shadow').show();
	        $('.option-box[data-id=choiceSport]').show();
	    });
	    $('#editS').click(function(){
	        $('.option-box[data-id=editS]').show();
	    });
	    $('#editCity').click(function(){
	        $('.option-box[data-id=editCity]').show();
	    });
	    $('#editSport').click(function(){
	        $('.option-box[data-id=editSport]').show();
	    });
	    $('#editAddLable').click(function(){
	        var top = $('#editAddLable').offset().top - 70;
	        var left = $('#editAddLable').offset().left - 280;
	        var newOffset = {
	            'left':left,
	            'top':top
	        };
	        $('.option-box[data-id=editAddLable]').offset(newOffset).show();
	    });
	    $('#lableBtn').click(function(){
	        var top = $('#lableBtn').offset().top - 65;
	        var left = $('#lableBtn').offset().left - 280;
	        var newOffset = {
	            'left':left,
	            'top':top
	        };
	        $('.lable-mine[data-id=lableMine]').offset(newOffset).show();
	    });
	    $('#editBasic').click(function(){
	       $('.shadow,.edit-basic').show();
	    });
	    $('#editSport').click(function(){
	       $('.shadow,.edit-sport').show();
	    });
	    $('#editHistory').click(function(){
	       $('.shadow,.edit-history').show();
	    });
	    $('#editTime').click(function(){
	       $('.shadow,.edit-time').show();
	    });
	    $('.edit-box .no').click(function(){
	        $(this).parents('.edit-box').hide();
	        $('.shadow').hide();
	    });
	});
});
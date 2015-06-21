
var cgNgapp = angular.module('hrmsApp',[]);
      cgNgapp.directive('cgInput', function(){
    	  
    	  return{
    		  restrict: 'AE',
    		  replace:true,
    		  template:'<input type="text" class="form-control" />'
    	  }
    	  
      });

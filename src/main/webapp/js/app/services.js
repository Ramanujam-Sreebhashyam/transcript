apnapp.factory('viewallService', function($http, $q) {
        // interface
        var service = {
        	page: 0,
        	totalpages:0,
            patients: [],
            getpatients: getpatients
        };
        return service;

        // implementation
        function getpatients(pg) {
            var def = $q.defer();
            page=pg;
            $http.post("/patients?page="+pg+"&size=5")
                .success(function(data) {
                    service.patients = data;
                    service.totalpages = data['totalPages'];
                    console.log(data);
                    console.log(service.totalpages);
                    def.resolve(data);
                })
                .error(function() {
                    def.reject("Failed to get patients");
                });
            return def.promise;
        }
        
        
    });


apnapp.service('viewById',function($http,$q){
		
	    var patient = {};
	    function setpatient(viewpatient){
	    	
	    	patient = viewpatient.id;
	    }
	    
	    function getpatient() {
	    	
	    	return patient;
        }
	    function updatepatient(){
	    	
	    	var info = "{\"id\":\""+patient+"\"}";
            var def = $q.defer();
            $http({
                method: 'POST',
                url: '/view',
                data: info,
                headers: {'Content-Type': 'application/json'}
            
            }).then(function successCallback(data) {
            	def.resolve(data);patient = data;
              }, function errorCallback(response) {
            	  def.reject("Failed to get patients");
              });
            
            return def.promise;
	    	
	    }
	    return {
	    	setpatient: setpatient,
	    	getpatient:getpatient,
	    	updatepatient:updatepatient
	    }
	
}
);

apnapp.factory('addService', function($http, $q) {
	        // interface
	        var service = {
	            setpatient: setpatient
	        };
	        return service;

	        // implementation
	        function setpatient(patient) {
	            var def = $q.defer();
	            $http({
	                method: 'POST',
	                url: '/add',
	                data: patient,
	                headers: {'Content-Type': 'application/json'}
	            
	            }).then(function successCallback(data) {
	            	def.resolve(data);console.log(data);
	              }, function errorCallback(response) {
	            	  def.reject("Failed to get patients");
	              });
	                
	            return def.promise;
	        }
	    });


apnapp.factory('deleteService', function($http, $q) {
	        // interface
	        var service = {
	            setpatient: setpatient
	        };
	        return service;

	        // implementation
	        function setpatient(patient) {
	            var def = $q.defer();

	            $http({
	                method: 'POST',
	                url: '/delete',
	                data: patient,
	                headers: {'Content-Type': 'application/json'}
	            
	            }).then(function successCallback(data) {
	            	def.resolve(data);
	              }, function errorCallback(response) {
	            	  def.reject("Failed to get patients");
	              });
	            
	            return def.promise;
	        }
	    });



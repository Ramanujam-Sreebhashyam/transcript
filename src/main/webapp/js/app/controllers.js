apnapp.controller('formController', function($scope, viewById, addService, deleteService, factors_increasing_risk_of_suicide ) {
		
		$scope.patient = {};
		console.log(factors_increasing_risk_of_suicide);
		if($scope.patient != {})
		{
			viewById.updatepatient().then(function(){
				$scope.patient = viewById.getpatient().data;
				console.log("patient : "+$scope.patient.sleep_wnl);
			});
			
		}
		
		$scope.clear = function(){
			$scope.patient = {};
		}
		
		$scope.submit = function(){
			
			addService.setpatient($scope.patient).then(function(){
				alert($scope.patient.name+" has been added.")
				$scope.patient = {};
			});
		}
		
		$scope.del = function(){
			
			deleteService.setpatient($scope.patient).then(function(){
				alert($scope.patient.name+" has been deleted.")
				$scope.patient = {};
			});
		}
		
});
apnapp.controller('viewPatientsController', function( $scope, $location, viewallService, viewById) {
											
											$scope.patients = [];
											$scope.getpatients = function(page) {
	                                        	viewallService.getpatients(page)
	                                                .then(function(patients) {
	                                                	$scope.patients = patients;
	                                                    console.log('patients returned to controller.');
	                                                    console.log($scope.patients);
	                                                },
	                                                function(data) {
	                                                    console.log('patients retrieval failed.')
	                                                });
	                                        };
	                                        if(viewallService.page==0)
	                                        { $scope.getpatients(0);}
	                                        
	                                        $scope.next= function (){
	                                        	console.log(viewallService.page);
	                                        	console.log(viewallService.totalpages);
	                                        	if(viewallService.page < viewallService.totalpages || viewallService.page ==0)
	                                        	{
		                                        	 viewallService.page = viewallService.page + 1;
		                                        	 $scope.getpatients(viewallService.page);
	                                        	}
	                                        }
	                                        
	                                        $scope.previous= function(){
	                                        	if(viewallService.page > 0)
	                                        	viewallService.page = viewallService.page - 1;
	                                        	$scope.getpatients(viewallService.page);
	                                        }
	                                        
	                                        
	                                        $scope.view = function(patient)
	                                        {	                                        	
	                                        	viewById.setpatient(patient);	                                        	
	                                        	$location.path('/form');
	                                        }
	                                        
	                                        
});

apnapp.controller('dsmcontroller',function($scope, dsmservice){
	
	dsmservice.getdsm().then(
	function(){
		$scope.content = $sce.trustAsResourceUrl(dsmservice.fileURL);
		
	}		
	);
	
	
	
});


apnapp.controller('aimscontroller',function($scope, viewById){
	
	$scope.submit = function(){
	if($scope.patient!=null)
	{$scope.patient.aims= $scope.aims;
		console.log("aims "+$scope.aims);
		console.log("patient "+$scope.aims);
	};
	}
	
	
});

apnapp.controller('srapcontroller',function($scope, viewById){
	
	$scope.submit = function(){
	if($scope.patient!=null)
	{$scope.patient.srap= $scope.srap;
		console.log("srap "+$scope.srap);
		console.log("patient "+$scope.srap);
	};
	}
	
	
});

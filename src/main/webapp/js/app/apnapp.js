var apnapp = angular.module('apnapp',["ngRoute"]);

apnapp.config(function ($routeProvider) {
    $routeProvider.when('/form', {templateUrl: '/form', controller:'formController'})
	    			.when('/viewclients', {templateUrl: '/viewpatients', controller:'viewPatientsController'})
	    			.when('/dsm', {templateUrl: '/dsmpage', controller:'dsmcontroller'})
	    			.when('/aims', {templateUrl: '/aims', controller:'aimscontroller'})
	    			.when('/srap', {templateUrl: '/srap', controller:'srapcontroller'})
	    			.otherwise({redirectTo: '/form'});

});
apnapp.constant('factors_increasing_risk_of_suicide',['Abuses drugs and/or alcohol','Poor impulse control','Feelings of hopelessness','Thought disturbance','Recent deterioration of mental statu','Medication non-compliant','Recent psychiatric/medical diagnosis','Terminal illness/chronic pain','Disorganized thinking','Current familial or interpersonal conflict','Poor judgment','Giving away belongings','Social withdrawal','Recent end of significant relationship','Non-compliance with critical medical care','History of suicidal ideation','suicidal command hallucination','Famly history of suicide','Victim of abuse','Employment problems or job loss','legal problems','Academic problems','Poor insight','Denial of mental illness','Intellactual impairment','Memory problem','History of suicide attempts','Disinhibited state','Other']);
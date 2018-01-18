 <!-- SECTION 2 - Clients -->
                            <section class="display">
                                <div class="profile" id="2">
                                    <div class="page-head">
                                        <div class="row">
                                            <div class="col-md-5">
                                                <h3>Clients</h3>
                                            </div>
                                            <div class="col-md-7">
                                                <div class="np-main">
                                                    <p>Go to previous/next page</p>
                                                    <div class="np-controls">
                                                        <a ng-click="previous()" class="previous"><i class="fa fa-arrow-circle-left"></i></a>
                                                        <a ng-click="next()"  class="next"><i class="fa fa-arrow-circle-right"></i></a>
                                                    </div>
                                                </div>
                                            </div>
                                        </div>
                                    </div>
                                    <div class="portfolio-wrap">
                                        <div class="row" >
                                                     <div class="personal-info-form col-md-12 no-padding" ng-repeat="patient in patients.content">
				                                        <h4>Personal Info</h4>
				                                        <div class="sep2" ></div>
				                                        <ul>
				                                            <li>
				                                                <div class="p-info"><em>name &nbsp &nbsp</em><input class="p-info" type="text" ng-model="patient.name" /></div>
				                                            </li>
				                                            <li>
				                                                <div class="p-info"><em>phone</em><input class="p-info" type="text" ng-model="patient.phone" /></div>
				                                            </li>
				                                            
				                                        </ul>
				                                        <button ng-click="view(patient)">View</button>
				                                    </div>
                                               
                                        </div>
                                    </div>
                                </div>
                            </section>
<!-- SECTION 2 - CLIENTS -->
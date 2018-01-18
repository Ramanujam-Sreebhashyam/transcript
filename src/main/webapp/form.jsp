 <!-- SECTION 1 - HOMEPAGE -->
                            <section class="display">
                            <form >
                                <div class="profile" id="1" >
                                    <h2><span>Sai Psychiatry</span><br>Psychiatric Evaluation Form</h2>
                                    <div class="sep1"></div>
                                    
                                        
                                    <div class="personal-info col-md-12 no-padding">
                                    	
                                        <h4>Personal Info <button ng-click="clear()">clear</button></h4>
                                        <div class="sep2" ></div>
                                        <ul>
                                            <li>
                                                <div class="p-info"><em>name &nbsp &nbsp</em><input class="p-info" type="text" ng-model="patient.name" /></div>
                                            </li>
                                            <li>
                                                <div class="p-info"><em>e-mail</em><input class="p-info" type="text" ng-model="patient.email" /></div>
                                            </li>
                                            <li>
                                                <div class="p-info"><em>address</em><input default="none" class="p-info" type="text" ng-model="patient.address" /></div>
                                            </li>
                                            <li>
                                                <div class="p-info"><em>phone</em><input class="p-info" type="text" ng-model="patient.phone" /></div>
                                            </li>
                                        </ul>
                                       <h4>Psychiatric Evaluation</h4>
                                        <div class="sep2" ></div>
                                        

                                        
                                    </div>
                                    
                                    <div class="personal-info-form">
                                    	 <ul>
                                            <li>
                                                <div class="p-info"><em>Date of Birth</em><input name="dob" class="p-info" type="text" ng-model="patient.dob" /></div>
                                            </li>
                                            <li>
                                                <div class="p-info"><em>Seen With:</em><input id="seen_with_alone" class="p-info" value="alone" type="radio" ng-model="patient.seen_with" /><em>Alone</em><input id="seen_with_other" class="p-info" value="other" type="radio" ng-model="patient.seen_with" /><em>Other</em></div>
                                            </li>
                                          
                                            <li>
                                                <div class="p-info"><em>History of Present Illiness: (Include , course of illness, psychosocial stressors)</em></div>
                                                
                                            </li>
                                            <li class="textar">
                                            <textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="history_of_present_illness" ng-model="patient.history_of_present_illness"></textarea>
                                            </li>
                                            <li>
                                                <div class="p-info"><em>Psychiatric review of Symtoms: (include details below)</em></br>&nbsp
                                                					<input id="sleep_wnl" class="p-info"  ng-true-value="'true'" ng-false-value="'false'" type="checkbox" ng-model="patient.sleep_wnl" />
                                                					<em>Sleep (wnl)</em>
                                                					<input id="homicidal_ideation_none" ng-true-value="'true'" ng-false-value="'false'" class="p-info" value="homicidal_ideation_none" type="checkbox" ng-model="patient.homicidal_ideation_none" />
                                                					<em>Homicidal ideation (none)</em>
                                                					<input id="manic_symptoms_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="manic_symptoms_none" type="checkbox" ng-model="patient.manic_symptoms_none" />
                                                					<em>Manic symptoms (none)</em></br>&nbsp
                                                					<input id="manic_symptoms_reported_in_past" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="manic_symptoms_reported_in_past" type="checkbox" ng-model="patient.manic_symptoms_reported_in_past" />
                                                					<em>Manic symptoms (reported in the past)</em>
                                                					<input id="interests_wnl" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="interests_wnl" type="checkbox" ng-model="patient.interests_wnl" />
                                                					<em>Interests (wnl) &nbsp &nbsp</em></br>&nbsp
                                                					<input id="worry_anxiety_tension_wnl" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="worry_anxiety_tension_wnl" type="checkbox" ng-model="patient.worry_anxiety_tension_wnl" />
                                                					<em>Worry / Anxiety / Tension (wnl)</em>
                                                					<input id="guilt_wnl" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="guilt_wnl" type="checkbox" ng-model="patient.guilt_wnl" />
                                                					<em>Guilt (wnl)</em></br>&nbsp
                                                					<input id="hallucination_delusions_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="hallucination_delusions_none" type="checkbox" ng-model="patient.hallucination_delusions_none" />
                                                					<em>Hallucination delusions (none)</em>
                                                					<input id="hallucination_delusions_reported_in_past" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="hallucination_delusions_reported_in_past" type="checkbox" ng-model="patient.hallucination_delusions_reported_in_past" />
                                                					<em>Hallucination delusions (reported in past)</em></br>&nbsp
                                                					<input id="eating_disorders_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="eating_disorders_none" type="checkbox" ng-model="patient.eating_disorders_none" />
                                                					<em>Eating disorders (none)</em>
                                                					<input id="eating_disorders_reported_in_past" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="eating_disorders_reported_in_past" type="checkbox" ng-model="patient.eating_disorders_reported_in_past" />
                                                					<em>Eating disorders (Reported in past)</em></br>&nbsp
                                                					<input id="energy_wnl" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="energy_wnl" type="checkbox" ng-model="patient.energy_wnl" />
                                                					<em>Energy (wnl)</em>
                                                					<input id="panic_attacks_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="panic_attacks_none" type="checkbox" ng-model="patient.panic_attacks_none" />
                                                					<em>Panic Attacks (none)</em>
                                                					<input id="concentration_wnl" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="concentration_wnl" type="checkbox" ng-model="patient.concentration_wnl" />
                                                					<em>Concentration (wnl)</em></br>&nbsp
                                                					<input id="obsessions_compulsions_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="obsessions_compulsions_none" type="checkbox" ng-model="patient.obsessions_compulsions_none" />
                                                					<em>Obsessions compulsions (none)</em>
                                                					<input id="self_injurious_behaviour_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="self_injurious_behaviour_none" type="checkbox" ng-model="patient.self_injurious_behaviour_none" />
                                                					<em>Self injurious behaviour (none)</em></br>&nbsp
                                                					<input id="self_injurious_behaviour_reported_in_past" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="self_injurious_behaviour_reported_in_past" type="checkbox" ng-model="patient.self_injurious_behaviour_reported_in_past" />
                                                					<em>Self injurious behaviour (reported in past)</em>
                                                					<input id="violence_history_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="violence_history_none" type="checkbox" ng-model="patient.violence_history_none" />
                                                					<em>Violence history (none)</em></br>&nbsp
                                                					<input id="appetite_wnl" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="appetite_wnl" type="checkbox" ng-model="patient.appetite_wnl" />
                                                					<em>Appetite (wnl)</em>
                                                					<input id="suicidal_ideation_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="suicidal_ideation_none" type="checkbox" ng-model="patient.suicidal_ideation_none" />
                                                					<em>Suicide ideation (none)</em>
                                                					<input id="gun_ownership_none" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="gun_ownership_none" type="checkbox" ng-model="patient.gun_ownership_none" />
                                                					<em>Gun ownership (none)</em>
                                                </div>
                                                </li>  
                                                
                                                <li>
                                                <div class="p-info"><em>Additional details below</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="psychiatric_review_of_symptoms" ng-model="patient.psychiatric_review_of_symptoms"></textarea>
	                                            </li>
												
	                                            
	                                            
	                                            <li>
                                                <div class="p-info"><em><b>Past Psychiatric history</b></em></div>
                                                
                                            	</li>
	                                            <li>
                                                <div class="p-info"><em>Psychiatric Hospitalizations: List#, First, and Most Recent:</em>
                                                
                                                </div>
                                                
                                           		</li>
                                           		<li >
                                           			<input class="wide-input"  name="psychiatric_hospitalizations"  type="text" ng-model="patient.psychiatric_hospitalizations" />
                                           		</li>
                                           		<li>
                                                <div class="p-info"><em>Suicide Attempts: List#, First and most recent</em>
                                                </div>
                                           		</li>
                                           		<li>
                                           			<input class="wide-input"  name="suicide_attempts"  type="text" ng-model="patient.suicide_attempts" />
                                           		</li>
                                           		<li>
                                           		<div class="p-info"><em>Previous, diagnosis, therapy experience and psychiatric medications:</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="previous_dignosis" ng-model="patient.previous_dignosis"></textarea>
	                                            </li>
	                                            
	                                            <li>
	                                            <div class="p-info"><em>Current Medications</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="current_medications" ng-model="patient.current_medications"></textarea>
	                                            </li>
												
	                                            <li>
	                                            <div class="p-info"><em>Allergies</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"   name="allergies" ng-model="patient.allergies"></textarea>
	                                            </li>
	                                            <li>
	                                            <div class="p-info"><em>Family psychiatric and medical history</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="family_history" ng-model="patient.family_history"></textarea>
	                                            </li>
	                                            
	                                             <li>
	                                            <div class="p-info"><em>Past medical and surgiacal history:</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="past_medical_history" ng-model="patient.past_medical_history"></textarea>
	                                            </li>
	                                            <li>
	                                            <div class="p-info"><em>Substance abuse history:</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="substance_abuse_history" ng-model="patient.substance_abuse_history"></textarea>
	                                            </li>
	                                            <li>
	                                            <div class="p-info"><em>Legal History</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="legal_history" ng-model="patient.legal_history"></textarea>
	                                            </li>
	                                            <li>
	                                            <div class="p-info"><em>Military History</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="military_history" ng-model="patient.military_history"></textarea>
	                                            </li>
	                                            
	                                            <li>
                                                <div class="p-info"><em><b>Personal History </b></em></div>
                                                
                                            	</li>
	                                            <li>
                                                <div class="p-info"><em>Born in: </em>
												</div>
	                                            </li>
	                                            </br>
												<li >
                                           			<input class="wide-input" name="born_in" class="p-info" type="text" ng-model="patient.born_in" />
                                           		</li>
	                                            <li>
                                                <div class="p-info"><em>Raised in:</em></div>
	                                            </li>
	                                            </br>
												<li>
													<input class="wide-input" name="raised_in" class="p-info" type="text" ng-model="patient.raised_in" />
												</li>
	                                            
	                                            <li>
                                                <div class="p-info">
					                                                <em>Parents:</em>
					                                                <input id="parents" class="p-info" value="married" type="radio" ng-model="patient.parents" />
					                                                <em>Married</em>
					                                                <input id="parents" class="p-info" value="divorced" type="radio" ng-model="patient.parents" />
					                                                <em>Divorced</em>
					                                                <input id="parents" class="p-info" value="never_married" type="radio" ng-model="patient.parents" />
	                                                				<em>Never Married</em></div>
                                           		</li>
                                           		
                                           		<li>
	                                            <div class="p-info"><em>Childhood trauma</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="childhood_trauma" ng-model="patient.childhood_trauma"></textarea>
	                                            </li>
	                                            <li>
	                                            <div class="p-info"><em>School/Job history</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="school_job_history" ng-model="patient.school_job_history"></textarea>
	                                            </li>
	                                            <li>
	                                            <div class="p-info"><em>Relationship history and living / social situation:</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="relationship_history_social_situation" ng-model="patient.relationship_history_social_situation"></textarea>
	                                            </li>
	                                            
	                                            
	                                            <li>
                                                <div class="p-info"><em>Sexual activity:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="sexual_activity" class="p-info" type="text" ng-model="patient.sexual_activity" />
												</li>
	                                            <li>
                                                <div class="p-info"><em>Client smoking status:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="smoking_status" class="p-info" type="text" ng-model="patient.smoking_status" />
												</li>
												
												<li>
	                                            <div class="p-info"><em>Future goals and strengths</em></div>
	                                                
	                                            </li>
	                                            <li class="textar">
	                                            					<textarea margin-bottom="20px" border: 1px solid #ededed; rows="10" cols="90"  name="future_goals_strengths" ng-model="patient.future_goals_strengths"></textarea>
	                                            </li>
	                                            
                                        </ul>
                                        <button style="float: left;" ng-click="del()">delete</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button ng-click="submit()">submit</button></br>
                                        
                                    </div>
                                    </form>
                                    <div class="clearfix"></div>
                                </div>
                            </section>
                            <!-- SECTION 1 - HOMEPAGE -->
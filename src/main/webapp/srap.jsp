 <!-- SECTION 5 - SRAP -->
                            <section class="display">
                            <form >
                                <div class="profile" id="1" >
                                    <h2><span>Sai Psychiatry</span><br>Suicidality Risk Assessment/Plan.</h2>
                                    <div class="sep1"></div>
                                    
                                        
                                    
                                    
                                    <div class="personal-info-form">
                                    	 <ul>
                                    	 		<li>
                                                <div class="p-info"><em>Reasons for assessment for Suicidality:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="resons_for_assessment_for_suicidality" class="p-info" type="text" ng-model="srap.resons_for_assessment_for_suicidality" />
												</li>
                                            	<li>
                                              	  <div class="p-info"><em>Indicators for risk for suicidality:</em></div>
                                            	</li>
                                            	<li>
                                              	  <div class="p-info"><em>Ideation:</em></br>&nbsp</div>
                                            	</li>
	                                            <li>
                                                <div class="p-info">
					                                                
					                                                <input id="ideation" class="p-info" value="yes" type="radio" ng-model="srap.ideation" />
					                                                <em>yes</em>
					                                                <input id="ideation" class="p-info" value="no" type="radio" ng-model="srap.ideation" />
					                                                <em>no</em>
					                                                <input id="ideation" class="p-info" value="unknown" type="radio" ng-model="srap.ideation" />
	                                                				<em>unknown</em>
                                           		</li>
                                           		<li>
                                                <div class="p-info"><em>Describe Ideation:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="describe_ideation" class="p-info" type="text" ng-model="srap.describe_ideation" />
												</li>
                                           		
                                           		<li>
                                                <div class="p-info">
					                                                <em>Plan:</em></br>&nbsp
					                                                <input id="plan" class="p-info" value="yes" type="radio" ng-model="srap.plan" />
					                                                <em>yes</em>
					                                                <input id="plan" class="p-info" value="no" type="radio" ng-model="srap.plan" />
					                                                <em>no</em>
					                                                <input id="plan" class="p-info" value="unknown" type="radio" ng-model="srap.plan" />
	                                                				<em>unknown</em>
                                           		</li>
                                           		<li>
                                                <div class="p-info"><em>Describe Plan:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="describe_ideation" class="p-info" type="text" ng-model="srap.describe_plan" />
												</li>
												<li>
                                                <div class="p-info">
					                                                <em>Means to carry out plan:</em></br>&nbsp
					                                                <input id="means_to_carry_out_plan" class="p-info" value="yes" type="radio" ng-model="srap.means_to_carry_out_plan" />
					                                                <em>yes</em>
					                                                <input id="means_to_carry_out_plan" class="p-info" value="no" type="radio" ng-model="srap.means_to_carry_out_plan" />
					                                                <em>no</em>
					                                                <input id="means_to_carry_out_plan" class="p-info" value="unknown" type="radio" ng-model="srap.means_to_carry_out_plan" />
	                                                				<em>unknown</em>
                                           		</li>
                                           		<li>
                                                <div class="p-info"><em>Describe means to carry out plan:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="describe_means_to_carry_out_plan" class="p-info" type="text" ng-model="srap.describe_means_to_carry_out_plan" />
												</li>
												<li>
                                                <div class="p-info">
					                                                <em>Attempt:</em></br>&nbsp
					                                                <input id="attempt" class="p-info" value="yes" type="radio" ng-model="srap.attempt" />
					                                                <em>yes</em>
					                                                <input id="attempt" class="p-info" value="no" type="radio" ng-model="srap.attempt" />
					                                                <em>no</em>
					                                                <input id="attempt" class="p-info" value="unknown" type="radio" ng-model="srap.attempt" />
	                                                				<em>unknown</em>
                                           		</li>
                                           		<li>
                                                <div class="p-info"><em>Describe attempt:</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="describe_attempt" class="p-info" type="text" ng-model="srap.describe_attempt" />
												</li>
												
                                           		
                                           		<li>
                                                <div class="p-info"><em>Describe other indicators (including , but not limited to, observable behaviors associated with increased risk of suicidality, suicidal command hallucinations, impending events/anniversaries that have been historically associated with suicidal behavior):</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="describe_other_indicators" class="p-info" type="text" ng-model="srap.describe_other_indicators" />
												</li>
                                           		
	                                            <li>
                                                <div class="p-info"><em>Factors increasing risk of(check all that apply):</em></div>
	                                            </li>
	                                            <li>
                                                <div class="p-info"><em>Factors increasing risk of suicide (check all that apply):</em></br>&nbsp
                                                					<input id="abuses_drugs_or_alchohol" class="p-info"  ng-true-value="'true'" ng-false-value="'false'" type="checkbox" ng-model="srap.abuses_drugs_or_alchohol" />
                                                					<em>Abuses drugs and /or alchohol</em>
                                                					<input id="recent_deterioration_of_mental_status" ng-true-value="'true'" ng-false-value="'false'" class="p-info" value="recent_deterioration_of_mental_status" type="checkbox" ng-model="srap.recent_deterioration_of_mental_status" />
                                                					<em>Recent deterioration of mental status</em>
                                                					<input id="poor_impulse_control" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="poor_impulse_control" type="checkbox" ng-model="srap.poor_impulse_control" />
                                                					<em>Poor impulse control</em></br>&nbsp
                                                					<input id="medication_non_compliant" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="medication_non_compliant" type="checkbox" ng-model="srap.medication_non_compliant" />
                                                					<em>Medication non-compliant</em>
                                                					<input id="feelings_of_hopelessness" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="feelings_of_hopelessness" type="checkbox" ng-model="srap.feelings_of_hopelessness" />
                                                					<em>Feelings of hopelessness</em></br>&nbsp
                                                					<input id="recent_psychiatric_or_medical_diagnosis" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="recent_psychiatric_or_medical_diagnosis" type="checkbox" ng-model="srap.recent_psychiatric_or_medical_diagnosis" />
                                                					<em>Recent psychiatric/medical diagnosis</em>
                                                					<input id="thought_disturbance" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="thought_disturbance" type="checkbox" ng-model="srap.thought_disturbance" />
                                                					<em>Thought disturbance</em></br>&nbsp
                                                					<input id="terminal_illness_chronic_pain" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="terminal_illness_chronic_pain" type="checkbox" ng-model="srap.terminal_illness_chronic_pain" />
                                                					<em>Terminal illness/chronic pain</em>
                                                					<input id="disorganized_thinking" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="disorganized_thinking" type="checkbox" ng-model="srap.disorganized_thinking" />
                                                					<em>Disorganized thinking</em></br>&nbsp
                                                					<input id="victim_of_abuse" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="victim_of_abuse" type="checkbox" ng-model="srap.victim_of_abuse" />
                                                					<em>Victim of abuse</em>
                                                					<input id="current_familial_or_interpersonal_conflict" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="current_familial_or_interpersonal_conflict" type="checkbox" ng-model="srap.current_familial_or_interpersonal_conflict" />
                                                					<em>Current familial or interpersonal conflict</em></br>&nbsp
                                                					<input id="intellectual_impairment" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="intellectual_impairment" type="checkbox" ng-model="srap.intellectual_impairment" />
                                                					<em>Employment problems/job loss</em>
                                                					<input id="poor_judgement" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="poor_judgement" type="checkbox" ng-model="srap.poor_judgement" />
                                                					<em>Poor judgment</em>
                                                					<input id="legal_problems" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="legal_problems" type="checkbox" ng-model="srap.legal_problems" />
                                                					<em>Legal problems</em></br>&nbsp
                                                					<input id="giving_away_belongings" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="giving_away_belongings" type="checkbox" ng-model="srap.giving_away_belongings" />
                                                					<em>Giving away belongings</em>
                                                					<input id="academic_problems" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="academic_problems" type="checkbox" ng-model="srap.academic_problems" />
                                                					<em>Academic problems</em></br>&nbsp
                                                					<input id="social_withdrawal" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="social_withdrawal" type="checkbox" ng-model="srap.social_withdrawal" />
                                                					<em>Social withdrawal</em>
                                                					<input id="poor_insight" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="poor_insight" type="checkbox" ng-model="srap.poor_insight" />
                                                					<em>Poor insight</em></br>&nbsp
                                                					<input id="recent_end_of_significant_relationship" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="recent_end_of_significant_relationship" type="checkbox" ng-model="srap.recent_end_of_significant_relationship" />
                                                					<em>Recent end of significant relationship</em>
                                                					<input id="denial_of_mental_illness" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="denial_of_mental_illness" type="checkbox" ng-model="srap.denial_of_mental_illness" />
                                                					<em>Denial of mental illness</em>
                                                					<input id="non_compliance_with_critical_medical_care" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="non_compliance_with_critical_medical_care" type="checkbox" ng-model="srap.non_compliance_with_critical_medical_care" />
                                                					<em>Non-compliance with critical medical care</em>
                                                					<input id="intellectual_impairment" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="intellectual_impairment" type="checkbox" ng-model="srap.intellectual_impairment" />
                                                					<em>Intellectual impairment</em>
                                                					<input id="recent_change_medication_regimen" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="recent_change_medication_regimen" type="checkbox" ng-model="srap.recent_change_medication_regimen" />
                                                					<em>Recent change in medication regimen</em>
                                                					<input id="memory_problem" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="memory_problem" type="checkbox" ng-model="srap.memory_problem" />
                                                					<em>Memory problem</em></br>&nbsp
                                                					<input id="giving_away_belongings" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="giving_away_belongings" type="checkbox" ng-model="srap.giving_away_belongings" />
                                                					<em>History of suicidal ideation</em>
                                                					<input id="history_of_suicide_attempts" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="history_of_suicide_attempts" type="checkbox" ng-model="srap.history_of_suicide_attempts" />
                                                					<em>History of suicide attempts</em></br>&nbsp
                                                					<input id="suicidal_command_hallucinations" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="suicidal_command_hallucinations" type="checkbox" ng-model="srap.suicidal_command_hallucinations" />
                                                					<em>Suicidal command hallucinations</em>
                                                					<input id="disinhibited_state" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="disinhibited_state" type="checkbox" ng-model="srap.disinhibited_state" />
                                                					<em>Disinhibited state</em></br>&nbsp
                                                					<input id="family_history_of_suicide" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="family_history_of_suicide" type="checkbox" ng-model="srap.family_history_of_suicide" />
                                                					<em>Famly history of suicide</em>
                                                					<input id="other" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="other" type="checkbox" ng-model="srap.other" />
                                                					<em>Other</em>
                                                </div>
                                                </li>  
	                                            <li>
                                                <div class="p-info"><em>If other, specify</em></div>
	                                            </li>
	                                            <li>
                                                <div class="p-info"><em>Explain factors reducing risk</em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="explain_factors_increasing_risk" class="p-info" type="text" ng-model="srap.explain_factors_increasing_risk" />
												</li>
												<li>
                                                <div class="p-info"><em>Does clienttenant hear voices telling him/her to harm/kill self </em></div>
	                                            </li>
	                                            <li>
													<input class="wide-input" name="does_client_hear_voices_asking_to_harm_or_kill_self" class="p-info" type="text" ng-model="srap.does_client_hear_voices_asking_to_harm_or_kill_self" />
												</li>
	                                            <li>
                                                <div class="p-info"><em>Factors decreasing risk of suicide (check all that apply)</em></div>
	                                            </li>
	                                            <li>
                                                <div class="p-info"><em>Factors decreasing risk of suicide (check all that apply)</em></br>&nbsp
                                                					<input id="abuses_drugs_or_alchohol" class="p-info"  ng-true-value="'true'" ng-false-value="'false'" type="checkbox" ng-model="srap.abuses_drugs_or_alchohol" />
                                                					<em>Compliant with treatment</em>
                                                					<input id="recent_deterioration_of_mental_status" ng-true-value="'true'" ng-false-value="'false'" class="p-info" value="recent_deterioration_of_mental_status" type="checkbox" ng-model="srap.recent_deterioration_of_mental_status" />
                                                					<em>Recent deterioration of mental status</em>
                                                					<input id="poor_impulse_control" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="poor_impulse_control" type="checkbox" ng-model="srap.poor_impulse_control" />
                                                					<em>Poor impulse control</em></br>&nbsp
                                                					<input id="medication_non_compliant" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="medication_non_compliant" type="checkbox" ng-model="srap.medication_non_compliant" />
                                                					<em>Medication non-compliant</em>
                                                					<input id="feelings_of_hopelessness" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="feelings_of_hopelessness" type="checkbox" ng-model="srap.feelings_of_hopelessness" />
                                                					<em>Feelings of hopelessness</em></br>&nbsp
                                                					<input id="recent_psychiatric_or_medical_diagnosis" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="recent_psychiatric_or_medical_diagnosis" type="checkbox" ng-model="srap.recent_psychiatric_or_medical_diagnosis" />
                                                					<em>Recent psychiatric/medical diagnosis</em>
                                                					<input id="thought_disturbance" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="thought_disturbance" type="checkbox" ng-model="srap.thought_disturbance" />
                                                					<em>Thought disturbance</em></br>&nbsp
                                                					<input id="terminal_illness_chronic_pain" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="terminal_illness_chronic_pain" type="checkbox" ng-model="srap.terminal_illness_chronic_pain" />
                                                					<em>Terminal illness/chronic pain</em>
                                                					<input id="disorganized_thinking" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="disorganized_thinking" type="checkbox" ng-model="srap.disorganized_thinking" />
                                                					<em>Disorganized thinking</em></br>&nbsp
                                                					<input id="victim_of_abuse" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="victim_of_abuse" type="checkbox" ng-model="srap.victim_of_abuse" />
                                                					<em>Victim of abuse</em>
                                                					<input id="current_familial_or_interpersonal_conflict" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="current_familial_or_interpersonal_conflict" type="checkbox" ng-model="srap.current_familial_or_interpersonal_conflict" />
                                                					<em>Current familial or interpersonal conflict</em></br>&nbsp
                                                					<input id="intellectual_impairment" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="intellectual_impairment" type="checkbox" ng-model="srap.intellectual_impairment" />
                                                					<em>Employment problems/job loss</em>
                                                					<input id="poor_judgement" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="poor_judgement" type="checkbox" ng-model="srap.poor_judgement" />
                                                					<em>Poor judgment</em>
                                                					<input id="legal_problems" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="legal_problems" type="checkbox" ng-model="srap.legal_problems" />
                                                					<em>Legal problems</em></br>&nbsp
                                                					<input id="giving_away_belongings" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="giving_away_belongings" type="checkbox" ng-model="srap.giving_away_belongings" />
                                                					<em>Giving away belongings</em>
                                                					<input id="academic_problems" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="academic_problems" type="checkbox" ng-model="srap.academic_problems" />
                                                					<em>Academic problems</em></br>&nbsp
                                                					<input id="social_withdrawal" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="social_withdrawal" type="checkbox" ng-model="srap.social_withdrawal" />
                                                					<em>Social withdrawal</em>
                                                					<input id="poor_insight" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="poor_insight" type="checkbox" ng-model="srap.poor_insight" />
                                                					<em>Poor insight</em>
                                                					<input id="Recent_end_of_significant_relationship" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="Recent_end_of_significant_relationship" type="checkbox" ng-model="srap.Recent_end_of_significant_relationship" />
                                                					<em>Recent end of significant relationship</em>
                                                					<input id="denial_of_mental_illness" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="denial_of_mental_illness" type="checkbox" ng-model="srap.denial_of_mental_illness" />
                                                					<em>Denial of mental illness</em>
                                                					<input id="non_compliance_with_critical_medical_care" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="non_compliance_with_critical_medical_care" type="checkbox" ng-model="srap.non_compliance_with_critical_medical_care" />
                                                					<em>Non-compliance with critical medial care</em>
                                                					<input id="intellectual_impairment" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="intellectual_impairment" type="checkbox" ng-model="srap.intellectual_impairment" />
                                                					<em>Intellectual impairment</em>
                                                					<input id="recent_change_medication_regimen" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="recent_change_medication_regimen" type="checkbox" ng-model="srap.recent_change_medication_regimen" />
                                                					<em>Recent end of significant relationship</em>
                                                					<input id="memory_problem" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="memory_problem" type="checkbox" ng-model="srap.memory_problem" />
                                                					<em>Memory problem</em>
                                                					<input id="history_of_suicidal_ideation" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="history_of_suicidal_ideation" type="checkbox" ng-model="srap.history_of_suicidal_ideation" />
                                                					<em>History of suicidal ideation</em>
                                                					<input id="history_of_suicide_attempts" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="history_of_suicide_attempts" type="checkbox" ng-model="srap.history_of_suicide_attempts" />
                                                					<em>History of suicide attempts</em>
                                                					<input id="suicidal_command_hallucinations" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="suicidal_command_hallucinations" type="checkbox" ng-model="srap.suicidal_command_hallucinations" />
                                                					<em>Suicidal command hallucinations</em>
                                                					<input id="disinhibited_state" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="disinhibited_state" type="checkbox" ng-model="srap.disinhibited_state" />
                                                					<em>Disinhibited state</em>
                                                					<input id="family_history_of_suicide" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="family_history_of_suicide" type="checkbox" ng-model="srap.family_history_of_suicide" />
                                                					<em>Family history of suicide</em>
                                                					<input id="other" class="p-info" ng-true-value="'true'" ng-false-value="'false'" value="other" type="checkbox" ng-model="srap.other" />
                                                					<em>Other</em>
                                                </div>
                                                </li>  
                                        </ul>
                                        <button style="float: left;" ng-click="del()">delete</button>&nbsp;&nbsp;&nbsp;&nbsp;
                                        <button ng-click="submit()">submit</button></br>
                                        
                                    </div>
                                    </form>
                                    <div class="clearfix"></div>
                                </div>
                            </section>
                            <!-- SECTION 1 - srap -->
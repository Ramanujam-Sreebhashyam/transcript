package com.transcript.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

import com.fasterxml.jackson.annotation.JsonProperty;


@Entity
@Table(name="SuicidalityRiskAssessmentPlan")
@Getter
@Setter
public class SuicidalityRiskAssessmentPlan {
	
	
	public SuicidalityRiskAssessmentPlan(Patient p)
	{
		this.setPatient(p);
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @JsonProperty("srapid")
	 @Column(name="srapid")
	 private int srapid;
	 
	 
		@JsonProperty("id")
		@OneToOne
		@JoinColumn(name="Id")
		private Patient patient;
	
	@JsonProperty("resons_for_assessment_for_suicidality")
	@Column(name="resons_for_assessment_for_suicidality", columnDefinition="TEXT")
	private String resons_for_assessment_for_suicidality;
	
	@JsonProperty("ideation")
	@Column(name="ideation", columnDefinition="TEXT")
	private String ideation;
	
	@JsonProperty("describe_ideation")
	@Column(name="describe_ideation", columnDefinition="TEXT")
	private String describe_ideation;
	
	@JsonProperty("plan")
	@Column(name="plan", columnDefinition="TEXT")
	private String plan;
	
	@JsonProperty("describe_plan")
	@Column(name="describe_plan", columnDefinition="TEXT")
	private String describe_plan;
	
	@JsonProperty("means_to_carry_out_plan")
	@Column(name="means_to_carry_out_plan", columnDefinition="TEXT")
	private String means_to_carry_out_plan;
	
	@JsonProperty("describe_means_to_carry_out_plan")
	@Column(name="describe_means_to_carry_out_plan", columnDefinition="TEXT")
	private String describe_means_to_carry_out_plan;
	
	@JsonProperty("attempt")
	@Column(name="attempt", columnDefinition="TEXT")
	private String attempt;
	
	@JsonProperty("describe_attempt")
	@Column(name="describe_attempt", columnDefinition="TEXT")
	private String describe_attempt;
	
	@JsonProperty("describe_other_indicators")
	@Column(name="describe_other_indicators", columnDefinition="TEXT")
	private String describe_other_indicators;
	
	
	@JsonProperty("abuses_drugs_or_alchohol")
	@Column(name="abuses_drugs_or_alchohol") 
	private String abuses_drugs_or_alchohol;
	
	@JsonProperty("poor_impulse_control")
	@Column(name="poor_impulse_control") 
	private String poor_impulse_control;
	
	
	@JsonProperty("feelings_of_hopelessness")
	@Column(name="feelings_of_hopelessness") 
	private String feelings_of_hopelessness;
	
	@JsonProperty("thought_disturbance")
	@Column(name="thought_disturbance") 
	private String thought_disturbance;
	
	@JsonProperty("recent_deterioration_of_mental_status")
	@Column(name="recent_deterioration_of_mental_status") 
	private String recent_deterioration_of_mental_status;
	
	@JsonProperty("medication_non_compliant")
	@Column(name="medication_non_compliant") 
	private String medication_non_compliant;

	@JsonProperty("recent_psychiatric_or_medical_diagnosis")
	@Column(name="recent_psychiatric_or_medical_diagnosis") 
	private String recent_psychiatric_or_medical_diagnosis;
	
	@JsonProperty("terminal_illness_chronic_pain")
	@Column(name="terminal_illness_chronic_pain") 
	private String terminal_illness_chronic_pain;
	
	@JsonProperty("disorganized_thinking")
	@Column(name="disorganized_thinking") 
	private String disorganized_thinking;
	
	@JsonProperty("current_familial_or_interpersonal_conflict")
	@Column(name="current_familial_or_interpersonal_conflict") 
	private String current_familial_or_interpersonal_conflict;
	
	@JsonProperty("poor_judgement")
	@Column(name="poor_judgement") 
	private String poor_judgement;
	
	@JsonProperty("giving_away_belongings")
	@Column(name="giving_away_belongings") 
	private String giving_away_belongings;
	
	@JsonProperty("social_withdrawal")
	@Column(name="social_withdrawal") 
	private String social_withdrawal;
	
	@JsonProperty("recent_end_of_significant_relationship")
	@Column(name="recent_end_of_significant_relationship") 
	private String recent_end_of_significant_relationship;
	
	
	@JsonProperty("non_compliance_with_critical_medical_care")
	@Column(name="non_compliance_with_critical_medical_care") 
	private String non_compliance_with_critical_medical_care;
	
	@JsonProperty("history_of_suicidal_ideation")
	@Column(name="history_of_suicidal_ideation") 
	private String history_of_suicidal_ideation;
	
	@JsonProperty("suicidal_command_hallucinations")
	@Column(name="suicidal_command_hallucinations") 
	private String suicidal_command_hallucinations;
	
	@JsonProperty("family_history_of_suicide")
	@Column(name="family_history_of_suicide") 
	private String family_history_of_suicide;
	
	@JsonProperty("victim_of_abuse")
	@Column(name="victim_of_abuse") 
	private String victim_of_abuse;
	
	@JsonProperty("employment_problems_or_job_loss")
	@Column(name="employment_problems_or_job_loss") 
	private String employment_problems_or_job_loss;
	
	@JsonProperty("legal_problems")
	@Column(name="legal_problems") 
	private String legal_problems;
	
	@JsonProperty("academic_problems")
	@Column(name="academic_problems") 
	private String academic_problems;
	
	@JsonProperty("poor_insight")
	@Column(name="poor_insight") 
	private String poor_insight;
	
	@JsonProperty("denial_of_mental_illness")
	@Column(name="denial_of_mental_illness") 
	private String denial_of_mental_illness;
	
	@JsonProperty("intellectual_impairment")
	@Column(name="intellectual_impairment") 
	private String intellectual_impairment;
	
	@JsonProperty("recent_change_medication_regimen")
	@Column(name="recent_change_medication_regimen") 
	private String recent_change_medication_regimen;
	
	@JsonProperty("memory_problem")
	@Column(name="memory_problem") 
	private String memory_problem;
	
	
	@JsonProperty("history_of_suicide_attempts")
	@Column(name="history_of_suicide_attempts") 
	private String history_of_suicide_attempts;
	
	@JsonProperty("disinhibited_state")
	@Column(name="disinhibited_state") 
	private String disinhibited_state;
	
	@JsonProperty("other")
	@Column(name="other", columnDefinition="TEXT") 
	private String other;

	@Column(name="explain_factors_increasing_risk", columnDefinition="TEXT") 
	@JsonProperty("explain_factors_increasing_risk")
	private String explain_factors_increasing_risk;
	
	@JsonProperty("does_client_hear_voices_asking_to_harm_or_kill_self")
	@Column(name="does_client_hear_voices_asking_to_harm_or_kill_self", columnDefinition="TEXT")
	private String does_client_hear_voices_asking_to_harm_or_kill_self;
	
	@JsonProperty("compliant_with_treatment")
	@Column(name="compliant_with_treatment") 
	private String compliant_with_treatment;
	
	@JsonProperty("compliant_with_medication")
	@Column(name="compliant_with_medication") 
	private String compliant_with_medication;
	
	@JsonProperty("adaptive_coping_skills")
	@Column(name="adaptive_coping_skills") 
	private String adaptive_coping_skills;
	
	@JsonProperty("insight_into_mental_illness")
	@Column(name="insight_into_mental_illness") 
	private String insight_into_mental_illness;
	
	@JsonProperty("employment_or_school_stability")
	@Column(name="employment_or_school_stability") 
	private String employment_or_school_stability;
	
	@JsonProperty("future_oriented")
	@Column(name="future_oriented") 
	private String future_oriented;
	
	@JsonProperty("religious_beliefs")
	@Column(name="religious_beliefs") 
	private String religious_beliefs;
	
	@JsonProperty("uses_strategies_to_cope_with_command_hallucinations")
	@Column(name="uses_strategies_to_cope_with_command_hallucinations") 
	private String uses_strategies_to_cope_with_command_hallucinations;
	
	@JsonProperty("no_history_of_suicidality")
	@Column(name="no_history_of_suicidality") 
	private String no_history_of_suicidality;
	
	@JsonProperty("no_current_substance_abuse")
	@Column(name="no_current_substance_abuse") 
	private String no_current_substance_abuse;
	
	@JsonProperty("family_significant_other_support")
	@Column(name="family_significant_other_support") 
	private String family_significant_other_support;
	
	@JsonProperty("acceptance_of_mental_illness")
	@Column(name="acceptance_of_mental_illness") 
	private String acceptance_of_mental_illness;
	
	@JsonProperty("social_peer_support")
	@Column(name="social_peer_support") 
	private String social_peer_support;
	
	@JsonProperty("ability_to_contract_for_safety")
	@Column(name="ability_to_contract_for_safety") 
	private String ability_to_contract_for_safety;
	
	@JsonProperty("ability_to_follow_contract")
	@Column(name="ability_to_follow_contract") 
	private String ability_to_follow_contract;
	
	@JsonProperty("other_factors_for_decreasing_risk_of_suicide")
	@Column(name="other_factors_for_decreasing_risk_of_suicide", columnDefinition="TEXT") 
	private String other_factors_for_decreasing_risk_of_suicide;
	
	@JsonProperty("actions_taken")
	@Column(name="actions_taken", columnDefinition="TEXT") 
	private String actions_taken;



	public int getSrapid() {
		return srapid;
	}

	public void setSrapid(int srapid) {
		this.srapid = srapid;
	}

	public String getResons_for_assessment_for_suicidality() {
		return resons_for_assessment_for_suicidality;
	}

	public void setResons_for_assessment_for_suicidality(
			String resons_for_assessment_for_suicidality) {
		this.resons_for_assessment_for_suicidality = resons_for_assessment_for_suicidality;
	}

	

	public String getPlan() {
		return plan;
	}

	public void setPlan(String plan) {
		this.plan = plan;
	}

	public String getMeans_to_carry_out_plan() {
		return means_to_carry_out_plan;
	}

	public void setMeans_to_carry_out_plan(String means_to_carry_out_plan) {
		this.means_to_carry_out_plan = means_to_carry_out_plan;
	}

	public String getAttempt() {
		return attempt;
	}

	public void setAttempt(String attempt) {
		this.attempt = attempt;
	}

	public String getDescribe_other_indicators() {
		return describe_other_indicators;
	}

	public void setDescribe_other_indicators(String describe_other_indicators) {
		this.describe_other_indicators = describe_other_indicators;
	}

	public String getAbuses_drugs_or_alchohol() {
		return abuses_drugs_or_alchohol;
	}

	public void setAbuses_drugs_or_alchohol(String abuses_drugs_or_alchohol) {
		this.abuses_drugs_or_alchohol = abuses_drugs_or_alchohol;
	}

	public String getPoor_impulse_control() {
		return poor_impulse_control;
	}

	public void setPoor_impulse_control(String poor_impulse_control) {
		this.poor_impulse_control = poor_impulse_control;
	}

	public String getFeelings_of_hopelessness() {
		return feelings_of_hopelessness;
	}

	public void setFeelings_of_hopelessness(String feelings_of_hopelessness) {
		this.feelings_of_hopelessness = feelings_of_hopelessness;
	}

	public String getThought_disturbance() {
		return thought_disturbance;
	}

	public void setThought_disturbance(String thought_disturbance) {
		this.thought_disturbance = thought_disturbance;
	}

	public String getRecent_deterioration_of_mental_status() {
		return recent_deterioration_of_mental_status;
	}

	public void setRecent_deterioration_of_mental_status(
			String recent_deterioration_of_mental_status) {
		this.recent_deterioration_of_mental_status = recent_deterioration_of_mental_status;
	}

	public String getMedication_non_compliant() {
		return medication_non_compliant;
	}

	public void setMedication_non_compliant(String medication_non_compliant) {
		this.medication_non_compliant = medication_non_compliant;
	}

	public String getRecent_psychiatric_or_medical_diagnosis() {
		return recent_psychiatric_or_medical_diagnosis;
	}

	public void setRecent_psychiatric_or_medical_diagnosis(
			String recent_psychiatric_or_medical_diagnosis) {
		this.recent_psychiatric_or_medical_diagnosis = recent_psychiatric_or_medical_diagnosis;
	}

	public String getTerminal_illness_chronic_pain() {
		return terminal_illness_chronic_pain;
	}

	public void setTerminal_illness_chronic_pain(
			String terminal_illness_chronic_pain) {
		this.terminal_illness_chronic_pain = terminal_illness_chronic_pain;
	}

	public String getDisorganized_thinking() {
		return disorganized_thinking;
	}

	public void setDisorganized_thinking(String disorganized_thinking) {
		this.disorganized_thinking = disorganized_thinking;
	}

	public String getCurrent_familial_or_interpersonal_conflict() {
		return current_familial_or_interpersonal_conflict;
	}

	public void setCurrent_familial_or_interpersonal_conflict(
			String current_familial_or_interpersonal_conflict) {
		this.current_familial_or_interpersonal_conflict = current_familial_or_interpersonal_conflict;
	}

	public String getPoor_judgement() {
		return poor_judgement;
	}

	public void setPoor_judgement(String poor_judgement) {
		this.poor_judgement = poor_judgement;
	}

	public String getGiving_away_belongings() {
		return giving_away_belongings;
	}

	public void setGiving_away_belongings(String giving_away_belongings) {
		this.giving_away_belongings = giving_away_belongings;
	}

	public String getSocial_withdrawal() {
		return social_withdrawal;
	}

	public void setSocial_withdrawal(String social_withdrawal) {
		this.social_withdrawal = social_withdrawal;
	}

	public String getRecent_end_of_significant_relationship() {
		return recent_end_of_significant_relationship;
	}

	public void setRecent_end_of_significant_relationship(
			String recent_end_of_significant_relationship) {
		this.recent_end_of_significant_relationship = recent_end_of_significant_relationship;
	}

	public String getNon_compliance_with_critical_medical_care() {
		return non_compliance_with_critical_medical_care;
	}

	public void setNon_compliance_with_critical_medical_care(
			String non_compliance_with_critical_medical_care) {
		this.non_compliance_with_critical_medical_care = non_compliance_with_critical_medical_care;
	}

	public String getHistory_of_suicidal_ideation() {
		return history_of_suicidal_ideation;
	}

	public void setHistory_of_suicidal_ideation(String history_of_suicidal_ideation) {
		this.history_of_suicidal_ideation = history_of_suicidal_ideation;
	}

	public String getSuicidal_command_hallucinations() {
		return suicidal_command_hallucinations;
	}

	public void setSuicidal_command_hallucinations(
			String suicidal_command_hallucinations) {
		this.suicidal_command_hallucinations = suicidal_command_hallucinations;
	}

	public String getFamily_history_of_suicide() {
		return family_history_of_suicide;
	}

	public void setFamily_history_of_suicide(String family_history_of_suicide) {
		this.family_history_of_suicide = family_history_of_suicide;
	}

	public String getVictim_of_abuse() {
		return victim_of_abuse;
	}

	public void setVictim_of_abuse(String victim_of_abuse) {
		this.victim_of_abuse = victim_of_abuse;
	}

	public String getEmployment_problems_or_job_loss() {
		return employment_problems_or_job_loss;
	}

	public void setEmployment_problems_or_job_loss(
			String employment_problems_or_job_loss) {
		this.employment_problems_or_job_loss = employment_problems_or_job_loss;
	}

	public String getLegal_problems() {
		return legal_problems;
	}

	public void setLegal_problems(String legal_problems) {
		this.legal_problems = legal_problems;
	}

	public String getAcademic_problems() {
		return academic_problems;
	}

	public void setAcademic_problems(String academic_problems) {
		this.academic_problems = academic_problems;
	}

	public String getPoor_insight() {
		return poor_insight;
	}

	public void setPoor_insight(String poor_insight) {
		this.poor_insight = poor_insight;
	}

	public String getDenial_of_mental_illness() {
		return denial_of_mental_illness;
	}

	public void setDenial_of_mental_illness(String denial_of_mental_illness) {
		this.denial_of_mental_illness = denial_of_mental_illness;
	}

	public String getIntellectual_impairment() {
		return intellectual_impairment;
	}

	public void setIntellectual_impairment(String intellectual_impairment) {
		this.intellectual_impairment = intellectual_impairment;
	}

	public String getMemory_problem() {
		return memory_problem;
	}

	public void setMemory_problem(String memory_problem) {
		this.memory_problem = memory_problem;
	}

	public String getHistory_of_suicide_attempts() {
		return history_of_suicide_attempts;
	}

	public void setHistory_of_suicide_attempts(String history_of_suicide_attempts) {
		this.history_of_suicide_attempts = history_of_suicide_attempts;
	}

	public String getDisinhibited_state() {
		return disinhibited_state;
	}

	public void setDisinhibited_state(String disinhibited_state) {
		this.disinhibited_state = disinhibited_state;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getDoes_client_hear_voices_asking_to_harm_or_kill_self() {
		return does_client_hear_voices_asking_to_harm_or_kill_self;
	}

	public void setDoes_client_hear_voices_asking_to_harm_or_kill_self(
			String does_client_hear_voices_asking_to_harm_or_kill_self) {
		this.does_client_hear_voices_asking_to_harm_or_kill_self = does_client_hear_voices_asking_to_harm_or_kill_self;
	}

	public String getCompliant_with_treatment() {
		return compliant_with_treatment;
	}

	public void setCompliant_with_treatment(String compliant_with_treatment) {
		this.compliant_with_treatment = compliant_with_treatment;
	}

	public String getCompliant_with_medication() {
		return compliant_with_medication;
	}

	public void setCompliant_with_medication(String compliant_with_medication) {
		this.compliant_with_medication = compliant_with_medication;
	}

	public String getAdaptive_coping_skills() {
		return adaptive_coping_skills;
	}

	public void setAdaptive_coping_skills(String adaptive_coping_skills) {
		this.adaptive_coping_skills = adaptive_coping_skills;
	}

	public String getInsight_into_mental_illness() {
		return insight_into_mental_illness;
	}

	public void setInsight_into_mental_illness(String insight_into_mental_illness) {
		this.insight_into_mental_illness = insight_into_mental_illness;
	}

	public String getEmployment_or_school_stability() {
		return employment_or_school_stability;
	}

	public void setEmployment_or_school_stability(
			String employment_or_school_stability) {
		this.employment_or_school_stability = employment_or_school_stability;
	}

	public String getFuture_oriented() {
		return future_oriented;
	}

	public void setFuture_oriented(String future_oriented) {
		this.future_oriented = future_oriented;
	}

	public String getReligious_beliefs() {
		return religious_beliefs;
	}

	public void setReligious_beliefs(String religious_beliefs) {
		this.religious_beliefs = religious_beliefs;
	}

	public String getUses_strategies_to_cope_with_command_hallucinations() {
		return uses_strategies_to_cope_with_command_hallucinations;
	}

	public void setUses_strategies_to_cope_with_command_hallucinations(
			String uses_strategies_to_cope_with_command_hallucinations) {
		this.uses_strategies_to_cope_with_command_hallucinations = uses_strategies_to_cope_with_command_hallucinations;
	}

	public String getNo_history_of_suicidality() {
		return no_history_of_suicidality;
	}

	public void setNo_history_of_suicidality(String no_history_of_suicidality) {
		this.no_history_of_suicidality = no_history_of_suicidality;
	}

	public String getNo_current_substance_abuse() {
		return no_current_substance_abuse;
	}

	public void setNo_current_substance_abuse(String no_current_substance_abuse) {
		this.no_current_substance_abuse = no_current_substance_abuse;
	}

	public String getFamily_significant_other_support() {
		return family_significant_other_support;
	}

	public void setFamily_significant_other_support(
			String family_significant_other_support) {
		this.family_significant_other_support = family_significant_other_support;
	}

	public String getAcceptance_of_mental_illness() {
		return acceptance_of_mental_illness;
	}

	public void setAcceptance_of_mental_illness(String acceptance_of_mental_illness) {
		this.acceptance_of_mental_illness = acceptance_of_mental_illness;
	}

	public String getSocial_peer_support() {
		return social_peer_support;
	}

	public void setSocial_peer_support(String social_peer_support) {
		this.social_peer_support = social_peer_support;
	}

	public String getAbility_to_contract_for_safety() {
		return ability_to_contract_for_safety;
	}

	public void setAbility_to_contract_for_safety(
			String ability_to_contract_for_safety) {
		this.ability_to_contract_for_safety = ability_to_contract_for_safety;
	}

	public String getAbility_to_follow_contract() {
		return ability_to_follow_contract;
	}

	public void setAbility_to_follow_contract(String ability_to_follow_contract) {
		this.ability_to_follow_contract = ability_to_follow_contract;
	}

	public String getOther_factors_for_decreasing_risk_of_suicide() {
		return other_factors_for_decreasing_risk_of_suicide;
	}

	public void setOther_factors_for_decreasing_risk_of_suicide(
			String other_factors_for_decreasing_risk_of_suicide) {
		this.other_factors_for_decreasing_risk_of_suicide = other_factors_for_decreasing_risk_of_suicide;
	}

	public String getActions_taken() {
		return actions_taken;
	}

	public void setActions_taken(String actions_taken) {
		this.actions_taken = actions_taken;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
}

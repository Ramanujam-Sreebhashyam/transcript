package com.transcript.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="patient")
public class Patient {
	
	 
		 @Id
		 @GeneratedValue(strategy = GenerationType.IDENTITY)
		 @JsonProperty("id")
		 @Column(name="Id")
		 private int id;
	 

		@JsonProperty("aimsid")
		@OneToOne
		@JoinColumn(name="aimsid")
		private AbnormalInvoluntaryMovementScale aims;
		
		@JsonProperty("srapid")
		@OneToOne
		@JoinColumn(name="srapid")
		private SuicidalityRiskAssessmentPlan srap;
		
		@JsonProperty("ddfid")
		@OneToOne
		@JoinColumn(name="ddfid")
		private DrDiagnosisForm ddf;
		
		@JsonProperty("mseid")
		@OneToOne
		@JoinColumn(name="mseid")
		private MentalStatusExam mse;
		
		@JsonProperty("rffdid")
		@OneToOne
		@JoinColumn(name="rffdid")
		private RiskFactorsForDR rffd;
	 
	 //.SEQUENCE, generator = "SEQ")
//	 @SequenceGenerator(name = "SEQ", sequenceName = "PSYCH_CLIENT")
	
	@JsonProperty("name")
	@Column(name="name") 
	private String name;
	
	@JsonProperty("email")
	@Column(name="email") 
	private String email;
	
	@JsonProperty("address")
	@Column(name="address", columnDefinition="TEXT") 
	private String address;
	
	@JsonProperty("phone")
	@Column(name="phone") 
	private String phone;
	
	@JsonProperty("dob")
	@Column(name="dob") 
	private String dob;
	
	@JsonProperty("seen_with")
	@Column(name="seen_with") 
	private String seen_with;
	
	@JsonProperty("history_of_present_illness")
	@Column(name="history_of_present_illness", columnDefinition="TEXT") 
	private String history_of_present_illness;
	
	@JsonProperty("sleep_wnl")
	@Column(name="sleep_wnl") 
	private String sleep_wnl;
	
	@JsonProperty("homicidal_ideation_none")
	@Column(name="homicidal_ideation_none") 
	private String homicidal_ideation_none;
	
	@JsonProperty("manic_symptoms_none")
	@Column(name="manic_symptoms_none") 
	private String manic_symptoms_none;
	
	@JsonProperty("manic_symptoms_reported_in_past")
	@Column(name="manic_symptoms_reported_in_past") 
	private String manic_symptoms_reported_in_past;
	
	@JsonProperty("interests_wnl")
	@Column(name="interests_wnl") 
	private String interests_wnl;
	
	@JsonProperty("worry_anxiety_tension_wnl")
	@Column(name="worry_anxiety_tension_wnl") 
	private String worry_anxiety_tension_wnl;
	
	@JsonProperty("guilt_wnl")
	@Column(name="guilt_wnl") 
	private String guilt_wnl;
	
	
	@JsonProperty("hallucination_delusions_none")
	@Column(name="hallucination_delusions_none") 
	private String hallucination_delusions_none;
	
	@JsonProperty("hallucination_delusions_reported_in_past")
	@Column(name="hallucination_delusions_reported_in_past") 
	private String hallucination_delusions_reported_in_past;
	
	@JsonProperty("eating_disorders_none")
	@Column(name="eating_disorders_none") 
	private String eating_disorders_none;
	
	@JsonProperty("eating_disorders_in_past")
	@Column(name="eating_disorders_in_past") 
	private String eating_disorders_in_past;
	
	@JsonProperty("energy_wnl")
	@Column(name="energy_wnl") 
	private String energy_wnl;
	
	@JsonProperty("panic_attacks_none")
	@Column(name="panic_attacks_none") 
	private String panic_attacks_none;
	
	@JsonProperty("concentration_wnl")
	@Column(name="concentration_wnl") 
	private String concentration_wnl;
	
	@JsonProperty("obsessions_compulsions_none")
	@Column(name="obsessions_compulsions_none") 
	private String obsessions_compulsions_none;
	
	@JsonProperty("self_injurious_behaviour_none")
	@Column(name="self_injurious_behaviour_none") 
	private String self_injurious_behaviour_none;
	
	@JsonProperty("self_injurious_behaviour_reported_in_past")
	@Column(name="self_injurious_behaviour_reported_in_past") 
	private String self_injurious_behaviour_reported_in_past;
	
	@JsonProperty("violence_history_none")
	@Column(name="violence_history_none") 
	private String violence_history_none;
	
	@JsonProperty("appetite_wnl")
	@Column(name="appetite_wnl") 
	private String appetite_wnl;
	
	@JsonProperty("suicidal_ideation_none")
	@Column(name="suicidal_ideation_none") 
	private String suicidal_ideation_none;
	
	@JsonProperty("gun_ownership_none")
	@Column(name="gun_ownership_none") 
	private String gun_ownership_none;
	
	@JsonProperty("psychiatric_review_of_symptoms")
	@Column(name="psychiatric_review_of_symptoms", columnDefinition="TEXT") 
	private String psychiatric_review_of_symptoms;
	
	@JsonProperty("psychiatric_hospitalizations")
	@Column(name="psychiatric_hospitalizations", columnDefinition="TEXT") 
	private String psychiatric_hospitalizations;
	
	@JsonProperty("suicide_attempts")
	@Column(name="suicide_attempts", columnDefinition="TEXT") 
	private String suicide_attempts;
	
	@JsonProperty("previous_dignosis")
	@Column(name="previous_dignosis", columnDefinition="TEXT") 
	private String previous_dignosis;
	
	@JsonProperty("current_medications")
	@Column(name="current_medications", columnDefinition="TEXT") 
	private String current_medications;
	
	@JsonProperty("allergies")
	@Column(name="allergies", columnDefinition="TEXT") 
	private String allergies;
	
	@JsonProperty("family_history")
	@Column(name="family_history", columnDefinition="TEXT") 
	private String family_history;
	
	@JsonProperty("past_medical_history")
	@Column(name="past_medical_history", columnDefinition="TEXT") 
	private String past_medical_history;
	
	@JsonProperty("substance_abuse_history")
	@Column(name="substance_abuse_history", columnDefinition="TEXT") 
	private String substance_abuse_history;
	
	@JsonProperty("legal_history")
	@Column(name="legal_history", columnDefinition="TEXT") 
	private String legal_history;
	
	@JsonProperty("military_history")
	@Column(name="military_history", columnDefinition="TEXT") 
	private String military_history;
	
	@JsonProperty("born_in")
	@Column(name="born_in") 
	private String born_in;
	
	@JsonProperty("raised_in")
	@Column(name="raised_in") 
	private String raised_in;
	
	@JsonProperty("parents")
	@Column(name="parents") 
	private String parents;
	
	@JsonProperty("childhood_trauma")
	@Column(name="childhood_trauma", columnDefinition="TEXT") 
	private String childhood_trauma;
	
	@JsonProperty("school_job_history")
	@Column(name="school_job_history", columnDefinition="TEXT") 
	private String school_job_history;
	
	@JsonProperty("relationship_history_social_situation")
	@Column(name="relationship_history_social_situation", columnDefinition="TEXT") 
	private String relationship_history_social_situation;
	
	@JsonProperty("sexual_activity")
	@Column(name="sexual_activity", columnDefinition="TEXT") 
	private String sexual_activity;
	
	@JsonProperty("smoking_status")
	@Column(name="smoking_status", columnDefinition="TEXT") 
	private String smoking_status;
	
	@JsonProperty("future_goals_strengths")
	@Column(name="future_goals_strengths", columnDefinition="TEXT") 
	private String future_goals_strengths;
	

	public String getEating_disorders_in_past() {
		return eating_disorders_in_past;
	}
	public void setEating_disorders_in_past(String eating_disorders_in_past) {
		this.eating_disorders_in_past = eating_disorders_in_past;
	}

	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getSeen_with() {
		return seen_with;
	}
	public void setSeen_with(String seen_with) {
		this.seen_with = seen_with;
	}
	public String getHistory_of_present_illness() {
		return history_of_present_illness;
	}
	public void setHistory_of_present_illness(String history_of_present_illness) {
		this.history_of_present_illness = history_of_present_illness;
	}
	public String getSleep_wnl() {
		return sleep_wnl;
	}
	public void setSleep_wnl(String sleep_wnl) {
		this.sleep_wnl = sleep_wnl;
	}
	public String getHomicidal_ideation_none() {
		return homicidal_ideation_none;
	}
	public void setHomicidal_ideation_none(String homicidal_ideation_none) {
		this.homicidal_ideation_none = homicidal_ideation_none;
	}
	public String getManic_symptoms_none() {
		return manic_symptoms_none;
	}
	public void setManic_symptoms_none(String manic_symptoms_none) {
		this.manic_symptoms_none = manic_symptoms_none;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getInterests_wnl() {
		return interests_wnl;
	}
	public void setInterests_wnl(String interests_wnl) {
		this.interests_wnl = interests_wnl;
	}
	public String getWorry_anxiety_tension_wnl() {
		return worry_anxiety_tension_wnl;
	}
	public void setWorry_anxiety_tension_wnl(String worry_anxiety_tension_wnl) {
		this.worry_anxiety_tension_wnl = worry_anxiety_tension_wnl;
	}
	public String getGuilt_wnl() {
		return guilt_wnl;
	}
	public void setGuilt_wnl(String guilt_wnl) {
		this.guilt_wnl = guilt_wnl;
	}
	public String getHallucination_delusions_none() {
		return hallucination_delusions_none;
	}
	public void setHallucination_delusions_none(String hallucination_delusions_none) {
		this.hallucination_delusions_none = hallucination_delusions_none;
	}
	

	public String getEating_disorders_none() {
		return eating_disorders_none;
	}
	public void setEating_disorders_none(String eating_disorders_none) {
		this.eating_disorders_none = eating_disorders_none;
	}
	public String getEnergy_wnl() {
		return energy_wnl;
	}
	public void setEnergy_wnl(String energy_wnl) {
		this.energy_wnl = energy_wnl;
	}
	public String getPanic_attacks_none() {
		return panic_attacks_none;
	}
	public void setPanic_attacks_none(String panic_attacks_none) {
		this.panic_attacks_none = panic_attacks_none;
	}
	public String getConcentration_wnl() {
		return concentration_wnl;
	}
	public void setConcentration_wnl(String concentration_wnl) {
		this.concentration_wnl = concentration_wnl;
	}
	public String getObsessions_compulsions_none() {
		return obsessions_compulsions_none;
	}
	public void setObsessions_compulsions_none(String obsessions_compulsions_none) {
		this.obsessions_compulsions_none = obsessions_compulsions_none;
	}
	public String getSelf_injurious_behaviour_none() {
		return self_injurious_behaviour_none;
	}
	public void setSelf_injurious_behaviour_none(
			String self_injurious_behaviour_none) {
		this.self_injurious_behaviour_none = self_injurious_behaviour_none;
	}

	public String getViolence_history_none() {
		return violence_history_none;
	}
	public void setViolence_history_none(String violence_history_none) {
		this.violence_history_none = violence_history_none;
	}
	public String getAppetite_wnl() {
		return appetite_wnl;
	}
	public void setAppetite_wnl(String appetite_wnl) {
		this.appetite_wnl = appetite_wnl;
	}
	public String getSuicidal_ideation_none() {
		return suicidal_ideation_none;
	}
	public void setSuicidal_ideation_none(String suicidal_ideation_none) {
		this.suicidal_ideation_none = suicidal_ideation_none;
	}
	public String getGun_ownership_none() {
		return gun_ownership_none;
	}
	public void setGun_ownership_none(String gun_ownership_none) {
		this.gun_ownership_none = gun_ownership_none;
	}
	
	public String getPsychiatric_hospitalizations() {
		return psychiatric_hospitalizations;
	}
	public void setPsychiatric_hospitalizations(String psychiatric_hospitalizations) {
		this.psychiatric_hospitalizations = psychiatric_hospitalizations;
	}
	public String getSuicide_attempts() {
		return suicide_attempts;
	}
	public void setSuicide_attempts(String suicide_attempts) {
		this.suicide_attempts = suicide_attempts;
	}
	public String getPrevious_dignosis() {
		return previous_dignosis;
	}
	public void setPrevious_dignosis(String previous_dignosis) {
		this.previous_dignosis = previous_dignosis;
	}
	public String getCurrent_medications() {
		return current_medications;
	}
	public void setCurrent_medications(String current_medications) {
		this.current_medications = current_medications;
	}
	public String getAllergies() {
		return allergies;
	}
	public void setAllergies(String allergies) {
		this.allergies = allergies;
	}
	public String getFamily_history() {
		return family_history;
	}
	public void setFamily_history(String family_history) {
		this.family_history = family_history;
	}
	public String getPast_medical_history() {
		return past_medical_history;
	}
	public void setPast_medical_history(String past_medical_history) {
		this.past_medical_history = past_medical_history;
	}
	public String getSubstance_abuse_history() {
		return substance_abuse_history;
	}
	public void setSubstance_abuse_history(String substance_abuse_history) {
		this.substance_abuse_history = substance_abuse_history;
	}
	public String getLegal_history() {
		return legal_history;
	}
	public void setLegal_history(String legal_history) {
		this.legal_history = legal_history;
	}
	public String getMilitary_history() {
		return military_history;
	}
	public void setMilitary_history(String military_history) {
		this.military_history = military_history;
	}
	public String getBorn_in() {
		return born_in;
	}
	public void setBorn_in(String born_in) {
		this.born_in = born_in;
	}
	public String getRaised_in() {
		return raised_in;
	}
	public void setRaised_in(String raised_in) {
		this.raised_in = raised_in;
	}
	public String getParents() {
		return parents;
	}
	public void setParents(String parents) {
		this.parents = parents;
	}
	public String getChildhood_trauma() {
		return childhood_trauma;
	}
	public void setChildhood_trauma(String childhood_trauma) {
		this.childhood_trauma = childhood_trauma;
	}
	public String getSchool_job_history() {
		return school_job_history;
	}
	public void setSchool_job_history(String school_job_history) {
		this.school_job_history = school_job_history;
	}
	
	public String getSexual_activity() {
		return sexual_activity;
	}
	public void setSexual_activity(String sexual_activity) {
		this.sexual_activity = sexual_activity;
	}
	public String getSmoking_status() {
		return smoking_status;
	}
	public void setSmoking_status(String smoking_status) {
		this.smoking_status = smoking_status;
	}
	public String getFuture_goals_strengths() {
		return future_goals_strengths;
	}
	public void setFuture_goals_strengths(String future_goals_strengths) {
		this.future_goals_strengths = future_goals_strengths;
	}
	public String getManic_symptoms_reported_in_past() {
		return manic_symptoms_reported_in_past;
	}
	public void setManic_symptoms_reported_in_past(
			String manic_symptoms_reported_in_past) {
		this.manic_symptoms_reported_in_past = manic_symptoms_reported_in_past;
	}
	public String getHallucination_delusions_reported_in_past() {
		return hallucination_delusions_reported_in_past;
	}
	public void setHallucination_delusions_reported_in_past(
			String hallucination_delusions_reported_in_past) {
		this.hallucination_delusions_reported_in_past = hallucination_delusions_reported_in_past;
	}
	public String getSelf_injurious_behaviour_reported_in_past() {
		return self_injurious_behaviour_reported_in_past;
	}
	public void setSelf_injurious_behaviour_reported_in_past(
			String self_injurious_behaviour_reported_in_past) {
		this.self_injurious_behaviour_reported_in_past = self_injurious_behaviour_reported_in_past;
	}
	public String getPsychiatric_review_of_symptoms() {
		return psychiatric_review_of_symptoms;
	}
	public void setPsychiatric_review_of_symptoms(
			String psychiatric_review_of_symptoms) {
		this.psychiatric_review_of_symptoms = psychiatric_review_of_symptoms;
	}
	public String getRelationship_history_social_situation() {
		return relationship_history_social_situation;
	}
	public void setRelationship_history_social_situation(
			String relationship_history_social_situation) {
		this.relationship_history_social_situation = relationship_history_social_situation;
	}
	public AbnormalInvoluntaryMovementScale getAims() {
		return aims;
	}
	public void setAims(AbnormalInvoluntaryMovementScale aims) {
		this.aims = aims;
	}
	public SuicidalityRiskAssessmentPlan getSrap() {
		return srap;
	}
	public void setSrap(SuicidalityRiskAssessmentPlan srap) {
		this.srap = srap;
	}
	public DrDiagnosisForm getDdf() {
		return ddf;
	}
	public void setDdf(DrDiagnosisForm ddf) {
		this.ddf = ddf;
	}
	public MentalStatusExam getMse() {
		return mse;
	}
	public void setMse(MentalStatusExam mse) {
		this.mse = mse;
	}
	public RiskFactorsForDR getRffd() {
		return rffd;
	}
	public void setRffd(RiskFactorsForDR rffd) {
		this.rffd = rffd;
	}
	
	
	
	
}

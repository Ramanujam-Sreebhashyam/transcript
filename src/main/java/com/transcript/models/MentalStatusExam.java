package com.transcript.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonProperty;

@Entity
@Table(name="MentalStatusExam")
public class MentalStatusExam {
	
	public MentalStatusExam(Patient p)
	{
		this.setPatient(p);
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @JsonProperty("mseid")
	 @Column(name="mseid")
	 private int mseid;
	 
		@JsonProperty("id")
		@OneToOne
		@JoinColumn(name="Id")
		private Patient patient;
	
	@JsonProperty("appears_stated_age")
	@Column(name="appears_stated_age")
	private String appears_stated_age;
	
	@JsonProperty("appropriate_dress_grooming")
	@Column(name="appropriate_dress_grooming")
	private String appropriate_dress_grooming;
	
	@JsonProperty("eye_contact_was_fair")
	@Column(name="eye_contact_was_fair")
	private String eye_contact_was_fair;
	
	@JsonProperty("was_calm_and_cooperative")
	@Column(name="was_calm_and_cooperative")
	private String was_calm_and_cooperative;
	
	@JsonProperty("speech_had_abnormalities")
	@Column(name="speech_had_abnormalities")
	private String speech_had_abnormalities;
	
	@JsonProperty("mood_was")
	@Column(name="mood_was")
	private String mood_was;
	
	@JsonProperty("affect_was_normal_in_range_appropriate_and_mood_congruent")
	@Column(name="affect_was_normal_in_range_appropriate_and_mood_congruent")
	private String affect_was_normal_in_range_appropriate_and_mood_congruent;
	
	@JsonProperty("though_process_was_goal_oriented")
	@Column(name="though_process_was_goal_oriented")
	private String though_process_was_goal_oriented;
	
	@JsonProperty("hallucinations")
	@Column(name="hallucinations")
	private String hallucinations;
	
	@JsonProperty("delusions")
	@Column(name="delusions")
	private String delusions;
	
	@JsonProperty("evidence_of_response_to_internal_stimuli")
	@Column(name="evidence_of_response_to_internal_stimuli")
	private String evidence_of_response_to_internal_stimuli;
	
	@JsonProperty("suicidal")
	@Column(name="suicidal")
	private String suicidal;
	
	@JsonProperty("homicidal")
	@Column(name="homicidal")
	private String homicidal;
	
	@JsonProperty("contracts_for_safety")
	@Column(name="contracts_for_safety")
	private String contracts_for_safety;
	
	
	@JsonProperty("alert_and_oriented")
	@Column(name="alert_and_oriented")
	private String alert_and_oriented;
	
	
	@JsonProperty("memory_register_was")
	@Column(name="memory_register_was")
	private String memory_register_was;
	
	@JsonProperty("memory_recall_was")
	@Column(name="memory_recall_was")
	private String memory_recall_was;
	
	@JsonProperty("serial_7_or_world_backwards_was")
	@Column(name="serial_7_or_world_backwards_was")
	private String serial_7_or_world_backwards_was;
	
	@JsonProperty("remembered")
	@Column(name="remembered")
	private String remembered;
	
	@JsonProperty("ability_to_abstract_was_basically_intact")
	@Column(name="ability_to_abstract_was_basically_intact")
	private String ability_to_abstract_was_basically_intact;
	
	@JsonProperty("insight_appeared_fair_based_on_history")
	@Column(name="insight_appeared_fair_based_on_history")
	private String insight_appeared_fair_based_on_history;
	
	@JsonProperty("judgement_appeared_fair_based_on_memory")
	@Column(name="judgement_appeared_fair_based_on_memory")
	private String judgement_appeared_fair_based_on_memory;
	
	@JsonProperty("other")
	@Column(name="other", columnDefinition="TEXT")
	private String other;
	
	@JsonProperty("recommendation_including_treatment_modality")
	@Column(name="recommendation_including_treatment_modality", columnDefinition="TEXT")
	private String recommendation_including_treatment_modality;



	public int getMseid() {
		return mseid;
	}

	public void setMseid(int mseid) {
		this.mseid = mseid;
	}

	public String getAppears_stated_age() {
		return appears_stated_age;
	}

	public void setAppears_stated_age(String appears_stated_age) {
		this.appears_stated_age = appears_stated_age;
	}

	public String getAppropriate_dress_grooming() {
		return appropriate_dress_grooming;
	}

	public void setAppropriate_dress_grooming(String appropriate_dress_grooming) {
		this.appropriate_dress_grooming = appropriate_dress_grooming;
	}

	public String getEye_contact_was_fair() {
		return eye_contact_was_fair;
	}

	public void setEye_contact_was_fair(String eye_contact_was_fair) {
		this.eye_contact_was_fair = eye_contact_was_fair;
	}

	public String getWas_calm_and_cooperative() {
		return was_calm_and_cooperative;
	}

	public void setWas_calm_and_cooperative(String was_calm_and_cooperative) {
		this.was_calm_and_cooperative = was_calm_and_cooperative;
	}

	public String getSpeech_had_abnormalities() {
		return speech_had_abnormalities;
	}

	public void setSpeech_had_abnormalities(String speech_had_abnormalities) {
		this.speech_had_abnormalities = speech_had_abnormalities;
	}

	public String getMood_was() {
		return mood_was;
	}

	public void setMood_was(String mood_was) {
		this.mood_was = mood_was;
	}

	public String getAffect_was_normal_in_range_appropriate_and_mood_congruent() {
		return affect_was_normal_in_range_appropriate_and_mood_congruent;
	}

	public void setAffect_was_normal_in_range_appropriate_and_mood_congruent(
			String affect_was_normal_in_range_appropriate_and_mood_congruent) {
		this.affect_was_normal_in_range_appropriate_and_mood_congruent = affect_was_normal_in_range_appropriate_and_mood_congruent;
	}

	public String getThough_process_was_goal_oriented() {
		return though_process_was_goal_oriented;
	}

	public void setThough_process_was_goal_oriented(
			String though_process_was_goal_oriented) {
		this.though_process_was_goal_oriented = though_process_was_goal_oriented;
	}

	public String getHallucinations() {
		return hallucinations;
	}

	public void setHallucinations(String hallucinations) {
		this.hallucinations = hallucinations;
	}

	public String getDelusions() {
		return delusions;
	}

	public void setDelusions(String delusions) {
		this.delusions = delusions;
	}

	public String getEvidence_of_response_to_internal_stimuli() {
		return evidence_of_response_to_internal_stimuli;
	}

	public void setEvidence_of_response_to_internal_stimuli(
			String evidence_of_response_to_internal_stimuli) {
		this.evidence_of_response_to_internal_stimuli = evidence_of_response_to_internal_stimuli;
	}

	public String getSuicidal() {
		return suicidal;
	}

	public void setSuicidal(String suicidal) {
		this.suicidal = suicidal;
	}

	public String getHomicidal() {
		return homicidal;
	}

	public void setHomicidal(String homicidal) {
		this.homicidal = homicidal;
	}

	public String getContracts_for_safety() {
		return contracts_for_safety;
	}

	public void setContracts_for_safety(String contracts_for_safety) {
		this.contracts_for_safety = contracts_for_safety;
	}

	public String getAlert_and_oriented() {
		return alert_and_oriented;
	}

	public void setAlert_and_oriented(String alert_and_oriented) {
		this.alert_and_oriented = alert_and_oriented;
	}

	public String getMemory_register_was() {
		return memory_register_was;
	}

	public void setMemory_register_was(String memory_register_was) {
		this.memory_register_was = memory_register_was;
	}

	public String getMemory_recall_was() {
		return memory_recall_was;
	}

	public void setMemory_recall_was(String memory_recall_was) {
		this.memory_recall_was = memory_recall_was;
	}

	public String getSerial_7_or_world_backwards_was() {
		return serial_7_or_world_backwards_was;
	}

	public void setSerial_7_or_world_backwards_was(
			String serial_7_or_world_backwards_was) {
		this.serial_7_or_world_backwards_was = serial_7_or_world_backwards_was;
	}

	public String getRemembered() {
		return remembered;
	}

	public void setRemembered(String remembered) {
		this.remembered = remembered;
	}

	public String getAbility_to_abstract_was_basically_intact() {
		return ability_to_abstract_was_basically_intact;
	}

	public void setAbility_to_abstract_was_basically_intact(
			String ability_to_abstract_was_basically_intact) {
		this.ability_to_abstract_was_basically_intact = ability_to_abstract_was_basically_intact;
	}

	public String getInsight_appeared_fair_based_on_history() {
		return insight_appeared_fair_based_on_history;
	}

	public void setInsight_appeared_fair_based_on_history(
			String insight_appeared_fair_based_on_history) {
		this.insight_appeared_fair_based_on_history = insight_appeared_fair_based_on_history;
	}

	public String getJudgement_appeared_fair_based_on_memory() {
		return judgement_appeared_fair_based_on_memory;
	}

	public void setJudgement_appeared_fair_based_on_memory(
			String judgement_appeared_fair_based_on_memory) {
		this.judgement_appeared_fair_based_on_memory = judgement_appeared_fair_based_on_memory;
	}

	public String getOther() {
		return other;
	}

	public void setOther(String other) {
		this.other = other;
	}

	public String getRecommendation_including_treatment_modality() {
		return recommendation_including_treatment_modality;
	}

	public void setRecommendation_including_treatment_modality(
			String recommendation_including_treatment_modality) {
		this.recommendation_including_treatment_modality = recommendation_including_treatment_modality;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	
	
	
	
	
	
}

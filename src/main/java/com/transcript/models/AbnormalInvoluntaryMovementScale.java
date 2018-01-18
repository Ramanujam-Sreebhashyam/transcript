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
@Table(name="AbnormalInvoluntaryMovementScale")
public class AbnormalInvoluntaryMovementScale {
	
	public AbnormalInvoluntaryMovementScale(Patient p)
	{
		this.setPatient(p);
	}

	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @JsonProperty("aimsid")
	 @Column(name="aimsid")
	 private int aimsid;
	
		@JsonProperty("id")
		@OneToOne
		@JoinColumn(name="Id")
		private Patient patient;
	 
	@JsonProperty("muscles_of_facial_expression")
	@Column(name="muscles_of_facial_expression")
	private String muscles_of_facial_expression;
	
	@JsonProperty("lips_and_perioral_area")
	@Column(name="lips_and_perioral_area")
	private String lips_and_perioral_area;
	
	@JsonProperty("jaw")
	@Column(name="jaw")
	private String jaw;
	
	@JsonProperty("tongue")
	@Column(name="tongue")
	private String tongue;
	
	@JsonProperty("Upper_arms_wrists_hands_fingers")
	@Column(name="Upper_arms_wrists_hands_fingers")
	private String Upper_arms_wrists_hands_fingers;
	
	@JsonProperty("Lower_legs_knees_ankles_toes")
	@Column(name="Lower_legs_knees_ankles_toes")
	private String Lower_legs_knees_ankles_toes;
	
	@JsonProperty("Neck_shoulders_hips")
	@Column(name="Neck_shoulders_hips")
	private String Neck_shoulders_hips;
	
	@JsonProperty("severity_of_abnormal_movements")
	@Column(name="severity_of_abnormal_movements")
	private String severity_of_abnormal_movements;
	
	@JsonProperty("incapacity_due_to_abnormal_movements")
	@Column(name="incapacity_due_to_abnormal_movements")
	private String incapacity_due_to_abnormal_movements;
	
	@JsonProperty("patients_awareness_of_abnormal_movements")
	@Column(name="patients_awareness_of_abnormal_movements")
	private String patients_awareness_of_abnormal_movements;
	
	@JsonProperty("total_tardive_dyskinesia_like_score")
	@Column(name="total_tardive_dyskinesia_like_score")
	private String total_tardive_dyskinesia_like_score;
	
	@JsonProperty("current_problems_with_teeth_and_dentures")
	@Column(name="current_problems_with_teeth_and_dentures")
	private String current_problems_with_teeth_and_dentures;
	
	@JsonProperty("does_client_usually_wear_dentures")
	@Column(name="does_client_usually_wear_dentures")
	private String does_client_usually_wear_dentures;
	
	@JsonProperty("comments_and_concerns")
	@Column(name="comments_and_concerns", columnDefinition="TEXT")
	private String comments_and_concerns;



	public int getAimsid() {
		return aimsid;
	}

	public void setAimsid(int aimsid) {
		this.aimsid = aimsid;
	}

	public String getMuscles_of_facial_expression() {
		return muscles_of_facial_expression;
	}

	public void setMuscles_of_facial_expression(String muscles_of_facial_expression) {
		this.muscles_of_facial_expression = muscles_of_facial_expression;
	}

	public String getLips_and_perioral_area() {
		return lips_and_perioral_area;
	}

	public void setLips_and_perioral_area(String lips_and_perioral_area) {
		this.lips_and_perioral_area = lips_and_perioral_area;
	}

	public String getJaw() {
		return jaw;
	}

	public void setJaw(String jaw) {
		this.jaw = jaw;
	}

	public String getTongue() {
		return tongue;
	}

	public void setTongue(String tongue) {
		this.tongue = tongue;
	}

	public String getUpper_arms_wrists_hands_fingers() {
		return Upper_arms_wrists_hands_fingers;
	}

	public void setUpper_arms_wrists_hands_fingers(
			String upper_arms_wrists_hands_fingers) {
		Upper_arms_wrists_hands_fingers = upper_arms_wrists_hands_fingers;
	}

	public String getLower_legs_knees_ankles_toes() {
		return Lower_legs_knees_ankles_toes;
	}

	public void setLower_legs_knees_ankles_toes(String lower_legs_knees_ankles_toes) {
		Lower_legs_knees_ankles_toes = lower_legs_knees_ankles_toes;
	}

	public String getNeck_shoulders_hips() {
		return Neck_shoulders_hips;
	}

	public void setNeck_shoulders_hips(String neck_shoulders_hips) {
		Neck_shoulders_hips = neck_shoulders_hips;
	}

	public String getSeverity_of_abnormal_movements() {
		return severity_of_abnormal_movements;
	}

	public void setSeverity_of_abnormal_movements(
			String severity_of_abnormal_movements) {
		this.severity_of_abnormal_movements = severity_of_abnormal_movements;
	}

	public String getIncapacity_due_to_abnormal_movements() {
		return incapacity_due_to_abnormal_movements;
	}

	public void setIncapacity_due_to_abnormal_movements(
			String incapacity_due_to_abnormal_movements) {
		this.incapacity_due_to_abnormal_movements = incapacity_due_to_abnormal_movements;
	}

	public String getPatients_awareness_of_abnormal_movements() {
		return patients_awareness_of_abnormal_movements;
	}

	public void setPatients_awareness_of_abnormal_movements(
			String patients_awareness_of_abnormal_movements) {
		this.patients_awareness_of_abnormal_movements = patients_awareness_of_abnormal_movements;
	}

	public String getTotal_tardive_dyskinesia_like_score() {
		return total_tardive_dyskinesia_like_score;
	}

	public void setTotal_tardive_dyskinesia_like_score(
			String total_tardive_dyskinesia_like_score) {
		this.total_tardive_dyskinesia_like_score = total_tardive_dyskinesia_like_score;
	}

	public String getCurrent_problems_with_teeth_and_dentures() {
		return current_problems_with_teeth_and_dentures;
	}

	public void setCurrent_problems_with_teeth_and_dentures(
			String current_problems_with_teeth_and_dentures) {
		this.current_problems_with_teeth_and_dentures = current_problems_with_teeth_and_dentures;
	}

	public String getDoes_client_usually_wear_dentures() {
		return does_client_usually_wear_dentures;
	}

	public void setDoes_client_usually_wear_dentures(
			String does_client_usually_wear_dentures) {
		this.does_client_usually_wear_dentures = does_client_usually_wear_dentures;
	}

	public String getComments_and_concerns() {
		return comments_and_concerns;
	}

	public void setComments_and_concerns(String comments_and_concerns) {
		this.comments_and_concerns = comments_and_concerns;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}

	
	
	
}

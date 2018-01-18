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
@Table(name="RiskFactorsForDR")
public class RiskFactorsForDR {
	
	
	public RiskFactorsForDR(Patient p)
	{
		this.setPatient(p);
	}
	
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 @JsonProperty("rffdid")
	 @Column(name="rffdid")
	 private int rffdid;
	
		@JsonProperty("id")
		@OneToOne
		@JoinColumn(name="Id")
		private Patient patient;
	 
	@JsonProperty("access_to_use_of_weapons")
	@Column(name="access_to_use_of_weapons", columnDefinition="TEXT")
	private String access_to_use_of_weapons;
	
	@JsonProperty("suicidal_homicidal")
	@Column(name="suicidal_homicidal", columnDefinition="TEXT")
	private String suicidal_homicidal;
	
	@JsonProperty("violent_aggressive_behaviours")
	@Column(name="violent_aggressive_behaviours", columnDefinition="TEXT")
	private String violent_aggressive_behaviours;
	
	@JsonProperty("current_history_of_abuse_neglect_domestic_violence")
	@Column(name="current_history_of_abuse_neglect_domestic_violence", columnDefinition="TEXT")
	private String current_history_of_abuse_neglect_domestic_violence;
	
	@JsonProperty("current_history_of_sexually_predatory_behaviours_or_risks")
	@Column(name="current_history_of_sexually_predatory_behaviours_or_risks", columnDefinition="TEXT")
	private String current_history_of_sexually_predatory_behaviours_or_risks;
	
	@JsonProperty("current_history_of_fire_setting")
	@Column(name="current_history_of_fire_setting", columnDefinition="TEXT")
	private String current_history_of_fire_setting;
	
	@JsonProperty("current_history_of_animal_abuse_misuse")
	@Column(name="current_history_of_animal_abuse_misuse", columnDefinition="TEXT")
	private String current_history_of_animal_abuse_misuse;
	
	@JsonProperty("identity_client_triggers")
	@Column(name="identity_client_triggers", columnDefinition="TEXT")
	private String identity_client_triggers;



	public int getRffdid() {
		return rffdid;
	}

	public void setRffdid(int rffdid) {
		this.rffdid = rffdid;
	}

	public String getAccess_to_use_of_weapons() {
		return access_to_use_of_weapons;
	}

	public void setAccess_to_use_of_weapons(String access_to_use_of_weapons) {
		this.access_to_use_of_weapons = access_to_use_of_weapons;
	}

	public String getSuicidal_homicidal() {
		return suicidal_homicidal;
	}

	public void setSuicidal_homicidal(String suicidal_homicidal) {
		this.suicidal_homicidal = suicidal_homicidal;
	}

	public String getViolent_aggressive_behaviours() {
		return violent_aggressive_behaviours;
	}

	public void setViolent_aggressive_behaviours(
			String violent_aggressive_behaviours) {
		this.violent_aggressive_behaviours = violent_aggressive_behaviours;
	}

	public String getCurrent_history_of_abuse_neglect_domestic_violence() {
		return current_history_of_abuse_neglect_domestic_violence;
	}

	public void setCurrent_history_of_abuse_neglect_domestic_violence(
			String current_history_of_abuse_neglect_domestic_violence) {
		this.current_history_of_abuse_neglect_domestic_violence = current_history_of_abuse_neglect_domestic_violence;
	}

	public String getCurrent_history_of_sexually_predatory_behaviours_or_risks() {
		return current_history_of_sexually_predatory_behaviours_or_risks;
	}

	public void setCurrent_history_of_sexually_predatory_behaviours_or_risks(
			String current_history_of_sexually_predatory_behaviours_or_risks) {
		this.current_history_of_sexually_predatory_behaviours_or_risks = current_history_of_sexually_predatory_behaviours_or_risks;
	}

	public String getCurrent_history_of_fire_setting() {
		return current_history_of_fire_setting;
	}

	public void setCurrent_history_of_fire_setting(
			String current_history_of_fire_setting) {
		this.current_history_of_fire_setting = current_history_of_fire_setting;
	}

	public String getCurrent_history_of_animal_abuse_misuse() {
		return current_history_of_animal_abuse_misuse;
	}

	public void setCurrent_history_of_animal_abuse_misuse(
			String current_history_of_animal_abuse_misuse) {
		this.current_history_of_animal_abuse_misuse = current_history_of_animal_abuse_misuse;
	}

	public String getIdentity_client_triggers() {
		return identity_client_triggers;
	}

	public void setIdentity_client_triggers(String identity_client_triggers) {
		this.identity_client_triggers = identity_client_triggers;
	}

	public Patient getPatient() {
		return patient;
	}

	public void setPatient(Patient patient) {
		this.patient = patient;
	}
	

	
}

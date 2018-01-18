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
@Table(name="DrDiagnosisForm")
public class DrDiagnosisForm {
	
	
	public DrDiagnosisForm(Patient p)
	{
		this.setPatient(p);
	}
			
			 @Id
			 @GeneratedValue(strategy = GenerationType.IDENTITY)
			 @JsonProperty("ddfid")
			 @Column(name="ddfid")
			 private int ddfid;
			 
				@JsonProperty("id")
				@OneToOne
				@JoinColumn(name="Id")
				private Patient patient;
			
			@JsonProperty("axis_1")
			@Column(name="axis_1", columnDefinition="TEXT")
			private String axis_1;
			
			@JsonProperty("axis_2")
			@Column(name="axis_2", columnDefinition="TEXT")
			private String axis_2;
			
			@JsonProperty("axis_3")
			@Column(name="axis_3", columnDefinition="TEXT")
			private String axis_3;
			
			@JsonProperty("axis_4")
			@Column(name="axis_4", columnDefinition="TEXT")
			private String axis_4;
			
			@JsonProperty("axis_5")
			@Column(name="axis_5", columnDefinition="TEXT")
			private String axis_5;
			
			@JsonProperty("general_comments")
			@Column(name="general_comments", columnDefinition="TEXT")
			private String general_comments;



			public int getDdfid() {
				return ddfid;
			}

			public void setDdfid(int ddfid) {
				this.ddfid = ddfid;
			}

			public String getAxis_1() {
				return axis_1;
			}

			public void setAxis_1(String axis_1) {
				this.axis_1 = axis_1;
			}

			public String getAxis_2() {
				return axis_2;
			}

			public void setAxis_2(String axis_2) {
				this.axis_2 = axis_2;
			}

			public String getAxis_3() {
				return axis_3;
			}

			public void setAxis_3(String axis_3) {
				this.axis_3 = axis_3;
			}

			public String getAxis_4() {
				return axis_4;
			}

			public void setAxis_4(String axis_4) {
				this.axis_4 = axis_4;
			}

			public String getAxis_5() {
				return axis_5;
			}

			public void setAxis_5(String axis_5) {
				this.axis_5 = axis_5;
			}

			public String getGeneral_comments() {
				return general_comments;
			}

			public void setGeneral_comments(String general_comments) {
				this.general_comments = general_comments;
			}

			public Patient getPatient() {
				return patient;
			}

			public void setPatient(Patient patient) {
				this.patient = patient;
			}
			
			
			
}

package com.transcript;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.transcript.models.AbnormalInvoluntaryMovementScale;
import com.transcript.models.DrDiagnosisForm;
import com.transcript.models.MentalStatusExam;
import com.transcript.models.Patient;
import com.transcript.models.RiskFactorsForDR;
import com.transcript.models.SuicidalityRiskAssessmentPlan;
import com.transcript.service.AbnormalInvoluntaryMovementScaleService;
import com.transcript.service.DrDiagnosisFormService;
import com.transcript.service.MentalStatusExamService;
import com.transcript.service.PatientService;
import com.transcript.service.RiskFactorsForDRService;
import com.transcript.service.SuicidalityRiskAssessmentPlanService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranscriptAppServiceTests {
	
	@Autowired
	AbnormalInvoluntaryMovementScaleService aimsservice;
	
	@Autowired
	DrDiagnosisFormService ddfsservice;
	
	@Autowired
	MentalStatusExamService mseservice;
	
	
	@Autowired
	RiskFactorsForDRService rffdservice;
	
	@Autowired
	SuicidalityRiskAssessmentPlanService srapservice;
	
	@Autowired
	PatientService ps;
	
	
	@Test
	public void testservices()
	{
		Patient p = ps.findByID(11);
		
		AbnormalInvoluntaryMovementScale aims = new AbnormalInvoluntaryMovementScale(p);
		
		DrDiagnosisForm ddf = new DrDiagnosisForm(p);
		
		MentalStatusExam mse = new MentalStatusExam(p);
		
		RiskFactorsForDR rffd = new RiskFactorsForDR(p);
		
		SuicidalityRiskAssessmentPlan srap = new SuicidalityRiskAssessmentPlan(p);
		
		
		mse.setAppears_stated_age("yes");
		mse.setSpeech_had_abnormalities("yes");
		mse.setRecommendation_including_treatment_modality("continue under current medicartion");
		
		aims.setMuscles_of_facial_expression("severe");
		aims.setLips_and_perioral_area("moderate");
		aims.setJaw("mild");
		aims.setTongue("minimal");
		aims.setNeck_shoulders_hips("none");
		aims.setComments_and_concerns("test tests testetds test tset");
		
		
		srap.setResons_for_assessment_for_suicidality("denied are the reasons for suicidality");
		srap.setPlan("no plans as of yet");
		srap.setAttempt("multiple attempts, but still alive, god bless");
		srap.setAbuses_drugs_or_alchohol("true");
		srap.setMedication_non_compliant("false");
		srap.setCompliant_with_treatment("true");
		
		rffd.setAccess_to_use_of_weapons("denied");
		rffd.setViolent_aggressive_behaviours("denied");
		rffd.setCurrent_history_of_abuse_neglect_domestic_violence("existing history");
		
		ddf.setAxis_4("diagnosis problem related to life management difficulty, unspecfied");
		
		aimsservice.update(aims);
		ddfsservice.update(ddf);
		mseservice.update(mse);
		rffdservice.update(rffd);
		srapservice.update(srap);
		
		p.setAims(aims);
		p.setDdf(ddf);
		p.setMse(mse);
		p.setRffd(rffd);
		p.setSrap(srap);
		
		ps.addpatient(p);
		
		
	}

}

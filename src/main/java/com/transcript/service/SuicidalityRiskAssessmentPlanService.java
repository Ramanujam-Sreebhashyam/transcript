package com.transcript.service;

import org.springframework.stereotype.Service;
import com.transcript.models.SuicidalityRiskAssessmentPlan;

@Service
public interface SuicidalityRiskAssessmentPlanService {
	
	public boolean update(SuicidalityRiskAssessmentPlan srap);
	
	public SuicidalityRiskAssessmentPlan findByID(int id);
	
	public boolean delete(SuicidalityRiskAssessmentPlan srap);

}

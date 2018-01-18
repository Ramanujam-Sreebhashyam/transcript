package com.transcript.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.transcript.dao.SuicidalityRiskAssessmentPlanRepository;
import com.transcript.models.SuicidalityRiskAssessmentPlan;
import com.transcript.service.SuicidalityRiskAssessmentPlanService;

@Component
public class SuicidalityRiskAssessmentPlanServiceImpl implements SuicidalityRiskAssessmentPlanService{
	
	@Autowired
	SuicidalityRiskAssessmentPlanRepository repository;
	
	
	
	public SuicidalityRiskAssessmentPlan findByID(int id) {
		// TODO Auto-generated method stub		
		repository.findOne(id);		
		return repository.findOne(id);
	}

	public boolean update(SuicidalityRiskAssessmentPlan obj) {
		// TODO Auto-generated method stub
		if(repository.save(obj).getSrapid() == obj.getSrapid())
		{	
			
			return true;
		}
		else
		return false;
	}

	public boolean delete(SuicidalityRiskAssessmentPlan obj) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		repository.delete(obj.getSrapid());
		if(repository.exists(obj.getSrapid()))
		return false;
		else
		return true;
	}

}

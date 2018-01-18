package com.transcript.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.transcript.dao.RiskFactorsForDRRepository;
import com.transcript.models.RiskFactorsForDR;
import com.transcript.service.RiskFactorsForDRService;

@Component
public class RiskFactorsForDRServiceImpl implements RiskFactorsForDRService{
	
	@Autowired
	RiskFactorsForDRRepository repository;
	
	
	
	public RiskFactorsForDR findByID(int id) {
		// TODO Auto-generated method stub		
		repository.findOne(id);		
		return repository.findOne(id);
	}

	public boolean update(RiskFactorsForDR obj) {
		// TODO Auto-generated method stub
		if(repository.save(obj).getRffdid() == obj.getRffdid())
		{	
			
			return true;
		}
		else
		return false;
	}

	public boolean delete(RiskFactorsForDR obj) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		repository.delete(obj.getRffdid());
		if(repository.exists(obj.getRffdid()))
		return false;
		else
		return true;
	}

}

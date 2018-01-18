package com.transcript.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.transcript.dao.AbnormalInvoluntaryMovementScaleRepository;
import com.transcript.models.AbnormalInvoluntaryMovementScale;
import com.transcript.service.AbnormalInvoluntaryMovementScaleService;

@Component
public class AbnormalInvoluntaryMovementScaleServiceImpl  implements AbnormalInvoluntaryMovementScaleService{

	@Autowired
	AbnormalInvoluntaryMovementScaleRepository repository;
	
	
	
	public AbnormalInvoluntaryMovementScale findByID(int id) {
		// TODO Auto-generated method stub		
		repository.findOne(id);		
		return repository.findOne(id);
	}

	public boolean update(AbnormalInvoluntaryMovementScale obj) {
		// TODO Auto-generated method stub
		if(repository.save(obj).getAimsid() == obj.getAimsid())
		{	
			
			return true;
		}
		else
		return false;
	}

	public boolean delete(AbnormalInvoluntaryMovementScale obj) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		repository.delete(obj.getAimsid());
		if(repository.exists(obj.getAimsid()))
		return false;
		else
		return true;
	}
	
	
}

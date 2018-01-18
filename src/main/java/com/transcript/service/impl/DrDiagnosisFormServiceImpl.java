package com.transcript.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import com.transcript.dao.DrDiagnosisFormRepository;
import com.transcript.models.DrDiagnosisForm;
import com.transcript.service.DrDiagnosisFormService;

@Component
public class DrDiagnosisFormServiceImpl implements DrDiagnosisFormService {
	
	@Autowired
	DrDiagnosisFormRepository repository;
	
	
	
	public DrDiagnosisForm findByID(int id) {
		// TODO Auto-generated method stub		
		repository.findOne(id);		
		return repository.findOne(id);
	}

	public boolean update(DrDiagnosisForm obj) {
		// TODO Auto-generated method stub
		if(repository.save(obj).getDdfid() == obj.getDdfid())
		{	
			
			return true;
		}
		else
		return false;
	}

	public boolean delete(DrDiagnosisForm obj) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		repository.delete(obj.getDdfid());
		if(repository.exists(obj.getDdfid()))
		return false;
		else
		return true;
	}

}

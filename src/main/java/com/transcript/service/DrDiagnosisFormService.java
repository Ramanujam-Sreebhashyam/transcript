package com.transcript.service;

import org.springframework.stereotype.Service;
import com.transcript.models.DrDiagnosisForm;

@Service
public interface DrDiagnosisFormService {
		
	public boolean update(DrDiagnosisForm ddf);
	
	public DrDiagnosisForm findByID(int id);
	
	public boolean delete(DrDiagnosisForm ddf);
}

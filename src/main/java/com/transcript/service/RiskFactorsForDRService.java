package com.transcript.service;

import org.springframework.stereotype.Service;
import com.transcript.models.RiskFactorsForDR;

@Service
public interface RiskFactorsForDRService {

	public boolean update(RiskFactorsForDR rffd);
	
	public RiskFactorsForDR findByID(int id);
	
	public boolean delete(RiskFactorsForDR rffd);
	
}

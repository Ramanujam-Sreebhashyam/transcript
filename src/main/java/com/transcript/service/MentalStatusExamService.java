package com.transcript.service;

import org.springframework.stereotype.Service;
import com.transcript.models.MentalStatusExam;

@Service
public interface MentalStatusExamService {
	
	public boolean update(MentalStatusExam mse);
	
	public MentalStatusExam findByID(int id);
	
	public boolean delete(MentalStatusExam mse);

}

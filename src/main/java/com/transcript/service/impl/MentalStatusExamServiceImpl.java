package com.transcript.service.impl;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.transcript.dao.MentalStatusExamRepository;
import com.transcript.dao.PatientRepository;
import com.transcript.models.MentalStatusExam;
import com.transcript.models.Patient;
import com.transcript.service.MentalStatusExamService;
import com.transcript.service.PDFSaver;
import com.transcript.service.PatientService;

@Component
public class MentalStatusExamServiceImpl  implements MentalStatusExamService {

	@Autowired
	MentalStatusExamRepository repository;
	
	
	
	public MentalStatusExam findByID(int id) {
		// TODO Auto-generated method stub		
		repository.findOne(id);		
		return repository.findOne(id);
	}

	public boolean update(MentalStatusExam obj) {
		// TODO Auto-generated method stub
		if(repository.save(obj).getMseid() == obj.getMseid() )
		{	
			
			return true;
		}
		else
		return false;
	}

	public boolean delete(MentalStatusExam obj) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		repository.delete(obj.getMseid());
		if(repository.exists(obj.getMseid()))
		return false;
		else
		return true;
	}



	
}

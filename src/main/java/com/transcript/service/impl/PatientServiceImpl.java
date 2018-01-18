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

import com.transcript.dao.PatientRepository;
import com.transcript.models.Patient;
import com.transcript.service.PDFSaver;
import com.transcript.service.PatientService;

@Component
public class PatientServiceImpl  implements PatientService {

	@Autowired
	PatientRepository repository;
	
	@Autowired
	PDFSaver pdfsaver;
	
	public Page<Patient> findall(Pageable pageable)
	{	
		return repository.findAll(pageable);
	}

	public Patient findByID(int id) {
		repository.findOne(id);		
		return repository.findOne(id);
	}

	public boolean savePDF(Patient p) {
		return pdfsaver.savepdf(p);
	}

	public boolean addpatient(Patient patient) {
		if(repository.save(patient).getName().equals(patient.getName()))
		{	
			savePDF(patient);
			return true;
		}
		else
		return false;
	}

	public boolean deletepatient(Patient p) throws IllegalArgumentException  {
		// TODO Auto-generated method stub
		repository.delete(p.getId());
		if(repository.exists(p.getId()))
		return false;
		else
		return true;
	}
	
}

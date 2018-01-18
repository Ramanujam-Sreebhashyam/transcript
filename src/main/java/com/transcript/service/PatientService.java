package com.transcript.service;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import com.transcript.dao.PatientRepository;
import com.transcript.models.Patient;

@Service
public interface PatientService  {
	
	
	public boolean addpatient(Patient ps);
	
	public Page<Patient> findall(Pageable pageable);
	
	public Patient findByID(int id);
	
	public boolean deletepatient(Patient p);
	
	public boolean savePDF(Patient ps);
	
}

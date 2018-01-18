package com.transcript.dao;


import java.util.List;

import org.springframework.data.repository.PagingAndSortingRepository;

import com.transcript.models.Patient;


public interface PatientRepository extends PagingAndSortingRepository<Patient, Integer> {
	
	
	
	
}

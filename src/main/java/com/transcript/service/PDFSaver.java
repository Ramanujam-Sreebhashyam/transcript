package com.transcript.service;

import org.springframework.stereotype.Service;

import com.transcript.models.Patient;

@Service
public interface PDFSaver {

	public boolean savepdf(Patient p);
	
}

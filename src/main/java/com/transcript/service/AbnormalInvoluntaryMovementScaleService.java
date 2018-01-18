package com.transcript.service;

import org.springframework.stereotype.Service;

import com.transcript.models.AbnormalInvoluntaryMovementScale;


@Service
public interface AbnormalInvoluntaryMovementScaleService {

	public boolean update(AbnormalInvoluntaryMovementScale aims);
	
	public AbnormalInvoluntaryMovementScale findByID(int id);
	
	public boolean delete(AbnormalInvoluntaryMovementScale aims);
	
}

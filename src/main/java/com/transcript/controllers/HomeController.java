package com.transcript.controllers;

import java.io.ByteArrayOutputStream;
import java.io.FileInputStream;
import java.io.InputStream;

import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.transcript.models.Patient;
import com.transcript.service.PatientService;

@Controller
public class HomeController {

	ObjectMapper mapper = new ObjectMapper();
	
	@Autowired
	PatientService ps;
	
	@RequestMapping("/")
	public String home()
	{
		return "index";
	}
	
	@RequestMapping("/form")
	public String form()
	{
		return "form";
	}
	
	@RequestMapping("/aims")
	public String aims()
	{
		return "aims";
	}
	
	@RequestMapping("/srap")
	public String srap()
	{
		return "srap";
	}
	
	
	@RequestMapping("/viewpatients")
	public String viewpatients()
	{
		return "viewpatients";
	}
	
	@RequestMapping("/dsmpage")
	public String dsmpage()
	{
		return "dsm";
	}
	
	@RequestMapping(value="/patients",method = RequestMethod.POST)
	public @ResponseBody String view(Pageable pageable)
	{
		Page<Patient> pl = ps.findall(pageable);
		
		try {
			
			return mapper.writeValueAsString(pl);
		} catch (JsonProcessingException e) {
			e.printStackTrace();
			return "false";
		}
		
	}
	
	
	@RequestMapping(value="/add",method = RequestMethod.POST)
	public @ResponseBody boolean add(@RequestBody Patient patient)
	{		
		if(patient != null)
		return ps.addpatient(patient);
		else
		return false;
	}
	
	@RequestMapping(value="/delete",method = RequestMethod.POST)
	public @ResponseBody boolean delete(@RequestBody Patient patient)
	{	
		if(patient != null)
		return ps.deletepatient(patient);
		else
		return false;
	}
	
	@RequestMapping(value="/view",method = RequestMethod.POST)
	public @ResponseBody String view(@RequestBody Patient patient) throws JsonProcessingException
	{
		if(patient != null)
		{
			return mapper.writeValueAsString(ps.findByID(patient.getId()));
		}
		else
		{
			return mapper.writeValueAsString(patient);
		}
	}
	
	@RequestMapping(value="/dsm5",method = RequestMethod.POST, produces="application/pdf")
	public byte[] dsm(HttpServletResponse response) 
	{
			//final InputStream fileInputStream = new FileInputStream("dsm5.pdf");
			ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
			return outputStream.toByteArray();

	        
	 }


	
	

}

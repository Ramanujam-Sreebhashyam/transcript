package com.transcript;


import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.lang.reflect.Field;
import java.util.Iterator;
import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.test.context.junit4.SpringRunner;












import com.transcript.models.Patient;
import com.transcript.service.PatientService;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TranscriptappApplicationTests {
	
	@Autowired
	PatientService ps;
	

	@Test
	public void contextLoads() {
	}

//	@Test
//	public void PatientService()
//	{
//		
//		Patient patient = new Patient();
//		patient.setAddress("123 robbinsville 08691");
//		patient.setDob("2 jul");
//		patient.setName("test case patient cbd");
//		patient.setSmoking_status("true");
//		patient.setPast_medical_history("You can add contents to a document using the PDFBox library, this provides you a class named PDPageContentStream which contains the required methods to insert text, images, and other types of contents in a page of a PDFDocument. Following are the steps to create an empty document and add contents to a page in it. Step 1: Loading an Existing Document. You can load an existing document using the load method of the PDDocument class. Therefore, instantiate this class and load the required document as shown below.");
//
//		//System.out.println(ps.findByName("test case patient"));
//
//		PageRequest request = new PageRequest(1,5);
//		//assertTrue(ps.savePDF(patient));
//		//assertTrue(ps.addpatient(patient));
//		//assertNotNull(ps.findall(request));
//		Page<Patient> pl = ps.findall(request);
//		for(Patient u : pl)
//		{
//			System.out.println(u.getId());
//		}
//		
//	}
	

}

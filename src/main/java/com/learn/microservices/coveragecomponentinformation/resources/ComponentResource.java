package com.learn.microservices.coveragecomponentinformation.resources;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.learn.microservices.coveragecomponentinformation.model.CoverageComponent;
import com.learn.microservices.coveragecomponentinformation.model.CoveredPerson;
import com.learn.microservices.coveragecomponentinformation.model.EnrollmentCoverageComponent;



@RestController
@RequestMapping("/resources")
public class ComponentResource {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${covered.person.url}")
	private String url;
	
	@RequestMapping("/getComponent")
	public CoverageComponent getCoverageComponent(){
		CoveredPerson cp= restTemplate.getForObject(url, CoveredPerson.class);
		List<EnrollmentCoverageComponent> eccList=Arrays.asList(
				new EnrollmentCoverageComponent(1,"Base",cp.getEcpList()),new EnrollmentCoverageComponent(2,"Emp",cp.getEcpList()));
		CoverageComponent cc=new CoverageComponent(eccList);
		return cc;
		
	}
}

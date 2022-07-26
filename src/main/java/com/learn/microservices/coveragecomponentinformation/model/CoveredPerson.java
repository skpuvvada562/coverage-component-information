package com.learn.microservices.coveragecomponentinformation.model;

import java.util.List;

public class CoveredPerson {

	private List<EnrollmentCoveredPerson> ecpList;

	public CoveredPerson() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CoveredPerson(List<EnrollmentCoveredPerson> ecpList) {
		super();
		this.ecpList = ecpList;
	}

	
	public List<EnrollmentCoveredPerson> getEcpList() {
		return ecpList;
	}

	public void setEcpList(List<EnrollmentCoveredPerson> ecpList) {
		this.ecpList = ecpList;
	}

	@Override
	public String toString() {
		return "CoveredPerson [ecpList=" + ecpList + "]";
	}
	
}

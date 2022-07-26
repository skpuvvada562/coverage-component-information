package com.learn.microservices.coveragecomponentinformation.model;

import java.util.List;

public class CoverageComponent {

	private List<EnrollmentCoverageComponent> eccList;
	

	public CoverageComponent() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public CoverageComponent(List<EnrollmentCoverageComponent> eccList) {
		super();
		this.eccList = eccList;
	}



	public List<EnrollmentCoverageComponent> getEccList() {
		return eccList;
	}

	public void setEccList(List<EnrollmentCoverageComponent> eccList) {
		this.eccList = eccList;
	}


	@Override
	public String toString() {
		return "CoverageComponent [eccList=" + eccList +  "]";
	}



	
}

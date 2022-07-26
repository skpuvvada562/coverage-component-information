package com.learn.microservices.coveragecomponentinformation.model;

import java.util.List;

public class EnrollmentCoverageComponent {

	private int eccId;
	private String code;
	private List<EnrollmentCoveredPerson> ecpList;
	/*private CoveredPerson cp;*/

	public EnrollmentCoverageComponent() {
		super();
		// TODO Auto-generated constructor stub
	}

	/*public EnrollmentCoverageComponent(int eccId, String code, CoveredPerson cp) {
		super();
		this.eccId = eccId;
		this.code = code;
		this.cp = cp;
	}*/

	public int getEccId() {
		return eccId;
	}

	public EnrollmentCoverageComponent(int eccId, String code, List<EnrollmentCoveredPerson> ecpList) {
		super();
		this.eccId = eccId;
		this.code = code;
		this.ecpList = ecpList;
	}

	public void setEccId(int eccId) {
		this.eccId = eccId;
	}

	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public List<EnrollmentCoveredPerson> getEcpList() {
		return ecpList;
	}

	public void setEcpList(List<EnrollmentCoveredPerson> ecpList) {
		this.ecpList = ecpList;
	}

	@Override
	public String toString() {
		return "EnrollmentCoverageComponent [eccId=" + eccId + ", code=" + code + ", ecpList=" + ecpList + "]";
	}

	/*public CoveredPerson getCp() {
		return cp;
	}

	public void setCp(CoveredPerson cp) {
		this.cp = cp;
	}

	@Override
	public String toString() {
		return "EnrollmentCoverageComponent [eccId=" + eccId + ", code=" + code + ", cp=" + cp + "]";
	}*/

}

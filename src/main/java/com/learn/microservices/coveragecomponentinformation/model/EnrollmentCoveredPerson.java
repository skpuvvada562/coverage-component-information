package com.learn.microservices.coveragecomponentinformation.model;

public class EnrollmentCoveredPerson {

	private int ecpId;
	private String ecpName;
	private String ecpAge;
	public EnrollmentCoveredPerson() {
		super();
		// TODO Auto-generated constructor stub
	}
	public EnrollmentCoveredPerson(int ecpId, String ecpName, String ecpAge) {
		super();
		this.ecpId = ecpId;
		this.ecpName = ecpName;
		this.ecpAge = ecpAge;
	}
	public int getEcpId() {
		return ecpId;
	}
	public void setEcpId(int ecpId) {
		this.ecpId = ecpId;
	}
	public String getEcpName() {
		return ecpName;
	}
	public void setEcpName(String ecpName) {
		this.ecpName = ecpName;
	}
	public String getEcpAge() {
		return ecpAge;
	}
	public void setEcpAge(String ecpAge) {
		this.ecpAge = ecpAge;
	}
	@Override
	public String toString() {
		return "EnrollmentCoveredPerson [ecpId=" + ecpId + ", ecpName=" + ecpName + ", ecpAge=" + ecpAge + "]";
	}
	
}

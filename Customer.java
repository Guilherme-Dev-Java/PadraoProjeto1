package br.com.calosguilherme.padaroProjeto1;

public class Customer {

	private String gradeRequest;
	private boolean hasCompanyContract;
	
	public Customer(String gradeRequest, boolean hasCompanyContract) {
		 	this.gradeRequest = gradeRequest;
		 	this.hasCompanyContract = hasCompanyContract;
	}
	
	public boolean hasComapanyContract() {
		return hasCompanyContract;
	}
	
	public String getGradeRequest() {
		return gradeRequest;
	}
	
}

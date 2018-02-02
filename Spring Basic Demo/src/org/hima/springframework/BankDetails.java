package org.hima.springframework;

public class BankDetails {

	private String bankName;
	private String bankID;
	private String bankAddress;

	public void getBankName() {
		System.out.println("This is parent class " + bankName);
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void getBankID() {
		System.out.println("This is parent class " + bankID);
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public void getBankAddress() {
		System.out.println("This is parent class " + bankAddress);
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

}

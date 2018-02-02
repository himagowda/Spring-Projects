package org.hima.springframework;

public class Customer {

	private String name;
	private int phoneNumber;
	private String bankName;
	private String bankID;
	private String bankAddress;

	public void getName() {
		System.out.println("Customer name is " + name);
	}

	public void setName(String name) {
		this.name = name;
	}

	public void getPhoneNumber() {
		System.out.println("Customer Phone number " + phoneNumber);
	}

	public void setPhoneNumber(int phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public void getBankName() {
		System.out.println("This is Bank name from child class "+bankName);
	}

	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	public void getBankID() {
		System.out.println("This is Bank ID from child class "+bankID+"\n");
	}

	public void setBankID(String bankID) {
		this.bankID = bankID;
	}

	public void getBankAddress() {
		System.out.println("This is Bank address from parent class "+bankAddress+"\n");
	}

	public void setBankAddress(String bankAddress) {
		this.bankAddress = bankAddress;
	}

}

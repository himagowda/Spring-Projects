package org.hima.springframework;

public class HelloWord {

	private String message;

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public void draw() {
		System.out.println("Hello and welcome to Spring Framework"+"\n");
	}

}

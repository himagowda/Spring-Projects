package org.hima.springframework;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String args[]) {

		/* Application context concept and basics of spring framework */
		AbstractApplicationContext context = new ClassPathXmlApplicationContext("org/hima/xml/Spring.xml");
		HelloWord helloWord = (HelloWord) context.getBean("helloword");
		helloWord.draw();

		/* Bean Scope */
		BeanScope type1 = (BeanScope) context.getBean("beanscope");
		type1.setMessage("Hey there This is Bean type example"+"\n");
		type1.getMessage();

		BeanScope type2 = (BeanScope) context.getBean("beanscope");
		type2.getMessage();

		/* Bean Life cycle */
		CreditCard obj = (CreditCard) context.getBean("creditcard");
		obj.getCardNo();
		context.registerShutdownHook();

		/* Inheritance in Bean */
		BankDetails bnkdtls = (BankDetails) context.getBean("bankdetails");
		bnkdtls.getBankAddress();
		bnkdtls.getBankID();
		bnkdtls.getBankName();

		Customer cust = (Customer) context.getBean("customer");
		cust.getName();
		cust.getPhoneNumber();
		cust.getBankName();
		cust.getBankID();

		/* Dependency Injection (constructor based ) */
		TextEditor te = (TextEditor) context.getBean("textEditor");
		te.spellCheck();
	   te.readCount();

		/* Annotations */

		Student student = (Student) context.getBean("student");
		System.out.println("Name : " + student.getName());
		System.out.println("Age : " + student.getAge()+"\n");

		Profile profile = (Profile) context.getBean("profile");
		profile.printAge();
		profile.printName();

	}
}

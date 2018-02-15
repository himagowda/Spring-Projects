package org.hima.springframework.aspect;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class AopMain {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("org/hima/xml/spring.xml");

		Student student = (Student) context.getBean("student");
		student.getName();
		student.getAge();

		student.printThrowException();
	}

}

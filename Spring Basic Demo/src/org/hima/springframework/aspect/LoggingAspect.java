package org.hima.springframework.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;

@Aspect
public class LoggingAspect {

	/*
	 * The below @Before Commands are some of usefull ways to use this attribute
	 * of Aspect
	 */

	//@Before("execution(public String getName())")
	// @Before("execution(public String
	// org.hima.springframework.aop.model.Circle.getName())")
	// @Before("execution(public * get*())")
	// @Before("execution(* get*(*))")--- for one or more
	// @Before("execution(* get*(..))") --- for zero or more arguments
	// @Before("allGetters()")
	// @Before("args(String)")
	/* all logical operations work as well */
	// @Before("allGetters() && allCircleMethods()")
	public void LoggingAdvice() {
		System.out.println("Advice run get method called");
	}

	// @Before("execution(public String getName())")
	// @Before("allGetters()")
	public void SecondAdvice() {
		System.out.println("second Advice executed");
	}

	//@Before("allCircleMethods()")
	public void LoggingAdvice(JoinPoint joinpoint) {
		System.out.println(joinpoint.toString());
		// System.out.println(joinpoint.getTarget());
		// Circle circle =(Circle)joinpoint.getTarget();
	}

	/*Pointcuts is the attribute that holds the expression which can be reused for other advice */
	
	//@Pointcut("execution(public String getName())")
	public void allGetters() {
		System.out.println("This is point cut all Getters");
	}

	//@Pointcut("within(org.hima.springframework.aop.model.Circle)")
	// @Pointcut("within(org.hima.springframework.aop.model..)")
	// @Pointcut(args()) -- takes all the class names or interface names
	public void allCircleMethods() {
		System.out.println("This is point cut all circle methods ");
	}

	/*
	// @After("args(name)")
	@AfterThrowing(pointcut = "args(name)", throwing = "ex")
	public void exceptionAdvice(String name, RuntimeException ex) {
		System.out.println("An exception has been thrown  " + ex.toString());
	}
	 */
}

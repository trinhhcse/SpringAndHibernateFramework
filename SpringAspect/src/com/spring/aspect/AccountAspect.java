package com.spring.aspect;

import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;

@Aspect // is class that have collection of relative advice(What action is taken and
		// when it should be apply)
@Component
public class AccountAspect {

//	Define a point cut one to reuse , share and compile this point cut for advice
//		+Name of point cut declaration : forDaoPackage 
	@Pointcut("execution(* com.spring.dao.*.*(..))")
	private void forDaoPackage() {
	}

	// Point cut for getter
	@Pointcut("execution(* get*(..))")
	private void getter() {
	}

	// Point cut for setter
	@Pointcut("execution(* set*(..))")
	private void setter() {
	}
	
	//Combine point cut: include any class's method exclude getter and setter
	@Pointcut("forDaoPackage() && !(getter() || setter())")
	private void combineWithGetterSetter() {
	}

// To specific/describe  JOIN POINT we using POINT CUT (A predicate(description) expression  : PE)

//	Advice:
//		+When it should be applied : @Before
//		+What action is Taken : logBeforeAddAccount()
//		
//	Point Cut:
//		+PE for where Advice should be apply: "execution(public void addAccount())"
//		+Rules to wearing

//	Join Point: 
//		+When addCount() of Account call during program execution 
//		+Situation that match the rules to wearing

//	--> Run Advice(logAccount action and Before) at situation that Describe by Point Cut
//	@Before("execution(public void com.spring.dao.AccountDAOImpl.addAccount())")
//	@Before("execution(public void add*())")
//	@Before("execution(public void add*(com.spring.entity.Membership))")
//	@Before("execution(public void com.spring.*.add*(..))")  // public void any class'method start with add and 
	// have 0 or more any param type
	// of any class in com.spring package
// @Before("execution(public void add*(*))")	 // one param of any param type 

	@Before("forDaoPackage()")
	public void logBeforeMethodExecutiontWithSingePointCut() {
//		System.out.println("Execution of log for AccountDAOImpl");
		System.out.println("Execution of logBeforeMethodExecutiontWithSingePointCut for ANY class's method");
	}

	@Before("combineWithGetterSetter()")
	public void logBeforeMethodExecutiontWithMultiplePointCut() {
		System.out.println("Execution of logBeforeMethodExecutiontWithMultiplePointCut "
				+ "for any class's method exclude getter/setter from com.spring.dao package");
	}
}

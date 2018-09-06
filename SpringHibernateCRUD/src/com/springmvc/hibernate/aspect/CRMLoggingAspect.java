package com.springmvc.hibernate.aspect;

import java.util.logging.Logger;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;


@Aspect
@Component // combile for support aop proxy
public class CRMLoggingAspect {

	// setup Logger
	private Logger logger = Logger.getLogger(getClass().getName());

	// setup pointcut for controller
	@Pointcut("execution(* com.springmvc.hibernate.controller.*.*(..))")
	public void pointcutForControllerPackage() {
	}

	// setup pointcut for service
	@Pointcut("execution(* com.springmvc.hibernate.service.*.*(..))")
	public void pointcutForServicePackage() {
	}

	// setup pointcut for dao
	@Pointcut("execution(* com.springmvc.hibernate.dao.*.*(..))")
	public void pointcutForDaoPackage() {
	}

	// setup pointcut for dao
	@Pointcut("pointcutForControllerPackage() || pointcutForServicePackage() || pointcutForDaoPackage()")
	public void pointcutCombineForAppFlow() {
	}

	// @Before advice for controller
	@Before("pointcutCombineForAppFlow()")
	public void beforeLoggingForControllerPackage(JoinPoint joinpoint) {
		logger.info("@Before calling method: "+joinpoint.getSignature().toShortString());
		logger.info("@Before calling Result: "+joinpoint.getArgs().toString());
	}

	// @AfterReturn advice for controller
	@AfterReturning(pointcut = "pointcutCombineForAppFlow()", returning = "result")
	public void AfterReturnLoggingForControllerPackage(JoinPoint joinPoint,Object result) {
		logger.info("@AfterReturning calling method: "+joinPoint.getSignature().toShortString());
		logger.info("@AfterReturning calling result: "+result);
	}
}

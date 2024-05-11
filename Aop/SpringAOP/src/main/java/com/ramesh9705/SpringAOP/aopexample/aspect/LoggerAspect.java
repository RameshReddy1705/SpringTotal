package com.ramesh9705.SpringAOP.aopexample.aspect;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.After;
import org.aspectj.lang.annotation.AfterReturning;
import org.aspectj.lang.annotation.AfterThrowing;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class LoggerAspect
{
//	private Logger logger=LoggerFactory.getLogger(getClass());
//	
//	@Before("execution(* com.ramesh9705.SpringAOP.*.*(..))")
//	public void logMethodCallBeforeExecution(JoinPoint joinPoint)
//	{
//		logger.info("Before aspect - {} is called with arguments:{}"
//				, joinPoint, joinPoint.getArgs()
//				);
//	}
//	@After("execution(* com.ramesh9705.SpringAOP.*.*(..))")
//	public void logMethodCallAfterExecution(JoinPoint joinPoint)
//	{
//		logger.info("After aspect - {} has executed", joinPoint);
//	}
//	@AfterThrowing(
//			pointcut =  "execution(* com.ramesh9705.SpringAOP.*.*(..))",
//			throwing = "exception"
//			)
//	public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exception)
//	{
//		logger.info("AfterThrowing aspect - {} has thrown an exception {}", joinPoint, exception);
//	}
//	@AfterReturning(
//			pointcut =  "execution(* com.ramesh9705.SpringAOP.*.*(..))",
//			returning = "resultValue"
//			)
//	public void logMethodCallAfterSuccessfullExecution(JoinPoint joinPoint, Object resultValue )
//	{
//		logger.info("AfterReturning aspect - {} has return {}", joinPoint, resultValue);
//	}
	
private Logger logger=LoggerFactory.getLogger(getClass());
	
	@Before("com.ramesh9705.SpringAOP.aopexample.aspect.CommonPointConfig.businessAndDataPackageConfig()")
	public void logMethodCallBeforeExecution(JoinPoint joinPoint)
	{
		logger.info("Before aspect - {} is called with arguments:{}"
				, joinPoint, joinPoint.getArgs()
				);
	}
	@After("com.ramesh9705.SpringAOP.aopexample.aspect.CommonPointConfig.businessPackageConfig()")
	public void logMethodCallAfterExecution(JoinPoint joinPoint)
	{
		logger.info("After aspect - {} has executed", joinPoint);
	}
	@AfterThrowing(
			pointcut =  "execution(* com.ramesh9705.SpringAOP.*.*(..))",
			throwing = "exception"
			)
	public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exception)
	{
		logger.info("AfterThrowing aspect - {} has thrown an exception {}", joinPoint, exception);
	}
	@AfterReturning(
			pointcut =  "execution(* com.ramesh9705.SpringAOP.*.*(..))",
			returning = "resultValue"
			)
	public void logMethodCallAfterSuccessfullExecution(JoinPoint joinPoint, Object resultValue )
	{
		logger.info("AfterReturning aspect - {} has return {}", joinPoint, resultValue);
	}
	
	
}

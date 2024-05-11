package com.ramesh9705.SpringAOP01.AopExample.aspects;

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
public class LoggingAspects
{
//	private Logger logger=LoggerFactory.getLogger(getClass());
//	//pintCut
//	//excecution(* Package.*.*(..))
//	@Before("execution(* com.ramesh9705.SpringAOP01.AopExample.*.*.*(..))")
//	public void logMethodCall(JoinPoint joinPoint)
//	{
//		logger.info("Before Aspect - {}",joinPoint, joinPoint.getArgs());
//	}
//	@After("execution(* com.ramesh9705.SpringAOP01.AopExample.*.*.*(..))")
//	public void logMethodCallAfterExecution(JoinPoint joinPoint)
//	{
//		logger.info("After Aspect - {} has executed",joinPoint);
//	}
//	@AfterThrowing(
//		pointcut = 	"execution(* com.ramesh9705.SpringAOP01.AopExample.*.*.*(..))",
//			throwing="exception")
//	public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exception)
//	{
//		logger.info("AfterThrowing Aspect - {} has thrown an exception {}",joinPoint,exception);
//	}
//	@AfterReturning(
//			pointcut = 	"execution(* com.ramesh9705.SpringAOP01.AopExample.*.*.*(..))",
//				returning ="returnValue")
//		public void logMethodCallAfterReturningExecution(JoinPoint joinPoint, Object returnValue)
//		{
//			logger.info("AfterReturning Aspect - {} has returning - {}",joinPoint,returnValue);
//		}
	private Logger logger=LoggerFactory.getLogger(getClass());
	//pintCut
	//excecution(* Package.*.*(..))
	@Before("com.ramesh9705.SpringAOP01.AopExample.aspects.CommonAspects.allPackageConfiguration()")
	public void logMethodCall(JoinPoint joinPoint)
	{
		logger.info("Before Aspect - {}",joinPoint, joinPoint.getArgs());
	}
	@After("com.ramesh9705.SpringAOP01.AopExample.aspects.CommonAspects.businessAndData()")
	public void logMethodCallAfterExecution(JoinPoint joinPoint)
	{
		logger.info("After Aspect - {} has executed",joinPoint);
	}
	@AfterThrowing(
		pointcut = 	"com.ramesh9705.SpringAOP01.AopExample.aspects.CommonAspects.data())",
			throwing="exception")
	public void logMethodCallAfterThrowingExecution(JoinPoint joinPoint, Exception exception)
	{
		logger.info("AfterThrowing Aspect - {} has thrown an exception {}",joinPoint,exception);
	}
	@AfterReturning(
			pointcut = 	"com.ramesh9705.SpringAOP01.AopExample.aspects.CommonAspects.business())",
				returning ="returnValue")
		public void logMethodCallAfterReturningExecution(JoinPoint joinPoint, Object returnValue)
		{
			logger.info("AfterReturning Aspect - {} has returning - {}",joinPoint,returnValue);
		}
}

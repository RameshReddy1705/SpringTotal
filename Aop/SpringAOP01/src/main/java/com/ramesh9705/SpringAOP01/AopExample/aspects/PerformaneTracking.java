package com.ramesh9705.SpringAOP01.AopExample.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerformaneTracking
{
	private Logger logger=LoggerFactory.getLogger(getClass());
	
	@Around("com.ramesh9705.SpringAOP01.AopExample.aspects.CommonAspects.businessAndData()")
	public Object findExecutionTime(ProceedingJoinPoint proceedingJoinPoint) throws Throwable
	{
		//Start Time 
		long startTimeMillis = System.currentTimeMillis();
		//Method
		Object returnValue= proceedingJoinPoint.proceed();
		//Stop Time
		long stopTimeMillis = System.currentTimeMillis();
		
		long executionTimeMillis=stopTimeMillis-startTimeMillis;
		
		logger.info("Around Aspect -{} Method executed in {} ms",proceedingJoinPoint,executionTimeMillis);
		
		return returnValue;
	}
}

package com.ramesh9705.SpringAOP.aopexmaple.aspects;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.context.annotation.Configuration;

@Configuration
@Aspect
public class PerfoemanceTrackingAspect
{
	private Logger logger=LoggerFactory.getLogger(getClass());

//	@Around("execution(* com.ramesh9705.SpringAOP.*.*(..))")
	@Around("com.ramesh9705.SpringAOP.aopexample.aspect.CommonPointConfig.trackTimeAnnotation()")
	public Object findExecutionTime(ProceedingJoinPoint proceedingjoinPoint) throws Throwable
	{
		//Start a Timer
		long startTimeMillis = System.currentTimeMillis();
		//Excecute The Mathod
		Object returnValue = proceedingjoinPoint.proceed();
		//Stop The Timer
		long stopTimeMillis = System.currentTimeMillis();
		
		long executionDuration = stopTimeMillis-startTimeMillis;
		
		logger.info("Around Aspect -{} Method executed in {} ms"
				,proceedingjoinPoint, executionDuration);
		return returnValue;
	}
}

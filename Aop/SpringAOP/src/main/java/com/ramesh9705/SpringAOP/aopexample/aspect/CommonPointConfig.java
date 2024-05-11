package com.ramesh9705.SpringAOP.aopexample.aspect;

import org.aspectj.lang.annotation.Pointcut;

public class CommonPointConfig
{
	@Pointcut("execution(* com.ramesh9705.SpringAOP.*.*(..))")
	public void businessAndDataPackageConfig() {}
	
	@Pointcut("execution(* com.ramesh9705.SpringAOP.*.*(..))")
	public void businessPackageConfig() {}
	
	@Pointcut("@annotation(com.ramesh9705.SpringAOP.aopexample.annotations.TrackTime)")
	public void trackTimeAnnotation() {}
}

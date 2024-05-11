package com.ramesh9705.SpringAOP01.AopExample.aspects;

import org.aspectj.lang.annotation.Pointcut;

public class CommonAspects
{
	@Pointcut("execution(* com.ramesh9705.SpringAOP01.AopExample.*.*.*(..))")
	public void businessAndData()
	{
		
	}
	@Pointcut("execution(* com.ramesh9705.SpringAOP01.AopExample.Business.*.*(..))")
	public void business()
	{
		
	}
	@Pointcut("execution(* com.ramesh9705.SpringAOP01.AopExample.Data.*.*(..))")
	public void data()
	{
		
	}
	@Pointcut("bean(*Service*)")
	public void allPackageConfiguration()
	{
		
	}
	@Pointcut("@annotation(com.ramesh9705.SpringAOP01.AopExample.annoatation.TrackTime)")
	public void trackTimeAnnotation()
	{
		
	}
		
	
}

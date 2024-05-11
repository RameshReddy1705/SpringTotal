package com.udemy.LearnSpringFrameWork.Example.c1;

import java.util.Arrays;

import org.springframework.stereotype.Component;
@Component
public class BusinessCalculationSrevice {
	private DataService dataservice;
	public BusinessCalculationSrevice(DataService dataservice)
	{
		super();
		this.dataservice=dataservice;
	}
	public int findMax()
	{
		return Arrays.stream(dataservice.retrieveData()).max().orElse(0);
	}
}

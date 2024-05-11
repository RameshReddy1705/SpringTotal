package com.udemy.LearnSpringFrameWork.Example.c1.Revision;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class BusinessCalculatorService
{
	
	DataService dataService;
	
	public BusinessCalculatorService(DataService dataService) {
		super();
		this.dataService = dataService;
	}

	public int findMax()
	{
		return Arrays.stream(dataService.retiveData()).max().orElse(0);
		
	}
	
	public int findMin()
	{
		return Arrays.stream(dataService.retiveData()).min().orElse(0);
		
	}

}

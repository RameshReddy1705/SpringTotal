package com.ramesh9705.SpringAOP01.AopExample.Business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh9705.SpringAOP01.AopExample.Data.DataService02;
@Service
public class Business02
{
	@Autowired
	private DataService02 dataService02;
	
	public int calculateMin()
	{
		int [] data=dataService02.retriveData02();
		return Arrays.stream(data).min().orElse(0);
	}
}

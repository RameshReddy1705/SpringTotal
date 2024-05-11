package com.ramesh9705.SpringAOP.aopexample.business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh9705.SpringAOP.aopexample.annotations.TrackTime;
import com.ramesh9705.SpringAOP.aopexample.data.DataService1;
@Service
public class BusinessService1
{
	@Autowired
	private DataService1 dataService1;
	@TrackTime
	public int calculateNax()
	{
		int [] data = dataService1.retriveData();
//		throw new RuntimeException("Something went wrong!");
		return Arrays.stream(data).max().orElse(0);
		
	}
}

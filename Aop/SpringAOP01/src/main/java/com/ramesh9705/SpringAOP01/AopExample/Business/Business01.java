package com.ramesh9705.SpringAOP01.AopExample.Business;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ramesh9705.SpringAOP01.AopExample.Data.DataService01;
import com.ramesh9705.SpringAOP01.AopExample.annoatation.TrackTime;
@Service
public class Business01
{
	@Autowired
	private DataService01 dataService01;
	@TrackTime
	public int calculateMax()
	{
		int [] data=dataService01.retriveData();
//		throw new RuntimeException("SomeThing Went Wrong..........!");
		return Arrays.stream(data).max().orElse(0);
	}
}

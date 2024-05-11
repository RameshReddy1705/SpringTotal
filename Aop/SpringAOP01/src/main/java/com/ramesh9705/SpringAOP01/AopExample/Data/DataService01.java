package com.ramesh9705.SpringAOP01.AopExample.Data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService01
{
	public int [] retriveData()
	{
		try {
			Thread.sleep(30);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return new int [] {1,2,3,4,5,6,7,8,9};
	}
}

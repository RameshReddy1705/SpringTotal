package com.ramesh9705.SpringAOP01.AopExample.Data;

import org.springframework.stereotype.Repository;

@Repository
public class DataService02
{
	public int [] retriveData02()
	{
		return new int [] {1,2,3,4,5,6,7,8,9};
	}
}

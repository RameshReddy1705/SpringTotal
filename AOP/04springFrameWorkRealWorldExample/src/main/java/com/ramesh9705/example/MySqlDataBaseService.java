package com.ramesh9705.example;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MySqlDataBaseService implements DataServiceInterface
{
	public int [] retriveData()
	{
		return new int []{1,2,3,4,5,6,7,8,9};
		
	}
}

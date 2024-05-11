package com.ramesh9705.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
@Component
public class Business
{
	private DataServiceInterface dataServiceInterface;

	public Business(@Qualifier("MongoDbDataService") DataServiceInterface dataServiceInterface) {
		super();
		this.dataServiceInterface = dataServiceInterface;
	}
	
	public int findMax()
	{
		return Arrays.stream(dataServiceInterface.retriveData()).max().orElse(0);
		
	}
}

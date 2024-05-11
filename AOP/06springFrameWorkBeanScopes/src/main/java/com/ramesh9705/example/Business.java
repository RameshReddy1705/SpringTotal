package com.ramesh9705.example;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Lazy;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;
@Component
@Lazy
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class Business
{
	private DataServiceInterface dataServiceInterface;

	public Business(@Qualifier("MongoDbDataService") DataServiceInterface dataServiceInterface) {
		super();
//		System.out.println("Business Logic --");
		this.dataServiceInterface = dataServiceInterface;
	}
	
	public int findMax()
	{
		return Arrays.stream(dataServiceInterface.retriveData()).max().orElse(0);
		
	}
}
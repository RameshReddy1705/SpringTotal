package com.ramesh9705.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Qualifier("MongoDbDataService")
//@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MongoDbDataService implements DataServiceInterface
{
	public int [] retriveData()
	{
		return new int [] {8,58,63,25,15};
	}
}

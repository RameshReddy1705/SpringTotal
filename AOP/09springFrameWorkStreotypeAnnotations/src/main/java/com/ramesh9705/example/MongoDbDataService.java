package com.ramesh9705.example;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

//@Component
@Service
@Qualifier("MongoDbDataService")
public class MongoDbDataService implements DataServiceInterface
{
	public int [] retriveData()
	{
		return new int [] {8,58,63,25,15};
	}
}

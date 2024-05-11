package com.udemy.LearnSpringFrameWork.Example.c1.Revision;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class MongoDBService implements DataService
{
	public int [] retiveData()
	{
		return new int [] {11,22,33,44,55};
	}
}

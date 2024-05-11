package com.udemy.LearnSpringFrameWork.Example.c1.Revision;

import org.springframework.stereotype.Component;

@Component
public class MySqlDBService implements DataService
{

	@Override
	public int[] retiveData()
	{
		return new int [] {1,2,3,4,5,6,7,8,9};
	}
	
}

package com.junit;

public class Calculation
{
	public int calculateSum(int [] num)
	{
		int sum = 0;
		for(int number:num)
		{
			sum +=number;
		}
		return sum;
	}
}

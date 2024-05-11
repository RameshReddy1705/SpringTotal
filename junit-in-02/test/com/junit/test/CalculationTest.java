package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import com.junit.Calculation;

class CalculationTest {

	@Test
	void test() {
		Calculation cal= new Calculation();
		int [] numbers= {1,2,3,4,5,6,7,8,9,0};
		int result =cal.calculateSum(numbers);
		System.out.println(result);
		
		int expectedresult=45;
		assertEquals(expectedresult, result);
	}

}

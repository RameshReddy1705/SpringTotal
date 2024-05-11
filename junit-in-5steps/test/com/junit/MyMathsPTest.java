package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class MyMathsPTest {
	MyMathsP mathsP=new MyMathsP();
	@Test
	void calculateSum_MemeberArray() {
		assertEquals(21, mathsP.calculateSum(new int[] {1,2,3,4,5,6}));
		//Absence of failure is success
		//TEST Condition or assert
	}
	
	@Test
	void test1() {
		assertEquals(0, mathsP.calculateSum(new int[] {}));
		//Absence of failure is success
		//TEST Condition or assert
	}

	
	
//	MyMathsP mathsP=new MyMathsP();
//	@Test
//	void test() {
//		int[] numbers= {1,2,3,4,5,6};
//
//		int result =mathsP.calculateSum(numbers);
//		System.out.println(result );
//		
//		int expectedResult=21;
//		assertEquals(expectedResult, result);
//		//Absence of failure is success
//		//TEST Condition or assert
//	}
//	
//	@Test
//	void test1() {
//		int[] numbers= {};
//		int result =mathsP.calculateSum(numbers);
//		System.out.println(result );
//		
//		int expectedResult=0;
//		assertEquals(expectedResult, result);
//		//Absence of failure is success
//		//TEST Condition or assert
//	}
}

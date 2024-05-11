package com.junit.test;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runners.Parameterized.BeforeParam;

class AssertTestCalculation {
	
	@Test
	void test() {
		System.out.println("test.......................0");
	}
	@BeforeParam
	void test1() {
		System.out.println("test.......................1");
	}
	@BeforeEach
	void test2() {
		System.out.println("test.......................2");
	}
	@BeforeAll
	void test3() {
		System.out.println("test.......................3");
	}

}

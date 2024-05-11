package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class yBeforeTestCase {
	
	@BeforeAll
	static void beforeAll() {
		System.out.println("BeforeAll--Each --Test");
	}
	@BeforeEach
	void test0() {
		System.out.println("Before--Each --Test");
	}
	@Test
	void test1() {
		System.out.println("test--1");
	}
	@Test
	void test2() {
		System.out.println("test--2");
	}
	@Test
	void test3() {
		System.out.println("test--3");
	}
	@AfterEach
	void test4() {
		System.out.println("After--Each --Test");
	}
	@BeforeAll
	static void afterAll() {
		System.out.println("AfterAll--Each --Test");
	}

}
//org.junit.platform.commons.JUnitException: @BeforeAll method 'void com.junit.yBeforeTestCase.beforeAll()' must be static unless the test class is annotated with @TestInstance(Lifecycle.PER_CLASS).
//at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//at java.base/java.util.Collections$UnmodifiableCollection.forEach(Collections.java:1092)
//at java.base/java.util.ArrayList.forEach(ArrayList.java:1511)
//


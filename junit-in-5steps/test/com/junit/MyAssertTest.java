package com.junit;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class MyAssertTest {
	List<String> employees=Arrays.asList("Ramesh","Reddy","Gang");
	@Test
	void test() {
		boolean test=employees.contains("Ramesh");
		boolean test2=employees.contains("RameshReddy");
		assertEquals(true, test);
		assertTrue(test);
		assertFalse(test2);
		assertArrayEquals(new int[] {123},new int[] {123});
		assertEquals(3, employees.size());
	}

}

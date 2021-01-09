package com.JEElab2.lab2.util;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class SecondSmallestTest
{
	private SecondSmallest secondSmallest;
	private static int SINGLE_NUMBER = 100;
	
	@Before
	public void setup() {
		secondSmallest=new SecondSmallest();
	}
	

	@Test
	public void test_getSecondSmallest_GivenEmptyIntegerArray_ShouldReturn0AsInteger() {
		int newNumbers[]= {};
		int result = secondSmallest.getSecondSmallest(newNumbers);
		assertEquals(0, result);
	}
	
	@Test
	public void test_getSecondSmallest_Given1InIntegerArray_ShouldReturn1AsInteger() {
		int newNumbers[]= {SINGLE_NUMBER};
		int result = secondSmallest.getSecondSmallest(newNumbers);
		assertEquals(SINGLE_NUMBER, result);
	}
	
	@Test
	public void test_getSecondSmallest_Given20And5InIntegerArray_ShouldReturn20AsInteger() {
		int newNumbers[]= {3,12};
		int result = secondSmallest.getSecondSmallest(newNumbers);
		assertEquals(12, result);
	}
}


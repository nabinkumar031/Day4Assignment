package com.assignment.day4;

import java.util.ArrayList;

import org.junit.Assert;
import org.junit.Test;

public class GetMaxService_Refactor1Test {

	@Test
	public void givenMaxNumAt1stPosition_ShouldReturnMaxInteger() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(2);
		numberList.add(1);
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		int maxInt = service.getMax(numberList);
		Assert.assertEquals(5, maxInt);
		
	}
	
	@Test
	public void givenMaxNumAt2ndPosition_ShouldReturnMaxInteger() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(5);
		numberList.add(1);
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		int maxInt = service.getMax(numberList);
		Assert.assertEquals(5, maxInt);
		
	}
	
	@Test
	public void givenMaxNumAt3rdPosition_ShouldReturnMaxInteger() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(1);
		numberList.add(5);
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		int maxInt = service.getMax(numberList);
		Assert.assertEquals(5, maxInt);
		
	}
	
	
	@Test
	public void givenMaxStringAt1stPosition_ShouldReturnMaxString() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("BRITANNIA");
		stringList.add("HUL");
		stringList.add("ITC");
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		String maxString = service.getMax(stringList);
		Assert.assertEquals("BRITANNIA", maxString);
	}
	
	@Test
	public void givenMaxStringAt2ndPosition_ShouldReturnMaxString() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("HUL");
		stringList.add("BRITANNIA");
		stringList.add("ITC");
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		String maxString = service.getMax(stringList);
		Assert.assertEquals("BRITANNIA", maxString);
	}
	
	
	@Test
	public void givenMaxStringAt3rdPosition_ShouldReturnMaxString() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("HUL");
		stringList.add("ITC");
		stringList.add("BRITANNIA");
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		String maxString = service.getMax(stringList);
		Assert.assertEquals("BRITANNIA", maxString);
	}
	
	@Test
	public void givenMaxFloatAt1stPosition_ShouldReturnMaxFlaot() {
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(5F);
		floatList.add(2.0F);
		floatList.add(1.8F);
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		float maxfloat = service.getMax(floatList);
		Assert.assertEquals(5F, maxfloat,0.0F);
		
	}
	
	@Test
	public void givenMaxFloatAt2ndPosition_ShouldReturnMaxFlaot() {
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(2.0F);
		floatList.add(5F);
		floatList.add(1.8F);
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		float maxfloat = service.getMax(floatList);
		Assert.assertEquals(5F, maxfloat,0.0F);
		
	}
	
	@Test
	public void givenMaxFloatAt3rdPosition_ShouldReturnMaxFlaot() {
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(2.0F);
		floatList.add(1.8F);
		floatList.add(5F);
		
		GetMaxService_Refactor1 service = new GetMaxService_Refactor1();
		float maxfloat = service.getMax(floatList);
		Assert.assertEquals(5F, maxfloat,0.0F);
		
	}
	

}

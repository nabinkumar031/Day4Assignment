package com.assignment.day4;

import java.util.ArrayList;
import org.junit.Assert;
import org.junit.Test;

public class GetMaxServiceTest {
	
	@Test
	public void givenMaxNumAt1stPosition_ShouldReturnMaxInteger() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(5);
		numberList.add(2);
		numberList.add(1);
		
		GetMaxService getMaxService = new GetMaxService();
		int maxInt = getMaxService.getMaxInteger(numberList);
		Assert.assertEquals(5, maxInt);
		
	}
	
	@Test
	public void givenMaxNumAt2ndPosition_ShouldReturnMaxInteger() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(5);
		numberList.add(1);
		
		GetMaxService getMaxService = new GetMaxService();
		int maxInt = getMaxService.getMaxInteger(numberList);
		Assert.assertEquals(5, maxInt);
		
	}
	
	@Test
	public void givenMaxNumAt3rdPosition_ShouldReturnMaxInteger() {
		ArrayList<Integer> numberList = new ArrayList<Integer>();
		numberList.add(2);
		numberList.add(1);
		numberList.add(5);
		
		GetMaxService getMaxService = new GetMaxService();
		int maxInt = getMaxService.getMaxInteger(numberList);
		Assert.assertEquals(5, maxInt);
		
	}
	
	
	
	@Test
	public void givenMaxFloatAt1stPosition_ShouldReturnMaxFlaot() {
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(5F);
		floatList.add(2.0F);
		floatList.add(1.8F);
		
		GetMaxService getMaxService = new GetMaxService();
		float maxfloat = getMaxService.getMaxFloat(floatList);
		Assert.assertEquals(5F, maxfloat,0.0F);
		
	}
	
	@Test
	public void givenMaxFloatAt2ndPosition_ShouldReturnMaxFlaot() {
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(2.0F);
		floatList.add(5F);
		floatList.add(4.5F);
		
		GetMaxService getMaxService = new GetMaxService();
		float maxfloat = getMaxService.getMaxFloat(floatList);
		Assert.assertEquals(5F, maxfloat,0.0F);
		
	}
	
	
	@Test
	public void givenMaxFloatAt3rdPosition_ShouldReturnMaxFlaot() {
		ArrayList<Float> floatList = new ArrayList<Float>();
		floatList.add(2.7F);
		floatList.add(2.9F);
		floatList.add(5F);
		
		GetMaxService getMaxService = new GetMaxService();
		float maxfloat = getMaxService.getMaxFloat(floatList);
		Assert.assertEquals(5F, maxfloat,0.0F);
		
	}
	

	@Test
	public void givenMaxStringAt1stPosition_ShouldReturnMaxString() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("BRITANNIA");
		stringList.add("HUL");
		stringList.add("ITC");
		
		GetMaxService getMaxService = new GetMaxService();
		String maxString = getMaxService.getMaxString(stringList);
		Assert.assertEquals("BRITANNIA", maxString);
		
	}
	
	
	@Test
	public void givenMaxStringAt2ndPosition_ShouldReturnMaxString() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("HUL");
		stringList.add("BRITANNIA");
		stringList.add("ITC");
		
		GetMaxService getMaxService = new GetMaxService();
		String maxString = getMaxService.getMaxString(stringList);
		Assert.assertEquals("BRITANNIA", maxString);
		
	}
	
	@Test
	public void givenMaxStringAt3rdPosition_ShouldReturnMaxString() {
		ArrayList<String> stringList = new ArrayList<String>();
		stringList.add("HUL");
		stringList.add("ITC");
		stringList.add("BRITANNIA");
		
		GetMaxService getMaxService = new GetMaxService();
		String maxString = getMaxService.getMaxString(stringList);
		Assert.assertEquals("BRITANNIA", maxString);
		
	}
	
	
}

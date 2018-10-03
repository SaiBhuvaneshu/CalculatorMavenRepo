package com.cg.maven.test;

import org.junit.Assert;
import org.junit.Test;

import com.cg.demo.Calculator;

public class TestCalculator {

	@Test
	public void add()
	{
		Calculator cal = new Calculator();
		int res = cal.add(5,3);
		Assert.assertEquals(8,res);
	}
	
	@Test
	public void multiply()
	{
		Calculator cal = new Calculator();
		int res = cal.multiply(5, 6);
		Assert.assertNotEquals(25,res);
	}
	
	@Test
	public void divide()
	{
		Calculator cal = new Calculator();
		int res = cal.divide(5, 4);
		Assert.assertNotEquals(2,res);
	}
}

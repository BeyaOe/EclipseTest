package de.ids.demo;

import org.junit.Test;

import junit.framework.Assert;

public class MathTest {

	TestProgramm objectUnderTest = new TestProgramm();

	@Test
	public void TestAdd()

	{

		Assert.assertEquals(7, objectUnderTest.add(new Double(3), new Double(4)));

	}

	@Test
	public void TestMulti()

	{

		Assert.assertEquals(12.0, objectUnderTest.multiply(new Double(3), new Double(4)));

	}

	@Test
	public void TestSubtract()

	{

		Assert.assertEquals(1, objectUnderTest.substract(new Double(4), new Double(3)));

	}

}

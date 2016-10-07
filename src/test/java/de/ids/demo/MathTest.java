package de.ids.demo;

import org.junit.Test;

import junit.framework.Assert;

@SuppressWarnings("deprecation")
public class MathTest {

	TestProgramm objectUnderTest = new TestProgramm();

	@Test
	public void TestAdd()

	{

		Assert.assertEquals(7, objectUnderTest.add(3, 4));

	}

	@Test
	public void TestMulti()

	{

		Assert.assertEquals(12, objectUnderTest.multiply(3, 4));

	}

	@Test
	public void TestSubtract()

	{

		Assert.assertEquals(1, objectUnderTest.substract(4, 3));

	}

}

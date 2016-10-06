package de.ids.demo;

import org.junit.Test;

import junit.framework.Assert;

public class MathTest {

	TestProgramm objectUnderTest = new TestProgramm();

	@Test
	public void TestAddition()

	{

		Assert.assertEquals(7, objectUnderTest.addition(new Double(3), new Double(4)));

	}

}

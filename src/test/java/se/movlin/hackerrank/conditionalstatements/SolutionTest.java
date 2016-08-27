package se.movlin.hackerrank.conditionalstatements;

import org.junit.Assert;

import org.junit.Test;


public class SolutionTest {

	@Test
	public void testIsWeirdNumber() {
		Assert.assertEquals("Not Weird", Solution.isWeirdNumber(2));
		Assert.assertEquals("Weird", Solution.isWeirdNumber(3));
		Assert.assertEquals("Not Weird", Solution.isWeirdNumber(4));
		Assert.assertEquals("Weird", Solution.isWeirdNumber(5));
		Assert.assertEquals("Weird", Solution.isWeirdNumber(6));
		Assert.assertEquals("Weird", Solution.isWeirdNumber(20));
		Assert.assertEquals("Weird", Solution.isWeirdNumber(21));
		Assert.assertEquals("Not Weird", Solution.isWeirdNumber(22));
		Assert.assertEquals("Weird", Solution.isWeirdNumber(23));
		Assert.assertEquals("Not Weird", Solution.isWeirdNumber(24));
		Assert.assertEquals("", Solution.isWeirdNumber(0));
	}

}

package se.movlin.hackerrank.thirtyoperators;

import  org.junit.Assert;
import org.junit.Test;

import se.movlin.hackerrank.thirtyoperators.Arithmetic;

public class ArithmeticTest {

	@Test
	public void testCalcCost() {
		Assert.assertEquals(15, Arithmetic.calcMealCost(12.0, 20, 8));
	}

}

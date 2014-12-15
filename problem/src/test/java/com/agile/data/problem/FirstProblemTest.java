package com.agile.data.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.*;

public class FirstProblemTest {

	public int array[] = { 2, 3, 2, 3, 8 };
	public int negativeArray[] = { -2, 3, -2, 3, 0 };
	public int expectedValue;
	public FirstProblem pb = new FirstProblem();

	@Test
	public void testSumOfEvenNumbers_WithCorectDataSet() {

		expectedValue = 12;

		assertEquals(expectedValue, pb.sum(array));

	}

	@Test
	public void testSumOfEvenNumbers_WithWrongDataSet() {

		expectedValue = 10;

		assertNotSame(expectedValue, pb.sum(array));
	}

	@Test
	public void testSumOfEvenNumbers_WithNegativeWithCorectDataSet() {

		expectedValue = -4;

		assertEquals(expectedValue, pb.sum(negativeArray));

	}

	@Test
	public void testSumOfEvenNumbers_WithNegativeWithWrongDataSet() {

		expectedValue = -6;

		assertNotSame(expectedValue, pb.sum(negativeArray));

	}
}

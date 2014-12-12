package com.agile.data.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class SecondProblemTest {

	public int array[] = { 2, 1, 23, 4, 5, 8 };
	public int negativeArray[] = { -2, -6, -8, -17, -27 };
	public int plainArray[] = { 1, 1, 1, 1 };
	public int expectedValue;

	@Test
	public void testMaxValue_WithCorectDataSet() {

		expectedValue = 23;
		SecondProblem pb = new SecondProblem();
		assertEquals(expectedValue, pb.maxValue(array));
	}

	@Test
	public void testMaxValue_WithWrongDataSet() {

		expectedValue = 4;
		SecondProblem pb = new SecondProblem();
		assertNotSame(expectedValue, pb.maxValue(array));
	}

	@Test
	public void testSecondMaxValue_WithCorectDataSet() {

		expectedValue = 8;
		SecondProblem pb = new SecondProblem();
		assertEquals(expectedValue, pb.secondValue(array));
	}

	@Test
	public void testSecondMaxValue_WithWrongDataSet() {

		expectedValue = 23;
		SecondProblem pb = new SecondProblem();
		assertNotSame(expectedValue, pb.secondValue(array));
	}

	@Test
	public void testMaxValue_WithNegativeCorectDataSet() {

		expectedValue = -2;
		SecondProblem pb = new SecondProblem();
		assertEquals(expectedValue, pb.maxValue(negativeArray));
	}

	@Test
	public void testMaxValue_WithNegativeWrongDataSet() {

		expectedValue = -44;
		SecondProblem pb = new SecondProblem();
		assertNotSame(expectedValue, pb.maxValue(negativeArray));
	}

	@Test
	public void testSecondMaxValue_WithNegativeCorectDataSet() {

		expectedValue = -6;
		SecondProblem pb = new SecondProblem();
		assertEquals(expectedValue, pb.secondValue(negativeArray));
	}

	@Test
	public void testSecondMaxValue_WithNegativeWrongDataSet() {

		expectedValue = -12;
		SecondProblem pb = new SecondProblem();
		assertNotSame(expectedValue, pb.secondValue(negativeArray));
	}

	@Test
	public void testMaxValue_WithPlainCorectDataSet() {

		expectedValue = 1;
		SecondProblem pb = new SecondProblem();
		assertEquals(expectedValue, pb.maxValue(plainArray));
	}

	@Test
	public void testMaxValue_WithPlainWrongDataSet() {

		expectedValue = 4;
		SecondProblem pb = new SecondProblem();
		assertNotSame(expectedValue, pb.maxValue(plainArray));
	}

	@Test
	public void testSecondMaxValue_WithPlainCorectDataSet() {

		expectedValue = 1;
		SecondProblem pb = new SecondProblem();
		assertEquals(expectedValue, pb.secondValue(plainArray));
	}

	@Test
	public void testSecondMaxValue_WithPlainWrongDataSet() {

		expectedValue = 0;
		SecondProblem pb = new SecondProblem();
		assertNotSame(expectedValue, pb.secondValue(plainArray));
	}
}

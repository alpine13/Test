package com.agile.data.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class SecondProblemTest {

	public int array[] = { 2, 1, 23, 4, 5, 8 };
	public int negativeArray[] = { -2, -6, -8, -17, -27 };
	public int plainArray[] = { 1, 1, 1, 1 };
	public List<Integer> expectedValues = new ArrayList<Integer>();
	public SecondProblem pb = new SecondProblem();

	@Test
	public void testMaxValue_WithCorectDataSet() {

		expectedValues.add(23);
		expectedValues.add(8);

		assertEquals(expectedValues, pb.maxValue(array));
	}

	@Test
	public void testMaxValue_WithWrongDataSet() {

		expectedValues.add(4);
		expectedValues.add(23);

		assertNotSame(expectedValues, pb.maxValue(array));
	}

	@Test
	public void testMaxValue_WithNegativeCorectDataSet() {

		expectedValues.add(-2);
		expectedValues.add(-6);

		assertEquals(expectedValues, pb.maxValue(negativeArray));
	}

	@Test
	public void testMaxValue_WithNegativeWrongDataSet() {

		expectedValues.add(-8);
		expectedValues.add(-2);

		assertNotSame(expectedValues, pb.maxValue(negativeArray));
	}

	@Test
	public void testMaxValue_WithPlainCorectDataSet() {

		expectedValues.add(1);
		expectedValues.add(1);

		assertEquals(expectedValues, pb.maxValue(plainArray));
	}

	@Test
	public void testMaxValue_WithPlainWrongDataSet() {

		expectedValues.add(4);
		expectedValues.add(4);

		assertNotSame(expectedValues, pb.maxValue(plainArray));
	}

}

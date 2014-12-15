package com.agile.data.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class ThirdProblemTest {

	public int array[] = { 1, 2, 3, 3, 4 };
	public int plainArray[] = { 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };
	boolean expectedValue = false;
	public ThirdProblem pb = new ThirdProblem();

	@Test
	public void testIsDuplicate_WithCorectDataSet() {

		expectedValue = true;

		assertEquals(expectedValue, pb.findDuplicate(array));

	}

	@Test
	public void testIsDuplicate_WithWrongDataSet() {

		expectedValue = false;

		assertNotSame(expectedValue, pb.findDuplicate(array));
	}

	@Test
	public void testIsDuplicate_WithPlainCorectDataSet() {

		expectedValue = true;

		assertEquals(expectedValue, pb.findDuplicate(plainArray));

	}

}

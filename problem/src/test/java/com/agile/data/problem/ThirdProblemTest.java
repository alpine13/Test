package com.agile.data.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

public class ThirdProblemTest {

	public int array[] = { 1, 2, 3, 3, 4 };
	public int multipleValueArray[] = { 1, 1, 2, 2, 2, 6 };
	public int validArray[] = { 7, 9, 3, 0, 3, 2 };
	public int plainArray[] = { 0,0,0,0,0,0,0,0,0,0,0};
	public List<Integer> expectedValues = new ArrayList<Integer>();

	@Test
	public void testIsDuplicate_WithCorectDataSet() {

		expectedValues.add(3);

		ThirdProblem pb = new ThirdProblem();
		assertEquals(expectedValues, pb.findDuplicate(array));

	}

	@Test
	public void testIsDuplicate_WithWrongDataSet() {

		expectedValues.add(4);

		ThirdProblem pb = new ThirdProblem();
		assertNotSame(expectedValues, pb.findDuplicate(array));
	}

	@Test
	public void testIsMoreThanOneDuplicate() {

		expectedValues.add(1);
		expectedValues.add(2);

		ThirdProblem pb = new ThirdProblem();
		assertEquals(expectedValues, pb.findDuplicate(multipleValueArray));
	}

	@Test
	public void testIsValid() {

		expectedValues.add(3);
		
		ThirdProblem pb = new ThirdProblem();
		assertEquals(expectedValues, pb.findDuplicate(validArray));

	}
	
	@Test
	public void testIsDuplicate_WithPlainCorectDataSet() {

		expectedValues.add(0);

		ThirdProblem pb = new ThirdProblem();
		assertEquals(expectedValues, pb.findDuplicate(plainArray));

	}

}

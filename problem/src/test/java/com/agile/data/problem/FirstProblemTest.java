package com.agile.data.problem;

import static org.junit.Assert.assertEquals;

import org.junit.*;

public class FirstProblemTest {

	public int array[] = { 2, 3, 2, 3, 8 };

	@Test
	public void testSum_succes() {

		int corect = 12;

		FirstProblem pb = new FirstProblem();
		assertEquals(corect, pb.sum(array));

	}

	@Test
	public void testSum_fail() {

		int bad = 10;
		
		FirstProblem pb = new FirstProblem();
		Assert.assertNotSame(bad, pb.sum(array));
	}
}

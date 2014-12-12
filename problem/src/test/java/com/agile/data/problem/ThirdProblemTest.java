package com.agile.data.problem;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class ThirdProblemTest {
	
	public int array[] = { 2, 2, 3, 3, 4 };

	@Test
	public void testIsDuplicate_succes() {

		List<Integer>  corect = new ArrayList<Integer>();
		corect.add(2);
		corect.add(3);

		ThirdProblem pb = new ThirdProblem();
		assertEquals(corect, pb.findDuplicate(array));

	}

	@Test
	public void testIsDuplicate_fail() {

		List<Integer>  bad = new ArrayList<Integer>();
		bad.add(2);
		bad.add(4);
		
		ThirdProblem pb = new ThirdProblem();
		Assert.assertNotSame(bad, pb.findDuplicate(array));
	}

}

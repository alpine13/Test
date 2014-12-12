package com.agile.data.problem;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotSame;

import org.junit.Test;

public class SecondProblemTest {
	
	public int array[]={ 2,1,23,4,5,8};
	
	@Test
	public void testMaxValue_succes(){
		
		int corect = 23;
		SecondProblem pb = new SecondProblem();
		assertEquals(corect, pb.maxValue(array));
	}
	
	@Test
	public void testMaxValue_fail(){
		
		int bad = 4;
		SecondProblem pb = new SecondProblem();
		assertNotSame(bad, pb.maxValue(array));
	}
	
	@Test
	public void testSecondValue_succes(){
		
		int corect = 8;
		SecondProblem pb = new SecondProblem();
		assertEquals(corect, pb.secondValue(array));
	}
	
	@Test
	public void testSecondValue_fail(){
		
		int bad = 23;
		SecondProblem pb = new SecondProblem();
		assertNotSame(bad, pb.secondValue(array));
	}

}

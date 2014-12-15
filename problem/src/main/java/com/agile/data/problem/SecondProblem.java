package com.agile.data.problem;

import java.util.ArrayList;
import java.util.List;

public class SecondProblem {

	public List<Integer> maxValue(int array[]) {

		List<Integer> resultsList = new ArrayList<Integer>();
		int maxValue = array[0];
		int secondValue = array[1];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > maxValue) {
				secondValue = maxValue;
				maxValue = array[i];
			}
			if (array[i] < maxValue && array[i] > secondValue) {
				secondValue = array[i];
			}
		}
		resultsList.add(maxValue);
		resultsList.add(secondValue);
		return resultsList;
	}


	public static void main(String[] args) {

		BaseClass base = new BaseClass();
		int array[] = base.readFromKeyboard();

		SecondProblem pb = new SecondProblem();
		List<Integer> resultsList = new ArrayList<Integer>();
		resultsList = pb.maxValue(array);

		System.out.println("largest number: " + resultsList.get(0));
		System.out.println("2nd largest number: " + resultsList.get(1));
	}

}

package com.agile.data.problem;

public class ThirdProblem {

	public boolean findDuplicate(int array[]) {

		int n = array.length;
		boolean isDuplicated = false;

		for (int i = 0; i < n; i++) {
			if (array[Math.abs(array[i])] > 0) {
				array[Math.abs(array[i])] = (-1) * array[Math.abs(array[i])];

			} else if (array[Math.abs(array[i])] < 0) {
				isDuplicated = true;

			}

		}
		return isDuplicated;
	}

	public static void main(String[] args) {

		BaseClass base = new BaseClass();
		int array[] = base.readFromKeyboard();

		ThirdProblem pb = new ThirdProblem();
		boolean result = pb.findDuplicate(array);
		System.out.println("Are duplicates in this array?  " + result);

	}
}

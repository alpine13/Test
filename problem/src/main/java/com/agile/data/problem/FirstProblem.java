package com.agile.data.problem;


public class FirstProblem {

	public int sum(int array[]) {
		int sum = 0;
		for (int i = 0; i < array.length; i++) {
			if (array[i] % 2 == 0) {
				sum = sum + array[i];
			}
		}

		return sum;
	}

	public static void main(String[] args) {

		BaseClass base = new BaseClass();
		int array[] = base.readFromKeyboard();

		FirstProblem pb = new FirstProblem();
		int suma = pb.sum(array);
		System.out.println("Even sum is :" + suma);
	}
}

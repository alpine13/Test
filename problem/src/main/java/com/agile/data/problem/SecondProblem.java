package com.agile.data.problem;

import java.util.Arrays;
import java.util.Scanner;

public class SecondProblem {

	public int maxValue(int array[]) {

		int maxValue = array[0];
		for (int i = 0; i < array.length; i++) {

			if (array[i] > maxValue) {
				maxValue = array[i];
			}
		}
		return maxValue;
	}

	public int secondValue(int array[]) {

		int secondValue = array[0];
		int maxValue = maxValue(array);
		for (int i = 0; i < array.length; i++) {
			if (array[i] < maxValue && array[i] > secondValue) {

				secondValue = array[i];
			}

		}

		return secondValue;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Array lenght:");
		int n = s.nextInt();

		int array[] = new int[n];
		System.out.println("Enter loop values");
		for (int i = 0; i <= n - 1; i++) {
			array[i] = s.nextInt();
		}
		System.out.println("Array is:");
		System.out.println(Arrays.toString(array));

		SecondProblem pb = new SecondProblem();
		int first = pb.maxValue(array);
		int second = pb.secondValue(array);

		System.out.println("largest number: " + first);
		System.out.println("2nd largest number: " + second);
		s.close();
	}

}

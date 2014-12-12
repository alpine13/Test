package com.agile.data.problem;

import java.util.Arrays;
import java.util.Scanner;

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

		FirstProblem pb = new FirstProblem();
		int suma = pb.sum(array);
		System.out.println("Even sum is :" + suma);
		s.close();
	}
}

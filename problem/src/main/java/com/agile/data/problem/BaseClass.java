package com.agile.data.problem;

import java.util.Arrays;
import java.util.Scanner;

public class BaseClass {

	public int[] readFromKeyboard() {

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
		s.close();
		return array;
	}

}

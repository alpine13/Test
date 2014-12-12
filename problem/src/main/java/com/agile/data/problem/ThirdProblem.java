package com.agile.data.problem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class ThirdProblem {

	public List<Integer> findDuplicate(int array[]) {

		List<Integer> findIt = new ArrayList<Integer>();
		int n = array.length;
		int pos = 1;
		for (int i : array) {

			while (n > pos) {
				if (i == array[n - 1]) {
					findIt.add(i);
				}
				n--;
			}
			pos++;
			n = array.length;
		}
		return findIt;
	}

	public static void main(String[] args) {

		Scanner s = new Scanner(System.in);

		System.out.println("Array lenght:");
		int n = s.nextInt();

		int array[] = new int[n];
		System.out.println("Enter loop values");
		for (int i = 0; i <= n - 1; i++) {
			try {
				array[i] = s.nextInt(n + 1);
			} catch (InputMismatchException e) {
				System.err.println("Unable to read values > " + n);
			}

		}
		System.out.println("Array is:");
		System.out.println(Arrays.toString(array));

		ThirdProblem pb = new ThirdProblem();
		List<Integer> result = pb.findDuplicate(array);
		System.out.println("Duplicate number is: " + result);
		s.close();
	}

}

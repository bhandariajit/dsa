package com.ab.practice.dsa;

import java.util.Arrays;

public class BookAllocationBinarySearch {

	public static void main(String[] args) {

		int array[] = new int[] { 10, 20, 30, 40, 50, 55 };

		int students = 2;

		int sum = Arrays.stream(array).sum();

		// Boolean possibleSolution = possibleSolution(a

		int minBooks = minBooks(array, students);

		System.out.println(minBooks);

	}

	static int minBooks(int array[], int students) {

		int sum = Arrays.stream(array).sum();

		int start = 0;

		int end = sum;

		int mid = (start + end) / 2;

		int ans = 0;

		while (start <= end) {

			Boolean isPossible = possibleSolution(array, mid, students, sum);

			if (isPossible) {

				ans = mid;

				end = mid - 1;

			} else {

				start = mid + 1;

			}

			mid = (start + end) / 2;
		}
		return ans;
	}

	private static Boolean possibleSolution(int[] array, int mid, int students, int sum) {

		int partitionSum = 0;

		int studentCount = 1;

		for (int i = 0; i < array.length; i++) {

			if (partitionSum + array[i] > mid) {

				studentCount++;

				partitionSum = array[i];

			} else {

				partitionSum = partitionSum + array[i];

			}

			if (studentCount > students) {

				return false;

			}

		}

		return true;

	}
}
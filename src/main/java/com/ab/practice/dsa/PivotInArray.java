package com.ab.practice.dsa;

import java.util.Arrays;

public class PivotInArray {

	public static int pivot(int array[]) {

		int leftsum = 0;

		int rightsum = Arrays.stream(array).sum();

		for (int i = 0; i < array.length; i++) {

			rightsum -= array[i];

			if (leftsum == rightsum) {

				return i;

			}

			leftsum += array[i];

		}
		return -1;
	}

	public static void main(String[] args) {

		int array[] = new int[] { 1, 1, 1, 1, 1, 1, 9, 6 };

		int pivot = pivot(array);

		System.out.println("pivot ans is " + pivot);

		int mid = array.length / 2;
		;

		int leftsum = 0;

		int rightsum = 0;

		int i = mid - 1;

		while (i >= 0) {

			leftsum = leftsum + array[i];

			i--;
		}
		int j = mid + 1;

		while (j < array.length) {
			rightsum = rightsum + array[j];

			j++;

		}

		System.out.println(leftsum + " " + rightsum + " " + mid);

		while (leftsum != rightsum && mid >= 0 && mid < array.length) {

			if (leftsum < rightsum) {

				leftsum += array[mid];

				rightsum -= array[mid + 1];

				mid = mid + 1;

			} else if (leftsum > rightsum) {

				rightsum += array[mid];

				leftsum -= array[mid - 1];

				mid = mid - 1;

			} else {

				break;

			}

			if (mid == 0) {

				leftsum = 0;

			} else if (mid == array.length - 1) {

				rightsum = 0;

			}

		}

		if (leftsum == rightsum) {

			System.out.println("ans is " + mid);

		} else {

		}

		System.out.println("ans is -1");

		System.out.println(leftsum + " " + rightsum);

	}
}
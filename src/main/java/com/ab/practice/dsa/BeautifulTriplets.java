package com.ab.practice.dsa;

public class BeautifulTriplets {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 4, 5, 7, 8, 10 };

		int d = 3;

		boolean possible = possible(array, d, 3);

		System.err.println();

		System.out.println(possible);

		triplets(array,d);

	}

	private static void triplets(int[] array, int d) {

		int start = array[0];

		int end = array[array.length - 1];

		int mid;

		while (start <= end) {

			mid = 5;

			possible(array, d, mid);
		}

	}

	private static boolean possible(int[] array, int d, int mid) {

		int tripletConst = 2;

		for (int i = 0; i < array.length; i++) {

			int lastPos = i;

			tripletConst = 2;

			System.out.println("sarting outer loop");

			for (int j = lastPos; j < array.length; j++) {

				if (array[j] - array[lastPos] == d) {

					System.out.print(array[lastPos] + " " + array[j] + " ");

					lastPos = j;

					j = lastPos;

					tripletConst--;

				}

				if (tripletConst == 0) {

					System.out.println("triplet found " + mid);

					mid--;

					tripletConst = 2;

					break;

				}

			}

		}

		if (mid == 0) {

			return true;

		}

		return false;

	}

}
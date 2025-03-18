package com.ab.practice.dsa;

public class Bitwise {

	public static void main(String[] args) {

		int array[] = new int[] { 1, 2, 3 };

		int ans = 0;

		for (int i = 0; i < array.length; i++) {

			ans = ans ^ array[i];

			System.out.println(ans);

		}

		System.out.println("ans is " + ans);

		System.out.println("--------------");

		int arr[] = new int[] { 4, 3, 2, 7, 8, 2, 3, 1 };

		for (int i = 0; i < array.length; i++) {

			ans = 0;

			ans = ans ^ array[i];

			if (ans == 0) {

				System.out.println(ans);

			}
		}
	}
}
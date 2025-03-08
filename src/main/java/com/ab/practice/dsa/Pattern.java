package com.ab.practice.dsa;

public class Pattern {

	public static void main(String[] args) {

		int n = 4;

		int row = 1;

		while (row <= n) {

			int col = 1;

			while (col <= n - row) {

				col++;

				System.out.print("-");

			}

			col = 1;

			while (col <= row) {

				col++;

				System.out.print("*");

			}

			row++;

			System.out.println();

		}
	}
}
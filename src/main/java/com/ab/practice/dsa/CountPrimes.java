package com.ab.practice.dsa;

public class CountPrimes {

	public static void main(String[] args) {

		int n = 5000000;

		int countPrimes = countPrimes(n);

		System.out.println(countPrimes);

	}

	private static int countPrimes(int n) {

		Boolean prime[] = new Boolean[n];

		prime[0] = prime[1] = false;

		int count = 0;

		for (int i = 2; i < n; i++) {

			if (prime[i] == null || prime[i]) {

				count++;

				System.out.println(i);

				for (int j = i * 2; j < n; j = j + i) {

					prime[j] = false;

				}

			}

		}

		return count;

	}

}

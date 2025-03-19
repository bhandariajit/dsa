package com.ab.practice.dsa;

public class ArraySumRecursion {

	public static void main(String[] args) {
		int array[] = new int[] {5,3,2,7,1,9};
		
		int sum = sum(array,array.length);
		System.out.println(sum);
	}

	private static int sum(int[] array, int n) {
		if(n == 0) {
			return 0;
		}
		
		return array[n-1] + sum(array,n-1);
	}

}

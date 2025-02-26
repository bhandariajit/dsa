package com.ab.practice.dsa;

import java.util.ArrayList;
import java.util.List;

import java.util.List;

public class ArraySubsets {

	public static void main(String[] args) {
		Integer array[] = new Integer[] {1,2,3};
		List<List<Integer>> ans = new ArrayList<List<Integer>>();
		
		solve(array, 0,  new ArrayList<Integer>(), ans);
		
		
		System.out.println(ans);
	}
	
	static void solve(Integer array[], int i,List<Integer> out, List<List<Integer>> ans) {
		if(i >= array.length) {
			ans.add(out);
			return;
		}
		
		//exclude
		System.out.println("exclude "+i+" "+out);
		solve(array, i+1, new ArrayList<Integer>(out) , ans);
		
		//include
		int element = array[i];
		out.add(element);
		System.out.println("include "+i+" "+out);

		solve(array, i+1,  new ArrayList<Integer>(out), ans);
		
		
	}

}

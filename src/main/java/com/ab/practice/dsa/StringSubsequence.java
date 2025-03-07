package com.ab.practice.dsa;

import java.util.ArrayList;
import java.util.List;

public class StringSubsequence {

	public static void main(String[] args) {
		String s = "abc";
		ArrayList<String> ans = new ArrayList<String>();
		solve(s, "", ans, 0);
		
		System.out.println(ans);
		
	}
	
	static void solve(String s, String out, List<String> ans, int i) {
		if(i >= s.length()) {
			ans.add(out);
			return;
		}
		
		//exclude
		System.out.println(i+" exclude "+out);
		solve(s, out, ans, i+1);
		
		//include
		System.out.println(i+" include "+out);

		char charAt = s.charAt(i);
		solve(s, out+charAt, ans, i+1);
	
	}

}

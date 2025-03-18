package com.ab.practice.dsa;

import java.util.HashMap;
import java.util.Map;

public class PermutationInString {

	public static void main(String[] args) {

		String s1 = "ab";

		String s2 = "eldbsooo";

		function(s1, s2);
	}

	private static boolean function(String s1, String s2) {

		Map<Character, Integer> map = new HashMap<>();

		resetMap(s1, map);

		int count = 0;

		for (int i = 0; i < s2.length(); i++) {

			char charAt = s2.charAt(i);

			if (map.containsKey(charAt) && map.get(charAt) != 0) {

				map.put(charAt, map.get(charAt) - 1);

				count++;

				if (count == s1.length()) {

					System.out.println("found");

					return true;

				}

			} else {

				resetMap(s1, map);

				count = 0;

			}

		}
		System.out.println("not found");

		return false;
	}

	private static void resetMap(String s1, Map<Character, Integer> map) {

		for (char c : s1.toCharArray()) {

			map.put(c, 1);

		}
	}
}
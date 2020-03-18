package org.mradhika.projects.leetcode.easy;

import java.util.HashSet;
import java.util.Set;

public class RepeatedStringMatch {

	public static int repeatedStringMatch0(String A, String B) {

		int count = 1;
		String str = new String(A);
		while (str.indexOf(B) == -1) {

			str = str + A;
			count++;
		}

		return count;

	}

	public int repeatedStringMatch1(String A, String B) {

		int count = 0;
		StringBuffer sb = new StringBuffer();

		while (sb.length() < B.length()) {
			sb.append(A);
			count++;

		}
		if (sb.toString().contains(B)) {
			return count;
		} else if (sb.append(A).toString().contains(B)) {
			return ++count;
		} else {
			return -1;
		}

	}

	//better solution
	public int repeatedStringMatch2(String A, String B) {
		if (A.indexOf(B) != -1)
			return 1;
		Set<Character> setA = new HashSet<>();
		Set<Character> setB = new HashSet<>();

		for (char a : A.toCharArray()) {
			setA.add(a);
		}
		for (char b : B.toCharArray()) {
			setB.add(b);
		}
		if (!setA.equals(setB)) {
			return -1;
		}
		int count = 1;
		String str = A;
		while (true) {
			str = str + A;
			count++;
			if (str.indexOf(B) != -1) {
				break;
			}
			if (str.length() >= B.length() * 3)
				return -1;

		}
		return count;

	}

	public static void main(String args[]) {

		RepeatedStringMatch.repeatedStringMatch0("abc", "cabcabca");
		// Initialising string
		String Str = new String("abcabcabc");

		// Initialising search string
		String subst = new String("cabcabca");

		// print the index of initial character
		// of Substring
		// prints 11
		System.out.print("Found geeks starting at position : ");
		System.out.print(Str.indexOf(subst));
	}

}

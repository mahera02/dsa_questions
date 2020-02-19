package org.mradhika.projects.leetcode.easy;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {

	public static void main(String[] args) {
		System.out.println(FizzBuzz.fizzBuzz(15));
	}

	public static List<String> fizzBuzz(int n) {

		List<String> output = new ArrayList<String>();
		for (int i = 1; i <= n; i++) {

			if (i % 3 == 0 && i % 5 == 0) {
				output.add("FizzBuzz");
			} else if (i % 3 == 0) {
				output.add("Fizz");
			} else if (i % 5 == 0) {
				output.add("Buzz");
			} else {
				output.add("" + i);
			}

		}
		return output;
	}

}

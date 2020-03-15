package org.mradhika.projects.leetcode.easy;

public class LongestPalindrome {
	public int longestPalindrome(String s) {

		int[] chars = new int[128];
		char[] ch = s.toCharArray();
		for (char c : ch) {
			chars[c]++;
		}
		int single = 0;
		for (int n : chars) {
			if (n % 2 != 0) {
				single++;
			}
		}
		// we remove the 1 extra odd num's i.e contained in 'single' of all chars from
		// the length and add 1 to
		// it as we can only have one odd sum in a palindrome
		return single > 1 ? ch.length - single + 1 : ch.length;

	}
}

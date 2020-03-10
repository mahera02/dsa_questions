package org.mradhika.projects.leetcode.medium;

import java.util.HashSet;

public class LengthOfLongestSubstring {
	/*
	 * Given a string, find the length of the longest substring without repeating
	 * characters.
	 * 
	 * Example 1:
	 * 
	 * Input: "abcabcbb" Output: 3 Explanation: The answer is "abc", with the length
	 * of 3. Example 2:
	 * 
	 * Input: "bbbbb" Output: 1 Explanation: The answer is "b", with the length of
	 * 1.
	 */
	public static void main(String[] args) {
		System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstring("abcabcbb"));

		System.out.println(LengthOfLongestSubstring.lengthOfLongestSubstringUsingSet("abcabcbb"));

	}

	// Best Solution
	public static int lengthOfLongestSubstring(String s) {

		int[] charMap = new int[256];
		int left = 0;
		int right = 0;
		int max = 0;
		while (right < s.length()) {
			char c = s.charAt(right);
			charMap[c]++;
			if (charMap[c] == 1) {
				max = Math.max(max, right - left + 1);
			} else {

				while (charMap[c] != 1) {
					charMap[s.charAt(left)]--;
					left++;
				}
			}
			right++;
		}
		return max;

	}

	/// Takes more time and memory due to using set
	public static int lengthOfLongestSubstringUsingSet(String s) {

		char[] ch = s.toCharArray();
		HashSet<Character> set = new HashSet<>();
		int left = 0;
		int right = 0;
		int max = 0;
		while (right < ch.length) {

			if (!set.contains(ch[right])) {
				set.add(ch[right]);
				max = Math.max(max, right - left + 1);
			} else {

				while (set.contains(ch[right])) {
					set.remove(ch[left]);
					left++;
				}
				set.add(ch[right]);

			}
			right++;
		}
		return max;
	}

}

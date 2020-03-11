package org.mradhika.projects.leetcode.medium;

public class PalindromicSubstrings {
	static int count = 0;

	// Extend through the center approach - Method 1
	// using char[] instead of s.charAt improves the rum time
	public static int countSubstrings(String s) {

		char[] ch = s.toCharArray();
		int len = ch.length;

		for (int i = 0; i < len; i++) {
			extendPalindrome(ch, i, i); // odd len Palindrome
			extendPalindrome(ch, i, i + 1); // even len Palindrome
		}
		return count;

	}

	private static void extendPalindrome(char[] ch, int left, int right) {
		// while (left >= 0 && right < s.length() && s.charAt(left) == s.charAt(right))
		// {
		while (left >= 0 && right < ch.length && ch[left] == ch[right]) {
			left--;
			right++;
			count++;
		}
	}

	// Same as Longest Palindromic Substring - Method 2
	public static int countSubstrings1(String s) {
		if (s.length() == 0)
			return 0;
		char[] ch = s.toCharArray();
		int len = s.length();
		boolean[][] dp = new boolean[len][len];
		// int maxLen = 1;
		// int beginIndex=0;
		int count = 0;
		// string length 1
		for (int i = 0; i < len; i++) {
			dp[i][i] = true;
			count++;
		}

		// string length 2
		for (int i = 0; i < len - 1; i++) {
			if (ch[i] == ch[i + 1]) {
				dp[i][i + 1] = true;
				// beginIndex =i;
				// maxLen =2;
				count++;
			}
		}
		// string length 3 or more
		for (int i = 3; i <= len; i++) {
			for (int j = 0; j < len - i + 1; j++) {
				int k = j + i - 1;
				if (ch[j] == ch[k] && dp[j + 1][k - 1]) {
					dp[j][k] = true;
					count++;
					// beginIndex=j;
					// maxLen=i;
				}
			}
		}
		return count;
	}

	public static void main(String[] args) {
		System.out.println(PalindromicSubstrings.countSubstrings("abc"));
	}
}

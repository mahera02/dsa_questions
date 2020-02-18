package org.mradhika.projects.leetcode.easy;

public class ValidPalindrome {

	public static void main(String[] args) {
		System.out.println('0' - 'P');
		System.out.println(ValidPalindrome.isPalindrome("A man, a plan, a canal: Panama"));
		System.out.println(ValidPalindrome.isChar(' '));

	}

	public static boolean isChar(char ch) {

		return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z') || (ch >= '0' && ch <= '9');

	}

	public static boolean isPalindrome(String s) {

		char[] ch = s.toCharArray();

		int left = 0;
		int right = ch.length - 1;
		while (left <= right) {

			if (!isChar(ch[left])) {
				left++;
			} else if (!isChar(ch[right])) {
				right--;
			//} else if (ch[left] == ch[right] || Math.abs(ch[left]-ch[right]) == ('a' - 'A')) {
			} else if (ch[left] == ch[right] || (Character.toLowerCase(ch[left]) == Character.toLowerCase(ch[right]))) {
				left++;
				right--;
			} else
				return false;

		}
		return true;

	}
}

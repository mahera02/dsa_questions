package org.mradhika.projects.leetcode.easy;

public class AddBinary {

	/*
	 * Input: a = "11", b = "1" Output: "100"
	 */

	// reduces time
	public String addBinaryUsingToCharArrayMethod(String a, String b) {
		StringBuilder sb = new StringBuilder();
		// int len1 = a.length() - 1;
		// int len2 = b.length() - 1;
		char[] cha = a.toCharArray();
		char[] chb = b.toCharArray();
		int len1 = cha.length - 1;
		int len2 = chb.length - 1;
		int carry = 0;

		while (len1 >= 0 || len2 >= 0) {
			int sum = 0;
			if (len1 >= 0) {
				sum = sum + cha[len1] - '0';
				len1--;
			}
			if (len2 >= 0) {
				sum = sum + chb[len2] - '0';
				len2--;
			}
			sum = sum + carry;
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry > 0)
			sb.append(1);
		return sb.reverse().toString();
	}

	// charAt() takes more time than above toCharArray();
	public String addBinary(String a, String b) {

		StringBuilder sb = new StringBuilder();
		int len1 = a.length() - 1;
		int len2 = b.length() - 1;
		int carry = 0;

		while (len1 >= 0 || len2 >= 0) {
			int sum = 0;
			if (len1 >= 0) {
				sum = sum + a.charAt(len1) - '0';
				len1--;
			}
			if (len2 >= 0) {
				sum = sum + b.charAt(len2) - '0';
				len2--;
			}
			sum = sum + carry;
			sb.append(sum % 2);
			carry = sum / 2;
		}
		if (carry > 0)
			sb.append(1);
		return sb.reverse().toString();

	}

}

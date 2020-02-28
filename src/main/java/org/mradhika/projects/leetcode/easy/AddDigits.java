package org.mradhika.projects.leetcode.easy;

public class AddDigits {

	/*
	 * Input: 38 Output: 2 Explanation: The process is like: 3 + 8 = 11, 1 + 1 = 2.
	 * Since 2 has only one digit, return it.
	 */
	public int addDigitsWithoutLoop(int num) {

		if (num == 0)
			return 0;
		if (num % 9 == 0)
			return 9;
		else
			return num % 9;

	}

	public int addDigits(int num) {
		// with loop
		while (num > 9) {
			int sum = 0;
			while (num > 0) {
				int rem = num % 10;
				sum = sum + rem;
				num = num / 10;
			}
			num = sum;
		}
		return num;
	}
}

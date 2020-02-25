package org.mradhika.projects.leetcode.easy;

import java.util.Arrays;

public class PlusOne {

	public static int[] plusOneBetter(int[] digits) {
		
		int n = digits.length;
		for(int i = n-1;i>=0;i--) {
			
			if(digits[i]<9) {
				digits[i] =digits[i]+1;
				return digits;
			}
			digits[i] =0;
		}
	  
		int[] newDigits = new int[n+1];
		newDigits[0] =1;
		return newDigits;
	}
	
	public static int[] plusOne(int[] digits) {

		int carry = 1;
		for (int i = digits.length - 1; i >= 0; i--) {
			int sum = digits[i] + carry;
			if (sum > 9) {
				carry = 1;
			} else {
				carry = 0;
			}
			digits[i] = sum % 10;
		}

		if (carry == 1) {
			int arrayPlus[] = Arrays.copyOf(digits, digits.length + 1);
			arrayPlus[0] = 1;
			return arrayPlus;
		} else
			return digits;

	}

	public static void main(String[] args) {
		int[] digits = new int[] { 9, 9, 9 ,8};
		int[] result = PlusOne.plusOneBetter(digits);

		System.out.println(result[3]);
	}

}

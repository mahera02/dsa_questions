package org.mradhika.projects.leetcode.easy;

public class ReverseOnlyLetters {

	/*
	Given a string S, return the "reversed" string where all characters that are not a letter stay in the same place,
	 and all letters reverse their positions.

			 

			Example 1:

			Input: "ab-cd"
			Output: "dc-ba"
			Example 2:

			Input: "a-bC-dEf-ghIj"
			Output: "j-Ih-gfE-dCba"
			Example 3:

			Input: "Test1ng-Leet=code-Q!"
			Output: "Qedo1ct-eeLg=ntse-T!"
  */			
	public static void main(String[] args) {
		System.out.println(ReverseOnlyLetters.reverseOnlyLetters("Test1ng-Leet=code-Q!"));
	}

	public static  String reverseOnlyLetters(String S) {

		char[] ch = S.toCharArray();
		int i = 0;
		int j = ch.length - 1;

		while (i < j) {
			if (isChar(ch[i]) && isChar(ch[j])) {
				char temp = ch[j];
				ch[j] = ch[i];
				ch[i] = temp;
				i++;
				j--;
			} else if (isChar(ch[i]) && !isChar(ch[j])) {
				j--;
			} else if (!isChar(ch[i]) && isChar(ch[j])) {
				i++;
			} else {
				i++;
				j--;
			}

		}

		return String.valueOf(ch);

	}

	public static boolean isChar(char c) {

		if ((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
			return true;
		else
			return false;
	}

}

package org.mradhika.projects.leetcode.easy;

public class ReverseVowels {

	/*
	 * Write a function that takes a string as input and reverse only the vowels of
	 * a string.
	 * 
	 * Example 1:
	 * 
	 * Input: "hello" Output: "holle" 
	 * 
	 * Example 2:
	 * 
	 * Input: "leetcode" Output: "leotcede" 
	 * Note: The vowels does not include the
	 * letter "y".
	 * 
	 * 
	 */
	public static void main(String[] args) {
		System.out.println(ReverseVowels.reverseVowels("leetcode"));
	}

	public static String reverseVowels(String s) {
		  
        if(s!=null && s.trim().isEmpty())
            return s;
        char[] ch = s.toCharArray();
        int left = 0;
        int right = ch.length-1;
        while(left<=right){
            if(!isVowel(ch[left]))
                left++;
            else if(!isVowel(ch[right]))
                right--;
            else{
                char temp = ch[left];
                ch[left] = ch[right];
                ch[right] = temp;
                left++;
                right--;
            }
                
        }
        
        return new String(ch);
	}

	public static boolean isVowel(char ch) {
		return (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I'
				|| ch == 'O' || ch == 'U');
	}
}

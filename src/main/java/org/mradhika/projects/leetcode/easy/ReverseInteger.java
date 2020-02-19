package org.mradhika.projects.leetcode.easy;

public class ReverseInteger {

	/*
	 * Given a 32-bit signed integer, reverse digits of an integer.
	 * 
	 * Example 1:
	 * 
	 * Input: 123 Output: 321 Example 2:
	 * 
	 * Input: -123 Output: -321 Example 3:
	 * 
	 * Input: 120 Output: 21
	 * 
	 * 
	 */
	public int reverseBest(int x) {
	      
	      //without using long variable  
	      int result = 0; 
	        while(x!=0){
	          int rem = x%10;
	          x= x/10;
	          int newNum = result*10+rem;
	       if((newNum - rem)/10 !=result)
	            return 0;
	          
	            result = newNum;
	            
	        }
	      
	       return result; 
	    }
	
	public static int reverse(int x) {

		String s = "";
		int rev=0;
		if (x < 0) {
			s = "-";
			x = x * -1;
		}
		while (x != 0) {
		   rev =  rev * 10 + x % 10;
			x = x / 10;
			// System.out.println(rem);
			
		}
		s = s + rev;
		//System.out.println(s);

		Integer result;
		try {
			result = Integer.parseInt(s);
			// result = new Integer(result);
		} catch (NumberFormatException n) {
			return 0;
		}
		/*
		 * if (result.intValue() > Integer.MAX_VALUE || result.intValue() <
		 * Integer.MIN_VALUE) return 0;
		 */

		return result.intValue();

	}

	public static void main(String[] args) {

		int result = ReverseInteger.reverse(1200);
		System.out.println(result);

	}

}

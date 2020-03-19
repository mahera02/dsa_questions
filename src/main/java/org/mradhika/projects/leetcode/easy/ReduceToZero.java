package org.mradhika.projects.leetcode.easy;

public class ReduceToZero {

	
	 // right shift operator - shifts the right most bit by the number of shifts specified after the shift operator.
	 //before shift  4 --- 100   shifted by 1 
	 // after shift  4 --- 010   becomes 2    
	
	public static int  numberOfSteps (int num) {
		 int ans = 0;
	        
	        while(num > 0) {
	            ans += (num & 1) + 1;
	            num >>= 1;
	        }
	        
	        return ans == 0 ?  -1 : ans - 1;
    }
	
	
	public static void main(String[] args) {
		System.out.println(numberOfSteps(14));	
	}
}

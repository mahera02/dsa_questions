package org.mradhika.projects.leetcode.easy;

public class FindNumbersWithEvenDigits {

	   public int findNumbers(int[] nums) {
	        int result = 0;
	        for(int n : nums){
	            int count = 0;
	            while(n > 0){
	                n=n/10;
	                count++;
	            }
	            if(count%2==0){
	                result++;
	            }
	            
	        }
	        return result;
	        
	    }
	   
	   public int findNumbers2(int[] nums) {
	        int result = 0;
	        for(int n : nums){
	        	if( (n>9 && n<100) ||   (n >999 && n<10000) || (n==100000))
	        		result++;
	            
	        }
	        return result;
	        
	    }
}

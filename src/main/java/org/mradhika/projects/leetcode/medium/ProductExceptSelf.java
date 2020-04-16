package org.mradhika.projects.leetcode.medium;

public class ProductExceptSelf {
	
	// O(n) time
	//O(1) space
	  public int[] productExceptSelf(int[] nums) {
	        int[] output = new int[nums.length];
	       
	        output[0]=1;
	        
	        // product of elements to the left of each element
	        for(int i =1;i<nums.length;i++){
	           output[i]=output[i-1]*nums[i-1];
	        }
	        int R = 1;
	        // product of elements to the right of each element
	        for(int i =nums.length-1;i>=0;i--){
	            output[i] = output[i] * R;
	            R= R * nums[i];
	        }
	        
	        return output;
	    }
	  
	  // another approach is to find the product of all elements and divide the product by each array element
	  
	  //another approach is to take left and right array and then multiply both for the final result
}

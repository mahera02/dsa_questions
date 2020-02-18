package org.mradhika.projects.leetcode.easy;
import java.util.Arrays;

public class RotateArray {
	/*
	Given an array, rotate the array to the right by k steps, where k is non-negative.

	Example 1:

	Input: [1,2,3,4,5,6,7] and k = 3
	Output: [5,6,7,1,2,3,4]
	Explanation:
	rotate 1 steps to the right: [7,1,2,3,4,5,6]
	rotate 2 steps to the right: [6,7,1,2,3,4,5]
	rotate 3 steps to the right: [5,6,7,1,2,3,4]
*/
	
//NOTE- Reversing the entire array first and then sorting using Arrays.sort two time - this sorting does not work properly. Hence 
// better to reverse all three times from start index to end index
	public static void main(String[] args) {
		rotateBruteForce(new int[] { 1, 2, 3, 4, 5, 6, 7 }, 3);
		rotate(new int[] { 1, 2, 3}, 4);
		rotate(new int[] { 1, 2}, 2);
		rotate(new int[] { 1}, 1);
	}

	 public static void rotateBruteForce(int[] nums, int k) {
	        int temp, previous;
	        for (int i = 0; i < k; i++) {
	            previous = nums[nums.length - 1];
	            for (int j = 0; j < nums.length; j++) {
	                temp = nums[j];
	                nums[j] = previous;
	                previous = temp;
	            }
	        }
	    }
    
	public static void rotate(int[] nums, int k) {

		if (nums.length == 1)
			return;
		if (nums.length == k)
			return;
		k = k % nums.length;  // IMPORTANT STEP
		reverse(nums, 0, nums.length - 1);
		reverse(nums, 0, k - 1);
		reverse(nums, k, nums.length - 1);
	}

	public static void reverse(int[] nums, int i, int j) {

		while (i < j) {

			int temp = nums[j];
			nums[j] = nums[i];
			nums[i] = temp;
			i++;
			j--;

		}

	}
	    
}
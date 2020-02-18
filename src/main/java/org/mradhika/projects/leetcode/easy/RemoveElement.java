package org.mradhika.projects.leetcode.easy;

public class RemoveElement {

	public static int removeElement(int[] nums, int val) {

		int count = 0;
		for (int i = 0; i < nums.length; i++) {

			if (nums[i] != val) {
				nums[count] = nums[i];
				count++;
			}
		}
		return count;
	}
	
	public static int removeElementTP(int[] nums, int val) {
		int left=0, right =0;
		while (right <nums.length) {
			if (nums[right] != val) {
				nums[left]=nums[right];
				right++;
				left++;
			}else {
				right++;
			}
		}
		return left+1;
	}

	public static void main(String[] args) {
		System.out.println(RemoveElement.removeElement(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
		System.out.println(RemoveElement.removeElementTP(new int[] { 0, 1, 2, 2, 3, 0, 4, 2 }, 2));
		System.out.println(RemoveElement.removeElementTP(new int[] { 1 }, 1));
		System.out.println(RemoveElement.removeElementTP(new int[] { 2 }, 3));

	}
}

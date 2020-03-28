package org.mradhika.projects.leetcode.medium;

public class SearchInRotatedArray {
	
	public static void main(String[] args) {
		SearchInRotatedArray.search(new int[] {4,5,6,7,0,1,2} ,4);
	}
	public static int search(int[] nums, int target) {
		int pivot = findPivot(0, nums.length - 1, nums);
		if (pivot == -1)
			return binarySearch(0, nums.length - 1, nums, target);
		else if (target == nums[pivot]) {
			return pivot;
		} else if (target >= nums[0]) {
			pivot = binarySearch(0, pivot - 1, nums, target);
		} else {
			pivot = binarySearch(pivot + 1, nums.length - 1, nums, target);
		}

		return pivot;
	}

	public static int binarySearch(int start, int end, int[] nums, int target) {
		while (start <= end) {
			int mid = start + (end - start) / 2;
			if (target == nums[mid])
				return mid;
			else if (target < nums[mid]) {
				end = mid - 1;
			} else {
				start = mid + 1;
			}
		}
		return -1;
	}

	public static int findPivot(int start, int end, int[] nums) {
		if (start > end)
			return -1;
		if (start == end)
			return start;
		int mid = (start + end) / 2;
		if (mid < end && nums[mid] > nums[mid + 1])
			return mid;
		if (mid > start && nums[mid] < nums[mid - 1])
			return mid - 1;
		if (nums[start] >= nums[mid])
			return findPivot(start, mid - 1, nums);
		else
			return findPivot(mid + 1, nums.length - 1, nums);
	}
	
	
	  public int searchArray(int[] nums, int target) {
	        int left = 0;
	        int right = nums.length - 1;
	        while (left <= right) {
	            int mid = (left+right)/2;
	            if (nums[mid] == target) return mid;
	            if (nums[mid] >= nums[left]) { // left side
	                if (target >= nums[left] && target <= nums[mid]) {
	                    right = mid;
	                } else {
	                    left = mid;
	                }
	            } else {
	                if (target >= nums[mid] && target <= nums[right]) {
	                    left = mid;
	                } else {
	                    right = mid;
	                }
	            }
	            if (left < nums.length && nums[left] == target) return left;
	            if (right >= 0 && nums[right] == target) return right;
	            left+=1;
	        }
	        
	        return -1;
	    }
}

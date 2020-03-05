package org.mradhika.projects.leetcode.hard;

public class MedianOfTwoSortedArray {

	// Better approach - Binary Search
	public double findMedianSortedArraysBinarySearch(int[] nums1, int[] nums2) {

		if (nums1.length > nums2.length)
			return findMedianSortedArrays(nums2, nums1);

		int n1 = nums1.length;
		int n2 = nums2.length;

		int left = 0;
		int right = n1;

		while (left <= right) {
			int partitionN1 = (left + right) / 2;
			int partitionN2 = (n1 + n2 + 1) / 2 - partitionN1;

			int maxLeftN1 = partitionN1 == 0 ? Integer.MIN_VALUE : nums1[partitionN1 - 1];
			int minRightN1 = partitionN1 == n1 ? Integer.MAX_VALUE : nums1[partitionN1];

			int maxLeftN2 = partitionN2 == 0 ? Integer.MIN_VALUE : nums2[partitionN2 - 1];
			int minRightN2 = partitionN2 == n2 ? Integer.MAX_VALUE : nums2[partitionN2];

			if (maxLeftN1 <= minRightN2 && maxLeftN2 <= minRightN1) {

				if ((n1 + n2) % 2 == 0) {

					return ((double) Math.max(maxLeftN1, maxLeftN2) + Math.min(minRightN1, minRightN2)) / 2;
				} else {
					return (double) Math.max(maxLeftN1, maxLeftN2);
				}
			} else if (maxLeftN1 > minRightN2) {
				right = partitionN1 - 1;
			} else {
				left = partitionN1 + 1;
			}

		}
		return 0.0;
	}

	// brute force merge to arrays and find the median - iteratively by taking a new
	// array of size n1+n2
	public double findMedianSortedArrays(int[] nums1, int[] nums2) {

		int n1 = 0;
		int n2 = 0;
		int[] nums = new int[nums1.length + nums2.length];
		int k = 0;
		double median = 0;
		while (n1 < nums1.length && n2 < nums2.length) {
			if (nums1[n1] < nums2[n2]) {
				nums[k] = nums1[n1];
				n1++;
				k++;
			} else if (nums1[n1] > nums2[n2]) {
				nums[k] = nums2[n2];
				n2++;
				k++;
			} else {
				nums[k] = nums1[n1];
				n1++;
				k++;
				nums[k] = nums2[n2];
				n2++;
				k++;
			}
		}
		while (n1 < nums1.length) {
			nums[k] = nums1[n1];
			n1++;
			k++;
		}

		while (n2 < nums2.length) {
			nums[k] = nums2[n2];
			n2++;
			k++;
		}
		if (nums.length % 2 == 0) {
			median = (nums[nums.length / 2] + nums[nums.length / 2 - 1]) / 2.0;

		} else {
			median = nums[nums.length / 2];
		}
		return median;
	}
}

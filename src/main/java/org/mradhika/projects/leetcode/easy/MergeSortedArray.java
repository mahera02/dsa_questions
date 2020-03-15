package org.mradhika.projects.leetcode.easy;

import java.util.Arrays;

public class MergeSortedArray {

	/*
	Given two sorted integer arrays nums1 and nums2, merge nums2 into nums1 as one sorted array.

	Note:

	The number of elements initialized in nums1 and nums2 are m and n respectively.
	You may assume that nums1 has enough space (size that is greater or equal to m + n) to hold additional elements from nums2.
	Example:

	Input:
	nums1 = [1,2,3,0,0,0], m = 3
	nums2 = [2,5,6],       n = 3

	Output: [1,2,2,3,5,6]
	*/
	public static void main(String[] args) {

		MergeSortedArray.mergeNew(new int[] { 4, 0, 0, 0, 0, 0 }, 1, new int[] { 1, 2, 3, 5, 6 }, 5);

	}

	public static void mergeNew(int[] nums1, int m, int[] nums2, int n) {

		int i = m - 1;
		int j = n - 1;
		int k = m + n - 1;

		while (i >= 0 && j >= 0) {
			if (nums1[i] > nums2[j]) {
				nums1[k] = nums1[i];
				i--;
				k--;
			} else if (nums1[i] < nums2[j]) {
				nums1[k] = nums2[j];
				j--;
				k--;
			} else if(nums1[i]==nums2[j]){
				nums1[k] = nums1[i];
				k--;
				nums1[k] = nums1[j];
				i--;
				j--;
				k--;

			}
		}
		while (j >= 0) {
			nums1[k] = nums2[j];
			j--;
			k--;
		}

	}

	// Not completely working

	public static void merge(int[] nums1, int m, int[] nums2, int n) {

		int i = 0;
		if (nums2.length == 0) {
			return;
		}

		while (i < m) {

			if (nums1[i] > nums2[0]) {
				int newIndex = findMaxDifference(nums1[i], n, nums2);
				int temp = nums1[i];
				nums1[i] = nums2[newIndex];
				nums2[newIndex] = temp;
				i++;
			} else {
				i++;
			}
		}
		for (int k = 0; k < nums2.length; k++) {
			Arrays.sort(nums2);
			nums1[i] = nums2[k];
			i++;

		}

	}

	public static int findMaxDifference(int num1, int n, int[] nums2) {
		int newIndex = 0;
		int maxDiff = 0;
		int j = 0;
		while (j < n) {

			if (num1 - nums2[j] > maxDiff) {
				maxDiff = num1 - nums2[j];
				newIndex = j;
			}
			j++;
		}
		return newIndex;

	}

}
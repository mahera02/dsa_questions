package org.mradhika.projects.sorting;

import java.util.Arrays;

public class SelectionSort {

	public void selectionSort(int[] a, int n) {

		for (int i = 0; i < n - 1; i++) {
			int min = i;
			for (int j = i + 1; j < n; j++) {
				if (a[j] < a[min]) {
					min = j;
				}

			}
			int temp = a[i];
			a[i] = a[min];
			a[min] = temp;

		}
	}

	public static void main(String[] args) {

		SelectionSort sort = new SelectionSort();
		int[] nums = new int[] { 4, 3, 7, 1, 2 };
		sort.selectionSort(nums, 5);
		System.out.println(Arrays.toString(nums));
	}
}

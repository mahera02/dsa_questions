package org.mradhika.projects.sorting;

import java.util.Arrays;

public class BubbleSort {

	public void bubbleSort(int[] a, int n) {

		for (int i = 0; i < n; i++) {
			boolean flag = false;
			for (int j = 0; j < n - 1; j++) {
				System.out.println("running");

				if (a[j] > a[j + 1]) {

					int temp = a[j];
					a[j] = a[j + 1];
					a[j + 1] = temp;

					flag = true;

				}
			}
			if (!flag) {
				break;
			}

		}

	}

	public static void main(String[] args) {

		BubbleSort sort = new BubbleSort();
		int[] nums = new int[] { 4, 3, 7, 1, 2 };
		sort.bubbleSort(nums, 5);
		System.out.println(Arrays.toString(nums));

		nums = new int[] { 1, 2, 3, 4, 5 };
		sort.bubbleSort(nums, 5);
		System.out.println(Arrays.toString(nums));
	}

}

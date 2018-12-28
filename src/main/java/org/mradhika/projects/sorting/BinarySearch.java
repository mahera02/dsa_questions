package org.mradhika.projects.sorting;

public class BinarySearch {

	public int binarySearch(int[] arr, int left, int right, int key) {

		if (right >= left) {
			int mid = left + (right - left) / 2;

			if (arr[mid] > key) {
				// search left
				return binarySearch(arr, left, mid - 1, key);
			} else if (arr[mid] < key) {
				// search right
				return binarySearch(arr, mid + 1, right, key);
			} else {
				return mid;
			}

		}

		return -1;

	}

	public static void main(String[] args) {

		BinarySearch obj = new BinarySearch();
		int[] arr = new int[] { 1, 2, 3, 4, 5, 6, 7 };
		int left = 0;
		int right = arr.length - 1;
		int key = 4;
		int result = obj.binarySearch(arr, left, right, key);
		System.out.println(result);

	}

}

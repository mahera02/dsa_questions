package org.mradhika.projects.leetcode.medium;

public class SearchIn2DMatrix {

	// Appraoach 1

	public boolean searchMatrix(int[][] matrix, int target) {
		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int m = matrix.length - 1;
		int n = matrix[0].length - 1;
		int start = 0;

		while (start <= m) {
			int mid =  start+ (m-start)/2;

			if (target >= matrix[mid][0] && target <= matrix[mid][n]) {
				return binarySearch(target, mid, matrix);
			} else if (target > matrix[mid][n]) {
				start = mid + 1;
			} else {
				m = mid - 1;
			}
		}
		return false;

	}

	public boolean binarySearch(int target, int row, int[][] matrix) {
		int start = 0;
		int end = matrix[row].length - 1;
		while (start <= end) {
			int mid = start + (end - start) / 2;

			if (target == matrix[row][mid]) {
				return true;
			} else if (target > matrix[row][mid]) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}
		}
		return false;
	}

	// Aproach 2;
	public boolean searchMatrixMethod2(int[][] matrix, int target) {

		if (matrix == null || matrix.length == 0 || matrix[0].length == 0)
			return false;
		int m = matrix.length;
		int n = matrix[0].length;
		int start = 0;
		int end = (m * n) - 1;

		while (start <= end) {
			int mid = start + (end - start) / 2;
			int midValue = matrix[mid / n][mid % n];

			if (target == midValue) {
				return true;
			} else if (target > midValue) {
				start = mid + 1;
			} else {
				end = mid - 1;
			}

		}
		return false;
	}

}
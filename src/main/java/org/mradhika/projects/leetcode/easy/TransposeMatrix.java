package org.mradhika.projects.leetcode.easy;

public class TransposeMatrix {

	public int[][] transpose(int[][] A) {

		// inplace when matrix is n*n
		if (A.length == A[0].length) {
			for (int i = 0; i < A.length; i++) {
				for (int j = i; j < A[0].length; j++) {
					int temp = A[i][j];
					A[i][j] = A[j][i];
					A[j][i] = temp;

				}
			}

			return A;
		}
		// when matrix is m*n
		                   // n*m
		int[][] B = new int[A[0].length][A.length];
		for (int i = 0; i < A.length; i++) {
			for (int j = 0; j < A[0].length; j++) {
				B[j][i] = A[i][j];
			}
		}
		return B;
	}
}

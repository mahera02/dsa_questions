package org.mradhika.projects.leetcode.medium;

import java.util.ArrayList;
import java.util.List;

public class SpiralMatrix {

	public static void main(String[] args) {
		List<Integer> list = SpiralMatrix.spiralOrder(new int[][] {{1,2,3},{4,5,6},{7,8,9}});
		System.out.println(list.get(8));
	}

	public static  List<Integer> spiralOrder(int[][] matrix) {

		List<Integer> list = new ArrayList<Integer>();

		int top = 0;
		int left = 0;

		if (matrix.length == 0 || matrix[0].length == 0) {
			return new ArrayList<>();
		}
		int bottom = matrix.length - 1;
		int right = matrix[0].length - 1;
		while (true) {
			// left-right
			for (int i = left; i <= right; i++) {
				list.add(matrix[top][i]);
			}
			top++;
			// break condition
			if (left > right || top > bottom)
				break;
			// top-bottom
			for (int i = top; i <= bottom; i++) {
				list.add(matrix[i][right]);
			}
			right--;
			// break condition
			if (left > right || top > bottom)
				break;
			//right-left
			for (int i = right; i >= left; i--) {
				list.add(matrix[bottom][i]);
			}
			bottom--;
			// break condition
			if (left > right || top > bottom)
				break;
            //bottom-top
			for (int i = bottom; i >= top; i--) {
				list.add(matrix[i][left]);
			}
			left++;
			// break condition
			if (left > right || top > bottom)
				break;

		}

		return list;

	}

}

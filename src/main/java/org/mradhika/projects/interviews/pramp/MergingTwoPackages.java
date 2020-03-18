package org.mradhika.projects.interviews.pramp;

import java.util.HashMap;

public class MergingTwoPackages {

	// two sum
	/*
	 * Given a package with a weight limit limit and an array arr of item weights,
	 * implement a function getIndicesOfItemWeights that finds two items whose sum
	 * of weights equals the weight limit limit. Your function should return a pair
	 * [i, j] of the indices of the item weights, ordered such that i > j. If such a
	 * pair doesn’t exist, return an empty array.
	 * 
	 * Analyze the time and space complexities of your solution.
	 * 
	 * Example:
	 * 
	 * input: arr = [4, 6, 10, 15, 16], lim = 21
	 * 
	 * output: [3, 1] # since these are the indices of the # weights 6 and 15 whose
	 * sum equals to 2
	 */
	static int[] getIndicesOfItemWeights(int[] arr, int limit) {
		// your code goes here

		// K V i
		// 4 0 0
		// 6 1 1
		// 10 2 2
		// 3
		HashMap<Integer, Integer> map = new HashMap<>();

		for (int i = 0; i < arr.length; i++) {
			if (map.containsKey(limit - arr[i])) {
				return new int[] { i, map.get(limit - arr[i]) };
			} else {
				map.put(arr[i], i);
			}
		}
		return new int[] {};

	}

	public static void main(String[] args) {

		int[] arr = new int[] { 4, 4 };

		int[] res = getIndicesOfItemWeights(arr, 8);
		System.out.println(res[0]);
		System.out.println(res[1]);
	}

}

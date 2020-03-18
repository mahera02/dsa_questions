package org.mradhika.projects.interviews.pramp;

import java.util.Arrays;

public class GrantBudget {

	// Best Solution

	static double findGrantsCapBest(double[] grantsArray, double newBudget) {
		Arrays.sort(grantsArray);

		int length = grantsArray.length;
		double prefixSum = 0;
		for (int index = 0; index < length; index++) {
			double current = grantsArray[index];
			double available = newBudget - prefixSum;
			int numbersLeft = length - index;
			if (current * numbersLeft > available) {
				return available / numbersLeft;
			}

			prefixSum += current;
		}
		return grantsArray[length - 1];

	}

	//binary search is not needed
	static double findGrantsCapNew(double[] grantsArr, double bgt) {
		Arrays.sort(grantsArr);
		double total = 0;
		int len = grantsArr.length;
		int i = 0;
		for (i = 0; i < len;) {
			double curr = grantsArr[i] * (len - i);
			if (curr + total < bgt) {
				total += grantsArr[i];
				i++;
			} else
				break;
		}
		double ans = findNumber(len - i, 0, grantsArr[i], bgt, total);
		return ans;
	}

	static double findNumber(double totalnums, double low, double high, double budget, double existingSum) {
		while (low < high) {
			double mid = (low + high) / 2;
			double calc = (mid * totalnums) + existingSum;
			if (calc > budget) {
				high = mid;
			} else if (calc < budget) {
				low = mid;
			} else
				return mid;
		}

		return 0;
	}

	public static void main(String[] args) {
		double[] grantsArray = new double[] { 2, 100, 50, 120, 167 };
		double newBudget = 190;
		double result = findGrantsCapBest(grantsArray, newBudget);
		System.out.println(result);
	}

}

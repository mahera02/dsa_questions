package org.mradhika.projects.leetcode.easy;

public class BestTimeToBuyAndSellStock {

	/*
	 * Input: [7,1,5,3,6,4] Output: 7 Explanation: Buy on day 2 (price = 1) and sell
	 * on day 3 (price = 5), profit = 5-1 = 4. Then buy on day 4 (price = 3) and
	 * sell on day 5 (price = 6), profit = 6-3 = 3.
	 */
	public int maxProfit(int[] prices) {

		int maxPrice = 0;

		for (int i = 0; i < prices.length - 1; i++) {

			// prices[i] < prices[i+1] means CP is less than SP or CP < SP
			// profit = SP - CP
			if (prices[i] < prices[i + 1]) {
				maxPrice = maxPrice + prices[i + 1] - prices[i];
			}

		}
		return maxPrice;
	}

	/*
	 * Input: [7,1,5,3,6,4] Output: 5 Explanation: Buy on day 2 (price = 1) and sell
	 * on day 5 (price = 6), profit = 6-1 = 5. Not 7-1 = 6, as selling price needs
	 * to be larger than buying price.
	 */
	public int maxProfitWithtMostOneTransaction(int[] prices) {
		if (prices == null || prices.length == 0)
			return 0;
		int numMin = prices[0];
		int max = 0;

		for (int i = 1; i < prices.length; i++) {

			if (numMin > prices[i]) {
				numMin = prices[i];
			}
			max = Math.max(max, prices[i] - numMin);
		}
		return max;
	}
}

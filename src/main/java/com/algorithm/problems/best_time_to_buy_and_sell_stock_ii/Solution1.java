/**
 * Leetcode - best_time_to_buy_and_sell_stock_2
 */
package com.algorithm.problems.best_time_to_buy_and_sell_stock_ii;

class Solution1 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int maxProfit(int[] prices) {
        return calculate(prices, 0);
    }

    public int calculate(int[] prices, int s) {
        if (s >= prices.length)
            return 0;
        int max = 0;
        for (int start = s; start < prices.length; start++) {
            int maxprofit = 0;
            for (int i = start + 1; i < prices.length; i++) {
                if (prices[start] < prices[i]) {
                    int profit = calculate(prices, i + 1) + prices[i] - prices[start];
                    if (profit > maxprofit)
                        maxprofit = profit;
                }
            }
            if (maxprofit > max)
                max = maxprofit;
        }
        return max;
    }
}

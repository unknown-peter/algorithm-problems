/**
 * Leetcode - best_time_to_buy_and_sell_stock_2
 */
package com.algorithm.problems.best_time_to_buy_and_sell_stock_ii;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int maxProfit(int[] prices) {
        int maxprofit = 0;
        for (int i = 1; i < prices.length; i++) {
            if (prices[i] > prices[i - 1])
                maxprofit += prices[i] - prices[i - 1];
        }
        return maxprofit;
    }
}

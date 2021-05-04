/**
 * Leetcode - best_time_to_buy_and_sell_stock_2
 */
package com.algorithm.problems.best_time_to_buy_and_sell_stock_2;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int maxProfit(int[] prices) {
        int i = 0;
        int valley = prices[0];
        int peak = prices[0];
        int maxprofit = 0;
        while (i < prices.length - 1) {
            while (i < prices.length - 1 && prices[i] >= prices[i + 1])
                i++;
            valley = prices[i];
            while (i < prices.length - 1 && prices[i] <= prices[i + 1])
                i++;
            peak = prices[i];
            maxprofit += peak - valley;
        }
        return maxprofit;
    }
}

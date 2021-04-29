/**
 * Leetcode - best_time_to_buy_and_sell_stock
 */
package com.algorithm.problems.best_time_to_buy_and_sell_stock;

class Solution1 implements Solution {

    @Override
    public int maxProfit(int[] prices) {
        int profit = 0;
        for (int i = 0; i < prices.length; i++) {
            for (int j = i + 1; j < prices.length; j++) {
                profit = Math.max(profit, prices[j] - prices[i]);
            }
        }
        return profit;
    }
}

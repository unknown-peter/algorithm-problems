/**
 * Leetcode - best_time_to_buy_and_sell_stock
 */
package com.algorithm.problems.best_time_to_buy_and_sell_stock;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int maxProfit(int prices[]) {
        int minprice = Integer.MAX_VALUE;
        int maxprofit = 0;
        for (int i = 0; i < prices.length; i++) {
            if (prices[i] < minprice)
                minprice = prices[i];
            else if (prices[i] - minprice > maxprofit)
                maxprofit = prices[i] - minprice;
        }
        return maxprofit;
    }
}

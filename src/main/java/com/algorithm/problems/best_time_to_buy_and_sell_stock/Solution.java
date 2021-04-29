/**
 * Leetcode - best_time_to_buy_and_sell_stock
 */
package com.algorithm.problems.best_time_to_buy_and_sell_stock;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

interface Solution {

    // use this Object to print the log (call from slf4j facade)
    static Logger log = LoggerFactory.getLogger(Solution.class);

    int maxProfit(int[] prices);
}

/**
 * Leetcode - lemonade_change
 */
package com.algorithm.problems.lemonade_change;

class Solution1 implements Solution {

    @Override
    public boolean lemonadeChange(int[] bills) {
        int fiveDollarCount = 0;
        int tenDollarCount = 0;
        for (int bill : bills) {
            if (bill == 5) fiveDollarCount++;
            else if (bill == 10) {
                if (fiveDollarCount == 0) return false;
                fiveDollarCount--;
                tenDollarCount++;
            } else {
                if (fiveDollarCount > 0 && tenDollarCount > 0) {
                    fiveDollarCount--;
                    tenDollarCount--;
                } else if (fiveDollarCount >= 3) {
                    fiveDollarCount -= 3;
                } else return false;
            }
        }
        return true;
    }
}

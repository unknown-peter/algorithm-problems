/**
 * Leetcode - single_number
 */
package com.algorithm.problems.single_number;

class Solution4 implements Solution {

    /**
     * solution from leetcode
     * a XOR 0 = a
     * a XOR a = 0
     * a XOR b XOR a = (a XOR a) XOR b = 0 XOR b = b
     */
    @Override
    public int singleNumber(int[] nums) {
        int a = 0;
        for (int i : nums) {
            a ^= i;
        }
        return a;
    }
}

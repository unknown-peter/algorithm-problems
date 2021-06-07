/**
 * Leetcode - number_of_1_bits
 */
package com.algorithm.problems.number_of_1_bits;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int hammingWeight(int n) {
        int sum = 0;
        while (n != 0) {
            sum++;
            n &= (n - 1);
        }
        return sum;
    }
}

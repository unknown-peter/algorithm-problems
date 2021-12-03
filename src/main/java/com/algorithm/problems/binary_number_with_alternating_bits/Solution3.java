/**
 * Leetcode - binary_number_with_alternating_bits
 */
package com.algorithm.problems.binary_number_with_alternating_bits;

class Solution3 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean hasAlternatingBits(int n) {
        int cur = n % 2;
        n /= 2;
        while (n > 0) {
            if (cur == n % 2) return false;
            cur = n % 2;
            n /= 2;
        }
        return true;
    }
}

/**
 * Leetcode - binary_number_with_alternating_bits
 */
package com.algorithm.problems.binary_number_with_alternating_bits;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public boolean hasAlternatingBits(int n) {
        String bits = Integer.toBinaryString(n);
        for (int i = 0; i < bits.length() - 1; i++) {
            if (bits.charAt(i) == bits.charAt(i + 1)) {
                return false;
            }
        }
        return true;
    }
}

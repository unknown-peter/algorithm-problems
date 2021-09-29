/**
 * Leetcode - number_complement
 */
package com.algorithm.problems.number_complement;

class Solution3 implements Solution {

    @Override
    public int findComplement(int num) {
        return (num <= 0) ? 0 : (((num ^ 1) & 1) + 2 * findComplement(num >> 1));
    }
}

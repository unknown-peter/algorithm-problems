/**
 * Leetcode - missing_number
 */
package com.algorithm.problems.missing_number;

import java.util.BitSet;

class Solution1 implements Solution {

    @Override
    public int missingNumber(int[] nums) {
        BitSet bitSet = new BitSet(nums.length);
        for (int num : nums) {
            bitSet.set(num);
        }
        return bitSet.nextClearBit(0);
    }
}

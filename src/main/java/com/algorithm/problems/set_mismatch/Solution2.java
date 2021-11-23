/**
 * Leetcode - set_mismatch
 */
package com.algorithm.problems.set_mismatch;

class Solution2 implements Solution {

    @Override
    public int[] findErrorNums(int[] nums) {
        int dup = -1;
        int missing = -1;
        for (int i = 1; i <= nums.length; i++) {
            int count = 0;
            for (int num : nums) {
                if (num == i) count++;
            }
            if (count == 0) missing = i;
            if (count == 2) dup = i;

//            if (dup > 0 && missing > 0)
//                break;
        }
        return new int[]{dup, missing};
    }
}

/**
 * Leetcode - binary_gap
 */
package com.algorithm.problems.binary_gap;

class Solution1 implements Solution {

    @Override
    public int binaryGap(int n) {
        int maxDistance = 0;
        int pre = -1;
        int i = 0;
        while (n != 0) {
            if ((n & 1) == 1) {
                if (pre >= 0) maxDistance = Math.max(maxDistance, i - pre);
                pre = i;
            }
            i++;
            n >>= 1;
        }
        return maxDistance;
    }
}

/**
 * Leetcode - hamming_distance
 */
package com.algorithm.problems.hamming_distance;

class Solution1 implements Solution {

    @Override
    public int hammingDistance(int x, int y) {
        int tmp = x ^ y;
        int dis = 0;
        while (tmp != 0) {
            tmp &= (tmp - 1);
            dis++;

//            dis += tmp & 1;
//            tmp >>= 1;
        }
        return dis;
    }
}

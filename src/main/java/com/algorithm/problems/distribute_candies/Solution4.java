/**
 * Leetcode - distribute_candies
 */
package com.algorithm.problems.distribute_candies;

class Solution4 implements Solution {

    @Override
    public int distributeCandies(int[] candyType) {
        int candies = candyType.length / 2;
        boolean[] hasType = new boolean[200001];
        int typeNum = 0;
        for (int type : candyType) {
            int idx = 100000 + type;
            if (!hasType[idx]) {
                hasType[idx] = true;
                if (typeNum++ == candies) return candies;
            }
        }
        return typeNum;
    }
}

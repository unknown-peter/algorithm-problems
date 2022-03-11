/**
 * Leetcode - last_stone_weight
 */
package com.algorithm.problems.last_stone_weight;

import java.util.Arrays;

class Solution2 implements Solution {

    @Override
    public int lastStoneWeight(int[] stones) {
        while (stones.length > 1) {
            Arrays.sort(stones);
            int remain = stones[stones.length - 1] - stones[stones.length - 2];
            if (remain > 0) {
                stones = Arrays.copyOf(stones, stones.length - 1);
                stones[stones.length - 1] = remain;
            } else stones = Arrays.copyOf(stones, stones.length - 2);
        }
        return (stones.length == 0) ? 0 : stones[0];
    }
}

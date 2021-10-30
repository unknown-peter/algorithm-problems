/**
 * Leetcode - distribute_candies
 */
package com.algorithm.problems.distribute_candies;

import java.util.HashSet;
import java.util.Set;

class Solution1 implements Solution {

    @Override
    public int distributeCandies(int[] candyType) {
        Set<Integer> set = new HashSet<>();
        for (int type : candyType) {
            set.add(type);
        }
        return Math.min(candyType.length / 2, set.size());
    }
}

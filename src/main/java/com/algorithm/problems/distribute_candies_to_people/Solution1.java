/**
 * Leetcode - distribute_candies_to_people
 */
package com.algorithm.problems.distribute_candies_to_people;

class Solution1 implements Solution {

    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];

        for (int i = 0; candies > 0; i++) {
            res[i % num_people] += Math.min(candies, i + 1);
            candies -= i + 1;
        }
        return res;
    }
}

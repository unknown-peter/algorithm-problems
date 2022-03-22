/**
 * Leetcode - distribute_candies_to_people
 */
package com.algorithm.problems.distribute_candies_to_people;

class Solution1 implements Solution {

    @Override
    public int[] distributeCandies(int candies, int num_people) {
        int[] res = new int[num_people];
        int num = 1;
        while (candies > 0) {
            for (int i = 0; i < num_people; i++) {
                if (candies <= num) {
                    res[i] += candies;
                    candies = 0;
                    break;
                }
                res[i] += num;
                candies -= num;
                num++;
            }
        }
        return res;
    }
}

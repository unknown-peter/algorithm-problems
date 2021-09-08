/**
 * Leetcode - third_maximum_number
 */
package com.algorithm.problems.third_maximum_number;

class Solution1 implements Solution {

    @Override
    public int thirdMax(int[] nums) {
        long firstMax = Long.MIN_VALUE;
        long secondMax = Long.MIN_VALUE;
        long thirdMax = Long.MIN_VALUE;
        for (int num : nums) {
            if (num > firstMax) {
                thirdMax = secondMax;
                secondMax = firstMax;
                firstMax = num;
            } else if (num < firstMax && num > secondMax) {
                thirdMax = secondMax;
                secondMax = num;
            } else if (num < secondMax && num > thirdMax) {
                thirdMax = num;
            }
        }
        return (thirdMax == Long.MIN_VALUE || thirdMax == secondMax) ? (int) firstMax : (int) thirdMax;
    }
}

/**
 * Leetcode - third_maximum_number
 */
package com.algorithm.problems.third_maximum_number;

class Solution1 implements Solution {

    @Override
    public int thirdMax(int[] nums) {
        Integer firstMax = Integer.MIN_VALUE;
        Integer secondMax = null;
        Integer thirdMax = null;
        for (int num : nums) {
            firstMax = Math.max(firstMax, num);
        }
        for (int num : nums) {
            if (num != firstMax) secondMax = (secondMax == null) ? num : Math.max(secondMax, num);
        }
        if (secondMax == null) return firstMax;
        for (int num : nums) {
            if (num != firstMax && num != secondMax) thirdMax = (thirdMax == null) ? num : Math.max(thirdMax, num);
        }
        return (thirdMax == null) ? firstMax : thirdMax;
    }
}

/**
 * Leetcode - construct_the_rectangle
 */
package com.algorithm.problems.construct_the_rectangle;

class Solution1 implements Solution {

    /**
     * 从(area)^1/2向下遍历数字i，如果i能整除area，则返回[area/i, i]
     */
    @Override
    public int[] constructRectangle(int area) {
        int[] lw = new int[]{area, 1};
        for (int i = (int) Math.sqrt(area); i >= 1; i--) {
            if (area % i == 0) {
                return new int[]{area / i, i};
            }
        }
        return lw;
    }
}

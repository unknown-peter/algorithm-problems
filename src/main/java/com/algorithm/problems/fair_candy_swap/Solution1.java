/**
 * Leetcode - fair_candy_swap
 */
package com.algorithm.problems.fair_candy_swap;

class Solution1 implements Solution {

    /**
     * 对于数组中的任意两值a、b，交换之后满足数组元素和相等S1-a+b=S2-b+a，则a-b=(S1-S2)/2
     */
    @Override
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;
        for (int num : aliceSizes) aliceSum += num;
        for (int num : bobSizes) bobSum += num;
        int tmp = (aliceSum - bobSum) / 2;
        for (int aliceNum : aliceSizes) {
            for (int bobNum : bobSizes) {
                if ((aliceNum - bobNum) == tmp) return new int[]{aliceNum, bobNum};
            }
        }
        return null;
    }
}

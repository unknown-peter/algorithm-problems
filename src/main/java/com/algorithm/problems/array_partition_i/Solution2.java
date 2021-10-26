/**
 * Leetcode - array_partition_i
 */
package com.algorithm.problems.array_partition_i;

class Solution2 implements Solution {

    /**
     * 查找nums最小值min和最大值max，定义长度为max-min+1的计数数组，对于nums中的num计数并在计数数组num-min处加1
     * 遍历计数数组，每隔一个加到sum上
     */
    @Override
    public int arrayPairSum(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int num : nums) {
            if (num < min) min = num;
            if (num > max) max = num;
        }
        int[] numCount = new int[max - min + 1];
        for (int num : nums) {
            numCount[num - min]++;
        }

        int sum = 0;
        boolean odd = true;
        for (int i = 0; i < numCount.length; i++) {
            while (numCount[i] > 0) {
                if (odd) {
                    sum += min + i;
                }
                odd = !odd;
                numCount[i]--;
            }
        }
        return sum;
    }
}

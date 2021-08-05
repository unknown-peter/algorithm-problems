/**
 * Leetcode - range_sum_query_immutable
 */
package com.algorithm.problems.range_sum_query_immutable;

class Solution2 implements Solution {

    @Override
    public Integer[] numArrayOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        Solution1.NumArray numArray = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "NumArray":
                    numArray = new Solution1.NumArray(data[i]);
                    result[i] = null;
                    break;
                case "sumRange":
                    result[i] = numArray.sumRange(data[i][0], data[i][1]);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class NumArray {

        private int[] sumArray;

        public NumArray(int[] nums) {
            sumArray = new int[nums.length + 1];
            sumArray[0] = 0;
            for (int i = 1; i < nums.length; i++) {
                sumArray[i] = sumArray[i - 1] + nums[i];
            }
        }

        public int sumRange(int left, int right) {
            return sumArray[right + 1] - sumArray[left];
        }
    }

}

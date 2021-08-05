/**
 * Leetcode - range_sum_query_immutable
 */
package com.algorithm.problems.range_sum_query_immutable;

class Solution1 implements Solution {

    @Override
    public Integer[] numArrayOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        NumArray numArray = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "NumArray":
                    numArray = new NumArray(data[i]);
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

        private int[] array;

        public NumArray(int[] nums) {
            array = nums;
        }

        public int sumRange(int left, int right) {
            int sum = 0;
            for (int i = left; i <= right; i++) {
                sum += array[i];
            }
            return sum;
        }
    }
}

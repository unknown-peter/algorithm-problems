/**
 * Leetcode - moving_average_from_data_stream
 */
package com.algorithm.problems.moving_average_from_data_stream;

class Solution2 implements Solution {

    @Override
    public Double[] dataStreamOperate(String[] operate, int[][] data) {
        Double[] result = new Double[operate.length];
        Solution1.MovingAverage movingAverage = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MovingAverage":
                    movingAverage = new Solution1.MovingAverage(data[i][0]);
                    result[i] = null;
                    break;
                case "next":
                    result[i] = movingAverage.next(data[i][0]);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class MovingAverage {

        int[] num;

        int pos;

        int sum;

        int count;

        public MovingAverage(int size) {
            num = new int[size];
            pos = 0;
            sum = 0;
            count = 0;
        }

        public double next(int val) {
            sum -= num[pos];
            num[pos++] = val;
            if (pos == num.length) {
                pos = 0;
            }
            sum += val;
            count = count == num.length ? count : count + 1;
            return ((double) sum) / count;
        }
    }
}

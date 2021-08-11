/**
 * Leetcode - moving_average_from_data_stream
 */
package com.algorithm.problems.moving_average_from_data_stream;

import java.util.LinkedList;
import java.util.Queue;

class Solution1 implements Solution {

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

        private int windowSize;

        private Queue<Integer> queue;

        private double sum;

        public MovingAverage(int size) {
            windowSize = size;
            queue = new LinkedList<>();
            sum = 0;
        }

        public double next(int val) {
            if (queue.size() == windowSize) sum -= queue.remove();
            queue.add(val);
            sum += val;
            return (queue.size() == windowSize) ? sum / windowSize : sum / queue.size();
        }
    }
}

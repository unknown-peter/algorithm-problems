/**
 * Leetcode - kth_largest_element_in_a_stream
 */
package com.algorithm.problems.kth_largest_element_in_a_stream;

import java.util.PriorityQueue;

class Solution2 implements Solution {

    @Override
    public Integer[] streamOperate(String[] operate, int k, int[][] data) {
        Integer[] result = new Integer[operate.length];
        KthLargest stream = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "KthLargest":
                    stream = new KthLargest(k, data[i]);
                    result[i] = null;
                    break;
                case "add":
                    result[i] = stream.add(data[i][0]);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    /**
     * solution from leetcode
     */
    static class KthLargest {
        private static int k;
        private PriorityQueue<Integer> heap;

        public KthLargest(int k, int[] nums) {
            this.k = k;
            heap = new PriorityQueue<>();

            for (int num : nums) {
                heap.offer(num);
            }

            while (heap.size() > k) {
                heap.poll();
            }
        }

        public int add(int val) {
            heap.offer(val);
            if (heap.size() > k) {
                heap.poll();
            }

            return heap.peek();
        }
    }
}

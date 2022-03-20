/**
 * Leetcode - high_five
 */
package com.algorithm.problems.high_five;

import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

class Solution1 implements Solution {

    @Override
    public int[][] highFive(int[][] items) {
        Map<Integer, PriorityQueue<Integer>> map = new TreeMap<>();
        for (int[] item : items) {
            PriorityQueue<Integer> queue = map.get(item[0]);
            if (queue == null) {
                queue = new PriorityQueue<>(5);
                map.put(item[0], queue);
            }
            queue.offer(item[1]);
            if (queue.size() > 5) queue.poll();
        }

        int[][] res = new int[map.size()][2];
        int index = 0;
        for (Map.Entry<Integer, PriorityQueue<Integer>> entry : map.entrySet()) {
            int sum = 0;
            PriorityQueue<Integer> queue = entry.getValue();
            while (!queue.isEmpty()) sum += queue.poll();
            res[index][0] = entry.getKey();
            res[index][1] = sum / 5;
            index++;
        }
        return res;
    }
}

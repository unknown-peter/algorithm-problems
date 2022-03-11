/**
 * Leetcode - last_stone_weight
 */
package com.algorithm.problems.last_stone_weight;

import java.util.Comparator;
import java.util.PriorityQueue;

class Solution1 implements Solution {

    /**
     * 使用优先队列倒序存储，每次取出两个进行操作
     */
    @Override
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> queue = new PriorityQueue<>(Comparator.reverseOrder());
        for (int stone : stones) queue.add(stone);
        while (queue.size() > 1) {
            int num1 = queue.poll();
            int num2 = queue.poll();
            if (num1 - num2 != 0) queue.add(num1 - num2);
        }
        return queue.isEmpty() ? 0 : queue.poll();
    }
}

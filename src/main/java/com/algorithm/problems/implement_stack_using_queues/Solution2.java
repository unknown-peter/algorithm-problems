/**
 * Leetcode - implement_stack_using_queues
 */
package com.algorithm.problems.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

class Solution2 implements Solution {

    @Override
    public Object[] stackOperate(String[] operate, int[][] data) {
        Object[] result = new Object[operate.length];
        Solution1.MyStack stack = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyStack":
                    stack = new Solution1.MyStack();
                    result[i] = null;
                    break;
                case "push":
                    stack.push(data[i][0]);
                    result[i] = null;
                    break;
                case "pop":
                    result[i] = String.valueOf(stack.pop());
                    break;
                case "top":
                    result[i] = String.valueOf(stack.top());
                    break;
                case "empty":
                    result[i] = String.valueOf(stack.empty());
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class MyStack {

        private Queue<Integer> q1 = new LinkedList<>();

        public void push(int x) {
            q1.add(x);
            int sz = q1.size();
            while (sz > 1) {
                q1.add(q1.remove());
                sz--;
            }
        }

        public int pop() {
            int x = q1.remove();
            return x;
        }

        public int top() {
            return q1.peek();
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }
}

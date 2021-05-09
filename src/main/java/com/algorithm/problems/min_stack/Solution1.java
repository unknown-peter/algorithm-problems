/**
 * Leetcode - min_stack
 */
package com.algorithm.problems.min_stack;

import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public Integer[] stackOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        MinStack stack = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MinStack":
                    stack = new MinStack();
                    result[i] = null;
                    break;
                case "push":
                    stack.push(data[i][0]);
                    result[i] = null;
                    break;
                case "pop":
                    stack.pop();
                    result[i] = null;
                    break;
                case "top":
                    result[i] = stack.top();
                    break;
                case "getMin":
                    result[i] = stack.getMin();
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class MinStack {

        private Stack<Integer> stack;

        private Stack<Integer> min;

        public MinStack() {
            stack = new Stack<>();
            min = new Stack<>();
        }

        public void push(int val) {
            stack.push(val);
            if (min.isEmpty()) {
                min.push(val);
            } else {
                int lastMin = min.peek();
                min.push(Math.min(lastMin, val));
            }
        }

        public void pop() {
            stack.pop();
            min.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int getMin() {
            return min.peek();
        }
    }
}

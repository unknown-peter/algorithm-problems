/**
 * Leetcode - max_stack
 */
package com.algorithm.problems.max_stack;

import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public Integer[] stackOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        MaxStack stack = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MaxStack":
                    stack = new MaxStack();
                    result[i] = null;
                    break;
                case "push":
                    stack.push(data[i][0]);
                    result[i] = null;
                    break;
                case "pop":
                    result[i] = stack.pop();
                    break;
                case "top":
                    result[i] = stack.top();
                    break;
                case "peekMax":
                    result[i] = stack.peekMax();
                    break;
                case "popMax":
                    result[i] = stack.popMax();
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class MaxStack {

        private Stack<Integer> stack;

        private Stack<Integer> max;

        public MaxStack() {
            stack = new Stack<>();
            max = new Stack<>();
        }

        public void push(int x) {
            stack.push(x);
            if (max.isEmpty()) max.push(x);
            else max.push(Math.max(x, max.peek()));
        }

        public int pop() {
            max.pop();
            return stack.pop();
        }

        public int top() {
            return stack.peek();
        }

        public int peekMax() {
            return max.peek();
        }

        public int popMax() {
            Stack<Integer> tmp = new Stack<>();
            Integer maxValue = max.peek();
            while (!stack.peek().equals(maxValue)) {
                tmp.push(stack.pop());
                max.pop();
            }
            stack.pop();
            max.pop();
            Integer secondMax = max.peek();
            while (!tmp.isEmpty()) {
                stack.push(tmp.pop());
                max.push(secondMax);
            }
            return maxValue;
        }
    }
}

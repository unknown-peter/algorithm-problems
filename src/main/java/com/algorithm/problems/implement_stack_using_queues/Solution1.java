/**
 * Leetcode - implement_stack_using_queues
 */
package com.algorithm.problems.implement_stack_using_queues;

import java.util.LinkedList;
import java.util.Queue;

class Solution1 implements Solution {

    @Override
    public Object[] stackOperate(String[] operate, int[][] data) {
        Object[] result = new Object[operate.length];
        MyStack stack = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyStack":
                    stack = new MyStack();
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

        private Queue<Integer> q2 = new LinkedList<>();

        private int top;

        public void push(int x) {
            q1.add(x);
            top = x;

//            q2.add(x);
//            top = x;
//            while (!q1.isEmpty()) {
//                q2.add(q1.remove());
//            }
//            Queue<Integer> temp = q1;
//            q1 = q2;
//            q2 = temp;
        }

        public int pop() {
            while (q1.size() > 1) {
                top = q1.remove();
                q2.add(top);
            }
            int x = q1.remove();
            Queue<Integer> temp = q1;
            q1 = q2;
            q2 = temp;

            return x;

//            q1.remove();
//            if (!q1.isEmpty()) {
//                top = q1.peek();
//            }
        }

        public int top() {
            return top;
        }

        public boolean empty() {
            return q1.isEmpty();
        }
    }
}

/**
 * Leetcode - implement_queue_using_stacks
 */
package com.algorithm.problems.implement_queue_using_stacks;

import java.util.Stack;

class Solution1 implements Solution {

    @Override
    public Object[] queueOperate(String[] operate, int[][] data) {
        Object[] result = new Object[operate.length];
        MyQueue queue = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyQueue":
                    queue = new MyQueue();
                    result[i] = null;
                    break;
                case "push":
                    queue.push(data[i][0]);
                    result[i] = null;
                    break;
                case "peek":
                    result[i] = String.valueOf(queue.peek());
                    break;
                case "pop":
                    result[i] = String.valueOf(queue.pop());
                    break;
                case "empty":
                    result[i] = String.valueOf(queue.empty());
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    class MyQueue {

        private Stack<Integer> s1 = new Stack<>();

        private Stack<Integer> s2 = new Stack<>();

        private int front;

        public MyQueue() {

        }

        public void push(int x) {
            if (s1.empty())
                front = x;
            s1.push(x);

//            if (s1.empty())
//                front = x;
//            while (!s1.isEmpty())
//                s2.push(s1.pop());
//            s2.push(x);
//            while (!s2.isEmpty())
//                s1.push(s2.pop());
        }

        public int pop() {
            if (s2.isEmpty()) {
                while (!s1.isEmpty())
                    s2.push(s1.pop());
            }
            return s2.pop();

//            int v = s1.pop();
//            if (!s1.empty())
//                front = s1.peek();
//            return v;
        }

        public int peek() {
            if (!s2.isEmpty()) {
                return s2.peek();
            }
            return front;

//            return front;
        }

        public boolean empty() {
            return s1.isEmpty() && s2.isEmpty();

//            return s1.isEmpty();
        }
    }
}

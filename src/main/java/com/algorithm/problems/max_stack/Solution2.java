/**
 * Leetcode - max_stack
 */
package com.algorithm.problems.max_stack;

import java.util.PriorityQueue;

class Solution2 implements Solution {

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
        private Node head;

        private Node tail;

        private PriorityQueue<Node> queue;

        public MaxStack() {
            head = new Node(-1, -1, null, null);
            tail = new Node(-1, -1, null, null);
            head.next = tail;
            tail.pre = head;
            queue = new PriorityQueue<>();
        }

        public void push(int x) {
            Node node = new Node(x, queue.size(), null, null);
            node.next = head.next;
            node.pre = head;
            head.next.pre = node;
            head.next = node;

            queue.add(node);
        }

        public int pop() {
            Node node = head.next;
            queue.remove(node);
            deleteNode(node);
            return node.val;
        }

        public int top() {
            return head.next.val;
        }

        public int peekMax() {
            return queue.peek().val;
        }

        public int popMax() {
            Node node = queue.poll();
            deleteNode(node);
            return node.val;
        }

        private void deleteNode(Node node) {
            node.pre.next = node.next;
            node.next.pre = node.pre;
            node.pre = null;
            node.next = null;
        }

        static class Node implements Comparable<Node> {
            int val;

            int depth;

            Node pre;

            Node next;

            public Node(int val, int depth, Node pre, Node next) {
                this.val = val;
                this.depth = depth;
                this.pre = pre;
                this.next = next;
            }

            @Override
            public int compareTo(Node node) {
                int diff = node.val - val;
                if (diff != 0) return diff;
                return node.depth - depth;
            }
        }
    }
}

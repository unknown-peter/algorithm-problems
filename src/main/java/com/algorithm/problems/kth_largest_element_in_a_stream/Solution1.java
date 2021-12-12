/**
 * Leetcode - kth_largest_element_in_a_stream
 */
package com.algorithm.problems.kth_largest_element_in_a_stream;

class Solution1 implements Solution {

    @Override
    public Integer[] streamOperate(String[] operate, int k, int[][] data) {
        Integer[] result = new Integer[operate.length];
        Solution1.KthLargest stream = null;
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

    static class KthLargest {

        private Node head;

        private int k;

        public KthLargest(int k, int[] nums) {
            head = new Node(10001, null, null);
            this.k = k;
            for (int num : nums) {
                addNode(head, num);
            }
        }

        public int add(int val) {
            addNode(head, val);
            Node node = head;
            for (int i = 0; i < k; i++) {
                node = node.next;
            }
            return node.val;
        }

        private void addNode(Node node, int num) {
            if (node == null) return;
            while (node.next != null) {
                if (node.next.val < num) break;
                node = node.next;
            }
            if (node.next == null) node.next = new Node(num, node, null);
            else {
                Node tmp = node.next;
                node.next = new Node(num, node, tmp);
                tmp.pre = node.next;
            }
        }

        public static class Node {
            int val;
            Node pre;
            Node next;

            public Node(int val, Node pre, Node next) {
                this.val = val;
                this.pre = pre;
                this.next = next;
            }
        }
    }
}

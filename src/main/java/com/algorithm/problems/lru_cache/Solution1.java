/**
 * Leetcode - lru_cache
 */
package com.algorithm.problems.lru_cache;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public Integer[] lruOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        LRUCache cache = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "LRUCache":
                    cache = new LRUCache(data[i][0]);
                    result[i] = null;
                    break;
                case "put":
                    cache.put(data[i][0], data[i][1]);
                    result[i] = null;
                    break;
                case "get":
                    result[i] = cache.get(data[i][0]);
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class LRUCache {

        static class Node {
            private int key;

            private int value;

            private Node pre;

            private Node next;

            public Node(int key, int value) {
                this.key = key;
                this.value = value;
            }
        }

        private Map<Integer, Node> map;

        private int capacity;

        private Node head;

        private Node tail;

        public LRUCache(int capacity) {
            this.capacity = capacity;
            map = new HashMap<>();
            head = new Node(-1, -1);
            tail = new Node(-1, -1);
            head.next = tail;
            tail.pre = head;
        }

        public int get(int key) {
            Node node = map.get(key);
            if (node == null) return -1;
            deleteNode(node);
            insertHead(node);
            return node.value;
        }

        public void put(int key, int value) {
            Node node = map.get(key);
            if (node == null) {
                if (map.size() == capacity) {
                    map.remove(tail.pre.key);
                    deleteNode(tail.pre);
                }
                node = new Node(key, value);
                map.put(key, node);
                insertHead(node);
            } else {
                deleteNode(node);
                node.value = value;
                map.put(key, node);
                insertHead(node);
            }
        }

        private void insertHead(Node node) {
            node.next = head.next;
            head.next.pre = node;
            node.pre = head;
            head.next = node;
        }

        private void deleteNode(Node node) {
            Node pre = node.pre;
            Node next = node.next;
            pre.next = next;
            next.pre = pre;
        }
    }
}

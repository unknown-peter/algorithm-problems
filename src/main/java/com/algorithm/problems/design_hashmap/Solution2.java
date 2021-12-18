/**
 * Leetcode - design_hashmap
 */
package com.algorithm.problems.design_hashmap;

class Solution2 implements Solution {

    @Override
    public Integer[] hashmapOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        Solution1.MyHashMap hashMap = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyHashMap":
                    hashMap = new Solution1.MyHashMap();
                    result[i] = null;
                    break;
                case "put":
                    hashMap.put(data[i][0], data[i][1]);
                    result[i] = null;
                    break;
                case "get":
                    result[i] = hashMap.get(data[i][0]);
                    break;
                case "remove":
                    hashMap.remove(data[i][0]);
                    result[i] = null;
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class MyHashMap {

        private Node[] array;

        public MyHashMap() {
            array = new Node[10000];
        }

        public void put(int key, int value) {
            Node node = getPreNode(key % array.length, key);
            if (node.next == null) node.next = new Node(key, value, null);
            else node.next.value = value;
        }

        public int get(int key) {
            Node node = getPreNode(key % array.length, key);
            return (node.next == null) ? -1 : node.next.value;
        }

        public void remove(int key) {
            Node node = getPreNode(key % array.length, key);
            if (node.next != null) {
                node.next = node.next.next;
            }
        }

        private Node getPreNode(int hash, int key) {
            if (array[hash] == null) {
                array[hash] = new Node(-1, -1, null);
                return array[hash];
            }

            Node node = array[hash];
            while (node.next != null && node.next.key != key) node = node.next;
            return node;
        }

        static class Node {
            private int key;

            private int value;

            private Node next;

            public Node(int key, int value, Node next) {
                this.key = key;
                this.value = value;
                this.next = next;
            }
        }
    }
}

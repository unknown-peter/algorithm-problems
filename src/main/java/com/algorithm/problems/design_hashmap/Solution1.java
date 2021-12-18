/**
 * Leetcode - design_hashmap
 */
package com.algorithm.problems.design_hashmap;

class Solution1 implements Solution {

    @Override
    public Integer[] hashmapOperate(String[] operate, int[][] data) {
        Integer[] result = new Integer[operate.length];
        MyHashMap hashMap = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyHashMap":
                    hashMap = new MyHashMap();
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

        private Integer[] array;

        public MyHashMap() {
            array = new Integer[1];
        }

        public void put(int key, int value) {
            if (key >= array.length) {
                Integer[] newArray = new Integer[key + array.length * 2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
            array[key] = value;
        }

        public int get(int key) {
            if (key >= array.length || array[key] == null) return -1;
            return array[key];
        }

        public void remove(int key) {
            if (key >= array.length) return;
            array[key] = null;
        }
    }
}

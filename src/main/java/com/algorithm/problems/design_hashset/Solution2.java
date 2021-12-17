/**
 * Leetcode - design_hashset
 */
package com.algorithm.problems.design_hashset;

class Solution2 implements Solution {

    @Override
    public Boolean[] hashsetOperate(String[] operate, int[][] data) {
        Boolean[] result = new Boolean[operate.length];
        Solution1.MyHashSet hashSet = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyHashSet":
                    hashSet = new Solution1.MyHashSet();
                    result[i] = null;
                    break;
                case "add":
                    hashSet.add(data[i][0]);
                    result[i] = null;
                    break;
                case "contains":
                    result[i] = hashSet.contains(data[i][0]);
                    break;
                case "remove":
                    hashSet.remove(data[i][0]);
                    result[i] = null;
                    break;
                default:
                    break;
            }
        }
        return result;
    }

    static class MyHashSet {

        private boolean[] array;

        public MyHashSet() {
            array = new boolean[1];
        }

        public void add(int key) {
            if (key >= array.length) {
                boolean[] newArray = new boolean[key + array.length * 2];
                System.arraycopy(array, 0, newArray, 0, array.length);
                array = newArray;
            }
            array[key] = true;
        }

        public void remove(int key) {
            if (key >= array.length) return;
            array[key] = false;
        }

        public boolean contains(int key) {
            if (key >= array.length) return false;
            return array[key];
        }
    }
}

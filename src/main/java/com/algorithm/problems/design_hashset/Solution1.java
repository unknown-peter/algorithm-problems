/**
 * Leetcode - design_hashset
 */
package com.algorithm.problems.design_hashset;

import java.util.HashMap;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public Boolean[] hashsetOperate(String[] operate, int[][] data) {
        Boolean[] result = new Boolean[operate.length];
        MyHashSet hashSet = null;
        for (int i = 0; i < operate.length; i++) {
            switch (operate[i]) {
                case "MyHashSet":
                    hashSet = new MyHashSet();
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

        private Map<Integer, Object> map;

        public MyHashSet() {
            map = new HashMap<>();
        }

        public void add(int key) {
            map.put(key, new Object());
        }

        public void remove(int key) {
            if (contains(key)) map.remove(key);
        }

        public boolean contains(int key) {
            return map.containsKey(key);
        }
    }
}

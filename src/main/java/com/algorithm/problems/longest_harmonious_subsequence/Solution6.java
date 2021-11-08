/**
 * Leetcode - longest_harmonious_subsequence
 */
package com.algorithm.problems.longest_harmonious_subsequence;

import java.util.HashMap;

class Solution6 implements Solution {

    /**
     * solution from leetcode
     */
    @Override
    public int findLHS(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();
        int res = 0;
        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }
        for (int key : map.keySet()) {
            if (map.containsKey(key + 1))
                res = Math.max(res, map.get(key) + map.get(key + 1));
        }
        return res;

//        HashMap < Integer, Integer > map = new HashMap < > ();
//        int res = 0;
//        for (int num: nums) {
//            map.put(num, map.getOrDefault(num, 0) + 1);
//            if (map.containsKey(num + 1))
//                res = Math.max(res, map.get(num) + map.get(num + 1));
//            if (map.containsKey(num - 1))
//                res = Math.max(res, map.get(num) + map.get(num - 1));
//        }
//        return res;
    }
}

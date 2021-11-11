/**
 * Leetcode - minimum_index_sum_of_two_lists
 */
package com.algorithm.problems.minimum_index_sum_of_two_lists;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public String[] findRestaurant(String[] list1, String[] list2) {
        Map<String, Integer> map = new HashMap<>();
        Map<String, Integer> commonMap = new HashMap<>();
        int minIndexSum = Integer.MAX_VALUE;
        for (int i = 0; i < list1.length; i++) {
            map.put(list1[i], i);
        }
        for (int j = 0; j < list2.length; j++) {
            Integer list1Index = map.get(list2[j]);
            if (list1Index != null) {
                commonMap.put(list2[j], list1Index + j);
                minIndexSum = Math.min(minIndexSum, list1Index + j);
            }
        }
        List<String> list = new ArrayList<>();
        for (Map.Entry<String, Integer> entry : commonMap.entrySet()) {
            if (entry.getValue() == minIndexSum) list.add(entry.getKey());
        }
        return list.toArray(new String[0]);
    }
}

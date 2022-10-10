/**
 * Leetcode - group_anagrams
 */
package com.algorithm.problems.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution1 implements Solution {

    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        Map<String, List<String>> map = new HashMap<>();
        for (String str : strs) {
            char[] arr = str.toCharArray();
            Arrays.sort(arr);
            String orderedStr = new String(arr);
            List<String> list = map.getOrDefault(orderedStr, new ArrayList<>());
            list.add(str);
            map.put(orderedStr, list);
        }
        return new ArrayList<>(map.values());
    }
}

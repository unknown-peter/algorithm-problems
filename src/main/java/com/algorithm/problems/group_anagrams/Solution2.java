/**
 * Leetcode - group_anagrams
 */
package com.algorithm.problems.group_anagrams;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class Solution2 implements Solution {

    /**
     * solution from leetcode
     * 对字符串数组strs中每个字符串，计算字符串中26个字母的个数，使用#分隔每个字母数量组成的字符串作为key
     * 存储相同key的字符串为List
     */
    @Override
    public List<List<String>> groupAnagrams(String[] strs) {
        if (strs.length == 0) return new ArrayList();
        Map<String, List> ans = new HashMap<String, List>();
        int[] count = new int[26];
        for (String s : strs) {
            Arrays.fill(count, 0);
            for (char c : s.toCharArray()) {
                count[c - 'a']++;
            }

            StringBuilder sb = new StringBuilder("");
            for (int i = 0; i < 26; i++) {
                sb.append('#');
                sb.append(count[i]);
            }
            String key = sb.toString();
            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
            ans.get(key).add(s);
        }
        return new ArrayList(ans.values());
    }

    //    public List<List<String>> groupAnagrams(String[] strs) {
    //        Map<String, List> ans = new HashMap<>();
    //        for (String s : strs) {
    //            char[] count = new char[26];
    //            for (char c : s.toCharArray()) count[c - 'a']++;
    //            String key = new String(count);
    //            if (!ans.containsKey(key)) ans.put(key, new ArrayList());
    //            ans.get(key).add(s);
    //        }
    //        return new ArrayList(ans.values());
    //    }
}
